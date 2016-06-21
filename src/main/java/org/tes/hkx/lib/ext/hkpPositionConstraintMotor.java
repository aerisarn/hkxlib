
package org.tes.hkx.lib.ext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.eclipse.persistence.oxm.annotations.XmlDiscriminatorValue;
import org.eclipse.persistence.oxm.annotations.XmlPath;
import org.tes.hkx.lib.HkobjectType;
import org.tes.hkx.model.IHkParentVisitor;
import org.tes.hkx.model.IHkVisitable;
import org.tes.hkx.model.IHkVisitor;

@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlDiscriminatorValue("0x748fb303")
@XmlType(propOrder = {
    "type",
    "minForce",
    "maxForce",
    "tau",
    "damping",
    "proportionalRecoveryVelocity",
    "constantRecoveryVelocity"
})
public class hkpPositionConstraintMotor
    extends HkobjectType
    implements IHkVisitable
{

    private String type;
    private String minForce;
    private String maxForce;
    private String tau;
    private String damping;
    private String proportionalRecoveryVelocity;
    private String constantRecoveryVelocity;

    public hkpPositionConstraintMotor() {
        setType("TYPE_POSITION");
        setMinForce("-1000000.000000");
        setMaxForce("100.000000");
        setTau("0.800000");
        setDamping("1.000000");
        setProportionalRecoveryVelocity("5.000000");
        setConstantRecoveryVelocity("0.200000");
        setClazz("hkpPositionConstraintMotor");
    }

    @XmlPath("hkparam[@name=\"type\"]/text()")
    public String getType() {
        return type;
    }

    @XmlPath("hkparam[@name=\"type\"]/text()")
    public void setType(String newType) {
        this.type = newType;
    }

    @XmlPath("hkparam[@name=\"minForce\"]/text()")
    public String getMinForce() {
        return minForce;
    }

    @XmlPath("hkparam[@name=\"minForce\"]/text()")
    public void setMinForce(String newMinForce) {
        this.minForce = newMinForce;
    }

    @XmlPath("hkparam[@name=\"maxForce\"]/text()")
    public String getMaxForce() {
        return maxForce;
    }

    @XmlPath("hkparam[@name=\"maxForce\"]/text()")
    public void setMaxForce(String newMaxForce) {
        this.maxForce = newMaxForce;
    }

    @XmlPath("hkparam[@name=\"tau\"]/text()")
    public String getTau() {
        return tau;
    }

    @XmlPath("hkparam[@name=\"tau\"]/text()")
    public void setTau(String newTau) {
        this.tau = newTau;
    }

    @XmlPath("hkparam[@name=\"damping\"]/text()")
    public String getDamping() {
        return damping;
    }

    @XmlPath("hkparam[@name=\"damping\"]/text()")
    public void setDamping(String newDamping) {
        this.damping = newDamping;
    }

    @XmlPath("hkparam[@name=\"proportionalRecoveryVelocity\"]/text()")
    public String getProportionalRecoveryVelocity() {
        return proportionalRecoveryVelocity;
    }

    @XmlPath("hkparam[@name=\"proportionalRecoveryVelocity\"]/text()")
    public void setProportionalRecoveryVelocity(String newProportionalRecoveryVelocity) {
        this.proportionalRecoveryVelocity = newProportionalRecoveryVelocity;
    }

    @XmlPath("hkparam[@name=\"constantRecoveryVelocity\"]/text()")
    public String getConstantRecoveryVelocity() {
        return constantRecoveryVelocity;
    }

    @XmlPath("hkparam[@name=\"constantRecoveryVelocity\"]/text()")
    public void setConstantRecoveryVelocity(String newConstantRecoveryVelocity) {
        this.constantRecoveryVelocity = newConstantRecoveryVelocity;
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
