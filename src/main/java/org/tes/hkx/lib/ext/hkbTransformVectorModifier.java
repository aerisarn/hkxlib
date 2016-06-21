
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
@XmlDiscriminatorValue("0xf93e0e24")
@XmlType(propOrder = {
    "variableBindingSet",
    "userData",
    "name",
    "enable",
    "rotation",
    "translation",
    "vectorIn",
    "vectorOut",
    "rotateOnly",
    "inverse",
    "computeOnActivate",
    "computeOnModify"
})
public class hkbTransformVectorModifier
    extends HkobjectType
    implements IHkContainer, IHkVisitable
{

    private hkbVariableBindingSet variableBindingSet;
    private String userData;
    private String childname;
    private String enable;
    private String rotation;
    private String translation;
    private String vectorIn;
    private String vectorOut;
    private String rotateOnly;
    private String inverse;
    private String computeOnActivate;
    private String computeOnModify;

    public hkbTransformVectorModifier() {
        setVariableBindingSet(null);
        setUserData("0");
        setName("TransformVectorModifier_ConstraintOffset_Grab");
        setEnable("true");
        setRotation("(0.000000 0.000000 0.000000 1.000000)");
        setTranslation("(0.000000 0.000000 0.000000 0.000000)");
        setVectorIn("(100.000000 -7.000000 -0.500000 0.000000)");
        setVectorOut("(0.000000 0.000000 0.000000 0.000000)");
        setRotateOnly("false");
        setInverse("false");
        setComputeOnActivate("true");
        setComputeOnModify("false");
        setClazz("hkbTransformVectorModifier");
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

    @XmlPath("hkparam[@name=\"rotation\"]/text()")
    public String getRotation() {
        return rotation;
    }

    @XmlPath("hkparam[@name=\"rotation\"]/text()")
    public void setRotation(String newRotation) {
        this.rotation = newRotation;
    }

    @XmlPath("hkparam[@name=\"translation\"]/text()")
    public String getTranslation() {
        return translation;
    }

    @XmlPath("hkparam[@name=\"translation\"]/text()")
    public void setTranslation(String newTranslation) {
        this.translation = newTranslation;
    }

    @XmlPath("hkparam[@name=\"vectorIn\"]/text()")
    public String getVectorIn() {
        return vectorIn;
    }

    @XmlPath("hkparam[@name=\"vectorIn\"]/text()")
    public void setVectorIn(String newVectorIn) {
        this.vectorIn = newVectorIn;
    }

    @XmlPath("hkparam[@name=\"vectorOut\"]/text()")
    public String getVectorOut() {
        return vectorOut;
    }

    @XmlPath("hkparam[@name=\"vectorOut\"]/text()")
    public void setVectorOut(String newVectorOut) {
        this.vectorOut = newVectorOut;
    }

    @XmlPath("hkparam[@name=\"rotateOnly\"]/text()")
    public String getRotateOnly() {
        return rotateOnly;
    }

    @XmlPath("hkparam[@name=\"rotateOnly\"]/text()")
    public void setRotateOnly(String newRotateOnly) {
        this.rotateOnly = newRotateOnly;
    }

    @XmlPath("hkparam[@name=\"inverse\"]/text()")
    public String getInverse() {
        return inverse;
    }

    @XmlPath("hkparam[@name=\"inverse\"]/text()")
    public void setInverse(String newInverse) {
        this.inverse = newInverse;
    }

    @XmlPath("hkparam[@name=\"computeOnActivate\"]/text()")
    public String getComputeOnActivate() {
        return computeOnActivate;
    }

    @XmlPath("hkparam[@name=\"computeOnActivate\"]/text()")
    public void setComputeOnActivate(String newComputeOnActivate) {
        this.computeOnActivate = newComputeOnActivate;
    }

    @XmlPath("hkparam[@name=\"computeOnModify\"]/text()")
    public String getComputeOnModify() {
        return computeOnModify;
    }

    @XmlPath("hkparam[@name=\"computeOnModify\"]/text()")
    public void setComputeOnModify(String newComputeOnModify) {
        this.computeOnModify = newComputeOnModify;
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
