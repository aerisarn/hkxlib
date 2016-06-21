
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
@XmlDiscriminatorValue("0xfd8584fe")
@XmlType(propOrder = {
    "variableBindingSet",
    "userData",
    "name",
    "selfTransitionMode",
    "eventMode",
    "duration",
    "toGeneratorStartTimeFraction",
    "flags",
    "endMode",
    "blendCurve"
})
public class hkbBlendingTransitionEffect
    extends HkobjectType
    implements IHkContainer, IHkVisitable
{

    private hkbVariableBindingSet variableBindingSet;
    private String userData;
    private String childname;
    private String selfTransitionMode;
    private String eventMode;
    private String duration;
    private HkobjectType toGeneratorStartTimeFraction;
    private String flags;
    private String endMode;
    private String blendCurve;

    public hkbBlendingTransitionEffect() {
        setVariableBindingSet(null);
        setUserData("0");
        setName("BlendingTransitionEffect00");
        setSelfTransitionMode("SELF_TRANSITION_MODE_CONTINUE_IF_CYCLIC_BLEND_IF_ACYCLIC");
        setEventMode("EVENT_MODE_DEFAULT");
        setDuration("0.000000");
        setToGeneratorStartTimeFraction(null);
        setFlags("0");
        setEndMode("END_MODE_NONE");
        setBlendCurve("BLEND_CURVE_SMOOTH");
        setClazz("hkbBlendingTransitionEffect");
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

    @XmlPath("hkparam[@name=\"selfTransitionMode\"]/text()")
    public String getSelfTransitionMode() {
        return selfTransitionMode;
    }

    @XmlPath("hkparam[@name=\"selfTransitionMode\"]/text()")
    public void setSelfTransitionMode(String newSelfTransitionMode) {
        this.selfTransitionMode = newSelfTransitionMode;
    }

    @XmlPath("hkparam[@name=\"eventMode\"]/text()")
    public String getEventMode() {
        return eventMode;
    }

    @XmlPath("hkparam[@name=\"eventMode\"]/text()")
    public void setEventMode(String newEventMode) {
        this.eventMode = newEventMode;
    }

    @XmlPath("hkparam[@name=\"duration\"]/text()")
    public String getDuration() {
        return duration;
    }

    @XmlPath("hkparam[@name=\"duration\"]/text()")
    public void setDuration(String newDuration) {
        this.duration = newDuration;
    }

    @XmlIDREF
    @XmlPath("hkparam[@name=\"toGeneratorStartTimeFraction\"]/text()")
    @ObjectLink
    public HkobjectType getToGeneratorStartTimeFraction() {
        return toGeneratorStartTimeFraction;
    }

    public void setToGeneratorStartTimeFraction(HkobjectType newToGeneratorStartTimeFraction) {
        this.toGeneratorStartTimeFraction = newToGeneratorStartTimeFraction;
    }

    @XmlPath("hkparam[@name=\"flags\"]/text()")
    public String getFlags() {
        return flags;
    }

    @XmlPath("hkparam[@name=\"flags\"]/text()")
    public void setFlags(String newFlags) {
        this.flags = newFlags;
    }

    @XmlPath("hkparam[@name=\"endMode\"]/text()")
    public String getEndMode() {
        return endMode;
    }

    @XmlPath("hkparam[@name=\"endMode\"]/text()")
    public void setEndMode(String newEndMode) {
        this.endMode = newEndMode;
    }

    @XmlPath("hkparam[@name=\"blendCurve\"]/text()")
    public String getBlendCurve() {
        return blendCurve;
    }

    @XmlPath("hkparam[@name=\"blendCurve\"]/text()")
    public void setBlendCurve(String newBlendCurve) {
        this.blendCurve = newBlendCurve;
    }

    @Override
    public<T >T accept(IHkVisitor<T> visitor) {
        visitor.visit(this);
        if (!(null == getVariableBindingSet())) {
            getVariableBindingSet().accept(visitor);
        }
        if (!(null == getToGeneratorStartTimeFraction())) {
            getToGeneratorStartTimeFraction().accept(visitor);
        }
        return visitor.getResults();
    }

    @Override
    public<T >T accept(IHkParentVisitor<T> visitor, IHkVisitable parent) {
        visitor.visit(this, parent);
        if (!(null == getVariableBindingSet())) {
            getVariableBindingSet().accept(visitor, this);
        }
        if (!(null == getToGeneratorStartTimeFraction())) {
            getToGeneratorStartTimeFraction().accept(visitor, this);
        }
        return visitor.getResults();
    }

    @Override
    public Collection<IHkVisitable> objects() {
        Collection<IHkVisitable> theseObjects = new ArrayList<IHkVisitable>();
        if (!(null == getVariableBindingSet())) {
            theseObjects.add(getVariableBindingSet());
        }
        if (!(null == getToGeneratorStartTimeFraction())) {
            theseObjects.add(getToGeneratorStartTimeFraction());
        }
        return theseObjects;
    }

    @Override
    public boolean remove(Object toRemove) {
        if ((getVariableBindingSet()!= null)&&getVariableBindingSet().equals(toRemove)) {
            setVariableBindingSet(null);
            return true;
        }
        if ((getToGeneratorStartTimeFraction()!= null)&&getToGeneratorStartTimeFraction().equals(toRemove)) {
            setToGeneratorStartTimeFraction(null);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString()+" ["+this.getName()+"]";
    }

}
