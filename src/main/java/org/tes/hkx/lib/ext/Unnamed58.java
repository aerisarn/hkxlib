
package org.tes.hkx.lib.ext;

import javax.xml.bind.annotation.XmlType;
import org.eclipse.persistence.oxm.annotations.XmlPath;
import org.tes.hkx.model.IHkParentVisitor;
import org.tes.hkx.model.IHkVisitable;
import org.tes.hkx.model.IHkVisitor;

@XmlType(propOrder = {
    "type",
    "isEnabled",
    "firstFrictionAxis",
    "numFrictionAxes",
    "maxFrictionTorque"
})
public class Unnamed58 implements IHkVisitable
{

    private String type;
    private String isEnabled;
    private String firstFrictionAxis;
    private String numFrictionAxes;
    private String maxFrictionTorque;

    public Unnamed58() {
        setType(null);
        setIsEnabled(null);
        setFirstFrictionAxis(null);
        setNumFrictionAxes(null);
        setMaxFrictionTorque(null);
    }

    @XmlPath("hkparam[@name=\"type\"]/text()")
    public String getType() {
        return type;
    }

    @XmlPath("hkparam[@name=\"type\"]/text()")
    public void setType(String newType) {
        this.type = newType;
    }

    @XmlPath("hkparam[@name=\"isEnabled\"]/text()")
    public String getIsEnabled() {
        return isEnabled;
    }

    @XmlPath("hkparam[@name=\"isEnabled\"]/text()")
    public void setIsEnabled(String newIsEnabled) {
        this.isEnabled = newIsEnabled;
    }

    @XmlPath("hkparam[@name=\"firstFrictionAxis\"]/text()")
    public String getFirstFrictionAxis() {
        return firstFrictionAxis;
    }

    @XmlPath("hkparam[@name=\"firstFrictionAxis\"]/text()")
    public void setFirstFrictionAxis(String newFirstFrictionAxis) {
        this.firstFrictionAxis = newFirstFrictionAxis;
    }

    @XmlPath("hkparam[@name=\"numFrictionAxes\"]/text()")
    public String getNumFrictionAxes() {
        return numFrictionAxes;
    }

    @XmlPath("hkparam[@name=\"numFrictionAxes\"]/text()")
    public void setNumFrictionAxes(String newNumFrictionAxes) {
        this.numFrictionAxes = newNumFrictionAxes;
    }

    @XmlPath("hkparam[@name=\"maxFrictionTorque\"]/text()")
    public String getMaxFrictionTorque() {
        return maxFrictionTorque;
    }

    @XmlPath("hkparam[@name=\"maxFrictionTorque\"]/text()")
    public void setMaxFrictionTorque(String newMaxFrictionTorque) {
        this.maxFrictionTorque = newMaxFrictionTorque;
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
