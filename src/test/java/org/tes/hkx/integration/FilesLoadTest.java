package org.tes.hkx.integration;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.File;

import org.junit.Before;
import org.junit.Test;
import org.tes.hkx.model.HkFile;
import org.tes.hkx.model.files.HkAnimationFile;
import org.tes.hkx.model.files.HkBehaviorFile;
import org.tes.hkx.model.files.HkCharacterFile;
import org.tes.hkx.model.files.HkFilesFactory;
import org.tes.hkx.model.files.HkProjectFile;
import org.tes.hkx.model.files.HkSkeletonFile;

public class FilesLoadTest {

	private ClassLoader classloader = Thread.currentThread().getContextClassLoader();

	@Test
	public void testHkSampleFileLoading() throws Exception {
		File projectFile = new File(classloader.getResource("minotaur/Minotaurproject.xml").toURI());
		HkFile hkFile = new HkFilesFactory().loadFile(projectFile);
		assertTrue(hkFile.getObjects().size() > 0);
	}

	@Test
	public void testProjectSimpleFileLoading() throws Exception {
		File projectFile = new File(classloader.getResource("minotaur/Minotaurproject.xml").toURI());
		HkProjectFile hkbFile = new HkFilesFactory().loadTypedFile(projectFile, HkProjectFile.class);
		assertTrue(hkbFile.getObjects().size() > 0);
		assertNotNull(hkbFile.getData().getStringData());
	}
	
	@Test
	public void testCharacterSampleFileLoading() throws Exception {
		File characterFile = new File(classloader.getResource("minotaur/characters/Minotaur_character.xml").toURI());
		HkCharacterFile hkbFile = new HkFilesFactory().loadTypedFile(characterFile, HkCharacterFile.class);
		assertTrue(hkbFile.getObjects().size() > 0);
		assertTrue(hkbFile.getStringData().getName().equals("Character01"));
	}
	
	@Test
	public void testSkeletonSampleFileLoading() throws Exception {
		File skeletonFile = new File(classloader.getResource("minotaur/assets/skeleton.xml").toURI());
		HkSkeletonFile hkbFile = new HkFilesFactory().loadTypedFile(skeletonFile, HkSkeletonFile.class);
		assertTrue(hkbFile.getObjects().size() > 0);
		assertTrue(hkbFile.getSkeletons().iterator().hasNext());
	}
	
	@Test
	public void testAnimationSampleFileLoading() throws Exception {
		File animationFile = new File(classloader.getResource("minotaur/animations/idle.xml").toURI());
		HkAnimationFile hkbFile = new HkFilesFactory().loadTypedFile(animationFile, HkAnimationFile.class);
		assertTrue(hkbFile.getObjects().size() > 0);
		assertTrue(hkbFile.getRoot().getNamedVariants().iterator().hasNext());
	}

	@Test
	public void testBehaviorSampleFileLoading() throws Exception {
		File behaviorFile = new File(classloader.getResource("minotaur/behaviors/Minotaur_behavior.xml").toURI());
		HkBehaviorFile hkbFile = new HkFilesFactory().loadTypedFile(behaviorFile, HkBehaviorFile.class);
		assertTrue(hkbFile.getObjects().size() > 0);
		assertTrue(hkbFile.getGraph().getName().equals("Minotaur.hkb"));
	}

}
