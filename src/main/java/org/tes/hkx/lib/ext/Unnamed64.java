
package org.tes.hkx.lib.ext;

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlType;
import org.eclipse.persistence.oxm.annotations.XmlPath;
import org.tes.hkx.model.IHkContainer;
import org.tes.hkx.model.IHkParentVisitor;
import org.tes.hkx.model.IHkVisitable;
import org.tes.hkx.model.IHkVisitor;
import org.tes.hkx.model.ObjectLink;

@XmlType(propOrder = {
    "shape",
    "shapeKey",
    "forceCollideOntoPpu",
    "broadPhaseHandle",
    "allowedPenetrationDepth"
})
public class Unnamed64 implements IHkContainer, IHkVisitable
{

    private hkpCapsuleShape shape;
    private String shapeKey;
    private String forceCollideOntoPpu;
    private Unnamed65 broadPhaseHandle;
    private String allowedPenetrationDepth;

    public Unnamed64() {
        setShape(null);
        setShapeKey(null);
        setForceCollideOntoPpu("-1");
        setBroadPhaseHandle(null);
        setAllowedPenetrationDepth(null);
    }

    @XmlIDREF
    @XmlPath("hkparam[@name=\"shape\"]/text()")
    @ObjectLink
    public hkpCapsuleShape getShape() {
        return shape;
    }

    public void setShape(hkpCapsuleShape newShape) {
        this.shape = newShape;
    }

    @XmlPath("hkparam[@name=\"shapeKey\"]/text()")
    public String getShapeKey() {
        return shapeKey;
    }

    @XmlPath("hkparam[@name=\"shapeKey\"]/text()")
    public void setShapeKey(String newShapeKey) {
        this.shapeKey = newShapeKey;
    }

    @XmlPath("hkparam[@name=\"forceCollideOntoPpu\"]/text()")
    public String getForceCollideOntoPpu() {
        return forceCollideOntoPpu;
    }

    @XmlPath("hkparam[@name=\"forceCollideOntoPpu\"]/text()")
    public void setForceCollideOntoPpu(String newForceCollideOntoPpu) {
        this.forceCollideOntoPpu = newForceCollideOntoPpu;
    }

    @XmlElement(name = "hkparam[@name=\"broadPhaseHandle\"]/hkobject")
    public Unnamed65 getBroadPhaseHandle() {
        return broadPhaseHandle;
    }

    public void setBroadPhaseHandle(Unnamed65 newBroadPhaseHandle) {
        this.broadPhaseHandle = newBroadPhaseHandle;
    }

    @XmlPath("hkparam[@name=\"allowedPenetrationDepth\"]/text()")
    public String getAllowedPenetrationDepth() {
        return allowedPenetrationDepth;
    }

    @XmlPath("hkparam[@name=\"allowedPenetrationDepth\"]/text()")
    public void setAllowedPenetrationDepth(String newAllowedPenetrationDepth) {
        this.allowedPenetrationDepth = newAllowedPenetrationDepth;
    }

    @Override
    public<T >T accept(IHkVisitor<T> visitor) {
        visitor.visit(this);
        if (!(null == getShape())) {
            getShape().accept(visitor);
        }
        if (!(null == getBroadPhaseHandle())) {
            getBroadPhaseHandle().accept(visitor);
        }
        return visitor.getResults();
    }

    @Override
    public<T >T accept(IHkParentVisitor<T> visitor, IHkVisitable parent) {
        visitor.visit(this, parent);
        if (!(null == getShape())) {
            getShape().accept(visitor, this);
        }
        if (!(null == getBroadPhaseHandle())) {
            getBroadPhaseHandle().accept(visitor, this);
        }
        return visitor.getResults();
    }

    @Override
    public Collection<IHkVisitable> objects() {
        Collection<IHkVisitable> theseObjects = new ArrayList<IHkVisitable>();
        if (!(null == getShape())) {
            theseObjects.add(getShape());
        }
        if (!(null == getBroadPhaseHandle())) {
            theseObjects.add(getBroadPhaseHandle());
        }
        return theseObjects;
    }

    @Override
    public boolean remove(Object toRemove) {
        if ((getShape()!= null)&&getShape().equals(toRemove)) {
            setShape(null);
            return true;
        }
        if ((getBroadPhaseHandle()!= null)&&getBroadPhaseHandle().equals(toRemove)) {
            setBroadPhaseHandle(null);
            return true;
        }
        return false;
    }

}
