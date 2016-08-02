package org.tes.hkx.examples;

import org.junit.Test;
import org.tes.hkx.model.files.HkFilesFactory;
import org.tes.hkx.model.files.HkProjectFile;

public class ProjectFileExample {

	/*
	 * <?xml version="1.0" encoding="UTF-8"?>
<hkpackfile classversion="8" contentsversion="hk_2010.2.0-r1" toplevelobject="#0008">
   <hksection name="__data__">
      <hkobject name="#0010" class="hkbProjectStringData" signature="0x76ad60a">
         <hkparam name="animationFilenames" numelements="0"></hkparam>
         <hkparam name="behaviorFilenames" numelements="0"></hkparam>
         <hkparam name="characterFilenames" numelements="1">
            <hkcstring>characters\Minotaur_character.hkx</hkcstring>
         </hkparam>
         <hkparam name="eventNames" numelements="0"/>
      </hkobject>
      <hkobject name="#0009" class="hkbProjectData" signature="0x13a39ba7">
         <hkparam name="worldUpWS">(0.000000 0.000000 1.000000 0.000000)</hkparam>
         <hkparam name="stringData">#0010</hkparam>
         <hkparam name="defaultEventMode">EVENT_MODE_IGNORE_FROM_GENERATOR</hkparam>
      </hkobject>
      <hkobject name="#0008" class="hkRootLevelContainer" signature="0x2772c11e">
         <hkparam name="namedVariants" numelements="1">
            <hkobject>
               <hkparam name="name">hkbProjectData</hkparam>
               <hkparam name="className">hkbProjectData</hkparam>
               <hkparam name="variant">#0009</hkparam>
            </hkobject>
         </hkparam>
      </hkobject>
   </hksection>
</hkpackfile>
	 */
	@Test
	public void main() {
		try {
			HkProjectFile projectFile = new HkProjectFile();
			projectFile.getData().setWorldUpWS("(0.000000 0.000000 1.000000 0.000000)");
			projectFile.getStringData().addToCharacterFilenames("characters\\Minotaur_character.hkx");
			
			HkFilesFactory factory = new HkFilesFactory();
			factory.out(projectFile);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
