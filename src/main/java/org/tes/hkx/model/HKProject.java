package org.tes.hkx.model;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

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
	private Multimap<HkCharacterFile, HkSkeletonFile> rigRagdollFile = ArrayListMultimap.create();
	private Multimap<HkCharacterFile, HkBehaviorFile> behaviorFiles = ArrayListMultimap.create();
	private Multimap<HkCharacterFile, HkAnimationFile> animationFiles = ArrayListMultimap.create();

	public HKProject(File projectFileSource) throws Exception {
		HkFilesFactory filesFactory = new HkFilesFactory();
		projectFile = filesFactory.loadTypedFile(projectFileSource, HkProjectFile.class);
		
		for (String characterPath : projectFile.getStringData().getCharacterFilenames()) {
			characterFiles.add(filesFactory.loadTypedFile(new File(projectFileSource.getParent(),characterPath.replace(".hkx", ".xml")), HkCharacterFile.class));
		}
		for (HkCharacterFile characterFile : characterFiles) {
			rigRagdollFile.put(characterFile, filesFactory
					.loadTypedFile(new File(projectFileSource.getParent(), characterFile.getStringData().getRigName().replace(".hkx", ".xml")), HkSkeletonFile.class));
			behaviorFiles.put(characterFile, filesFactory.loadTypedFile(
					new File(projectFileSource.getParent(), characterFile.getStringData().getBehaviorFilename().replace(".hkx", ".xml")), HkBehaviorFile.class));
			for (String animationFile : characterFile.getStringData().getAnimationNames()) {
				animationFiles.put(characterFile,
						filesFactory.loadTypedFile(new File(projectFileSource.getParent(),animationFile.replace(".hkx", ".xml")), HkAnimationFile.class));
			}
		}
	}
	
	public List<HkCharacterFile> getCharacterFiles() {
		return characterFiles;
	}
}
