
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
@XmlDiscriminatorValue("0x338ad4ff")
@XmlType(propOrder = {
    "bindings",
    "indexOfBindingToEnable"
})
public class hkbVariableBindingSet
    extends HkobjectType
    implements IHkContainer, IHkVisitable
{

    @XmlElement(name = "hkparam[@name=\"bindings\"]/hkobject", required = true, nillable = true)
    private ArrayList<org.tes.hkx.lib.ext.Unnamed52> bindings;
    @XmlPath("hkparam[@name=\"bindings\"]/@numelements")
    private Integer numbindings;
    private String indexOfBindingToEnable;

    public hkbVariableBindingSet() {
        bindings = new ArrayList<org.tes.hkx.lib.ext.Unnamed52>();
        numbindings = 0;
        setIndexOfBindingToEnable("-1");
        setClazz("hkbVariableBindingSet");
    }

    public Integer getNumBindings() {
        return numbindings;
    }

    public Iterable<org.tes.hkx.lib.ext.Unnamed52> getBindings() {
        return bindings;
    }

    public org.tes.hkx.lib.ext.Unnamed52 getBindingsAt(int index) {
        return bindings.get(index);
    }

    public boolean addToBindings(org.tes.hkx.lib.ext.Unnamed52 newBindings) {
        if (bindings.add(newBindings)) {
            numbindings += 1;
            return true;
        }
        return false;
    }

    @ObjectLink
    public boolean removeFromBindings(org.tes.hkx.lib.ext.Unnamed52 bindingsToRemove) {
        if (bindings.remove(bindingsToRemove)) {
            numbindings += -1;
            return true;
        }
        return false;
    }

    public org.tes.hkx.lib.ext.Unnamed52 removeFromBindingsAt(int index) {
        org.tes.hkx.lib.ext.Unnamed52 toRemove;
        toRemove = bindings.remove(index);
        if (!(null == toRemove)) {
            numbindings += -1;
            return toRemove;
        }
        return null;
    }

    @XmlPath("hkparam[@name=\"indexOfBindingToEnable\"]/text()")
    public String getIndexOfBindingToEnable() {
        return indexOfBindingToEnable;
    }

    @XmlPath("hkparam[@name=\"indexOfBindingToEnable\"]/text()")
    public void setIndexOfBindingToEnable(String newIndexOfBindingToEnable) {
        this.indexOfBindingToEnable = newIndexOfBindingToEnable;
    }

    @Override
    public<T >T accept(IHkVisitor<T> visitor) {
        visitor.visit(this);
        for (org.tes.hkx.lib.ext.Unnamed52 child: getBindings()) {
            child.accept(visitor);
        }
        return visitor.getResults();
    }

    @Override
    public<T >T accept(IHkParentVisitor<T> visitor, IHkVisitable parent) {
        visitor.visit(this, parent);
        for (org.tes.hkx.lib.ext.Unnamed52 child: getBindings()) {
            child.accept(visitor, this);
        }
        return visitor.getResults();
    }

    @Override
    public Collection<IHkVisitable> objects() {
        Collection<IHkVisitable> theseObjects = new ArrayList<IHkVisitable>();
        for (org.tes.hkx.lib.ext.Unnamed52 child: getBindings()) {
            theseObjects.add(child);
        }
        return theseObjects;
    }

    @Override
    public boolean remove(Object toRemove) {
        if ((toRemove instanceof org.tes.hkx.lib.ext.Unnamed52)&&removeFromBindings(((org.tes.hkx.lib.ext.Unnamed52) toRemove))) {
            return true;
        }
        return false;
    }

}
