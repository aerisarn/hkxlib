
package org.tes.hkx.lib.ext;

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlType;
import org.eclipse.persistence.oxm.annotations.XmlPath;
import org.tes.hkx.model.IHkContainer;
import org.tes.hkx.model.IHkParentVisitor;
import org.tes.hkx.model.IHkVisitable;
import org.tes.hkx.model.IHkVisitor;
import org.tes.hkx.model.ObjectLink;

@XmlType(propOrder = {
    "childShape"
})
public class Unnamed18 implements IHkContainer, IHkVisitable
{

    private hkpBoxShape childShape;

    public Unnamed18() {
        setChildShape(null);
    }

    @XmlIDREF
    @XmlPath("hkparam[@name=\"childShape\"]/text()")
    @ObjectLink
    public hkpBoxShape getChildShape() {
        return childShape;
    }

    public void setChildShape(hkpBoxShape newChildShape) {
        this.childShape = newChildShape;
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
