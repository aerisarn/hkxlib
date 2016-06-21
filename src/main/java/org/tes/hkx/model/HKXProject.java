package org.tes.hkx.model;

import java.util.List;

public class HKXProject {
	
	private HkFile projectFile;
	private HkFile characterFile;
	private List<HkFile> behaviorFiles;
	private List<HkFile> animationFiles;
	private List<HkFile> assetFiles;
	
	public HkFile getProjectFile() {
		return projectFile;
	}
	public void setProjectFile(HkFile projectFile) {
		this.projectFile = projectFile;
	}
	public HkFile getCharacterFile() {
		return characterFile;
	}
	public void setCharacterFile(HkFile characterFile) {
		this.characterFile = characterFile;
	}
	
}
