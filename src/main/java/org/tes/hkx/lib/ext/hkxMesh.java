
package org.tes.hkx.lib.ext;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.eclipse.persistence.oxm.annotations.XmlDiscriminatorValue;
import org.eclipse.persistence.oxm.annotations.XmlPath;
import org.tes.hkx.lib.HkobjectType;

@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlDiscriminatorValue("0xf2edcc5f")
@XmlType(propOrder = {
    "sections",
    "userChannelInfos"
})
public class hkxMesh
    extends HkobjectType
{

    @XmlPath("hkparam[@name=\"sections\"]/hkobject")
    private ArrayList<org.tes.hkx.lib.ext.hkxMeshSection> sections;
    @XmlPath("hkparam[@name=\"sections\"]/@numelements")
    private Integer numsections;
    @XmlPath("hkparam[@name=\"userChannelInfos\"]/hkobject")
    private ArrayList<org.tes.hkx.lib.ext.hkxMeshSection> userChannelInfos;
    @XmlPath("hkparam[@name=\"userChannelInfos\"]/@numelements")
    private Integer numuserChannelInfos;

    public hkxMesh() {
        sections = new ArrayList<org.tes.hkx.lib.ext.hkxMeshSection>();
        numsections = 0;
        userChannelInfos = new ArrayList<org.tes.hkx.lib.ext.hkxMeshSection>();
        numuserChannelInfos = 0;
    }

    public hkxMesh(hkxMesh toCopy, Boolean deepCopy) {
        super(toCopy, deepCopy);
        if (toCopy == null) {
            return ;
        }
        sections = new ArrayList<org.tes.hkx.lib.ext.hkxMeshSection>();
        numsections = 0;
        for (org.tes.hkx.lib.ext.hkxMeshSection obj: toCopy.getSections()) {
            if (deepCopy == true) {
                addToSections(new org.tes.hkx.lib.ext.hkxMeshSection(obj, deepCopy));
            } else {
                addToSections(obj);
            }
        }
        userChannelInfos = new ArrayList<org.tes.hkx.lib.ext.hkxMeshSection>();
        numuserChannelInfos = 0;
        for (org.tes.hkx.lib.ext.hkxMeshSection obj: toCopy.getUserChannelInfos()) {
            if (deepCopy == true) {
                addToUserChannelInfos(new org.tes.hkx.lib.ext.hkxMeshSection(obj, deepCopy));
            } else {
                addToUserChannelInfos(obj);
            }
        }
    }

    public Integer getNumSections() {
        return numsections;
    }

    public Iterable<org.tes.hkx.lib.ext.hkxMeshSection> getSections() {
        return sections;
    }

    public org.tes.hkx.lib.ext.hkxMeshSection getSectionsAt(int index) {
        return sections.get(index);
    }

    public boolean addToSections(org.tes.hkx.lib.ext.hkxMeshSection newSections) {
        if (sections.add(newSections)) {
            numsections += 1;
            return true;
        }
        return false;
    }

    public boolean removeFromSections(org.tes.hkx.lib.ext.hkxMeshSection sectionsToRemove) {
        if (sections.remove(sectionsToRemove)) {
            numsections += -1;
            return true;
        }
        return false;
    }

    public org.tes.hkx.lib.ext.hkxMeshSection removeFromSectionsAt(int index) {
        org.tes.hkx.lib.ext.hkxMeshSection toRemove;
        toRemove = sections.remove(index);
        if (!(null == toRemove)) {
            numsections += -1;
            return toRemove;
        }
        return null;
    }

    public Integer getNumUserChannelInfos() {
        return numuserChannelInfos;
    }

    public Iterable<org.tes.hkx.lib.ext.hkxMeshSection> getUserChannelInfos() {
        return userChannelInfos;
    }

    public org.tes.hkx.lib.ext.hkxMeshSection getUserChannelInfosAt(int index) {
        return userChannelInfos.get(index);
    }

    public boolean addToUserChannelInfos(org.tes.hkx.lib.ext.hkxMeshSection newUserChannelInfos) {
        if (userChannelInfos.add(newUserChannelInfos)) {
            numuserChannelInfos += 1;
            return true;
        }
        return false;
    }

    public boolean removeFromUserChannelInfos(org.tes.hkx.lib.ext.hkxMeshSection userChannelInfosToRemove) {
        if (userChannelInfos.remove(userChannelInfosToRemove)) {
            numuserChannelInfos += -1;
            return true;
        }
        return false;
    }

    public org.tes.hkx.lib.ext.hkxMeshSection removeFromUserChannelInfosAt(int index) {
        org.tes.hkx.lib.ext.hkxMeshSection toRemove;
        toRemove = userChannelInfos.remove(index);
        if (!(null == toRemove)) {
            numuserChannelInfos += -1;
            return toRemove;
        }
        return null;
    }

}
