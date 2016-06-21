
package org.tes.hkx.lib.ext;

import javax.xml.bind.annotation.XmlType;
import org.eclipse.persistence.oxm.annotations.XmlPath;
import org.tes.hkx.model.IHkParentVisitor;
import org.tes.hkx.model.IHkVisitable;
import org.tes.hkx.model.IHkVisitor;

@XmlType(propOrder = {
    "maxForce",
    "tau",
    "damping",
    "proportionalRecoveryVelocity",
    "constantRecoveryVelocity"
})
public class Unnamed36 implements IHkVisitable
{

    private String maxForce;
    private String tau;
    private String damping;
    private String proportionalRecoveryVelocity;
    private String constantRecoveryVelocity;

    public Unnamed36() {
        setMaxForce(null);
        setTau(null);
        setDamping(null);
        setProportionalRecoveryVelocity(null);
        setConstantRecoveryVelocity(null);
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
