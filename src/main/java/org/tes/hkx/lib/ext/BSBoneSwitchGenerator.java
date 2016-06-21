
package org.tes.hkx.lib.ext;

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlType;
import org.eclipse.persistence.oxm.annotations.XmlDiscriminatorValue;
import org.eclipse.persistence.oxm.annotations.XmlPath;
import org.tes.hkx.lib.HkobjectType;
import org.tes.hkx.model.IHkContainer;
import org.tes.hkx.model.IHkParentVisitor;
import org.tes.hkx.model.IHkVisitable;
import org.tes.hkx.model.IHkVisitor;
import org.tes.hkx.model.ObjectLink;

@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlDiscriminatorValue("0xf33d3eea")
@XmlType(propOrder = {
    "variableBindingSet",
    "userData",
    "name",
    "PDefaultGenerator",
    "ChildrenA"
})
public class BSBoneSwitchGenerator
    extends HkobjectType
    implements IHkContainer, IHkVisitable
{

    private hkbVariableBindingSet variableBindingSet;
    private String userData;
    private String childname;
    private HkobjectType pDefaultGenerator;
    @XmlIDREF
    @XmlPath("hkparam[@name=\"ChildrenA\"]/text()")
    @XmlList
    private ArrayList<BSBoneSwitchGeneratorBoneData> ChildrenA;
    @XmlPath("hkparam[@name=\"ChildrenA\"]/@numelements")
    private Integer numChildrenA;

    public BSBoneSwitchGenerator() {
        setVariableBindingSet(null);
        setUserData("1");
        setName("1HM_Idle_1stPBodyCameraBoneSwitch");
        setPDefaultGenerator(null);
        ChildrenA = new ArrayList<BSBoneSwitchGeneratorBoneData>();
        numChildrenA = 0;
        setClazz("BSBoneSwitchGenerator");
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

    @XmlIDREF
    @XmlPath("hkparam[@name=\"pDefaultGenerator\"]/text()")
    @ObjectLink
    public HkobjectType getPDefaultGenerator() {
        return pDefaultGenerator;
    }

    public void setPDefaultGenerator(HkobjectType newPDefaultGenerator) {
        this.pDefaultGenerator = newPDefaultGenerator;
    }

    public Integer getNumChildrenA() {
        return numChildrenA;
    }

    public Iterable<BSBoneSwitchGeneratorBoneData> getChildrenA() {
        return ChildrenA;
    }

    public BSBoneSwitchGeneratorBoneData getChildrenAAt(int index) {
        return ChildrenA.get(index);
    }

    public boolean addToChildrenA(BSBoneSwitchGeneratorBoneData newChildrenA) {
        if (ChildrenA.add(newChildrenA)) {
            numChildrenA += 1;
            return true;
        }
        return false;
    }

    @ObjectLink
    public boolean removeFromChildrenA(BSBoneSwitchGeneratorBoneData ChildrenAToRemove) {
        if (ChildrenA.remove(ChildrenAToRemove)) {
            numChildrenA += -1;
            return true;
        }
        return false;
    }

    public BSBoneSwitchGeneratorBoneData removeFromChildrenAAt(int index) {
        BSBoneSwitchGeneratorBoneData toRemove;
        toRemove = ChildrenA.remove(index);
        if (!(null == toRemove)) {
            numChildrenA += -1;
            return toRemove;
        }
        return null;
    }

    @Override
    public<T >T accept(IHkVisitor<T> visitor) {
        visitor.visit(this);
        if (!(null == getVariableBindingSet())) {
            getVariableBindingSet().accept(visitor);
        }
        if (!(null == getPDefaultGenerator())) {
            getPDefaultGenerator().accept(visitor);
        }
        for (BSBoneSwitchGeneratorBoneData child: getChildrenA()) {
            child.accept(visitor);
        }
        return visitor.getResults();
    }

    @Override
    public<T >T accept(IHkParentVisitor<T> visitor, IHkVisitable parent) {
        visitor.visit(this, parent);
        if (!(null == getVariableBindingSet())) {
            getVariableBindingSet().accept(visitor, this);
        }
        if (!(null == getPDefaultGenerator())) {
            getPDefaultGenerator().accept(visitor, this);
        }
        for (BSBoneSwitchGeneratorBoneData child: getChildrenA()) {
            child.accept(visitor, this);
        }
        return visitor.getResults();
    }

    @Override
    public Collection<IHkVisitable> objects() {
        Collection<IHkVisitable> theseObjects = new ArrayList<IHkVisitable>();
        if (!(null == getVariableBindingSet())) {
            theseObjects.add(getVariableBindingSet());
        }
        if (!(null == getPDefaultGenerator())) {
            theseObjects.add(getPDefaultGenerator());
        }
        for (BSBoneSwitchGeneratorBoneData child: getChildrenA()) {
            theseObjects.add(child);
        }
        return theseObjects;
    }

    @Override
    public boolean remove(Object toRemove) {
        if ((getVariableBindingSet()!= null)&&getVariableBindingSet().equals(toRemove)) {
            setVariableBindingSet(null);
            return true;
        }
        if ((getPDefaultGenerator()!= null)&&getPDefaultGenerator().equals(toRemove)) {
            setPDefaultGenerator(null);
            return true;
        }
        if ((toRemove instanceof BSBoneSwitchGeneratorBoneData)&&removeFromChildrenA(((BSBoneSwitchGeneratorBoneData) toRemove))) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString()+" ["+this.getName()+"]";
    }

}
