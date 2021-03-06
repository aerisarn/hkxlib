
package org.tes.hkx.lib.ext;

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
@XmlDiscriminatorValue("0x877ebc0b")
@XmlType(propOrder = {
    "variableBindingSet",
    "userData",
    "name",
    "enable",
    "degreesPerSecond",
    "speedMultiplier",
    "axisOfRotation"
})
public class hkbRotateCharacterModifier
    extends HkobjectType
    implements IHkContainer, IHkVisitable
{

    private hkbVariableBindingSet variableBindingSet;
    private String userData;
    private String childname;
    private String enable;
    private String degreesPerSecond;
    private String speedMultiplier;
    private String axisOfRotation;

    public hkbRotateCharacterModifier() {
        setVariableBindingSet(null);
        setUserData("0");
        setName("Default_RotateModifier");
        setEnable("true");
        setDegreesPerSecond("90.000000");
        setSpeedMultiplier("1.000000");
        setAxisOfRotation("(0.000000 0.000000 1.000000 0.000000)");
        setClazz("hkbRotateCharacterModifier");
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

    @XmlPath("hkparam[@name=\"degreesPerSecond\"]/text()")
    public String getDegreesPerSecond() {
        return degreesPerSecond;
    }

    @XmlPath("hkparam[@name=\"degreesPerSecond\"]/text()")
    public void setDegreesPerSecond(String newDegreesPerSecond) {
        this.degreesPerSecond = newDegreesPerSecond;
    }

    @XmlPath("hkparam[@name=\"speedMultiplier\"]/text()")
    public String getSpeedMultiplier() {
        return speedMultiplier;
    }

    @XmlPath("hkparam[@name=\"speedMultiplier\"]/text()")
    public void setSpeedMultiplier(String newSpeedMultiplier) {
        this.speedMultiplier = newSpeedMultiplier;
    }

    @XmlPath("hkparam[@name=\"axisOfRotation\"]/text()")
    public String getAxisOfRotation() {
        return axisOfRotation;
    }

    @XmlPath("hkparam[@name=\"axisOfRotation\"]/text()")
    public void setAxisOfRotation(String newAxisOfRotation) {
        this.axisOfRotation = newAxisOfRotation;
    }

    @Override
    public<T >T accept(IHkVisitor<T> visitor) {
        visitor.visit(this);
        if (!(null == getVariableBindingSet())) {
            getVariableBindingSet().accept(visitor);
        }
        return visitor.getResults();
    }

    @Override
    public<T >T accept(IHkParentVisitor<T> visitor, IHkVisitable parent) {
        visitor.visit(this, parent);
        if (!(null == getVariableBindingSet())) {
            getVariableBindingSet().accept(visitor, this);
        }
        return visitor.getResults();
    }

    @Override
    public Collection<IHkVisitable> objects() {
        Collection<IHkVisitable> theseObjects = new ArrayList<IHkVisitable>();
        if (!(null == getVariableBindingSet())) {
            theseObjects.add(getVariableBindingSet());
        }
        return theseObjects;
    }

    @Override
    public boolean remove(Object toRemove) {
        if ((getVariableBindingSet()!= null)&&getVariableBindingSet().equals(toRemove)) {
            setVariableBindingSet(null);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString()+" ["+this.getName()+"]";
    }

}
