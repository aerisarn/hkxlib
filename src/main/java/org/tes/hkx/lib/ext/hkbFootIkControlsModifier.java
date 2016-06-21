
package org.tes.hkx.lib.ext;

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
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
@XmlDiscriminatorValue("0xe5b6f544")
@XmlType(propOrder = {
    "variableBindingSet",
    "userData",
    "name",
    "enable",
    "controlData",
    "legs",
    "errorOutTranslation",
    "alignWithGroundRotation"
})
public class hkbFootIkControlsModifier
    extends HkobjectType
    implements IHkContainer, IHkVisitable
{

    private hkbVariableBindingSet variableBindingSet;
    private String userData;
    private String childname;
    private String enable;
    private Unnamed73 controlData;
    @XmlElement(name = "hkparam[@name=\"legs\"]/hkobject", required = true, nillable = true)
    private ArrayList<org.tes.hkx.lib.ext.Unnamed75> legs;
    @XmlPath("hkparam[@name=\"legs\"]/@numelements")
    private Integer numlegs;
    private String errorOutTranslation;
    private String alignWithGroundRotation;

    public hkbFootIkControlsModifier() {
        setVariableBindingSet(null);
        setUserData("0");
        setName("FootIKControlsModifier");
        setEnable("true");
        setControlData(null);
        legs = new ArrayList<org.tes.hkx.lib.ext.Unnamed75>();
        numlegs = 0;
        setErrorOutTranslation("(0.000000 4971617746849628200.000000 -1.#IND00 0.000000)");
        setAlignWithGroundRotation("(0.000000 0.000000 0.000000 1.000000)");
        setClazz("hkbFootIkControlsModifier");
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

    @XmlElement(name = "hkparam[@name=\"controlData\"]/hkobject")
    public Unnamed73 getControlData() {
        return controlData;
    }

    public void setControlData(Unnamed73 newControlData) {
        this.controlData = newControlData;
    }

    public Integer getNumLegs() {
        return numlegs;
    }

    public Iterable<org.tes.hkx.lib.ext.Unnamed75> getLegs() {
        return legs;
    }

    public org.tes.hkx.lib.ext.Unnamed75 getLegsAt(int index) {
        return legs.get(index);
    }

    public boolean addToLegs(org.tes.hkx.lib.ext.Unnamed75 newLegs) {
        if (legs.add(newLegs)) {
            numlegs += 1;
            return true;
        }
        return false;
    }

    @ObjectLink
    public boolean removeFromLegs(org.tes.hkx.lib.ext.Unnamed75 legsToRemove) {
        if (legs.remove(legsToRemove)) {
            numlegs += -1;
            return true;
        }
        return false;
    }

    public org.tes.hkx.lib.ext.Unnamed75 removeFromLegsAt(int index) {
        org.tes.hkx.lib.ext.Unnamed75 toRemove;
        toRemove = legs.remove(index);
        if (!(null == toRemove)) {
            numlegs += -1;
            return toRemove;
        }
        return null;
    }

    @XmlPath("hkparam[@name=\"errorOutTranslation\"]/text()")
    public String getErrorOutTranslation() {
        return errorOutTranslation;
    }

    @XmlPath("hkparam[@name=\"errorOutTranslation\"]/text()")
    public void setErrorOutTranslation(String newErrorOutTranslation) {
        this.errorOutTranslation = newErrorOutTranslation;
    }

    @XmlPath("hkparam[@name=\"alignWithGroundRotation\"]/text()")
    public String getAlignWithGroundRotation() {
        return alignWithGroundRotation;
    }

    @XmlPath("hkparam[@name=\"alignWithGroundRotation\"]/text()")
    public void setAlignWithGroundRotation(String newAlignWithGroundRotation) {
        this.alignWithGroundRotation = newAlignWithGroundRotation;
    }

    @Override
    public<T >T accept(IHkVisitor<T> visitor) {
        visitor.visit(this);
        if (!(null == getVariableBindingSet())) {
            getVariableBindingSet().accept(visitor);
        }
        if (!(null == getControlData())) {
            getControlData().accept(visitor);
        }
        for (org.tes.hkx.lib.ext.Unnamed75 child: getLegs()) {
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
        if (!(null == getControlData())) {
            getControlData().accept(visitor, this);
        }
        for (org.tes.hkx.lib.ext.Unnamed75 child: getLegs()) {
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
        if (!(null == getControlData())) {
            theseObjects.add(getControlData());
        }
        for (org.tes.hkx.lib.ext.Unnamed75 child: getLegs()) {
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
        if ((getControlData()!= null)&&getControlData().equals(toRemove)) {
            setControlData(null);
            return true;
        }
        if ((toRemove instanceof org.tes.hkx.lib.ext.Unnamed75)&&removeFromLegs(((org.tes.hkx.lib.ext.Unnamed75) toRemove))) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString()+" ["+this.getName()+"]";
    }

}
