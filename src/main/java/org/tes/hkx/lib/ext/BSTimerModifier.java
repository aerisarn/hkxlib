
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
@XmlDiscriminatorValue("0x531f3292")
@XmlType(propOrder = {
    "variableBindingSet",
    "userData",
    "name",
    "enable",
    "alarmTimeSeconds",
    "alarmEvent",
    "resetAlarm"
})
public class BSTimerModifier
    extends HkobjectType
    implements IHkContainer, IHkVisitable
{

    private hkbVariableBindingSet variableBindingSet;
    private String userData;
    private String childname;
    private String enable;
    private String alarmTimeSeconds;
    private Unnamed38 alarmEvent;
    private String resetAlarm;

    public BSTimerModifier() {
        setVariableBindingSet(null);
        setUserData("2");
        setName("BSTimerModifier_PickNewIdle");
        setEnable("true");
        setAlarmTimeSeconds("0.000000");
        setAlarmEvent(null);
        setResetAlarm("true");
        setClazz("BSTimerModifier");
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

    @XmlPath("hkparam[@name=\"alarmTimeSeconds\"]/text()")
    public String getAlarmTimeSeconds() {
        return alarmTimeSeconds;
    }

    @XmlPath("hkparam[@name=\"alarmTimeSeconds\"]/text()")
    public void setAlarmTimeSeconds(String newAlarmTimeSeconds) {
        this.alarmTimeSeconds = newAlarmTimeSeconds;
    }

    @XmlElement(name = "hkparam[@name=\"alarmEvent\"]/hkobject")
    public Unnamed38 getAlarmEvent() {
        return alarmEvent;
    }

    public void setAlarmEvent(Unnamed38 newAlarmEvent) {
        this.alarmEvent = newAlarmEvent;
    }

    @XmlPath("hkparam[@name=\"resetAlarm\"]/text()")
    public String getResetAlarm() {
        return resetAlarm;
    }

    @XmlPath("hkparam[@name=\"resetAlarm\"]/text()")
    public void setResetAlarm(String newResetAlarm) {
        this.resetAlarm = newResetAlarm;
    }

    @Override
    public<T >T accept(IHkVisitor<T> visitor) {
        visitor.visit(this);
        if (!(null == getVariableBindingSet())) {
            getVariableBindingSet().accept(visitor);
        }
        if (!(null == getAlarmEvent())) {
            getAlarmEvent().accept(visitor);
        }
        return visitor.getResults();
    }

    @Override
    public<T >T accept(IHkParentVisitor<T> visitor, IHkVisitable parent) {
        visitor.visit(this, parent);
        if (!(null == getVariableBindingSet())) {
            getVariableBindingSet().accept(visitor, this);
        }
        if (!(null == getAlarmEvent())) {
            getAlarmEvent().accept(visitor, this);
        }
        return visitor.getResults();
    }

    @Override
    public Collection<IHkVisitable> objects() {
        Collection<IHkVisitable> theseObjects = new ArrayList<IHkVisitable>();
        if (!(null == getVariableBindingSet())) {
            theseObjects.add(getVariableBindingSet());
        }
        if (!(null == getAlarmEvent())) {
            theseObjects.add(getAlarmEvent());
        }
        return theseObjects;
    }

    @Override
    public boolean remove(Object toRemove) {
        if ((getVariableBindingSet()!= null)&&getVariableBindingSet().equals(toRemove)) {
            setVariableBindingSet(null);
            return true;
        }
        if ((getAlarmEvent()!= null)&&getAlarmEvent().equals(toRemove)) {
            setAlarmEvent(null);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString()+" ["+this.getName()+"]";
    }

}
