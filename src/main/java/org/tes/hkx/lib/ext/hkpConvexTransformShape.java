
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
@XmlDiscriminatorValue("0xae3e5017")
@XmlType(propOrder = {
    "userData",
    "radius",
    "childShape",
    "transform"
})
public class hkpConvexTransformShape
    extends HkobjectType
    implements IHkContainer, IHkVisitable
{

    private String userData;
    private String radius;
    private Unnamed81 childShape;
    private String transform;

    public hkpConvexTransformShape() {
        setUserData("0");
        setRadius("90.000000");
        setChildShape(null);
        setTransform("(-1.000000 0.000000 -0.000000)(-0.000000 0.000000 1.000000)(0.000000 1.000000 -0.000000)(-0.000001 -0.000000 0.000000)");
        setClazz("hkpConvexTransformShape");
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
    public Unnamed81 getChildShape() {
        return childShape;
    }

    public void setChildShape(Unnamed81 newChildShape) {
        this.childShape = newChildShape;
    }

    @XmlPath("hkparam[@name=\"transform\"]/text()")
    public String getTransform() {
        return transform;
    }

    @XmlPath("hkparam[@name=\"transform\"]/text()")
    public void setTransform(String newTransform) {
        this.transform = newTransform;
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
