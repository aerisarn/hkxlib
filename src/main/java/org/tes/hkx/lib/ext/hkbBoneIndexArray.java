
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
@XmlDiscriminatorValue("0xaa8619")
@XmlType(propOrder = {
    "variableBindingSet",
    "boneIndices"
})
public class hkbBoneIndexArray
    extends HkobjectType
    implements IHkContainer, IHkVisitable
{

    private hkbVariableBindingSet variableBindingSet;
    @XmlList
    @XmlPath("hkparam[@name=\"boneIndices\"]/text()")
    private ArrayList<String> boneIndices;
    @XmlPath("hkparam[@name=\"boneIndices\"]/@numelements")
    private Integer numboneIndices;

    public hkbBoneIndexArray() {
        setVariableBindingSet(null);
        boneIndices = new ArrayList<String>();
        numboneIndices = 0;
        setClazz("hkbBoneIndexArray");
    }

    @XmlIDREF
    @XmlPath("hkparam[@name=\"variableBindingSet\"]/text()")
    @ObjectLink
    public hkbVariableBindingSet getVariableBindingSet() {
        return variableBindingSet;
    }

    public void setVariableBindingSet(hkbVariableBindingSet newVariableBindingSet) {
        this.variableBindingSet = newVariableBindingSet;
    }

    public Integer getNumBoneIndices() {
        return numboneIndices;
    }

    public Iterable<String> getBoneIndices() {
        return boneIndices;
    }

    public String getBoneIndicesAt(int index) {
        return boneIndices.get(index);
    }

    public boolean addToBoneIndices(String newBoneIndices) {
        if (boneIndices.add(newBoneIndices)) {
            numboneIndices += 1;
            return true;
        }
        return false;
    }

    public boolean removeFromBoneIndices(String boneIndicesToRemove) {
        if (boneIndices.remove(boneIndicesToRemove)) {
            numboneIndices += -1;
            return true;
        }
        return false;
    }

    public String removeFromBoneIndicesAt(int index) {
        String toRemove;
        toRemove = boneIndices.remove(index);
        if (!(null == toRemove)) {
            numboneIndices += -1;
            return toRemove;
        }
        return null;
    }
    
    public void clearBoneIndices() {
    	numboneIndices=0;
    	boneIndices.clear();
    }

    @Override
    public<T >T accept(IHkVisitor<T> visitor) {
        visitor.visit(this);
        if (!(null == getVariableBindingSet())) {
            getVariableBindingSet().accept(visitor);
        }
        return visitor.getResults();
    }

    @Override
    public<T >T accept(IHkParentVisitor<T> visitor, IHkVisitable parent) {
        visitor.visit(this, parent);
        if (!(null == getVariableBindingSet())) {
            getVariableBindingSet().accept(visitor, this);
        }
        return visitor.getResults();
    }

    @Override
    public Collection<IHkVisitable> objects() {
        Collection<IHkVisitable> theseObjects = new ArrayList<IHkVisitable>();
        if (!(null == getVariableBindingSet())) {
            theseObjects.add(getVariableBindingSet());
        }
        return theseObjects;
    }

    @Override
    public boolean remove(Object toRemove) {
        if ((getVariableBindingSet()!= null)&&getVariableBindingSet().equals(toRemove)) {
            setVariableBindingSet(null);
            return true;
        }
        return false;
    }

}
