
package org.tes.hkx.lib.ext;

import javax.xml.bind.annotation.XmlType;
import org.eclipse.persistence.oxm.annotations.XmlPath;
import org.tes.hkx.model.IHkParentVisitor;
import org.tes.hkx.model.IHkVisitable;
import org.tes.hkx.model.IHkVisitor;

@XmlType(propOrder = {
    "centerOfMass0",
    "centerOfMass1",
    "rotation0",
    "rotation1",
    "centerOfMassLocal"
})
public class Unnamed71 implements IHkVisitable
{

    private String centerOfMass0;
    private String centerOfMass1;
    private String rotation0;
    private String rotation1;
    private String centerOfMassLocal;

    public Unnamed71() {
        setCenterOfMass0(null);
        setCenterOfMass1(null);
        setRotation0(null);
        setRotation1(null);
        setCenterOfMassLocal(null);
    }

    @XmlPath("hkparam[@name=\"centerOfMass0\"]/text()")
    public String getCenterOfMass0() {
        return centerOfMass0;
    }

    @XmlPath("hkparam[@name=\"centerOfMass0\"]/text()")
    public void setCenterOfMass0(String newCenterOfMass0) {
        this.centerOfMass0 = newCenterOfMass0;
    }

    @XmlPath("hkparam[@name=\"centerOfMass1\"]/text()")
    public String getCenterOfMass1() {
        return centerOfMass1;
    }

    @XmlPath("hkparam[@name=\"centerOfMass1\"]/text()")
    public void setCenterOfMass1(String newCenterOfMass1) {
        this.centerOfMass1 = newCenterOfMass1;
    }

    @XmlPath("hkparam[@name=\"rotation0\"]/text()")
    public String getRotation0() {
        return rotation0;
    }

    @XmlPath("hkparam[@name=\"rotation0\"]/text()")
    public void setRotation0(String newRotation0) {
        this.rotation0 = newRotation0;
    }

    @XmlPath("hkparam[@name=\"rotation1\"]/text()")
    public String getRotation1() {
        return rotation1;
    }

    @XmlPath("hkparam[@name=\"rotation1\"]/text()")
    public void setRotation1(String newRotation1) {
        this.rotation1 = newRotation1;
    }

    @XmlPath("hkparam[@name=\"centerOfMassLocal\"]/text()")
    public String getCenterOfMassLocal() {
        return centerOfMassLocal;
    }

    @XmlPath("hkparam[@name=\"centerOfMassLocal\"]/text()")
    public void setCenterOfMassLocal(String newCenterOfMassLocal) {
        this.centerOfMassLocal = newCenterOfMassLocal;
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
