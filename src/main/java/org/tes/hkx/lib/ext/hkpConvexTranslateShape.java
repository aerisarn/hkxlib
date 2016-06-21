
package org.tes.hkx.lib.ext;

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.eclipse.persistence.oxm.annotations.XmlDiscriminatorValue;
import org.eclipse.persistence.oxm.annotations.XmlPath;
import org.tes.hkx.lib.HkobjectType;
import org.tes.hkx.model.IHkContainer;
import org.tes.hkx.model.IHkParentVisitor;
import org.tes.hkx.model.IHkVisitable;
import org.tes.hkx.model.IHkVisitor;

@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlDiscriminatorValue("0x5ba0a5f7")
@XmlType(propOrder = {
    "userData",
    "radius",
    "childShape",
    "translation"
})
public class hkpConvexTranslateShape
    extends HkobjectType
    implements IHkContainer, IHkVisitable
{

    private String userData;
    private String radius;
    private Unnamed18 childShape;
    private String translation;

    public hkpConvexTranslateShape() {
        setUserData("0");
        setRadius("0.030000");
        setChildShape(null);
        setTranslation("(0.168224 0.143853 20.027813 0.000000)");
        setClazz("hkpConvexTranslateShape");
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

    @XmlElement(name = "hkparam[@name=\"childShape\"]/hkobject")
    public Unnamed18 getChildShape() {
        return childShape;
    }

    public void setChildShape(Unnamed18 newChildShape) {
        this.childShape = newChildShape;
    }

    @XmlPath("hkparam[@name=\"translation\"]/text()")
    public String getTranslation() {
        return translation;
    }

    @XmlPath("hkparam[@name=\"translation\"]/text()")
    public void setTranslation(String newTranslation) {
        this.translation = newTranslation;
    }

    @Override
    public<T >T accept(IHkVisitor<T> visitor) {
        visitor.visit(this);
        if (!(null == getChildShape())) {
            getChildShape().accept(visitor);
        }
        return visitor.getResults();
    }

    @Override
    public<T >T accept(IHkParentVisitor<T> visitor, IHkVisitable parent) {
        visitor.visit(this, parent);
        if (!(null == getChildShape())) {
            getChildShape().accept(visitor, this);
        }
        return visitor.getResults();
    }

    @Override
    public Collection<IHkVisitable> objects() {
        Collection<IHkVisitable> theseObjects = new ArrayList<IHkVisitable>();
        if (!(null == getChildShape())) {
            theseObjects.add(getChildShape());
        }
        return theseObjects;
    }

    @Override
    public boolean remove(Object toRemove) {
        if ((getChildShape()!= null)&&getChildShape().equals(toRemove)) {
            setChildShape(null);
            return true;
        }
        return false;
    }

}
