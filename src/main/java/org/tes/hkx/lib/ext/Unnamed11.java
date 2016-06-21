
package org.tes.hkx.lib.ext;

import javax.xml.bind.annotation.XmlType;
import org.eclipse.persistence.oxm.annotations.XmlPath;
import org.tes.hkx.model.IHkParentVisitor;
import org.tes.hkx.model.IHkVisitable;
import org.tes.hkx.model.IHkVisitor;

@XmlType(propOrder = {
    "type",
    "freeRotationAxis"
})
public class Unnamed11 implements IHkVisitable
{

    private String type;
    private String freeRotationAxis;

    public Unnamed11() {
        setType(null);
        setFreeRotationAxis(null);
    }

    @XmlPath("hkparam[@name=\"type\"]/text()")
    public String getType() {
        return type;
    }

    @XmlPath("hkparam[@name=\"type\"]/text()")
    public void setType(String newType) {
        this.type = newType;
    }

    @XmlPath("hkparam[@name=\"freeRotationAxis\"]/text()")
    public String getFreeRotationAxis() {
        return freeRotationAxis;
    }

    @XmlPath("hkparam[@name=\"freeRotationAxis\"]/text()")
    public void setFreeRotationAxis(String newFreeRotationAxis) {
        this.freeRotationAxis = newFreeRotationAxis;
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
