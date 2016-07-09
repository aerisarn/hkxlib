
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
@XmlDiscriminatorValue("0x6030970c")
@XmlType(propOrder = {
    "variableBindingSet",
    "userData",
    "name",
    "enable",
    "eventToCheckFor",
    "eventToSend",
    "numberOfEventsBeforeSend",
    "minimumNumberOfEventsBeforeSend",
    "randomizeNumberOfEvents"
})
public class BSEventEveryNEventsModifier
    extends HkobjectType
    implements IHkContainer, IHkVisitable
{

    private hkbVariableBindingSet variableBindingSet;
    private String userData;
    private String childname;
    private String enable;
    private innerEvent eventToCheckFor;
    private innerEvent eventToSend;
    private String numberOfEventsBeforeSend;
    private String minimumNumberOfEventsBeforeSend;
    private String randomizeNumberOfEvents;

    public BSEventEveryNEventsModifier() {
        setVariableBindingSet(null);
        setUserData("3");
        setName("BSEventEveryNEventsModifier01");
        setEnable("true");
        setEventToCheckFor(null);
        setEventToSend(null);
        setNumberOfEventsBeforeSend("5");
        setMinimumNumberOfEventsBeforeSend("1");
        setRandomizeNumberOfEvents("true");
        setClazz("BSEventEveryNEventsModifier");
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

    @XmlElement(name = "hkparam[@name=\"eventToCheckFor\"]/hkobject")
    public innerEvent getEventToCheckFor() {
        return eventToCheckFor;
    }

    public void setEventToCheckFor(innerEvent newEventToCheckFor) {
        this.eventToCheckFor = newEventToCheckFor;
    }

    @XmlElement(name = "hkparam[@name=\"eventToSend\"]/hkobject")
    public innerEvent getEventToSend() {
        return eventToSend;
    }

    public void setEventToSend(innerEvent newEventToSend) {
        this.eventToSend = newEventToSend;
    }

    @XmlPath("hkparam[@name=\"numberOfEventsBeforeSend\"]/text()")
    public String getNumberOfEventsBeforeSend() {
        return numberOfEventsBeforeSend;
    }

    @XmlPath("hkparam[@name=\"numberOfEventsBeforeSend\"]/text()")
    public void setNumberOfEventsBeforeSend(String newNumberOfEventsBeforeSend) {
        this.numberOfEventsBeforeSend = newNumberOfEventsBeforeSend;
    }

    @XmlPath("hkparam[@name=\"minimumNumberOfEventsBeforeSend\"]/text()")
    public String getMinimumNumberOfEventsBeforeSend() {
        return minimumNumberOfEventsBeforeSend;
    }

    @XmlPath("hkparam[@name=\"minimumNumberOfEventsBeforeSend\"]/text()")
    public void setMinimumNumberOfEventsBeforeSend(String newMinimumNumberOfEventsBeforeSend) {
        this.minimumNumberOfEventsBeforeSend = newMinimumNumberOfEventsBeforeSend;
    }

    @XmlPath("hkparam[@name=\"randomizeNumberOfEvents\"]/text()")
    public String getRandomizeNumberOfEvents() {
        return randomizeNumberOfEvents;
    }

    @XmlPath("hkparam[@name=\"randomizeNumberOfEvents\"]/text()")
    public void setRandomizeNumberOfEvents(String newRandomizeNumberOfEvents) {
        this.randomizeNumberOfEvents = newRandomizeNumberOfEvents;
    }

    @Override
    public<T >T accept(IHkVisitor<T> visitor) {
        visitor.visit(this);
        if (!(null == getVariableBindingSet())) {
            getVariableBindingSet().accept(visitor);
        }
        if (!(null == getEventToCheckFor())) {
            getEventToCheckFor().accept(visitor);
        }
        if (!(null == getEventToSend())) {
            getEventToSend().accept(visitor);
        }
        return visitor.getResults();
    }

    @Override
    public<T >T accept(IHkParentVisitor<T> visitor, IHkVisitable parent) {
        visitor.visit(this, parent);
        if (!(null == getVariableBindingSet())) {
            getVariableBindingSet().accept(visitor, this);
        }
        if (!(null == getEventToCheckFor())) {
            getEventToCheckFor().accept(visitor, this);
        }
        if (!(null == getEventToSend())) {
            getEventToSend().accept(visitor, this);
        }
        return visitor.getResults();
    }

    @Override
    public Collection<IHkVisitable> objects() {
        Collection<IHkVisitable> theseObjects = new ArrayList<IHkVisitable>();
        if (!(null == getVariableBindingSet())) {
            theseObjects.add(getVariableBindingSet());
        }
        if (!(null == getEventToCheckFor())) {
            theseObjects.add(getEventToCheckFor());
        }
        if (!(null == getEventToSend())) {
            theseObjects.add(getEventToSend());
        }
        return theseObjects;
    }

    @Override
    public boolean remove(Object toRemove) {
        if ((getVariableBindingSet()!= null)&&getVariableBindingSet().equals(toRemove)) {
            setVariableBindingSet(null);
            return true;
        }
        if ((getEventToCheckFor()!= null)&&getEventToCheckFor().equals(toRemove)) {
            setEventToCheckFor(null);
            return true;
        }
        if ((getEventToSend()!= null)&&getEventToSend().equals(toRemove)) {
            setEventToSend(null);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString()+" ["+this.getName()+"]";
    }

}
