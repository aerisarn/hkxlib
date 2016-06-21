
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
@XmlDiscriminatorValue("0xb6b76b32")
@XmlType(propOrder = {
    "variableBindingSet",
    "userData",
    "name",
    "enable",
    "axisOfRotation",
    "twistAngle",
    "startBoneIndex",
    "endBoneIndex",
    "setAngleMethod",
    "rotationAxisCoordinates",
    "isAdditive"
})
public class hkbTwistModifier
    extends HkobjectType
    implements IHkContainer, IHkVisitable
{

    private hkbVariableBindingSet variableBindingSet;
    private String userData;
    private String childname;
    private String enable;
    private String axisOfRotation;
    private String twistAngle;
    private String startBoneIndex;
    private String endBoneIndex;
    private String setAngleMethod;
    private String rotationAxisCoordinates;
    private String isAdditive;

    public hkbTwistModifier() {
        setVariableBindingSet(null);
        setUserData("1");
        setName("1stPRotTwistModifier");
        setEnable("true");
        setAxisOfRotation("(0.000000 0.000000 1.000000 0.000000)");
        setTwistAngle("0.000000");
        setStartBoneIndex("-1");
        setEndBoneIndex("-1");
        setSetAngleMethod("LINEAR");
        setRotationAxisCoordinates("ROTATION_AXIS_IN_MODEL_COORDINATES");
        setIsAdditive("true");
        setClazz("hkbTwistModifier");
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

    @XmlPath("hkparam[@name=\"axisOfRotation\"]/text()")
    public String getAxisOfRotation() {
        return axisOfRotation;
    }

    @XmlPath("hkparam[@name=\"axisOfRotation\"]/text()")
    public void setAxisOfRotation(String newAxisOfRotation) {
        this.axisOfRotation = newAxisOfRotation;
    }

    @XmlPath("hkparam[@name=\"twistAngle\"]/text()")
    public String getTwistAngle() {
        return twistAngle;
    }

    @XmlPath("hkparam[@name=\"twistAngle\"]/text()")
    public void setTwistAngle(String newTwistAngle) {
        this.twistAngle = newTwistAngle;
    }

    @XmlPath("hkparam[@name=\"startBoneIndex\"]/text()")
    public String getStartBoneIndex() {
        return startBoneIndex;
    }

    @XmlPath("hkparam[@name=\"startBoneIndex\"]/text()")
    public void setStartBoneIndex(String newStartBoneIndex) {
        this.startBoneIndex = newStartBoneIndex;
    }

    @XmlPath("hkparam[@name=\"endBoneIndex\"]/text()")
    public String getEndBoneIndex() {
        return endBoneIndex;
    }

    @XmlPath("hkparam[@name=\"endBoneIndex\"]/text()")
    public void setEndBoneIndex(String newEndBoneIndex) {
        this.endBoneIndex = newEndBoneIndex;
    }

    @XmlPath("hkparam[@name=\"setAngleMethod\"]/text()")
    public String getSetAngleMethod() {
        return setAngleMethod;
    }

    @XmlPath("hkparam[@name=\"setAngleMethod\"]/text()")
    public void setSetAngleMethod(String newSetAngleMethod) {
        this.setAngleMethod = newSetAngleMethod;
    }

    @XmlPath("hkparam[@name=\"rotationAxisCoordinates\"]/text()")
    public String getRotationAxisCoordinates() {
        return rotationAxisCoordinates;
    }

    @XmlPath("hkparam[@name=\"rotationAxisCoordinates\"]/text()")
    public void setRotationAxisCoordinates(String newRotationAxisCoordinates) {
        this.rotationAxisCoordinates = newRotationAxisCoordinates;
    }

    @XmlPath("hkparam[@name=\"isAdditive\"]/text()")
    public String getIsAdditive() {
        return isAdditive;
    }

    @XmlPath("hkparam[@name=\"isAdditive\"]/text()")
    public void setIsAdditive(String newIsAdditive) {
        this.isAdditive = newIsAdditive;
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
