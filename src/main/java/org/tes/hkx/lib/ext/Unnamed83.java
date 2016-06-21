
package org.tes.hkx.lib.ext;

import javax.xml.bind.annotation.XmlType;
import org.eclipse.persistence.oxm.annotations.XmlPath;
import org.tes.hkx.model.IHkParentVisitor;
import org.tes.hkx.model.IHkVisitable;
import org.tes.hkx.model.IHkVisitor;

@XmlType(propOrder = {
    "hierarchyGain",
    "velocityDamping",
    "accelerationGain",
    "velocityGain",
    "positionGain",
    "positionMaxLinearVelocity",
    "positionMaxAngularVelocity",
    "snapGain",
    "snapMaxLinearVelocity",
    "snapMaxAngularVelocity",
    "snapMaxLinearDistance",
    "snapMaxAngularDistance"
})
public class Unnamed83 implements IHkVisitable
{

    private String hierarchyGain;
    private String velocityDamping;
    private String accelerationGain;
    private String velocityGain;
    private String positionGain;
    private String positionMaxLinearVelocity;
    private String positionMaxAngularVelocity;
    private String snapGain;
    private String snapMaxLinearVelocity;
    private String snapMaxAngularVelocity;
    private String snapMaxLinearDistance;
    private String snapMaxAngularDistance;

    public Unnamed83() {
        setHierarchyGain(null);
        setVelocityDamping(null);
        setAccelerationGain(null);
        setVelocityGain(null);
        setPositionGain(null);
        setPositionMaxLinearVelocity(null);
        setPositionMaxAngularVelocity(null);
        setSnapGain(null);
        setSnapMaxLinearVelocity(null);
        setSnapMaxAngularVelocity(null);
        setSnapMaxLinearDistance(null);
        setSnapMaxAngularDistance(null);
    }

    @XmlPath("hkparam[@name=\"hierarchyGain\"]/text()")
    public String getHierarchyGain() {
        return hierarchyGain;
    }

    @XmlPath("hkparam[@name=\"hierarchyGain\"]/text()")
    public void setHierarchyGain(String newHierarchyGain) {
        this.hierarchyGain = newHierarchyGain;
    }

    @XmlPath("hkparam[@name=\"velocityDamping\"]/text()")
    public String getVelocityDamping() {
        return velocityDamping;
    }

    @XmlPath("hkparam[@name=\"velocityDamping\"]/text()")
    public void setVelocityDamping(String newVelocityDamping) {
        this.velocityDamping = newVelocityDamping;
    }

    @XmlPath("hkparam[@name=\"accelerationGain\"]/text()")
    public String getAccelerationGain() {
        return accelerationGain;
    }

    @XmlPath("hkparam[@name=\"accelerationGain\"]/text()")
    public void setAccelerationGain(String newAccelerationGain) {
        this.accelerationGain = newAccelerationGain;
    }

    @XmlPath("hkparam[@name=\"velocityGain\"]/text()")
    public String getVelocityGain() {
        return velocityGain;
    }

    @XmlPath("hkparam[@name=\"velocityGain\"]/text()")
    public void setVelocityGain(String newVelocityGain) {
        this.velocityGain = newVelocityGain;
    }

    @XmlPath("hkparam[@name=\"positionGain\"]/text()")
    public String getPositionGain() {
        return positionGain;
    }

    @XmlPath("hkparam[@name=\"positionGain\"]/text()")
    public void setPositionGain(String newPositionGain) {
        this.positionGain = newPositionGain;
    }

    @XmlPath("hkparam[@name=\"positionMaxLinearVelocity\"]/text()")
    public String getPositionMaxLinearVelocity() {
        return positionMaxLinearVelocity;
    }

    @XmlPath("hkparam[@name=\"positionMaxLinearVelocity\"]/text()")
    public void setPositionMaxLinearVelocity(String newPositionMaxLinearVelocity) {
        this.positionMaxLinearVelocity = newPositionMaxLinearVelocity;
    }

    @XmlPath("hkparam[@name=\"positionMaxAngularVelocity\"]/text()")
    public String getPositionMaxAngularVelocity() {
        return positionMaxAngularVelocity;
    }

    @XmlPath("hkparam[@name=\"positionMaxAngularVelocity\"]/text()")
    public void setPositionMaxAngularVelocity(String newPositionMaxAngularVelocity) {
        this.positionMaxAngularVelocity = newPositionMaxAngularVelocity;
    }

    @XmlPath("hkparam[@name=\"snapGain\"]/text()")
    public String getSnapGain() {
        return snapGain;
    }

    @XmlPath("hkparam[@name=\"snapGain\"]/text()")
    public void setSnapGain(String newSnapGain) {
        this.snapGain = newSnapGain;
    }

    @XmlPath("hkparam[@name=\"snapMaxLinearVelocity\"]/text()")
    public String getSnapMaxLinearVelocity() {
        return snapMaxLinearVelocity;
    }

    @XmlPath("hkparam[@name=\"snapMaxLinearVelocity\"]/text()")
    public void setSnapMaxLinearVelocity(String newSnapMaxLinearVelocity) {
        this.snapMaxLinearVelocity = newSnapMaxLinearVelocity;
    }

    @XmlPath("hkparam[@name=\"snapMaxAngularVelocity\"]/text()")
    public String getSnapMaxAngularVelocity() {
        return snapMaxAngularVelocity;
    }

    @XmlPath("hkparam[@name=\"snapMaxAngularVelocity\"]/text()")
    public void setSnapMaxAngularVelocity(String newSnapMaxAngularVelocity) {
        this.snapMaxAngularVelocity = newSnapMaxAngularVelocity;
    }

    @XmlPath("hkparam[@name=\"snapMaxLinearDistance\"]/text()")
    public String getSnapMaxLinearDistance() {
        return snapMaxLinearDistance;
    }

    @XmlPath("hkparam[@name=\"snapMaxLinearDistance\"]/text()")
    public void setSnapMaxLinearDistance(String newSnapMaxLinearDistance) {
        this.snapMaxLinearDistance = newSnapMaxLinearDistance;
    }

    @XmlPath("hkparam[@name=\"snapMaxAngularDistance\"]/text()")
    public String getSnapMaxAngularDistance() {
        return snapMaxAngularDistance;
    }

    @XmlPath("hkparam[@name=\"snapMaxAngularDistance\"]/text()")
    public void setSnapMaxAngularDistance(String newSnapMaxAngularDistance) {
        this.snapMaxAngularDistance = newSnapMaxAngularDistance;
    }

    @Override
    public<T >T accept(IHkVisitor<T> visitor) {
        visitor.visit(this);
        return visitor.getResults();
    }

    @Override
    public<T >T accept(IHkParentVisitor<T> visitor, IHkVisitable parent) {
        visitor.visit(this, parent);
        return visitor.getResults();
    }

}
