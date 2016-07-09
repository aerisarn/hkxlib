
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
@XmlDiscriminatorValue("0x703d7b66")
@XmlType(propOrder = {
    "variableBindingSet",
    "userData",
    "name",
    "enable",
    "targetPosition",
    "radius",
    "movementDirection",
    "triggerEvent"
})
public class BSPassByTargetTriggerModifier
    extends HkobjectType
    implements IHkContainer, IHkVisitable
{

    private hkbVariableBindingSet variableBindingSet;
    private String userData;
    private String childname;
    private String enable;
    private String targetPosition;
    private String radius;
    private String movementDirection;
    private innerEvent triggerEvent;

    public BSPassByTargetTriggerModifier() {
        setVariableBindingSet(null);
        setUserData("1");
        setName("BSPassByTargetTriggerModifier_Flight");
        setEnable("true");
        setTargetPosition("(0.000000 0.000000 0.000000 0.000000)");
        setRadius("4000.000000");
        setMovementDirection("(0.000000 0.000000 0.000000 0.000000)");
        setTriggerEvent(null);
        setClazz("BSPassByTargetTriggerModifier");
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

    @XmlPath("hkparam[@name=\"targetPosition\"]/text()")
    public String getTargetPosition() {
        return targetPosition;
    }

    @XmlPath("hkparam[@name=\"targetPosition\"]/text()")
    public void setTargetPosition(String newTargetPosition) {
        this.targetPosition = newTargetPosition;
    }

    @XmlPath("hkparam[@name=\"radius\"]/text()")
    public String getRadius() {
        return radius;
    }

    @XmlPath("hkparam[@name=\"radius\"]/text()")
    public void setRadius(String newRadius) {
        this.radius = newRadius;
    }

    @XmlPath("hkparam[@name=\"movementDirection\"]/text()")
    public String getMovementDirection() {
        return movementDirection;
    }

    @XmlPath("hkparam[@name=\"movementDirection\"]/text()")
    public void setMovementDirection(String newMovementDirection) {
        this.movementDirection = newMovementDirection;
    }

    @XmlElement(name = "hkparam[@name=\"triggerEvent\"]/hkobject")
    public innerEvent getTriggerEvent() {
        return triggerEvent;
    }

    public void setTriggerEvent(innerEvent newTriggerEvent) {
        this.triggerEvent = newTriggerEvent;
    }

    @Override
    public<T >T accept(IHkVisitor<T> visitor) {
        visitor.visit(this);
        if (!(null == getVariableBindingSet())) {
            getVariableBindingSet().accept(visitor);
        }
        if (!(null == getTriggerEvent())) {
            getTriggerEvent().accept(visitor);
        }
        return visitor.getResults();
    }

    @Override
    public<T >T accept(IHkParentVisitor<T> visitor, IHkVisitable parent) {
        visitor.visit(this, parent);
        if (!(null == getVariableBindingSet())) {
            getVariableBindingSet().accept(visitor, this);
        }
        if (!(null == getTriggerEvent())) {
            getTriggerEvent().accept(visitor, this);
        }
        return visitor.getResults();
    }

    @Override
    public Collection<IHkVisitable> objects() {
        Collection<IHkVisitable> theseObjects = new ArrayList<IHkVisitable>();
        if (!(null == getVariableBindingSet())) {
            theseObjects.add(getVariableBindingSet());
        }
        if (!(null == getTriggerEvent())) {
            theseObjects.add(getTriggerEvent());
        }
        return theseObjects;
    }

    @Override
    public boolean remove(Object toRemove) {
        if ((getVariableBindingSet()!= null)&&getVariableBindingSet().equals(toRemove)) {
            setVariableBindingSet(null);
            return true;
        }
        if ((getTriggerEvent()!= null)&&getTriggerEvent().equals(toRemove)) {
            setTriggerEvent(null);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString()+" ["+this.getName()+"]";
    }

}
