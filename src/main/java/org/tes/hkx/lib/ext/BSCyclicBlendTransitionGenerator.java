
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
@XmlDiscriminatorValue("0x5119eb06")
@XmlType(propOrder = {
    "variableBindingSet",
    "userData",
    "name",
    "PBlenderGenerator",
    "eventToFreezeBlendValue",
    "eventToCrossBlend",
    "FBlendParameter",
    "FTransitionDuration",
    "EBlendCurve"
})
public class BSCyclicBlendTransitionGenerator
    extends HkobjectType
    implements IHkContainer, IHkVisitable
{

    private hkbVariableBindingSet variableBindingSet;
    private String userData;
    private String childname;
    private HkobjectType pBlenderGenerator;
    private innerEvent EventToFreezeBlendValue;
    private innerEvent EventToCrossBlend;
    private String fBlendParameter;
    private String fTransitionDuration;
    private String eBlendCurve;

    public BSCyclicBlendTransitionGenerator() {
        setVariableBindingSet(null);
        setUserData("0");
        setName("Sneak_BSCyclicBlendTransitionGenerator");
        setPBlenderGenerator(null);
        setEventToFreezeBlendValue(null);
        setEventToCrossBlend(null);
        setFBlendParameter("0.000000");
        setFTransitionDuration("0.200000");
        setEBlendCurve("BLEND_CURVE_SMOOTH");
        setClazz("BSCyclicBlendTransitionGenerator");
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
    @XmlPath("hkparam[@name=\"pBlenderGenerator\"]/text()")
    @ObjectLink
    public HkobjectType getPBlenderGenerator() {
        return pBlenderGenerator;
    }

    public void setPBlenderGenerator(HkobjectType newPBlenderGenerator) {
        this.pBlenderGenerator = newPBlenderGenerator;
    }

    @XmlElement(name = "hkparam[@name=\"EventToFreezeBlendValue\"]/hkobject")
    public innerEvent getEventToFreezeBlendValue() {
        return EventToFreezeBlendValue;
    }

    public void setEventToFreezeBlendValue(innerEvent newEventToFreezeBlendValue) {
        this.EventToFreezeBlendValue = newEventToFreezeBlendValue;
    }

    @XmlElement(name = "hkparam[@name=\"EventToCrossBlend\"]/hkobject")
    public innerEvent getEventToCrossBlend() {
        return EventToCrossBlend;
    }

    public void setEventToCrossBlend(innerEvent newEventToCrossBlend) {
        this.EventToCrossBlend = newEventToCrossBlend;
    }

    @XmlPath("hkparam[@name=\"fBlendParameter\"]/text()")
    public String getFBlendParameter() {
        return fBlendParameter;
    }

    @XmlPath("hkparam[@name=\"fBlendParameter\"]/text()")
    public void setFBlendParameter(String newFBlendParameter) {
        this.fBlendParameter = newFBlendParameter;
    }

    @XmlPath("hkparam[@name=\"fTransitionDuration\"]/text()")
    public String getFTransitionDuration() {
        return fTransitionDuration;
    }

    @XmlPath("hkparam[@name=\"fTransitionDuration\"]/text()")
    public void setFTransitionDuration(String newFTransitionDuration) {
        this.fTransitionDuration = newFTransitionDuration;
    }

    @XmlPath("hkparam[@name=\"eBlendCurve\"]/text()")
    public String getEBlendCurve() {
        return eBlendCurve;
    }

    @XmlPath("hkparam[@name=\"eBlendCurve\"]/text()")
    public void setEBlendCurve(String newEBlendCurve) {
        this.eBlendCurve = newEBlendCurve;
    }

    @Override
    public<T >T accept(IHkVisitor<T> visitor) {
        visitor.visit(this);
        if (!(null == getVariableBindingSet())) {
            getVariableBindingSet().accept(visitor);
        }
        if (!(null == getPBlenderGenerator())) {
            getPBlenderGenerator().accept(visitor);
        }
        if (!(null == getEventToFreezeBlendValue())) {
            getEventToFreezeBlendValue().accept(visitor);
        }
        if (!(null == getEventToCrossBlend())) {
            getEventToCrossBlend().accept(visitor);
        }
        return visitor.getResults();
    }

    @Override
    public<T >T accept(IHkParentVisitor<T> visitor, IHkVisitable parent) {
        visitor.visit(this, parent);
        if (!(null == getVariableBindingSet())) {
            getVariableBindingSet().accept(visitor, this);
        }
        if (!(null == getPBlenderGenerator())) {
            getPBlenderGenerator().accept(visitor, this);
        }
        if (!(null == getEventToFreezeBlendValue())) {
            getEventToFreezeBlendValue().accept(visitor, this);
        }
        if (!(null == getEventToCrossBlend())) {
            getEventToCrossBlend().accept(visitor, this);
        }
        return visitor.getResults();
    }

    @Override
    public Collection<IHkVisitable> objects() {
        Collection<IHkVisitable> theseObjects = new ArrayList<IHkVisitable>();
        if (!(null == getVariableBindingSet())) {
            theseObjects.add(getVariableBindingSet());
        }
        if (!(null == getPBlenderGenerator())) {
            theseObjects.add(getPBlenderGenerator());
        }
        if (!(null == getEventToFreezeBlendValue())) {
            theseObjects.add(getEventToFreezeBlendValue());
        }
        if (!(null == getEventToCrossBlend())) {
            theseObjects.add(getEventToCrossBlend());
        }
        return theseObjects;
    }

    @Override
    public boolean remove(Object toRemove) {
        if ((getVariableBindingSet()!= null)&&getVariableBindingSet().equals(toRemove)) {
            setVariableBindingSet(null);
            return true;
        }
        if ((getPBlenderGenerator()!= null)&&getPBlenderGenerator().equals(toRemove)) {
            setPBlenderGenerator(null);
            return true;
        }
        if ((getEventToFreezeBlendValue()!= null)&&getEventToFreezeBlendValue().equals(toRemove)) {
            setEventToFreezeBlendValue(null);
            return true;
        }
        if ((getEventToCrossBlend()!= null)&&getEventToCrossBlend().equals(toRemove)) {
            setEventToCrossBlend(null);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString()+" ["+this.getName()+"]";
    }

}
