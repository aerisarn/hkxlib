
package org.tes.hkx.lib.ext;

import javax.xml.bind.annotation.XmlType;
import org.eclipse.persistence.oxm.annotations.XmlPath;
import org.tes.hkx.model.IHkParentVisitor;
import org.tes.hkx.model.IHkVisitable;
import org.tes.hkx.model.IHkVisitor;

@XmlType(propOrder = {
    "type",
    "transformA",
    "transformB"
})
public class Unnamed6 implements IHkVisitable
{

    private String type;
    private String transformA;
    private String transformB;

    public Unnamed6() {
        setType(null);
        setTransformA(null);
        setTransformB(null);
    }

    @XmlPath("hkparam[@name=\"type\"]/text()")
    public String getType() {
        return type;
    }

    @XmlPath("hkparam[@name=\"type\"]/text()")
    public void setType(String newType) {
        this.type = newType;
    }

    @XmlPath("hkparam[@name=\"transformA\"]/text()")
    public String getTransformA() {
        return transformA;
    }

    @XmlPath("hkparam[@name=\"transformA\"]/text()")
    public void setTransformA(String newTransformA) {
        this.transformA = newTransformA;
    }

    @XmlPath("hkparam[@name=\"transformB\"]/text()")
    public String getTransformB() {
        return transformB;
    }

    @XmlPath("hkparam[@name=\"transformB\"]/text()")
    public void setTransformB(String newTransformB) {
        this.transformB = newTransformB;
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
