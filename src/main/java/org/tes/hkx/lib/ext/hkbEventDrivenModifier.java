
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
@XmlDiscriminatorValue("0x7ed3f44e")
@XmlType(propOrder = {
    "variableBindingSet",
    "userData",
    "name",
    "enable",
    "modifier",
    "activateEventId",
    "deactivateEventId",
    "activeByDefault"
})
public class hkbEventDrivenModifier
    extends HkobjectType
    implements IHkContainer, IHkVisitable
{

    private hkbVariableBindingSet variableBindingSet;
    private String userData;
    private String childname;
    private String enable;
    private HkobjectType modifier;
    private String activateEventId;
    private String deactivateEventId;
    private String activeByDefault;

    public hkbEventDrivenModifier() {
        setVariableBindingSet(null);
        setUserData("1");
        setName("TurnOnMatchingRagdoll");
        setEnable("true");
        setModifier(null);
        setActivateEventId("-1");
        setDeactivateEventId("-1");
        setActiveByDefault("false");
        setClazz("hkbEventDrivenModifier");
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

    @XmlIDREF
    @XmlPath("hkparam[@name=\"modifier\"]/text()")
    @ObjectLink
    public HkobjectType getModifier() {
        return modifier;
    }

    public void setModifier(HkobjectType newModifier) {
        this.modifier = newModifier;
    }

    @XmlPath("hkparam[@name=\"activateEventId\"]/text()")
    public String getActivateEventId() {
        return activateEventId;
    }

    @XmlPath("hkparam[@name=\"activateEventId\"]/text()")
    public void setActivateEventId(String newActivateEventId) {
        this.activateEventId = newActivateEventId;
    }

    @XmlPath("hkparam[@name=\"deactivateEventId\"]/text()")
    public String getDeactivateEventId() {
        return deactivateEventId;
    }

    @XmlPath("hkparam[@name=\"deactivateEventId\"]/text()")
    public void setDeactivateEventId(String newDeactivateEventId) {
        this.deactivateEventId = newDeactivateEventId;
    }

    @XmlPath("hkparam[@name=\"activeByDefault\"]/text()")
    public String getActiveByDefault() {
        return activeByDefault;
    }

    @XmlPath("hkparam[@name=\"activeByDefault\"]/text()")
    public void setActiveByDefault(String newActiveByDefault) {
        this.activeByDefault = newActiveByDefault;
    }

    @Override
    public<T >T accept(IHkVisitor<T> visitor) {
        visitor.visit(this);
        if (!(null == getVariableBindingSet())) {
            getVariableBindingSet().accept(visitor);
        }
        if (!(null == getModifier())) {
            getModifier().accept(visitor);
        }
        return visitor.getResults();
    }

    @Override
    public<T >T accept(IHkParentVisitor<T> visitor, IHkVisitable parent) {
        visitor.visit(this, parent);
        if (!(null == getVariableBindingSet())) {
            getVariableBindingSet().accept(visitor, this);
        }
        if (!(null == getModifier())) {
            getModifier().accept(visitor, this);
        }
        return visitor.getResults();
    }

    @Override
    public Collection<IHkVisitable> objects() {
        Collection<IHkVisitable> theseObjects = new ArrayList<IHkVisitable>();
        if (!(null == getVariableBindingSet())) {
            theseObjects.add(getVariableBindingSet());
        }
        if (!(null == getModifier())) {
            theseObjects.add(getModifier());
        }
        return theseObjects;
    }

    @Override
    public boolean remove(Object toRemove) {
        if ((getVariableBindingSet()!= null)&&getVariableBindingSet().equals(toRemove)) {
            setVariableBindingSet(null);
            return true;
        }
        if ((getModifier()!= null)&&getModifier().equals(toRemove)) {
            setModifier(null);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString()+" ["+this.getName()+"]";
    }

}
