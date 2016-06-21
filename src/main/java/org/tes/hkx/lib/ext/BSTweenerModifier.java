
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
@XmlDiscriminatorValue("0xd2d9a04")
@XmlType(propOrder = {
    "variableBindingSet",
    "userData",
    "name",
    "enable",
    "tweenPosition",
    "tweenRotation",
    "useTweenDuration",
    "tweenDuration",
    "targetPosition",
    "targetRotation"
})
public class BSTweenerModifier
    extends HkobjectType
    implements IHkContainer, IHkVisitable
{

    private hkbVariableBindingSet variableBindingSet;
    private String userData;
    private String childname;
    private String enable;
    private String tweenPosition;
    private String tweenRotation;
    private String useTweenDuration;
    private String tweenDuration;
    private String targetPosition;
    private String targetRotation;

    public BSTweenerModifier() {
        setVariableBindingSet(null);
        setUserData("0");
        setName("BSTweenerModifier_FlightGrab");
        setEnable("true");
        setTweenPosition("true");
        setTweenRotation("true");
        setUseTweenDuration("false");
        setTweenDuration("0.000000");
        setTargetPosition("(0.000000 0.000000 0.000000 0.000000)");
        setTargetRotation("(0.000000 0.000000 0.000000 1.000000)");
        setClazz("BSTweenerModifier");
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

    @XmlPath("hkparam[@name=\"tweenPosition\"]/text()")
    public String getTweenPosition() {
        return tweenPosition;
    }

    @XmlPath("hkparam[@name=\"tweenPosition\"]/text()")
    public void setTweenPosition(String newTweenPosition) {
        this.tweenPosition = newTweenPosition;
    }

    @XmlPath("hkparam[@name=\"tweenRotation\"]/text()")
    public String getTweenRotation() {
        return tweenRotation;
    }

    @XmlPath("hkparam[@name=\"tweenRotation\"]/text()")
    public void setTweenRotation(String newTweenRotation) {
        this.tweenRotation = newTweenRotation;
    }

    @XmlPath("hkparam[@name=\"useTweenDuration\"]/text()")
    public String getUseTweenDuration() {
        return useTweenDuration;
    }

    @XmlPath("hkparam[@name=\"useTweenDuration\"]/text()")
    public void setUseTweenDuration(String newUseTweenDuration) {
        this.useTweenDuration = newUseTweenDuration;
    }

    @XmlPath("hkparam[@name=\"tweenDuration\"]/text()")
    public String getTweenDuration() {
        return tweenDuration;
    }

    @XmlPath("hkparam[@name=\"tweenDuration\"]/text()")
    public void setTweenDuration(String newTweenDuration) {
        this.tweenDuration = newTweenDuration;
    }

    @XmlPath("hkparam[@name=\"targetPosition\"]/text()")
    public String getTargetPosition() {
        return targetPosition;
    }

    @XmlPath("hkparam[@name=\"targetPosition\"]/text()")
    public void setTargetPosition(String newTargetPosition) {
        this.targetPosition = newTargetPosition;
    }

    @XmlPath("hkparam[@name=\"targetRotation\"]/text()")
    public String getTargetRotation() {
        return targetRotation;
    }

    @XmlPath("hkparam[@name=\"targetRotation\"]/text()")
    public void setTargetRotation(String newTargetRotation) {
        this.targetRotation = newTargetRotation;
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
