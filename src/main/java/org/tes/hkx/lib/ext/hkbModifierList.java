
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
@XmlDiscriminatorValue("0xa4180ca1")
@XmlType(propOrder = {
    "variableBindingSet",
    "userData",
    "name",
    "enable",
    "modifiers"
})
public class hkbModifierList
    extends HkobjectType
    implements IHkContainer, IHkVisitable
{

    private hkbVariableBindingSet variableBindingSet;
    private String userData;
    private String childname;
    private String enable;
    @XmlIDREF
    @XmlPath("hkparam[@name=\"modifiers\"]/text()")
    @XmlList
    private ArrayList<HkobjectType> modifiers;
    @XmlPath("hkparam[@name=\"modifiers\"]/@numelements")
    private Integer nummodifiers;

    public hkbModifierList() {
        setVariableBindingSet(null);
        setUserData("1");
        setName("MatchAndSendGetup");
        setEnable("true");
        modifiers = new ArrayList<HkobjectType>();
        nummodifiers = 0;
        setClazz("hkbModifierList");
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

    public Integer getNumModifiers() {
        return nummodifiers;
    }

    public Iterable<HkobjectType> getModifiers() {
        return modifiers;
    }

    public HkobjectType getModifiersAt(int index) {
        return modifiers.get(index);
    }

    public boolean addToModifiers(HkobjectType newModifiers) {
        if (modifiers.add(newModifiers)) {
            nummodifiers += 1;
            return true;
        }
        return false;
    }

    @ObjectLink
    public boolean removeFromModifiers(HkobjectType modifiersToRemove) {
        if (modifiers.remove(modifiersToRemove)) {
            nummodifiers += -1;
            return true;
        }
        return false;
    }

    public HkobjectType removeFromModifiersAt(int index) {
        HkobjectType toRemove;
        toRemove = modifiers.remove(index);
        if (!(null == toRemove)) {
            nummodifiers += -1;
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
        for (HkobjectType child: getModifiers()) {
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
        for (HkobjectType child: getModifiers()) {
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
        for (HkobjectType child: getModifiers()) {
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
        if ((toRemove instanceof HkobjectType)&&removeFromModifiers(((HkobjectType) toRemove))) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString()+" ["+this.getName()+"]";
    }

}
