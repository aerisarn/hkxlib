
package org.tes.hkx.lib.ext;

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.eclipse.persistence.oxm.annotations.XmlDiscriminatorValue;
import org.eclipse.persistence.oxm.annotations.XmlPath;
import org.tes.hkx.lib.HkParenthesysVectorAdapter;
import org.tes.hkx.lib.HkobjectType;
import org.tes.hkx.model.IHkContainer;
import org.tes.hkx.model.IHkParentVisitor;
import org.tes.hkx.model.IHkVisitable;
import org.tes.hkx.model.IHkVisitor;
import org.tes.hkx.model.ObjectLink;

@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlDiscriminatorValue("0x95f66629")
@XmlType(propOrder = {
    "variableBindingSet",
    "userData",
    "name",
    "enable",
    "keyframeInfo",
    "keyframedBonesList"
})
public class hkbKeyframeBonesModifier
    extends HkobjectType
    implements IHkContainer, IHkVisitable
{

    private hkbVariableBindingSet variableBindingSet;
    private String userData;
    private String childname;
    private String enable;
    @XmlJavaTypeAdapter(HkParenthesysVectorAdapter.class)
    @XmlPath("hkparam[@name=\"keyframeInfo\"]/text()")
    private ArrayList<String> keyframeInfo;
    @XmlPath("hkparam[@name=\"keyframeInfo\"]/@numelements")
    private Integer numkeyframeInfo;
    private hkbBoneIndexArray keyframedBonesList;

    public hkbKeyframeBonesModifier() {
        setVariableBindingSet(null);
        setUserData("1");
        setName("KeyframeLowerBody");
        setEnable("true");
        keyframeInfo = new ArrayList<String>();
        numkeyframeInfo = 0;
        setKeyframedBonesList(null);
        setClazz("hkbKeyframeBonesModifier");
    }

    @XmlIDREF
    @XmlPath("hkparam[@name=\"variableBindingSet\"]/text()")
    @ObjectLink
    public hkbVariableBindingSet getVariableBindingSet() {
        return variableBindingSet;
    }

    public void setVariableBindingSet(hkbVariableBindingSet newVariableBindingSet) {
        this.variableBindingSet = newVariableBindingSet;
    }

    @XmlPath("hkparam[@name=\"userData\"]/text()")
    public String getUserData() {
        return userData;
    }

    @XmlPath("hkparam[@name=\"userData\"]/text()")
    public void setUserData(String newUserData) {
        this.userData = newUserData;
    }

    @XmlPath("hkparam[@name=\"name\"]/text()")
    public String getName() {
        return childname;
    }

    @XmlPath("hkparam[@name=\"name\"]/text()")
    public void setName(String newName) {
        this.childname = newName;
    }

    @XmlPath("hkparam[@name=\"enable\"]/text()")
    public String getEnable() {
        return enable;
    }

    @XmlPath("hkparam[@name=\"enable\"]/text()")
    public void setEnable(String newEnable) {
        this.enable = newEnable;
    }

    public Integer getNumKeyframeInfo() {
        return numkeyframeInfo;
    }

    public Iterable<String> getKeyframeInfo() {
        return keyframeInfo;
    }

    public String getKeyframeInfoAt(int index) {
        return keyframeInfo.get(index);
    }

    public boolean addToKeyframeInfo(String newKeyframeInfo) {
        if (keyframeInfo.add(newKeyframeInfo)) {
            numkeyframeInfo += 1;
            return true;
        }
        return false;
    }

    public boolean removeFromKeyframeInfo(String keyframeInfoToRemove) {
        if (keyframeInfo.remove(keyframeInfoToRemove)) {
            numkeyframeInfo += -1;
            return true;
        }
        return false;
    }

    public String removeFromKeyframeInfoAt(int index) {
        String toRemove;
        toRemove = keyframeInfo.remove(index);
        if (!(null == toRemove)) {
            numkeyframeInfo += -1;
            return toRemove;
        }
        return null;
    }

    @XmlIDREF
    @XmlPath("hkparam[@name=\"keyframedBonesList\"]/text()")
    @ObjectLink
    public hkbBoneIndexArray getKeyframedBonesList() {
        return keyframedBonesList;
    }

    public void setKeyframedBonesList(hkbBoneIndexArray newKeyframedBonesList) {
        this.keyframedBonesList = newKeyframedBonesList;
    }

    @Override
    public<T >T accept(IHkVisitor<T> visitor) {
        visitor.visit(this);
        if (!(null == getVariableBindingSet())) {
            getVariableBindingSet().accept(visitor);
        }
        if (!(null == getKeyframedBonesList())) {
            getKeyframedBonesList().accept(visitor);
        }
        return visitor.getResults();
    }

    @Override
    public<T >T accept(IHkParentVisitor<T> visitor, IHkVisitable parent) {
        visitor.visit(this, parent);
        if (!(null == getVariableBindingSet())) {
            getVariableBindingSet().accept(visitor, this);
        }
        if (!(null == getKeyframedBonesList())) {
            getKeyframedBonesList().accept(visitor, this);
        }
        return visitor.getResults();
    }

    @Override
    public Collection<IHkVisitable> objects() {
        Collection<IHkVisitable> theseObjects = new ArrayList<IHkVisitable>();
        if (!(null == getVariableBindingSet())) {
            theseObjects.add(getVariableBindingSet());
        }
        if (!(null == getKeyframedBonesList())) {
            theseObjects.add(getKeyframedBonesList());
        }
        return theseObjects;
    }

    @Override
    public boolean remove(Object toRemove) {
        if ((getVariableBindingSet()!= null)&&getVariableBindingSet().equals(toRemove)) {
            setVariableBindingSet(null);
            return true;
        }
        if ((getKeyframedBonesList()!= null)&&getKeyframedBonesList().equals(toRemove)) {
            setKeyframedBonesList(null);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString()+" ["+this.getName()+"]";
    }

}
