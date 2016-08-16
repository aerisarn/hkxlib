package org.tes.hkx.model;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.tes.hkx.lib.HkobjectType;
import org.tes.hkx.lib.ext.hkbBehaviorReferenceGenerator;
import org.tes.hkx.model.files.HkAnimationFile;
import org.tes.hkx.model.files.HkBehaviorFile;
import org.tes.hkx.model.files.HkCharacterFile;
import org.tes.hkx.model.files.HkFilesFactory;
import org.tes.hkx.model.files.HkProjectFile;
import org.tes.hkx.model.files.HkSkeletonFile;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

public class HKProject {

	private HkProjectFile projectFile;
	private File projectFileSource;
	private HkFilesFactory filesFactory = new HkFilesFactory();
	private List<HkCharacterFile> characterFiles = new ArrayList<>();
	// ragdoll is embedded into the skeleton for Skyrim
	
	//Files
	private Map<HkCharacterFile, HkSkeletonFile> rigRagdollFiles = new HashMap<>();
	private Multimap<HkCharacterFile, HkBehaviorFile> behaviorFiles = ArrayListMultimap.create();
	private Multimap<String, HkBehaviorFile> behaviorFileNames = ArrayListMultimap.create();
	private Multimap<HkCharacterFile, HkAnimationFile> animationFiles = ArrayListMultimap.create();

	//Interface
	private Set<HkBehaviorGraph> behaviors = new HashSet();
	
	public HKProject() throws Exception {
		projectFile = new HkProjectFile();
	}

	public HKProject(String projectName) throws Exception {
		projectFile = new HkProjectFile(projectName);
	}

	private String getPathFromHKX(String path) {
		return path.replace(".hkx", ".xml").replace(".HKX", ".xml").replace("\\", File.separator);
	}

	private void scanForAdditionalBehaviors(HkBehaviorFile behaviorFile, HkCharacterFile characterFile)
			throws Exception {
		for (HkobjectType bobj : behaviorFile.getObjects()) {
			if (bobj instanceof hkbBehaviorReferenceGenerator) {
				hkbBehaviorReferenceGenerator p = (hkbBehaviorReferenceGenerator) bobj;
				if (!behaviorFileNames.keys().contains(p.getBehaviorName())) {
					HkBehaviorFile refBF = filesFactory.loadTypedFile(
							new File(projectFileSource.getParent(), getPathFromHKX(p.getBehaviorName())),
							HkBehaviorFile.class);
					behaviors.add(new HkBehaviorGraph(refBF));
					behaviorFiles.put(characterFile, refBF);
					behaviorFileNames.put(p.getBehaviorName(), refBF);
					scanForAdditionalBehaviors(refBF, characterFile);
				}
			}
		}
	}

	public HKProject(File projectFileSource) throws Exception {
		this.projectFileSource = projectFileSource;
		projectFile = filesFactory.loadTypedFile(projectFileSource, HkProjectFile.class);

		for (String characterPath : projectFile.getStringData().getCharacterFilenames()) {
			characterFiles.add(filesFactory.loadTypedFile(
					new File(projectFileSource.getParent(), getPathFromHKX(characterPath)), HkCharacterFile.class));
		}
		for (HkCharacterFile characterFile : characterFiles) {
			rigRagdollFiles
					.put(characterFile,
							filesFactory.loadTypedFile(
									new File(projectFileSource.getParent(),
											getPathFromHKX(characterFile.getStringData().getRigName())),
									HkSkeletonFile.class));
			HkBehaviorFile bf = filesFactory.loadTypedFile(new File(projectFileSource.getParent(),
					getPathFromHKX(characterFile.getStringData().getBehaviorFilename())), HkBehaviorFile.class);
			behaviorFiles.put(characterFile, bf);
			behaviors.add(new HkBehaviorGraph(bf));
			scanForAdditionalBehaviors(bf, characterFile);
//			for (String animationFile : characterFile.getStringData().getAnimationNames()) {
//				animationFiles.put(characterFile, filesFactory.loadTypedFile(
//						new File(projectFileSource.getParent(), getPathFromHKX(animationFile)), HkAnimationFile.class));
//			}
		}
	}

	public HkProjectFile getProjectFile() {
		return projectFile;
	}

	public List<HkCharacterFile> getCharacterFiles() {
		return characterFiles;
	}

	public HkSkeletonFile getRigRagdollFile(HkCharacterFile charFile) {
		return rigRagdollFiles.get(charFile);
	}

	public HkBehaviorFile getBehavior(HkCharacterFile charFile) {
		return behaviorFiles.get(charFile).iterator().next();
	}

	public Collection<HkBehaviorFile> getBehaviors(HkCharacterFile charFile) {
		return behaviorFiles.get(charFile);
	}

	public Collection<HkAnimationFile> getAnimationFiles(HkCharacterFile charFile) {
		return Collections.unmodifiableCollection(animationFiles.get(charFile));
	}

	public void setRigRagdoll(HkCharacterFile charFile, String name) throws Exception {
		charFile.getStringData().setRagdollName("assets\\" + name + ".hkx");
		charFile.getStringData().setRigName("assets\\" + name + ".hkx");
		File ragdollFile = new File("assets" + File.pathSeparator + name + ".xml");
		if (ragdollFile.exists())
			rigRagdollFiles.put(charFile, new HkFilesFactory().loadTypedFile(ragdollFile, HkSkeletonFile.class));
		else
			rigRagdollFiles.put(charFile, new HkSkeletonFile(name));
	}

	public void setBehavior(HkCharacterFile charFile, String name) {
		charFile.getStringData().setBehaviorFilename("behaviors\\" + name + ".hkx");
	}

	public void setBehavior(HkCharacterFile charFile, File file) {
		// TODO
	}

}
