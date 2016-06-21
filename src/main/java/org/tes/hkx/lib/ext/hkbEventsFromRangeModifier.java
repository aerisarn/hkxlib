
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
@XmlDiscriminatorValue("0xbc561b6e")
@XmlType(propOrder = {
    "variableBindingSet",
    "userData",
    "name",
    "enable",
    "inputValue",
    "lowerBound",
    "eventRanges"
})
public class hkbEventsFromRangeModifier
    extends HkobjectType
    implements IHkContainer, IHkVisitable
{

    private hkbVariableBindingSet variableBindingSet;
    private String userData;
    private String childname;
    private String enable;
    private String inputValue;
    private String lowerBound;
    private hkbEventRangeDataArray eventRanges;

    public hkbEventsFromRangeModifier() {
        setVariableBindingSet(null);
        setUserData("0");
        setName("TurnLeft_EventsFromRangeMod");
        setEnable("true");
        setInputValue("0.000000");
        setLowerBound("0.000000");
        setEventRanges(null);
        setClazz("hkbEventsFromRangeModifier");
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

    @XmlPath("hkparam[@name=\"inputValue\"]/text()")
    public String getInputValue() {
        return inputValue;
    }

    @XmlPath("hkparam[@name=\"inputValue\"]/text()")
    public void setInputValue(String newInputValue) {
        this.inputValue = newInputValue;
    }

    @XmlPath("hkparam[@name=\"lowerBound\"]/text()")
    public String getLowerBound() {
        return lowerBound;
    }

    @XmlPath("hkparam[@name=\"lowerBound\"]/text()")
    public void setLowerBound(String newLowerBound) {
        this.lowerBound = newLowerBound;
    }

    @XmlIDREF
    @XmlPath("hkparam[@name=\"eventRanges\"]/text()")
    @ObjectLink
    public hkbEventRangeDataArray getEventRanges() {
        return eventRanges;
    }

    public void setEventRanges(hkbEventRangeDataArray newEventRanges) {
        this.eventRanges = newEventRanges;
    }

    @Override
    public<T >T accept(IHkVisitor<T> visitor) {
        visitor.visit(this);
        if (!(null == getVariableBindingSet())) {
            getVariableBindingSet().accept(visitor);
        }
        if (!(null == getEventRanges())) {
            getEventRanges().accept(visitor);
        }
        return visitor.getResults();
    }

    @Override
    public<T >T accept(IHkParentVisitor<T> visitor, IHkVisitable parent) {
        visitor.visit(this, parent);
        if (!(null == getVariableBindingSet())) {
            getVariableBindingSet().accept(visitor, this);
        }
        if (!(null == getEventRanges())) {
            getEventRanges().accept(visitor, this);
        }
        return visitor.getResults();
    }

    @Override
    public Collection<IHkVisitable> objects() {
        Collection<IHkVisitable> theseObjects = new ArrayList<IHkVisitable>();
        if (!(null == getVariableBindingSet())) {
            theseObjects.add(getVariableBindingSet());
        }
        if (!(null == getEventRanges())) {
            theseObjects.add(getEventRanges());
        }
        return theseObjects;
    }

    @Override
    public boolean remove(Object toRemove) {
        if ((getVariableBindingSet()!= null)&&getVariableBindingSet().equals(toRemove)) {
            setVariableBindingSet(null);
            return true;
        }
        if ((getEventRanges()!= null)&&getEventRanges().equals(toRemove)) {
            setEventRanges(null);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString()+" ["+this.getName()+"]";
    }

}
