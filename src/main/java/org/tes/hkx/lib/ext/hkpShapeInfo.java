
package org.tes.hkx.lib.ext;

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.eclipse.persistence.oxm.annotations.XmlDiscriminatorValue;
import org.eclipse.persistence.oxm.annotations.XmlPath;
import org.tes.hkx.lib.HkParenthesysVectorAdapter;
import org.tes.hkx.lib.HkobjectType;
import org.tes.hkx.model.IHkContainer;
import org.tes.hkx.model.IHkParentVisitor;
import org.tes.hkx.model.IHkVisitable;
import org.tes.hkx.model.IHkVisitor;
import org.tes.hkx.model.ObjectLink;

@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlDiscriminatorValue("0xea7f1d08")
@XmlType(propOrder = {
    "shape",
    "isHierarchicalCompound",
    "hkdShapesCollected",
    "childShapeNames",
    "childTransforms",
    "transform"
})
public class hkpShapeInfo
    extends HkobjectType
    implements IHkContainer, IHkVisitable
{

    private hkpCapsuleShape shape;
    private String isHierarchicalCompound;
    private String hkdShapesCollected;
    @XmlElement(name = "hkparam[@name=\"childShapeNames\"]/hkcstring", required = true, nillable = true)
    private ArrayList<String> childShapeNames;
    @XmlPath("hkparam[@name=\"childShapeNames\"]/@numelements")
    private Integer numchildShapeNames;
    @XmlJavaTypeAdapter(HkParenthesysVectorAdapter.class)
    @XmlPath("hkparam[@name=\"childTransforms\"]/text()")
    private ArrayList<String> childTransforms;
    @XmlPath("hkparam[@name=\"childTransforms\"]/@numelements")
    private Integer numchildTransforms;
    private String transform;

    public hkpShapeInfo() {
        setShape(null);
        setIsHierarchicalCompound("false");
        setHkdShapesCollected("false");
        childShapeNames = new ArrayList<String>();
        numchildShapeNames = 0;
        childTransforms = new ArrayList<String>();
        numchildTransforms = 0;
        setTransform("(1.000000 -0.000002 0.000001)(0.000002 0.991033 -0.133614)(-0.000001 0.133614 0.991033)(0.000004 -5.835165 102.357948)");
        setClazz("hkpShapeInfo");
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

    @XmlPath("hkparam[@name=\"isHierarchicalCompound\"]/text()")
    public String getIsHierarchicalCompound() {
        return isHierarchicalCompound;
    }

    @XmlPath("hkparam[@name=\"isHierarchicalCompound\"]/text()")
    public void setIsHierarchicalCompound(String newIsHierarchicalCompound) {
        this.isHierarchicalCompound = newIsHierarchicalCompound;
    }

    @XmlPath("hkparam[@name=\"hkdShapesCollected\"]/text()")
    public String getHkdShapesCollected() {
        return hkdShapesCollected;
    }

    @XmlPath("hkparam[@name=\"hkdShapesCollected\"]/text()")
    public void setHkdShapesCollected(String newHkdShapesCollected) {
        this.hkdShapesCollected = newHkdShapesCollected;
    }

    public Integer getNumChildShapeNames() {
        return numchildShapeNames;
    }

    public Iterable<String> getChildShapeNames() {
        return childShapeNames;
    }

    public String getChildShapeNamesAt(int index) {
        return childShapeNames.get(index);
    }

    public boolean addToChildShapeNames(String newChildShapeNames) {
        if (childShapeNames.add(newChildShapeNames)) {
            numchildShapeNames += 1;
            return true;
        }
        return false;
    }

    public boolean removeFromChildShapeNames(String childShapeNamesToRemove) {
        if (childShapeNames.remove(childShapeNamesToRemove)) {
            numchildShapeNames += -1;
            return true;
        }
        return false;
    }

    public String removeFromChildShapeNamesAt(int index) {
        String toRemove;
        toRemove = childShapeNames.remove(index);
        if (!(null == toRemove)) {
            numchildShapeNames += -1;
            return toRemove;
        }
        return null;
    }

    public Integer getNumChildTransforms() {
        return numchildTransforms;
    }

    public Iterable<String> getChildTransforms() {
        return childTransforms;
    }

    public String getChildTransformsAt(int index) {
        return childTransforms.get(index);
    }

    public boolean addToChildTransforms(String newChildTransforms) {
        if (childTransforms.add(newChildTransforms)) {
            numchildTransforms += 1;
            return true;
        }
        return false;
    }

    public boolean removeFromChildTransforms(String childTransformsToRemove) {
        if (childTransforms.remove(childTransformsToRemove)) {
            numchildTransforms += -1;
            return true;
        }
        return false;
    }

    public String removeFromChildTransformsAt(int index) {
        String toRemove;
        toRemove = childTransforms.remove(index);
        if (!(null == toRemove)) {
            numchildTransforms += -1;
            return toRemove;
        }
        return null;
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
        if (!(null == getShape())) {
            getShape().accept(visitor);
        }
        return visitor.getResults();
    }

    @Override
    public<T >T accept(IHkParentVisitor<T> visitor, IHkVisitable parent) {
        visitor.visit(this, parent);
        if (!(null == getShape())) {
            getShape().accept(visitor, this);
        }
        return visitor.getResults();
    }

    @Override
    public Collection<IHkVisitable> objects() {
        Collection<IHkVisitable> theseObjects = new ArrayList<IHkVisitable>();
        if (!(null == getShape())) {
            theseObjects.add(getShape());
        }
        return theseObjects;
    }

    @Override
    public boolean remove(Object toRemove) {
        if ((getShape()!= null)&&getShape().equals(toRemove)) {
            setShape(null);
            return true;
        }
        return false;
    }

}
