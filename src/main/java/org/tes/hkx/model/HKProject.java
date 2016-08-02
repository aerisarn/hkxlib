package org.tes.hkx.model;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
	private List<HkCharacterFile> characterFiles = new ArrayList<>();
	// ragdoll is embedded into the skeleton for Skyrim
	private Map<HkCharacterFile, HkSkeletonFile> rigRagdollFiles = new HashMap<>();
	private Map<HkCharacterFile, HkBehaviorFile> behaviorFiles = new HashMap<>();
	private Multimap<HkCharacterFile, HkAnimationFile> animationFiles = ArrayListMultimap.create();

	public HKProject() throws Exception {
		projectFile = new HkProjectFile();
	}

	public HKProject(String projectName) throws Exception {
		projectFile = new HkProjectFile(projectName);
	}

	private String getPathFromHKX(String path) {
		return path.replace(".hkx", ".xml").replace("\\", File.separator);
	}
	
	public HKProject(File projectFileSource) throws Exception {
		HkFilesFactory filesFactory = new HkFilesFactory();
		projectFile = filesFactory.loadTypedFile(projectFileSource, HkProjectFile.class);

		for (String characterPath : projectFile.getStringData().getCharacterFilenames()) {
			characterFiles.add(filesFactory.loadTypedFile(
					new File(projectFileSource.getParent(), getPathFromHKX(characterPath)),
					HkCharacterFile.class));
		}
		for (HkCharacterFile characterFile : characterFiles) {
			rigRagdollFiles.put(characterFile,
					filesFactory.loadTypedFile(
							new File(projectFileSource.getParent(),
									getPathFromHKX(characterFile.getStringData().getRigName())),
							HkSkeletonFile.class));
			behaviorFiles.put(characterFile,
					filesFactory.loadTypedFile(
							new File(projectFileSource.getParent(),
									getPathFromHKX(characterFile.getStringData().getBehaviorFilename())),
							HkBehaviorFile.class));
			for (String animationFile : characterFile.getStringData().getAnimationNames()) {
				animationFiles.put(characterFile,
						filesFactory.loadTypedFile(
								new File(projectFileSource.getParent(), getPathFromHKX(animationFile)),
								HkAnimationFile.class));
			}
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
		charFile.getStringData().setBehaviorFilename("behaviors\\"+name+".hkx");
	}

	public void setBehavior(HkCharacterFile charFile, File file) {
		//TODO
	}

}
