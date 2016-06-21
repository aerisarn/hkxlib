
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
@XmlDiscriminatorValue("0xd297fda9")
@XmlType(propOrder = {
    "variableBindingSet",
    "userData",
    "name",
    "enable",
    "state",
    "direction",
    "goalSpeed",
    "speedOut"
})
public class BSSpeedSamplerModifier
    extends HkobjectType
    implements IHkContainer, IHkVisitable
{

    private hkbVariableBindingSet variableBindingSet;
    private String userData;
    private String childname;
    private String enable;
    private String state;
    private String direction;
    private String goalSpeed;
    private String speedOut;

    public BSSpeedSamplerModifier() {
        setVariableBindingSet(null);
        setUserData("2");
        setName("BSSpeedSamplerModifier");
        setEnable("true");
        setState("-1");
        setDirection("0.000000");
        setGoalSpeed("0.000000");
        setSpeedOut("0.000000");
        setClazz("BSSpeedSamplerModifier");
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

    @XmlPath("hkparam[@name=\"state\"]/text()")
    public String getState() {
        return state;
    }

    @XmlPath("hkparam[@name=\"state\"]/text()")
    public void setState(String newState) {
        this.state = newState;
    }

    @XmlPath("hkparam[@name=\"direction\"]/text()")
    public String getDirection() {
        return direction;
    }

    @XmlPath("hkparam[@name=\"direction\"]/text()")
    public void setDirection(String newDirection) {
        this.direction = newDirection;
    }

    @XmlPath("hkparam[@name=\"goalSpeed\"]/text()")
    public String getGoalSpeed() {
        return goalSpeed;
    }

    @XmlPath("hkparam[@name=\"goalSpeed\"]/text()")
    public void setGoalSpeed(String newGoalSpeed) {
        this.goalSpeed = newGoalSpeed;
    }

    @XmlPath("hkparam[@name=\"speedOut\"]/text()")
    public String getSpeedOut() {
        return speedOut;
    }

    @XmlPath("hkparam[@name=\"speedOut\"]/text()")
    public void setSpeedOut(String newSpeedOut) {
        this.speedOut = newSpeedOut;
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
