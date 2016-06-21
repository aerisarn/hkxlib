
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
@XmlDiscriminatorValue("0x3444d2d5")
@XmlType(propOrder = {
    "userData",
    "radius",
    "halfExtents"
})
public class hkpBoxShape
    extends HkobjectType
    implements IHkVisitable
{

    private String userData;
    private String radius;
    private String halfExtents;

    public hkpBoxShape() {
        setUserData("0");
        setRadius("0.030000");
        setHalfExtents("(2.617282 10.388301 10.207670 2.617282)");
        setClazz("hkpBoxShape");
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

    @XmlPath("hkparam[@name=\"halfExtents\"]/text()")
    public String getHalfExtents() {
        return halfExtents;
    }

    @XmlPath("hkparam[@name=\"halfExtents\"]/text()")
    public void setHalfExtents(String newHalfExtents) {
        this.halfExtents = newHalfExtents;
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
