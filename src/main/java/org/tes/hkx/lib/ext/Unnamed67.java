
package org.tes.hkx.lib.ext;

import javax.xml.bind.annotation.XmlType;
import org.eclipse.persistence.oxm.annotations.XmlPath;
import org.tes.hkx.model.IHkParentVisitor;
import org.tes.hkx.model.IHkVisitable;
import org.tes.hkx.model.IHkVisitor;

@XmlType(propOrder = {
    "responseType",
    "rollingFrictionMultiplier",
    "friction",
    "restitution"
})
public class Unnamed67 implements IHkVisitable
{

    private String responseType;
    private String rollingFrictionMultiplier;
    private String friction;
    private String restitution;

    public Unnamed67() {
        setResponseType(null);
        setRollingFrictionMultiplier(null);
        setFriction(null);
        setRestitution(null);
    }

    @XmlPath("hkparam[@name=\"responseType\"]/text()")
    public String getResponseType() {
        return responseType;
    }

    @XmlPath("hkparam[@name=\"responseType\"]/text()")
    public void setResponseType(String newResponseType) {
        this.responseType = newResponseType;
    }

    @XmlPath("hkparam[@name=\"rollingFrictionMultiplier\"]/text()")
    public String getRollingFrictionMultiplier() {
        return rollingFrictionMultiplier;
    }

    @XmlPath("hkparam[@name=\"rollingFrictionMultiplier\"]/text()")
    public void setRollingFrictionMultiplier(String newRollingFrictionMultiplier) {
        this.rollingFrictionMultiplier = newRollingFrictionMultiplier;
    }

    @XmlPath("hkparam[@name=\"friction\"]/text()")
    public String getFriction() {
        return friction;
    }

    @XmlPath("hkparam[@name=\"friction\"]/text()")
    public void setFriction(String newFriction) {
        this.friction = newFriction;
    }

    @XmlPath("hkparam[@name=\"restitution\"]/text()")
    public String getRestitution() {
        return restitution;
    }

    @XmlPath("hkparam[@name=\"restitution\"]/text()")
    public void setRestitution(String newRestitution) {
        this.restitution = newRestitution;
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
