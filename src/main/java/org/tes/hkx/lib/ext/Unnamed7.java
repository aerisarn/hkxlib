
package org.tes.hkx.lib.ext;

import javax.xml.bind.annotation.XmlType;
import org.eclipse.persistence.oxm.annotations.XmlPath;
import org.tes.hkx.model.IHkParentVisitor;
import org.tes.hkx.model.IHkVisitable;
import org.tes.hkx.model.IHkVisitor;

@XmlType(propOrder = {
    "type",
    "enabled",
    "maxAngle",
    "padding"
})
public class Unnamed7 implements IHkVisitable
{

    private String type;
    private String enabled;
    private String maxAngle;
    private String padding;

    public Unnamed7() {
        setType(null);
        setEnabled(null);
        setMaxAngle(null);
        setPadding(null);
    }

    @XmlPath("hkparam[@name=\"type\"]/text()")
    public String getType() {
        return type;
    }

    @XmlPath("hkparam[@name=\"type\"]/text()")
    public void setType(String newType) {
        this.type = newType;
    }

    @XmlPath("hkparam[@name=\"enabled\"]/text()")
    public String getEnabled() {
        return enabled;
    }

    @XmlPath("hkparam[@name=\"enabled\"]/text()")
    public void setEnabled(String newEnabled) {
        this.enabled = newEnabled;
    }

    @XmlPath("hkparam[@name=\"maxAngle\"]/text()")
    public String getMaxAngle() {
        return maxAngle;
    }

    @XmlPath("hkparam[@name=\"maxAngle\"]/text()")
    public void setMaxAngle(String newMaxAngle) {
        this.maxAngle = newMaxAngle;
    }

    @XmlPath("hkparam[@name=\"padding\"]/text()")
    public String getPadding() {
        return padding;
    }

    @XmlPath("hkparam[@name=\"padding\"]/text()")
    public void setPadding(String newPadding) {
        this.padding = newPadding;
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
