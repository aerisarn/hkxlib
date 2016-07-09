
package org.tes.hkx.lib.ext;

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.eclipse.persistence.oxm.annotations.XmlDiscriminatorValue;
import org.tes.hkx.lib.HkobjectType;
import org.tes.hkx.model.IHkContainer;
import org.tes.hkx.model.IHkParentVisitor;
import org.tes.hkx.model.IHkVisitable;
import org.tes.hkx.model.IHkVisitor;

@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlDiscriminatorValue("0x12df42a5")
@XmlType(propOrder = {
    "mapping"
})
public class hkaSkeletonMapper
    extends HkobjectType
    implements IHkContainer, IHkVisitable
{

    private innerSkeletonMappingInfo mapping;

    public hkaSkeletonMapper() {
        setMapping(null);
        setClazz("hkaSkeletonMapper");
    }

    @XmlElement(name = "hkparam[@name=\"mapping\"]/hkobject")
    public innerSkeletonMappingInfo getMapping() {
        return mapping;
    }

    public void setMapping(innerSkeletonMappingInfo newMapping) {
        this.mapping = newMapping;
    }

    @Override
    public<T >T accept(IHkVisitor<T> visitor) {
        visitor.visit(this);
        if (!(null == getMapping())) {
            getMapping().accept(visitor);
        }
        return visitor.getResults();
    }

    @Override
    public<T >T accept(IHkParentVisitor<T> visitor, IHkVisitable parent) {
        visitor.visit(this, parent);
        if (!(null == getMapping())) {
            getMapping().accept(visitor, this);
        }
        return visitor.getResults();
    }

    @Override
    public Collection<IHkVisitable> objects() {
        Collection<IHkVisitable> theseObjects = new ArrayList<IHkVisitable>();
        if (!(null == getMapping())) {
            theseObjects.add(getMapping());
        }
        return theseObjects;
    }

    @Override
    public boolean remove(Object toRemove) {
        if ((getMapping()!= null)&&getMapping().equals(toRemove)) {
            setMapping(null);
            return true;
        }
        return false;
    }

}
