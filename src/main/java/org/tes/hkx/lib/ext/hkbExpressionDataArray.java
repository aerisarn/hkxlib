
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
import org.tes.hkx.model.ObjectLink;

@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlDiscriminatorValue("0x4b9ee1a2")
@XmlType(propOrder = {
    "expressionsData"
})
public class hkbExpressionDataArray
    extends HkobjectType
    implements IHkContainer, IHkVisitable
{

    @XmlElement(name = "hkparam[@name=\"expressionsData\"]/hkobject", required = true, nillable = true)
    private ArrayList<org.tes.hkx.lib.ext.Unnamed72> expressionsData;
    @XmlPath("hkparam[@name=\"expressionsData\"]/@numelements")
    private Integer numexpressionsData;

    public hkbExpressionDataArray() {
        expressionsData = new ArrayList<org.tes.hkx.lib.ext.Unnamed72>();
        numexpressionsData = 0;
        setClazz("hkbExpressionDataArray");
    }

    public Integer getNumExpressionsData() {
        return numexpressionsData;
    }

    public Iterable<org.tes.hkx.lib.ext.Unnamed72> getExpressionsData() {
        return expressionsData;
    }

    public org.tes.hkx.lib.ext.Unnamed72 getExpressionsDataAt(int index) {
        return expressionsData.get(index);
    }

    public boolean addToExpressionsData(org.tes.hkx.lib.ext.Unnamed72 newExpressionsData) {
        if (expressionsData.add(newExpressionsData)) {
            numexpressionsData += 1;
            return true;
        }
        return false;
    }

    @ObjectLink
    public boolean removeFromExpressionsData(org.tes.hkx.lib.ext.Unnamed72 expressionsDataToRemove) {
        if (expressionsData.remove(expressionsDataToRemove)) {
            numexpressionsData += -1;
            return true;
        }
        return false;
    }

    public org.tes.hkx.lib.ext.Unnamed72 removeFromExpressionsDataAt(int index) {
        org.tes.hkx.lib.ext.Unnamed72 toRemove;
        toRemove = expressionsData.remove(index);
        if (!(null == toRemove)) {
            numexpressionsData += -1;
            return toRemove;
        }
        return null;
    }

    @Override
    public<T >T accept(IHkVisitor<T> visitor) {
        visitor.visit(this);
        for (org.tes.hkx.lib.ext.Unnamed72 child: getExpressionsData()) {
            child.accept(visitor);
        }
        return visitor.getResults();
    }

    @Override
    public<T >T accept(IHkParentVisitor<T> visitor, IHkVisitable parent) {
        visitor.visit(this, parent);
        for (org.tes.hkx.lib.ext.Unnamed72 child: getExpressionsData()) {
            child.accept(visitor, this);
        }
        return visitor.getResults();
    }

    @Override
    public Collection<IHkVisitable> objects() {
        Collection<IHkVisitable> theseObjects = new ArrayList<IHkVisitable>();
        for (org.tes.hkx.lib.ext.Unnamed72 child: getExpressionsData()) {
            theseObjects.add(child);
        }
        return theseObjects;
    }

    @Override
    public boolean remove(Object toRemove) {
        if ((toRemove instanceof org.tes.hkx.lib.ext.Unnamed72)&&removeFromExpressionsData(((org.tes.hkx.lib.ext.Unnamed72) toRemove))) {
            return true;
        }
        return false;
    }

}
