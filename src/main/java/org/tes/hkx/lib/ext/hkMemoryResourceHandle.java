
package org.tes.hkx.lib.ext;

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
@XmlDiscriminatorValue("0xbffac086")
@XmlType(propOrder = {
    "variant",
    "name",
    "references"
})
public class hkMemoryResourceHandle
    extends HkobjectType
    implements IHkContainer, IHkVisitable
{

    private hkpShapeInfo variant;
    private String childname;
    @XmlJavaTypeAdapter(HkParenthesysVectorAdapter.class)
    @XmlPath("hkparam[@name=\"references\"]/text()")
    private ArrayList<String> references;
    @XmlPath("hkparam[@name=\"references\"]/@numelements")
    private Integer numreferences;

    public hkMemoryResourceHandle() {
        setVariant(null);
        setName("hkpShapeInfo");
        references = new ArrayList<String>();
        numreferences = 0;
        setClazz("hkMemoryResourceHandle");
    }

    @XmlIDREF
    @XmlPath("hkparam[@name=\"variant\"]/text()")
    @ObjectLink
    public hkpShapeInfo getVariant() {
        return variant;
    }

    public void setVariant(hkpShapeInfo newVariant) {
        this.variant = newVariant;
    }

    @XmlPath("hkparam[@name=\"name\"]/text()")
    public String getName() {
        return childname;
    }

    @XmlPath("hkparam[@name=\"name\"]/text()")
    public void setName(String newName) {
        this.childname = newName;
    }

    public Integer getNumReferences() {
        return numreferences;
    }

    public Iterable<String> getReferences() {
        return references;
    }

    public String getReferencesAt(int index) {
        return references.get(index);
    }

    public boolean addToReferences(String newReferences) {
        if (references.add(newReferences)) {
            numreferences += 1;
            return true;
        }
        return false;
    }

    public boolean removeFromReferences(String referencesToRemove) {
        if (references.remove(referencesToRemove)) {
            numreferences += -1;
            return true;
        }
        return false;
    }

    public String removeFromReferencesAt(int index) {
        String toRemove;
        toRemove = references.remove(index);
        if (!(null == toRemove)) {
            numreferences += -1;
            return toRemove;
        }
        return null;
    }

    @Override
    public<T >T accept(IHkVisitor<T> visitor) {
        visitor.visit(this);
        if (!(null == getVariant())) {
            getVariant().accept(visitor);
        }
        return visitor.getResults();
    }

    @Override
    public<T >T accept(IHkParentVisitor<T> visitor, IHkVisitable parent) {
        visitor.visit(this, parent);
        if (!(null == getVariant())) {
            getVariant().accept(visitor, this);
        }
        return visitor.getResults();
    }

    @Override
    public Collection<IHkVisitable> objects() {
        Collection<IHkVisitable> theseObjects = new ArrayList<IHkVisitable>();
        if (!(null == getVariant())) {
            theseObjects.add(getVariant());
        }
        return theseObjects;
    }

    @Override
    public boolean remove(Object toRemove) {
        if ((getVariant()!= null)&&getVariant().equals(toRemove)) {
            setVariant(null);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString()+" ["+this.getName()+"]";
    }

}
