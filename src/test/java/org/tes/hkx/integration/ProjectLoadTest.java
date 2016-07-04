package org.tes.hkx.integration;

import static org.junit.Assert.assertTrue;

import java.io.File;

import org.junit.Test;
import org.tes.hkx.model.HKProject;

public class ProjectLoadTest {
	private ClassLoader classloader = Thread.currentThread().getContextClassLoader();

	@Test
	public void testHkSampleFileLoading() throws Exception {
		File projectFile = new File(classloader.getResource("minotaur/Minotaurproject.xml").toURI());
		HKProject p = new HKProject(projectFile);
		assertTrue(p.getCharacterFiles().size()>0);
	}
}
