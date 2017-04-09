
package org.tes.hkx.lib.ext;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.eclipse.persistence.oxm.annotations.XmlDiscriminatorValue;
import org.eclipse.persistence.oxm.annotations.XmlPath;
import org.tes.hkx.lib.HkParenthesysVectorAdapter;
import org.tes.hkx.lib.HkobjectType;

@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlDiscriminatorValue("0x5a218502")
@XmlType(propOrder = {
    "attributeGroups",
    "name",
    "object",
    "keyFrames",
    "children",
    "annotations",
    "userProperties",
    "selected"
})
public class hkxNode
    extends HkobjectType
{

    @XmlJavaTypeAdapter(HkParenthesysVectorAdapter.class)
    @XmlPath("hkparam[@name=\"attributeGroups\"]/text()")
    private ArrayList<String> attributeGroups;
    @XmlPath("hkparam[@name=\"attributeGroups\"]/@numelements")
    private Integer numattributeGroups;
    private String childname;
    private hkxCamera object;
    @XmlJavaTypeAdapter(HkParenthesysVectorAdapter.class)
    @XmlPath("hkparam[@name=\"keyFrames\"]/text()")
    private ArrayList<String> keyFrames;
    @XmlPath("hkparam[@name=\"keyFrames\"]/@numelements")
    private Integer numkeyFrames;
    @XmlPath("hkparam[@name=\"children\"]/hkobject")
    private ArrayList<org.tes.hkx.lib.ext.hkxNode> children;
    @XmlPath("hkparam[@name=\"children\"]/@numelements")
    private Integer numchildren;
    @XmlPath("hkparam[@name=\"annotations\"]/hkobject")
    private ArrayList<org.tes.hkx.lib.ext.hkxNode> annotations;
    @XmlPath("hkparam[@name=\"annotations\"]/@numelements")
    private Integer numannotations;
    private String userProperties;
    private String selected;

    public hkxNode() {
        attributeGroups = new ArrayList<String>();
        numattributeGroups = 0;
        setName("SiltStrider2");
        setObject(null);
        keyFrames = new ArrayList<String>();
        numkeyFrames = 0;
        children = new ArrayList<org.tes.hkx.lib.ext.hkxNode>();
        numchildren = 0;
        annotations = new ArrayList<org.tes.hkx.lib.ext.hkxNode>();
        numannotations = 0;
        setUserProperties("\u2400");
        setSelected("false");
    }

    public hkxNode(hkxNode toCopy, Boolean deepCopy) {
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
        if (!(toCopy.getObject() == null)) {
            if (deepCopy == true) {
                setObject(new hkxCamera(toCopy.getObject(), deepCopy));
            } else {
                setObject(toCopy.getObject());
            }
        }
        keyFrames = new ArrayList<String>();
        numkeyFrames = 0;
        for (String obj: toCopy.getKeyFrames()) {
            if (deepCopy == true) {
                addToKeyFrames(new String(obj));
            } else {
                addToKeyFrames(obj);
            }
        }
        children = new ArrayList<org.tes.hkx.lib.ext.hkxNode>();
        numchildren = 0;
        for (org.tes.hkx.lib.ext.hkxNode obj: toCopy.getChildren()) {
            if (deepCopy == true) {
                addToChildren(new org.tes.hkx.lib.ext.hkxNode(obj, deepCopy));
            } else {
                addToChildren(obj);
            }
        }
        annotations = new ArrayList<org.tes.hkx.lib.ext.hkxNode>();
        numannotations = 0;
        for (org.tes.hkx.lib.ext.hkxNode obj: toCopy.getAnnotations()) {
            if (deepCopy == true) {
                addToAnnotations(new org.tes.hkx.lib.ext.hkxNode(obj, deepCopy));
            } else {
                addToAnnotations(obj);
            }
        }
        if (!(toCopy.getUserProperties() == null)) {
            if (deepCopy == true) {
                setUserProperties(new String(toCopy.getUserProperties()));
            } else {
                setUserProperties(toCopy.getUserProperties());
            }
        }
        if (!(toCopy.getSelected() == null)) {
            if (deepCopy == true) {
                setSelected(new String(toCopy.getSelected()));
            } else {
                setSelected(toCopy.getSelected());
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

    @XmlPath("hkparam[@name=\"object\"]/text()")
    public hkxCamera getObject() {
        return object;
    }

    @XmlPath("hkparam[@name=\"object\"]/text()")
    public void setObject(hkxCamera newObject) {
        this.object = newObject;
    }

    public Integer getNumKeyFrames() {
        return numkeyFrames;
    }

    public Iterable<String> getKeyFrames() {
        return keyFrames;
    }

    public String getKeyFramesAt(int index) {
        return keyFrames.get(index);
    }

    public boolean addToKeyFrames(String newKeyFrames) {
        if (keyFrames.add(newKeyFrames)) {
            numkeyFrames += 1;
            return true;
        }
        return false;
    }

    public boolean removeFromKeyFrames(String keyFramesToRemove) {
        if (keyFrames.remove(keyFramesToRemove)) {
            numkeyFrames += -1;
            return true;
        }
        return false;
    }

    public String removeFromKeyFramesAt(int index) {
        String toRemove;
        toRemove = keyFrames.remove(index);
        if (!(null == toRemove)) {
            numkeyFrames += -1;
            return toRemove;
        }
        return null;
    }

    public Integer getNumChildren() {
        return numchildren;
    }

    public Iterable<org.tes.hkx.lib.ext.hkxNode> getChildren() {
        return children;
    }

    public org.tes.hkx.lib.ext.hkxNode getChildrenAt(int index) {
        return children.get(index);
    }

    public boolean addToChildren(org.tes.hkx.lib.ext.hkxNode newChildren) {
        if (children.add(newChildren)) {
            numchildren += 1;
            return true;
        }
        return false;
    }

    public boolean removeFromChildren(org.tes.hkx.lib.ext.hkxNode childrenToRemove) {
        if (children.remove(childrenToRemove)) {
            numchildren += -1;
            return true;
        }
        return false;
    }

    public org.tes.hkx.lib.ext.hkxNode removeFromChildrenAt(int index) {
        org.tes.hkx.lib.ext.hkxNode toRemove;
        toRemove = children.remove(index);
        if (!(null == toRemove)) {
            numchildren += -1;
            return toRemove;
        }
        return null;
    }

    public Integer getNumAnnotations() {
        return numannotations;
    }

    public Iterable<org.tes.hkx.lib.ext.hkxNode> getAnnotations() {
        return annotations;
    }

    public org.tes.hkx.lib.ext.hkxNode getAnnotationsAt(int index) {
        return annotations.get(index);
    }

    public boolean addToAnnotations(org.tes.hkx.lib.ext.hkxNode newAnnotations) {
        if (annotations.add(newAnnotations)) {
            numannotations += 1;
            return true;
        }
        return false;
    }

    public boolean removeFromAnnotations(org.tes.hkx.lib.ext.hkxNode annotationsToRemove) {
        if (annotations.remove(annotationsToRemove)) {
            numannotations += -1;
            return true;
        }
        return false;
    }

    public org.tes.hkx.lib.ext.hkxNode removeFromAnnotationsAt(int index) {
        org.tes.hkx.lib.ext.hkxNode toRemove;
        toRemove = annotations.remove(index);
        if (!(null == toRemove)) {
            numannotations += -1;
            return toRemove;
        }
        return null;
    }

    @XmlPath("hkparam[@name=\"userProperties\"]/text()")
    public String getUserProperties() {
        return userProperties;
    }

    @XmlPath("hkparam[@name=\"userProperties\"]/text()")
    public void setUserProperties(String newUserProperties) {
        this.userProperties = newUserProperties;
    }

    @XmlPath("hkparam[@name=\"selected\"]/text()")
    public String getSelected() {
        return selected;
    }

    @XmlPath("hkparam[@name=\"selected\"]/text()")
    public void setSelected(String newSelected) {
        this.selected = newSelected;
    }

    @Override
    public String toString() {
        return super.toString()+" ["+this.getName()+"]";
    }

}
