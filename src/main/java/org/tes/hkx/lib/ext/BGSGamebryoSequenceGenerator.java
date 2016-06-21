
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
@XmlDiscriminatorValue("0xc8df2d77")
@XmlType(propOrder = {
    "variableBindingSet",
    "userData",
    "name",
    "PSequence",
    "EBlendModeFunction",
    "FPercent"
})
public class BGSGamebryoSequenceGenerator
    extends HkobjectType
    implements IHkContainer, IHkVisitable
{

    private hkbVariableBindingSet variableBindingSet;
    private String userData;
    private String childname;
    private String pSequence;
    private String eBlendModeFunction;
    private String fPercent;

    public BGSGamebryoSequenceGenerator() {
        setVariableBindingSet(null);
        setUserData("0");
        setName("GamebryoSequenceGenerator00");
        setPSequence("Waiting");
        setEBlendModeFunction("BMF_NONE");
        setFPercent("1.000000");
        setClazz("BGSGamebryoSequenceGenerator");
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

    @XmlPath("hkparam[@name=\"pSequence\"]/text()")
    public String getPSequence() {
        return pSequence;
    }

    @XmlPath("hkparam[@name=\"pSequence\"]/text()")
    public void setPSequence(String newPSequence) {
        this.pSequence = newPSequence;
    }

    @XmlPath("hkparam[@name=\"eBlendModeFunction\"]/text()")
    public String getEBlendModeFunction() {
        return eBlendModeFunction;
    }

    @XmlPath("hkparam[@name=\"eBlendModeFunction\"]/text()")
    public void setEBlendModeFunction(String newEBlendModeFunction) {
        this.eBlendModeFunction = newEBlendModeFunction;
    }

    @XmlPath("hkparam[@name=\"fPercent\"]/text()")
    public String getFPercent() {
        return fPercent;
    }

    @XmlPath("hkparam[@name=\"fPercent\"]/text()")
    public void setFPercent(String newFPercent) {
        this.fPercent = newFPercent;
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
