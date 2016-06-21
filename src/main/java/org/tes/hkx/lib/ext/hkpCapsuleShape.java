
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
@XmlDiscriminatorValue("0xdd0b1fd3")
@XmlType(propOrder = {
    "userData",
    "radius",
    "vertexA",
    "vertexB"
})
public class hkpCapsuleShape
    extends HkobjectType
    implements IHkVisitable
{

    private String userData;
    private String radius;
    private String vertexA;
    private String vertexB;

    public hkpCapsuleShape() {
        setUserData("0");
        setRadius("10.000000");
        setVertexA("(-2.929944 0.000000 0.000000 9.140879)");
        setVertexB("(2.929946 0.000000 0.000000 9.140879)");
        setClazz("hkpCapsuleShape");
    }

    @XmlPath("hkparam[@name=\"userData\"]/text()")
    public String getUserData() {
        return userData;
    }

    @XmlPath("hkparam[@name=\"userData\"]/text()")
    public void setUserData(String newUserData) {
        this.userData = newUserData;
    }

    @XmlPath("hkparam[@name=\"radius\"]/text()")
    public String getRadius() {
        return radius;
    }

    @XmlPath("hkparam[@name=\"radius\"]/text()")
    public void setRadius(String newRadius) {
        this.radius = newRadius;
    }

    @XmlPath("hkparam[@name=\"vertexA\"]/text()")
    public String getVertexA() {
        return vertexA;
    }

    @XmlPath("hkparam[@name=\"vertexA\"]/text()")
    public void setVertexA(String newVertexA) {
        this.vertexA = newVertexA;
    }

    @XmlPath("hkparam[@name=\"vertexB\"]/text()")
    public String getVertexB() {
        return vertexB;
    }

    @XmlPath("hkparam[@name=\"vertexB\"]/text()")
    public void setVertexB(String newVertexB) {
        this.vertexB = newVertexB;
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
