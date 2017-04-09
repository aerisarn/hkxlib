
package org.tes.hkx.lib.ext;

import java.util.ArrayList;
import java.util.Collection;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.eclipse.persistence.oxm.annotations.XmlDiscriminatorValue;
import org.eclipse.persistence.oxm.annotations.XmlPath;
import org.tes.hkx.lib.HkParenthesysVectorAdapter;
import org.tes.hkx.lib.HkobjectType;
import org.tes.hkx.model.IHkContainer;
import org.tes.hkx.model.IHkVisitable;

@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlDiscriminatorValue("0x2954537a")
@XmlType(propOrder = {
    "attributeGroups",
    "name",
    "stages",
    "diffuseColor",
    "ambientColor",
    "specularColor",
    "emissiveColor",
    "subMaterials",
    "extraData",
    "properties"
})
public class hkxMaterial
    extends HkobjectType
    implements IHkContainer
{

    @XmlJavaTypeAdapter(HkParenthesysVectorAdapter.class)
    @XmlPath("hkparam[@name=\"attributeGroups\"]/text()")
    private ArrayList<String> attributeGroups;
    @XmlPath("hkparam[@name=\"attributeGroups\"]/@numelements")
    private Integer numattributeGroups;
    private String childname;
    @XmlElement(name = "hkparam[@name=\"stages\"]/hkobject", required = true, nillable = true)
    private ArrayList<org.tes.hkx.lib.ext.Unnamed29> stages;
    @XmlPath("hkparam[@name=\"stages\"]/@numelements")
    private Integer numstages;
    private String diffuseColor;
    private String ambientColor;
    private String specularColor;
    private String emissiveColor;
    @XmlJavaTypeAdapter(HkParenthesysVectorAdapter.class)
    @XmlPath("hkparam[@name=\"subMaterials\"]/text()")
    private ArrayList<String> subMaterials;
    @XmlPath("hkparam[@name=\"subMaterials\"]/@numelements")
    private Integer numsubMaterials;
    private String extraData;
    @XmlJavaTypeAdapter(HkParenthesysVectorAdapter.class)
    @XmlPath("hkparam[@name=\"properties\"]/text()")
    private ArrayList<String> properties;
    @XmlPath("hkparam[@name=\"properties\"]/@numelements")
    private Integer numproperties;

    public hkxMaterial() {
        attributeGroups = new ArrayList<String>();
        numattributeGroups = 0;
        setName("SiltStrider2");
        stages = new ArrayList<org.tes.hkx.lib.ext.Unnamed29>();
        numstages = 0;
        setDiffuseColor("(0.588000 0.588000 0.588000 100.000000)");
        setAmbientColor("(0.588000 0.588000 0.588000 0.000000)");
        setSpecularColor("(0.000000 0.000000 0.000000 11.000000)");
        setEmissiveColor("(0.000000 0.000000 0.000000 1.000000)");
        subMaterials = new ArrayList<String>();
        numsubMaterials = 0;
        setExtraData("null");
        properties = new ArrayList<String>();
        numproperties = 0;
    }

    public hkxMaterial(hkxMaterial toCopy, Boolean deepCopy) {
        super(toCopy, deepCopy);
        if (toCopy == null) {
            return ;
        }
        attributeGroups = new ArrayList<String>();
        numattributeGroups = 0;
        for (String obj: toCopy.getAttributeGroups()) {
            if (deepCopy == true) {
                addToAttributeGroups(new String(obj));
            } else {
                addToAttributeGroups(obj);
            }
        }
        if (!(toCopy.getName() == null)) {
            if (deepCopy == true) {
                setName(new String(toCopy.getName()));
            } else {
                setName(toCopy.getName());
            }
        }
        stages = new ArrayList<org.tes.hkx.lib.ext.Unnamed29>();
        numstages = 0;
        for (org.tes.hkx.lib.ext.Unnamed29 obj: toCopy.getStages()) {
            if (deepCopy == true) {
                addToStages(new org.tes.hkx.lib.ext.Unnamed29(obj, deepCopy));
            } else {
                addToStages(obj);
            }
        }
        if (!(toCopy.getDiffuseColor() == null)) {
            if (deepCopy == true) {
                setDiffuseColor(new String(toCopy.getDiffuseColor()));
            } else {
                setDiffuseColor(toCopy.getDiffuseColor());
            }
        }
        if (!(toCopy.getAmbientColor() == null)) {
            if (deepCopy == true) {
                setAmbientColor(new String(toCopy.getAmbientColor()));
            } else {
                setAmbientColor(toCopy.getAmbientColor());
            }
        }
        if (!(toCopy.getSpecularColor() == null)) {
            if (deepCopy == true) {
                setSpecularColor(new String(toCopy.getSpecularColor()));
            } else {
                setSpecularColor(toCopy.getSpecularColor());
            }
        }
        if (!(toCopy.getEmissiveColor() == null)) {
            if (deepCopy == true) {
                setEmissiveColor(new String(toCopy.getEmissiveColor()));
            } else {
                setEmissiveColor(toCopy.getEmissiveColor());
            }
        }
        subMaterials = new ArrayList<String>();
        numsubMaterials = 0;
        for (String obj: toCopy.getSubMaterials()) {
            if (deepCopy == true) {
                addToSubMaterials(new String(obj));
            } else {
                addToSubMaterials(obj);
            }
        }
        if (!(toCopy.getExtraData() == null)) {
            if (deepCopy == true) {
                setExtraData(new String(toCopy.getExtraData()));
            } else {
                setExtraData(toCopy.getExtraData());
            }
        }
        properties = new ArrayList<String>();
        numproperties = 0;
        for (String obj: toCopy.getProperties()) {
            if (deepCopy == true) {
                addToProperties(new String(obj));
            } else {
                addToProperties(obj);
            }
        }
    }

    public Integer getNumAttributeGroups() {
        return numattributeGroups;
    }

    public Iterable<String> getAttributeGroups() {
        return attributeGroups;
    }

    public String getAttributeGroupsAt(int index) {
        return attributeGroups.get(index);
    }

    public boolean addToAttributeGroups(String newAttributeGroups) {
        if (attributeGroups.add(newAttributeGroups)) {
            numattributeGroups += 1;
            return true;
        }
        return false;
    }

    public boolean removeFromAttributeGroups(String attributeGroupsToRemove) {
        if (attributeGroups.remove(attributeGroupsToRemove)) {
            numattributeGroups += -1;
            return true;
        }
        return false;
    }

    public String removeFromAttributeGroupsAt(int index) {
        String toRemove;
        toRemove = attributeGroups.remove(index);
        if (!(null == toRemove)) {
            numattributeGroups += -1;
            return toRemove;
        }
        return null;
    }

    @XmlPath("hkparam[@name=\"name\"]/text()")
    public String getName() {
        return childname;
    }

    @XmlPath("hkparam[@name=\"name\"]/text()")
    public void setName(String newName) {
        this.childname = newName;
    }

    public Integer getNumStages() {
        return numstages;
    }

    public Iterable<org.tes.hkx.lib.ext.Unnamed29> getStages() {
        return stages;
    }

    public org.tes.hkx.lib.ext.Unnamed29 getStagesAt(int index) {
        return stages.get(index);
    }

    public boolean addToStages(org.tes.hkx.lib.ext.Unnamed29 newStages) {
        if (stages.add(newStages)) {
            numstages += 1;
            return true;
        }
        return false;
    }

    public boolean removeFromStages(org.tes.hkx.lib.ext.Unnamed29 stagesToRemove) {
        if (stages.remove(stagesToRemove)) {
            numstages += -1;
            return true;
        }
        return false;
    }

    public org.tes.hkx.lib.ext.Unnamed29 removeFromStagesAt(int index) {
        org.tes.hkx.lib.ext.Unnamed29 toRemove;
        toRemove = stages.remove(index);
        if (!(null == toRemove)) {
            numstages += -1;
            return toRemove;
        }
        return null;
    }

    @XmlPath("hkparam[@name=\"diffuseColor\"]/text()")
    public String getDiffuseColor() {
        return diffuseColor;
    }

    @XmlPath("hkparam[@name=\"diffuseColor\"]/text()")
    public void setDiffuseColor(String newDiffuseColor) {
        this.diffuseColor = newDiffuseColor;
    }

    @XmlPath("hkparam[@name=\"ambientColor\"]/text()")
    public String getAmbientColor() {
        return ambientColor;
    }

    @XmlPath("hkparam[@name=\"ambientColor\"]/text()")
    public void setAmbientColor(String newAmbientColor) {
        this.ambientColor = newAmbientColor;
    }

    @XmlPath("hkparam[@name=\"specularColor\"]/text()")
    public String getSpecularColor() {
        return specularColor;
    }

    @XmlPath("hkparam[@name=\"specularColor\"]/text()")
    public void setSpecularColor(String newSpecularColor) {
        this.specularColor = newSpecularColor;
    }

    @XmlPath("hkparam[@name=\"emissiveColor\"]/text()")
    public String getEmissiveColor() {
        return emissiveColor;
    }

    @XmlPath("hkparam[@name=\"emissiveColor\"]/text()")
    public void setEmissiveColor(String newEmissiveColor) {
        this.emissiveColor = newEmissiveColor;
    }

    public Integer getNumSubMaterials() {
        return numsubMaterials;
    }

    public Iterable<String> getSubMaterials() {
        return subMaterials;
    }

    public String getSubMaterialsAt(int index) {
        return subMaterials.get(index);
    }

    public boolean addToSubMaterials(String newSubMaterials) {
        if (subMaterials.add(newSubMaterials)) {
            numsubMaterials += 1;
            return true;
        }
        return false;
    }

    public boolean removeFromSubMaterials(String subMaterialsToRemove) {
        if (subMaterials.remove(subMaterialsToRemove)) {
            numsubMaterials += -1;
            return true;
        }
        return false;
    }

    public String removeFromSubMaterialsAt(int index) {
        String toRemove;
        toRemove = subMaterials.remove(index);
        if (!(null == toRemove)) {
            numsubMaterials += -1;
            return toRemove;
        }
        return null;
    }

    @XmlPath("hkparam[@name=\"extraData\"]/text()")
    public String getExtraData() {
        return extraData;
    }

    @XmlPath("hkparam[@name=\"extraData\"]/text()")
    public void setExtraData(String newExtraData) {
        this.extraData = newExtraData;
    }

    public Integer getNumProperties() {
        return numproperties;
    }

    public Iterable<String> getProperties() {
        return properties;
    }

    public String getPropertiesAt(int index) {
        return properties.get(index);
    }

    public boolean addToProperties(String newProperties) {
        if (properties.add(newProperties)) {
            numproperties += 1;
            return true;
        }
        return false;
    }

    public boolean removeFromProperties(String propertiesToRemove) {
        if (properties.remove(propertiesToRemove)) {
            numproperties += -1;
            return true;
        }
        return false;
    }

    public String removeFromPropertiesAt(int index) {
        String toRemove;
        toRemove = properties.remove(index);
        if (!(null == toRemove)) {
            numproperties += -1;
            return toRemove;
        }
        return null;
    }

    public boolean remove(Object toRemove) {
        if ((toRemove instanceof org.tes.hkx.lib.ext.Unnamed29)&&removeFromStages(((org.tes.hkx.lib.ext.Unnamed29) toRemove))) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString()+" ["+this.getName()+"]";
    }

	@Override
	public Collection<IHkVisitable> objects() {
		// TODO Auto-generated method stub
		return null;
	}

}
