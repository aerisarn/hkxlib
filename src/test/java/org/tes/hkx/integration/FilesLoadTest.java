package org.tes.hkx.integration;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.InputStream;

import org.junit.Before;
import org.junit.Test;
import org.tes.hkx.model.HkFile;
import org.tes.hkx.model.files.HkBehaviorFile;

public class FilesLoadTest {
	
	private ClassLoader classloader;
	private InputStream is;
	
	@Before
	public void setup() {
		classloader = Thread.currentThread().getContextClassLoader();
	}
	
	@Test
	public void testHkSampleFileLoading() throws Exception {
		 File projectFile = new File(classloader.getResource("minotaur/Minotaurproject.xml").toURI());
		 HkFile hkFile = new HkFile(projectFile);
		 assertTrue(hkFile.getObjects().size()>0);
	}
	
	@Test
	public void testBehaviorSampleFileLoading() throws Exception {
		 File behaviorFile = new File(classloader.getResource("minotaur/behaviors/Minotaur_behavior.xml").toURI());
		 HkFile hkFile = new HkFile(behaviorFile);
		 HkBehaviorFile hkbFile = new HkBehaviorFile(hkFile);
		 assertTrue(hkFile.getObjects().size()>0);
		 assertTrue(hkbFile.getGraph().getName().equals("Minotaur.hkb"));
	}

}
