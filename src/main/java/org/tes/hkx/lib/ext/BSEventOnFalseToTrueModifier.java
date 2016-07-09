
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
@XmlDiscriminatorValue("0x81d0777a")
@XmlType(propOrder = {
    "variableBindingSet",
    "userData",
    "name",
    "enable",
    "BEnableEvent1",
    "BVariableToTest1",
    "eventToSend1",
    "BEnableEvent2",
    "BVariableToTest2",
    "eventToSend2",
    "BEnableEvent3",
    "BVariableToTest3",
    "eventToSend3"
})
public class BSEventOnFalseToTrueModifier
    extends HkobjectType
    implements IHkContainer, IHkVisitable
{

    private hkbVariableBindingSet variableBindingSet;
    private String userData;
    private String childname;
    private String enable;
    private String bEnableEvent1;
    private String bVariableToTest1;
    private innerEvent EventToSend1;
    private String bEnableEvent2;
    private String bVariableToTest2;
    private innerEvent EventToSend2;
    private String bEnableEvent3;
    private String bVariableToTest3;
    private innerEvent EventToSend3;

    public BSEventOnFalseToTrueModifier() {
        setVariableBindingSet(null);
        setUserData("2");
        setName("BeginShout_OnFalseToTrueMod");
        setEnable("true");
        setBEnableEvent1("true");
        setBVariableToTest1("false");
        setEventToSend1(null);
        setBEnableEvent2("false");
        setBVariableToTest2("false");
        setEventToSend2(null);
        setBEnableEvent3("false");
        setBVariableToTest3("false");
        setEventToSend3(null);
        setClazz("BSEventOnFalseToTrueModifier");
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

    @XmlPath("hkparam[@name=\"bEnableEvent1\"]/text()")
    public String getBEnableEvent1() {
        return bEnableEvent1;
    }

    @XmlPath("hkparam[@name=\"bEnableEvent1\"]/text()")
    public void setBEnableEvent1(String newBEnableEvent1) {
        this.bEnableEvent1 = newBEnableEvent1;
    }

    @XmlPath("hkparam[@name=\"bVariableToTest1\"]/text()")
    public String getBVariableToTest1() {
        return bVariableToTest1;
    }

    @XmlPath("hkparam[@name=\"bVariableToTest1\"]/text()")
    public void setBVariableToTest1(String newBVariableToTest1) {
        this.bVariableToTest1 = newBVariableToTest1;
    }

    @XmlElement(name = "hkparam[@name=\"EventToSend1\"]/hkobject")
    public innerEvent getEventToSend1() {
        return EventToSend1;
    }

    public void setEventToSend1(innerEvent newEventToSend1) {
        this.EventToSend1 = newEventToSend1;
    }

    @XmlPath("hkparam[@name=\"bEnableEvent2\"]/text()")
    public String getBEnableEvent2() {
        return bEnableEvent2;
    }

    @XmlPath("hkparam[@name=\"bEnableEvent2\"]/text()")
    public void setBEnableEvent2(String newBEnableEvent2) {
        this.bEnableEvent2 = newBEnableEvent2;
    }

    @XmlPath("hkparam[@name=\"bVariableToTest2\"]/text()")
    public String getBVariableToTest2() {
        return bVariableToTest2;
    }

    @XmlPath("hkparam[@name=\"bVariableToTest2\"]/text()")
    public void setBVariableToTest2(String newBVariableToTest2) {
        this.bVariableToTest2 = newBVariableToTest2;
    }

    @XmlElement(name = "hkparam[@name=\"EventToSend2\"]/hkobject")
    public innerEvent getEventToSend2() {
        return EventToSend2;
    }

    public void setEventToSend2(innerEvent newEventToSend2) {
        this.EventToSend2 = newEventToSend2;
    }

    @XmlPath("hkparam[@name=\"bEnableEvent3\"]/text()")
    public String getBEnableEvent3() {
        return bEnableEvent3;
    }

    @XmlPath("hkparam[@name=\"bEnableEvent3\"]/text()")
    public void setBEnableEvent3(String newBEnableEvent3) {
        this.bEnableEvent3 = newBEnableEvent3;
    }

    @XmlPath("hkparam[@name=\"bVariableToTest3\"]/text()")
    public String getBVariableToTest3() {
        return bVariableToTest3;
    }

    @XmlPath("hkparam[@name=\"bVariableToTest3\"]/text()")
    public void setBVariableToTest3(String newBVariableToTest3) {
        this.bVariableToTest3 = newBVariableToTest3;
    }

    @XmlElement(name = "hkparam[@name=\"EventToSend3\"]/hkobject")
    public innerEvent getEventToSend3() {
        return EventToSend3;
    }

    public void setEventToSend3(innerEvent newEventToSend3) {
        this.EventToSend3 = newEventToSend3;
    }

    @Override
    public<T >T accept(IHkVisitor<T> visitor) {
        visitor.visit(this);
        if (!(null == getVariableBindingSet())) {
            getVariableBindingSet().accept(visitor);
        }
        if (!(null == getEventToSend1())) {
            getEventToSend1().accept(visitor);
        }
        if (!(null == getEventToSend2())) {
            getEventToSend2().accept(visitor);
        }
        if (!(null == getEventToSend3())) {
            getEventToSend3().accept(visitor);
        }
        return visitor.getResults();
    }

    @Override
    public<T >T accept(IHkParentVisitor<T> visitor, IHkVisitable parent) {
        visitor.visit(this, parent);
        if (!(null == getVariableBindingSet())) {
            getVariableBindingSet().accept(visitor, this);
        }
        if (!(null == getEventToSend1())) {
            getEventToSend1().accept(visitor, this);
        }
        if (!(null == getEventToSend2())) {
            getEventToSend2().accept(visitor, this);
        }
        if (!(null == getEventToSend3())) {
            getEventToSend3().accept(visitor, this);
        }
        return visitor.getResults();
    }

    @Override
    public Collection<IHkVisitable> objects() {
        Collection<IHkVisitable> theseObjects = new ArrayList<IHkVisitable>();
        if (!(null == getVariableBindingSet())) {
            theseObjects.add(getVariableBindingSet());
        }
        if (!(null == getEventToSend1())) {
            theseObjects.add(getEventToSend1());
        }
        if (!(null == getEventToSend2())) {
            theseObjects.add(getEventToSend2());
        }
        if (!(null == getEventToSend3())) {
            theseObjects.add(getEventToSend3());
        }
        return theseObjects;
    }

    @Override
    public boolean remove(Object toRemove) {
        if ((getVariableBindingSet()!= null)&&getVariableBindingSet().equals(toRemove)) {
            setVariableBindingSet(null);
            return true;
        }
        if ((getEventToSend1()!= null)&&getEventToSend1().equals(toRemove)) {
            setEventToSend1(null);
            return true;
        }
        if ((getEventToSend2()!= null)&&getEventToSend2().equals(toRemove)) {
            setEventToSend2(null);
            return true;
        }
        if ((getEventToSend3()!= null)&&getEventToSend3().equals(toRemove)) {
            setEventToSend3(null);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString()+" ["+this.getName()+"]";
    }

}
