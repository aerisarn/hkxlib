
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
@XmlDiscriminatorValue("0x6cb24f2e")
@XmlType(propOrder = {
    "variableBindingSet",
    "userData",
    "name",
    "enable",
    "IStateVar",
    "stateData"
})
public class BSIStateManagerModifier
    extends HkobjectType
    implements IHkContainer, IHkVisitable
{

    private hkbVariableBindingSet variableBindingSet;
    private String userData;
    private String childname;
    private String enable;
    private String iStateVar;
    @XmlElement(name = "hkparam[@name=\"stateData\"]/hkobject", required = true, nillable = true)
    private ArrayList<org.tes.hkx.lib.ext.Unnamed43> stateData;
    @XmlPath("hkparam[@name=\"stateData\"]/@numelements")
    private Integer numstateData;

    public BSIStateManagerModifier() {
        setVariableBindingSet(null);
        setUserData("3");
        setName("Spriggan_iStateManager");
        setEnable("true");
        setIStateVar("0");
        stateData = new ArrayList<org.tes.hkx.lib.ext.Unnamed43>();
        numstateData = 0;
        setClazz("BSIStateManagerModifier");
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

    @XmlPath("hkparam[@name=\"iStateVar\"]/text()")
    public String getIStateVar() {
        return iStateVar;
    }

    @XmlPath("hkparam[@name=\"iStateVar\"]/text()")
    public void setIStateVar(String newIStateVar) {
        this.iStateVar = newIStateVar;
    }

    public Integer getNumStateData() {
        return numstateData;
    }

    public Iterable<org.tes.hkx.lib.ext.Unnamed43> getStateData() {
        return stateData;
    }

    public org.tes.hkx.lib.ext.Unnamed43 getStateDataAt(int index) {
        return stateData.get(index);
    }

    public boolean addToStateData(org.tes.hkx.lib.ext.Unnamed43 newStateData) {
        if (stateData.add(newStateData)) {
            numstateData += 1;
            return true;
        }
        return false;
    }

    @ObjectLink
    public boolean removeFromStateData(org.tes.hkx.lib.ext.Unnamed43 stateDataToRemove) {
        if (stateData.remove(stateDataToRemove)) {
            numstateData += -1;
            return true;
        }
        return false;
    }

    public org.tes.hkx.lib.ext.Unnamed43 removeFromStateDataAt(int index) {
        org.tes.hkx.lib.ext.Unnamed43 toRemove;
        toRemove = stateData.remove(index);
        if (!(null == toRemove)) {
            numstateData += -1;
            return toRemove;
        }
        return null;
    }

    @Override
    public<T >T accept(IHkVisitor<T> visitor) {
        visitor.visit(this);
        if (!(null == getVariableBindingSet())) {
            getVariableBindingSet().accept(visitor);
        }
        for (org.tes.hkx.lib.ext.Unnamed43 child: getStateData()) {
            child.accept(visitor);
        }
        return visitor.getResults();
    }

    @Override
    public<T >T accept(IHkParentVisitor<T> visitor, IHkVisitable parent) {
        visitor.visit(this, parent);
        if (!(null == getVariableBindingSet())) {
            getVariableBindingSet().accept(visitor, this);
        }
        for (org.tes.hkx.lib.ext.Unnamed43 child: getStateData()) {
            child.accept(visitor, this);
        }
        return visitor.getResults();
    }

    @Override
    public Collection<IHkVisitable> objects() {
        Collection<IHkVisitable> theseObjects = new ArrayList<IHkVisitable>();
        if (!(null == getVariableBindingSet())) {
            theseObjects.add(getVariableBindingSet());
        }
        for (org.tes.hkx.lib.ext.Unnamed43 child: getStateData()) {
            theseObjects.add(child);
        }
        return theseObjects;
    }

    @Override
    public boolean remove(Object toRemove) {
        if ((getVariableBindingSet()!= null)&&getVariableBindingSet().equals(toRemove)) {
            setVariableBindingSet(null);
            return true;
        }
        if ((toRemove instanceof org.tes.hkx.lib.ext.Unnamed43)&&removeFromStateData(((org.tes.hkx.lib.ext.Unnamed43) toRemove))) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString()+" ["+this.getName()+"]";
    }

}
