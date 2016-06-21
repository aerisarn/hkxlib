
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
@XmlDiscriminatorValue("0x9a040f03")
@XmlType(propOrder = {
    "variableBindingSet",
    "userData",
    "name",
    "enable",
    "KP",
    "KI",
    "KD",
    "enableScalarDamping",
    "enableVectorDamping",
    "rawValue",
    "dampedValue",
    "rawVector",
    "dampedVector",
    "vecErrorSum",
    "vecPreviousError",
    "errorSum",
    "previousError"
})
public class hkbDampingModifier
    extends HkobjectType
    implements IHkContainer, IHkVisitable
{

    private hkbVariableBindingSet variableBindingSet;
    private String userData;
    private String childname;
    private String enable;
    private String kP;
    private String kI;
    private String kD;
    private String enableScalarDamping;
    private String enableVectorDamping;
    private String rawValue;
    private String dampedValue;
    private String rawVector;
    private String dampedVector;
    private String vecErrorSum;
    private String vecPreviousError;
    private String errorSum;
    private String previousError;

    public hkbDampingModifier() {
        setVariableBindingSet(null);
        setUserData("1");
        setName("1stPRotDampingModifier");
        setEnable("true");
        setKP("0.200000");
        setKI("0.015000");
        setKD("-0.100000");
        setEnableScalarDamping("true");
        setEnableVectorDamping("false");
        setRawValue("0.000000");
        setDampedValue("0.000000");
        setRawVector("(0.000000 0.000000 0.000000 0.000000)");
        setDampedVector("(0.000000 0.000000 0.000000 0.000000)");
        setVecErrorSum("(0.000000 0.000000 0.000000 0.000000)");
        setVecPreviousError("(0.000000 0.000000 0.000000 0.000000)");
        setErrorSum("0.000000");
        setPreviousError("0.000000");
        setClazz("hkbDampingModifier");
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

    @XmlPath("hkparam[@name=\"kP\"]/text()")
    public String getKP() {
        return kP;
    }

    @XmlPath("hkparam[@name=\"kP\"]/text()")
    public void setKP(String newKP) {
        this.kP = newKP;
    }

    @XmlPath("hkparam[@name=\"kI\"]/text()")
    public String getKI() {
        return kI;
    }

    @XmlPath("hkparam[@name=\"kI\"]/text()")
    public void setKI(String newKI) {
        this.kI = newKI;
    }

    @XmlPath("hkparam[@name=\"kD\"]/text()")
    public String getKD() {
        return kD;
    }

    @XmlPath("hkparam[@name=\"kD\"]/text()")
    public void setKD(String newKD) {
        this.kD = newKD;
    }

    @XmlPath("hkparam[@name=\"enableScalarDamping\"]/text()")
    public String getEnableScalarDamping() {
        return enableScalarDamping;
    }

    @XmlPath("hkparam[@name=\"enableScalarDamping\"]/text()")
    public void setEnableScalarDamping(String newEnableScalarDamping) {
        this.enableScalarDamping = newEnableScalarDamping;
    }

    @XmlPath("hkparam[@name=\"enableVectorDamping\"]/text()")
    public String getEnableVectorDamping() {
        return enableVectorDamping;
    }

    @XmlPath("hkparam[@name=\"enableVectorDamping\"]/text()")
    public void setEnableVectorDamping(String newEnableVectorDamping) {
        this.enableVectorDamping = newEnableVectorDamping;
    }

    @XmlPath("hkparam[@name=\"rawValue\"]/text()")
    public String getRawValue() {
        return rawValue;
    }

    @XmlPath("hkparam[@name=\"rawValue\"]/text()")
    public void setRawValue(String newRawValue) {
        this.rawValue = newRawValue;
    }

    @XmlPath("hkparam[@name=\"dampedValue\"]/text()")
    public String getDampedValue() {
        return dampedValue;
    }

    @XmlPath("hkparam[@name=\"dampedValue\"]/text()")
    public void setDampedValue(String newDampedValue) {
        this.dampedValue = newDampedValue;
    }

    @XmlPath("hkparam[@name=\"rawVector\"]/text()")
    public String getRawVector() {
        return rawVector;
    }

    @XmlPath("hkparam[@name=\"rawVector\"]/text()")
    public void setRawVector(String newRawVector) {
        this.rawVector = newRawVector;
    }

    @XmlPath("hkparam[@name=\"dampedVector\"]/text()")
    public String getDampedVector() {
        return dampedVector;
    }

    @XmlPath("hkparam[@name=\"dampedVector\"]/text()")
    public void setDampedVector(String newDampedVector) {
        this.dampedVector = newDampedVector;
    }

    @XmlPath("hkparam[@name=\"vecErrorSum\"]/text()")
    public String getVecErrorSum() {
        return vecErrorSum;
    }

    @XmlPath("hkparam[@name=\"vecErrorSum\"]/text()")
    public void setVecErrorSum(String newVecErrorSum) {
        this.vecErrorSum = newVecErrorSum;
    }

    @XmlPath("hkparam[@name=\"vecPreviousError\"]/text()")
    public String getVecPreviousError() {
        return vecPreviousError;
    }

    @XmlPath("hkparam[@name=\"vecPreviousError\"]/text()")
    public void setVecPreviousError(String newVecPreviousError) {
        this.vecPreviousError = newVecPreviousError;
    }

    @XmlPath("hkparam[@name=\"errorSum\"]/text()")
    public String getErrorSum() {
        return errorSum;
    }

    @XmlPath("hkparam[@name=\"errorSum\"]/text()")
    public void setErrorSum(String newErrorSum) {
        this.errorSum = newErrorSum;
    }

    @XmlPath("hkparam[@name=\"previousError\"]/text()")
    public String getPreviousError() {
        return previousError;
    }

    @XmlPath("hkparam[@name=\"previousError\"]/text()")
    public void setPreviousError(String newPreviousError) {
        this.previousError = newPreviousError;
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
