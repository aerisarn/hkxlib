
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
@XmlDiscriminatorValue("0xdf358bd3")
@XmlType(propOrder = {
    "variableBindingSet",
    "userData",
    "name",
    "enable",
    "pointIn",
    "pointOut",
    "groundAngleOut",
    "upAngleOut",
    "verticalOffset",
    "reverseGroundAngle",
    "reverseUpAngle",
    "projectPoint",
    "normalizePoint",
    "computeOnlyOnce",
    "computedOutput"
})
public class hkbComputeDirectionModifier
    extends HkobjectType
    implements IHkContainer, IHkVisitable
{

    private hkbVariableBindingSet variableBindingSet;
    private String userData;
    private String childname;
    private String enable;
    private String pointIn;
    private String pointOut;
    private String groundAngleOut;
    private String upAngleOut;
    private String verticalOffset;
    private String reverseGroundAngle;
    private String reverseUpAngle;
    private String projectPoint;
    private String normalizePoint;
    private String computeOnlyOnce;
    private String computedOutput;

    public hkbComputeDirectionModifier() {
        setVariableBindingSet(null);
        setUserData("0");
        setName("Z_NPCGetAim_CDM");
        setEnable("true");
        setPointIn("(0.000000 0.000000 0.000000 0.000000)");
        setPointOut("(0.000000 0.000000 0.000000 0.000000)");
        setGroundAngleOut("0.000000");
        setUpAngleOut("0.000000");
        setVerticalOffset("0.000000");
        setReverseGroundAngle("false");
        setReverseUpAngle("false");
        setProjectPoint("false");
        setNormalizePoint("false");
        setComputeOnlyOnce("false");
        setComputedOutput("true");
        setClazz("hkbComputeDirectionModifier");
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

    @XmlPath("hkparam[@name=\"pointIn\"]/text()")
    public String getPointIn() {
        return pointIn;
    }

    @XmlPath("hkparam[@name=\"pointIn\"]/text()")
    public void setPointIn(String newPointIn) {
        this.pointIn = newPointIn;
    }

    @XmlPath("hkparam[@name=\"pointOut\"]/text()")
    public String getPointOut() {
        return pointOut;
    }

    @XmlPath("hkparam[@name=\"pointOut\"]/text()")
    public void setPointOut(String newPointOut) {
        this.pointOut = newPointOut;
    }

    @XmlPath("hkparam[@name=\"groundAngleOut\"]/text()")
    public String getGroundAngleOut() {
        return groundAngleOut;
    }

    @XmlPath("hkparam[@name=\"groundAngleOut\"]/text()")
    public void setGroundAngleOut(String newGroundAngleOut) {
        this.groundAngleOut = newGroundAngleOut;
    }

    @XmlPath("hkparam[@name=\"upAngleOut\"]/text()")
    public String getUpAngleOut() {
        return upAngleOut;
    }

    @XmlPath("hkparam[@name=\"upAngleOut\"]/text()")
    public void setUpAngleOut(String newUpAngleOut) {
        this.upAngleOut = newUpAngleOut;
    }

    @XmlPath("hkparam[@name=\"verticalOffset\"]/text()")
    public String getVerticalOffset() {
        return verticalOffset;
    }

    @XmlPath("hkparam[@name=\"verticalOffset\"]/text()")
    public void setVerticalOffset(String newVerticalOffset) {
        this.verticalOffset = newVerticalOffset;
    }

    @XmlPath("hkparam[@name=\"reverseGroundAngle\"]/text()")
    public String getReverseGroundAngle() {
        return reverseGroundAngle;
    }

    @XmlPath("hkparam[@name=\"reverseGroundAngle\"]/text()")
    public void setReverseGroundAngle(String newReverseGroundAngle) {
        this.reverseGroundAngle = newReverseGroundAngle;
    }

    @XmlPath("hkparam[@name=\"reverseUpAngle\"]/text()")
    public String getReverseUpAngle() {
        return reverseUpAngle;
    }

    @XmlPath("hkparam[@name=\"reverseUpAngle\"]/text()")
    public void setReverseUpAngle(String newReverseUpAngle) {
        this.reverseUpAngle = newReverseUpAngle;
    }

    @XmlPath("hkparam[@name=\"projectPoint\"]/text()")
    public String getProjectPoint() {
        return projectPoint;
    }

    @XmlPath("hkparam[@name=\"projectPoint\"]/text()")
    public void setProjectPoint(String newProjectPoint) {
        this.projectPoint = newProjectPoint;
    }

    @XmlPath("hkparam[@name=\"normalizePoint\"]/text()")
    public String getNormalizePoint() {
        return normalizePoint;
    }

    @XmlPath("hkparam[@name=\"normalizePoint\"]/text()")
    public void setNormalizePoint(String newNormalizePoint) {
        this.normalizePoint = newNormalizePoint;
    }

    @XmlPath("hkparam[@name=\"computeOnlyOnce\"]/text()")
    public String getComputeOnlyOnce() {
        return computeOnlyOnce;
    }

    @XmlPath("hkparam[@name=\"computeOnlyOnce\"]/text()")
    public void setComputeOnlyOnce(String newComputeOnlyOnce) {
        this.computeOnlyOnce = newComputeOnlyOnce;
    }

    @XmlPath("hkparam[@name=\"computedOutput\"]/text()")
    public String getComputedOutput() {
        return computedOutput;
    }

    @XmlPath("hkparam[@name=\"computedOutput\"]/text()")
    public void setComputedOutput(String newComputedOutput) {
        this.computedOutput = newComputedOutput;
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
