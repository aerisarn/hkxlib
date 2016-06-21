
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
@XmlDiscriminatorValue("0x2772c11e")
@XmlType(propOrder = {
    "namedVariants"
})
public class hkRootLevelContainer
    extends HkobjectType
    implements IHkContainer, IHkVisitable
{

    @XmlElement(name = "hkparam[@name=\"namedVariants\"]/hkobject", required = true, nillable = true)
    private ArrayList<org.tes.hkx.lib.ext.Unnamed1> namedVariants;
    @XmlPath("hkparam[@name=\"namedVariants\"]/@numelements")
    private Integer numnamedVariants;

    public hkRootLevelContainer() {
        namedVariants = new ArrayList<org.tes.hkx.lib.ext.Unnamed1>();
        numnamedVariants = 0;
        setClazz("hkRootLevelContainer");
    }

    public Integer getNumNamedVariants() {
        return numnamedVariants;
    }

    public Iterable<org.tes.hkx.lib.ext.Unnamed1> getNamedVariants() {
        return namedVariants;
    }

    public org.tes.hkx.lib.ext.Unnamed1 getNamedVariantsAt(int index) {
        return namedVariants.get(index);
    }

    public boolean addToNamedVariants(org.tes.hkx.lib.ext.Unnamed1 newNamedVariants) {
        if (namedVariants.add(newNamedVariants)) {
            numnamedVariants += 1;
            return true;
        }
        return false;
    }

    @ObjectLink
    public boolean removeFromNamedVariants(org.tes.hkx.lib.ext.Unnamed1 namedVariantsToRemove) {
        if (namedVariants.remove(namedVariantsToRemove)) {
            numnamedVariants += -1;
            return true;
        }
        return false;
    }

    public org.tes.hkx.lib.ext.Unnamed1 removeFromNamedVariantsAt(int index) {
        org.tes.hkx.lib.ext.Unnamed1 toRemove;
        toRemove = namedVariants.remove(index);
        if (!(null == toRemove)) {
            numnamedVariants += -1;
            return toRemove;
        }
        return null;
    }

    @Override
    public<T >T accept(IHkVisitor<T> visitor) {
        visitor.visit(this);
        for (org.tes.hkx.lib.ext.Unnamed1 child: getNamedVariants()) {
            child.accept(visitor);
        }
        return visitor.getResults();
    }

    @Override
    public<T >T accept(IHkParentVisitor<T> visitor, IHkVisitable parent) {
        visitor.visit(this, parent);
        for (org.tes.hkx.lib.ext.Unnamed1 child: getNamedVariants()) {
            child.accept(visitor, this);
        }
        return visitor.getResults();
    }

    @Override
    public Collection<IHkVisitable> objects() {
        Collection<IHkVisitable> theseObjects = new ArrayList<IHkVisitable>();
        for (org.tes.hkx.lib.ext.Unnamed1 child: getNamedVariants()) {
            theseObjects.add(child);
        }
        return theseObjects;
    }

    @Override
    public boolean remove(Object toRemove) {
        if ((toRemove instanceof org.tes.hkx.lib.ext.Unnamed1)&&removeFromNamedVariants(((org.tes.hkx.lib.ext.Unnamed1) toRemove))) {
            return true;
        }
        return false;
    }

}
