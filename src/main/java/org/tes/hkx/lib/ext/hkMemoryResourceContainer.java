
package org.tes.hkx.lib.ext;

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlList;
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
@XmlDiscriminatorValue("0x4762f92a")
@XmlType(propOrder = {
    "name",
    "resourceHandles",
    "children"
})
public class hkMemoryResourceContainer
    extends HkobjectType
    implements IHkContainer, IHkVisitable
{

    private String childname;
    @XmlIDREF
    @XmlPath("hkparam[@name=\"resourceHandles\"]/text()")
    @XmlList
    private ArrayList<hkMemoryResourceHandle> resourceHandles;
    @XmlPath("hkparam[@name=\"resourceHandles\"]/@numelements")
    private Integer numresourceHandles;
    @XmlIDREF
    @XmlPath("hkparam[@name=\"children\"]/text()")
    @XmlList
    private ArrayList<org.tes.hkx.lib.ext.hkMemoryResourceContainer> children;
    @XmlPath("hkparam[@name=\"children\"]/@numelements")
    private Integer numchildren;

    public hkMemoryResourceContainer() {
        setName("NPC Root [Root]");
        resourceHandles = new ArrayList<hkMemoryResourceHandle>();
        numresourceHandles = 0;
        children = new ArrayList<org.tes.hkx.lib.ext.hkMemoryResourceContainer>();
        numchildren = 0;
        setClazz("hkMemoryResourceContainer");
    }

    @XmlPath("hkparam[@name=\"name\"]/text()")
    public String getName() {
        return childname;
    }

    @XmlPath("hkparam[@name=\"name\"]/text()")
    public void setName(String newName) {
        this.childname = newName;
    }

    public Integer getNumResourceHandles() {
        return numresourceHandles;
    }

    public Iterable<hkMemoryResourceHandle> getResourceHandles() {
        return resourceHandles;
    }

    public hkMemoryResourceHandle getResourceHandlesAt(int index) {
        return resourceHandles.get(index);
    }

    public boolean addToResourceHandles(hkMemoryResourceHandle newResourceHandles) {
        if (resourceHandles.add(newResourceHandles)) {
            numresourceHandles += 1;
            return true;
        }
        return false;
    }

    @ObjectLink
    public boolean removeFromResourceHandles(hkMemoryResourceHandle resourceHandlesToRemove) {
        if (resourceHandles.remove(resourceHandlesToRemove)) {
            numresourceHandles += -1;
            return true;
        }
        return false;
    }

    public hkMemoryResourceHandle removeFromResourceHandlesAt(int index) {
        hkMemoryResourceHandle toRemove;
        toRemove = resourceHandles.remove(index);
        if (!(null == toRemove)) {
            numresourceHandles += -1;
            return toRemove;
        }
        return null;
    }

    public Integer getNumChildren() {
        return numchildren;
    }

    public Iterable<org.tes.hkx.lib.ext.hkMemoryResourceContainer> getChildren() {
        return children;
    }

    public org.tes.hkx.lib.ext.hkMemoryResourceContainer getChildrenAt(int index) {
        return children.get(index);
    }

    public boolean addToChildren(org.tes.hkx.lib.ext.hkMemoryResourceContainer newChildren) {
        if (children.add(newChildren)) {
            numchildren += 1;
            return true;
        }
        return false;
    }

    @ObjectLink
    public boolean removeFromChildren(org.tes.hkx.lib.ext.hkMemoryResourceContainer childrenToRemove) {
        if (children.remove(childrenToRemove)) {
            numchildren += -1;
            return true;
        }
        return false;
    }

    public org.tes.hkx.lib.ext.hkMemoryResourceContainer removeFromChildrenAt(int index) {
        org.tes.hkx.lib.ext.hkMemoryResourceContainer toRemove;
        toRemove = children.remove(index);
        if (!(null == toRemove)) {
            numchildren += -1;
            return toRemove;
        }
        return null;
    }

    @Override
    public<T >T accept(IHkVisitor<T> visitor) {
        visitor.visit(this);
        for (hkMemoryResourceHandle child: getResourceHandles()) {
            child.accept(visitor);
        }
        for (org.tes.hkx.lib.ext.hkMemoryResourceContainer child: getChildren()) {
            child.accept(visitor);
        }
        return visitor.getResults();
    }

    @Override
    public<T >T accept(IHkParentVisitor<T> visitor, IHkVisitable parent) {
        visitor.visit(this, parent);
        for (hkMemoryResourceHandle child: getResourceHandles()) {
            child.accept(visitor, this);
        }
        for (org.tes.hkx.lib.ext.hkMemoryResourceContainer child: getChildren()) {
            child.accept(visitor, this);
        }
        return visitor.getResults();
    }

    @Override
    public Collection<IHkVisitable> objects() {
        Collection<IHkVisitable> theseObjects = new ArrayList<IHkVisitable>();
        for (hkMemoryResourceHandle child: getResourceHandles()) {
            theseObjects.add(child);
        }
        for (org.tes.hkx.lib.ext.hkMemoryResourceContainer child: getChildren()) {
            theseObjects.add(child);
        }
        return theseObjects;
    }

    @Override
    public boolean remove(Object toRemove) {
        if ((toRemove instanceof hkMemoryResourceHandle)&&removeFromResourceHandles(((hkMemoryResourceHandle) toRemove))) {
            return true;
        }
        if ((toRemove instanceof org.tes.hkx.lib.ext.hkMemoryResourceContainer)&&removeFromChildren(((org.tes.hkx.lib.ext.hkMemoryResourceContainer) toRemove))) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString()+" ["+this.getName()+"]";
    }

}
