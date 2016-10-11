
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
@XmlDiscriminatorValue("0xcd902b77")
@XmlType(propOrder = {
    "variableBindingSet",
    "boneWeights"
})
public class hkbBoneWeightArray
    extends HkobjectType
    implements IHkContainer, IHkVisitable
{

    private hkbVariableBindingSet variableBindingSet;
    @XmlList
    @XmlPath("hkparam[@name=\"boneWeights\"]/text()")
    private ArrayList<String> boneWeights;
    @XmlPath("hkparam[@name=\"boneWeights\"]/@numelements")
    private Integer numboneWeights;

    public hkbBoneWeightArray() {
        setVariableBindingSet(null);
        boneWeights = new ArrayList<String>();
        numboneWeights = 0;
        setClazz("hkbBoneWeightArray");
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

    public Integer getNumBoneWeights() {
        return numboneWeights;
    }

    public Iterable<String> getBoneWeights() {
        return boneWeights;
    }

    public String getBoneWeightsAt(int index) {
        return boneWeights.get(index);
    }

    public boolean addToBoneWeights(String newBoneWeights) {
        if (boneWeights.add(newBoneWeights)) {
            numboneWeights += 1;
            return true;
        }
        return false;
    }

    public boolean removeFromBoneWeights(String boneWeightsToRemove) {
        if (boneWeights.remove(boneWeightsToRemove)) {
            numboneWeights += -1;
            return true;
        }
        return false;
    }

    public String removeFromBoneWeightsAt(int index) {
        String toRemove;
        toRemove = boneWeights.remove(index);
        if (!(null == toRemove)) {
            numboneWeights += -1;
            return toRemove;
        }
        return null;
    }
    
    public void clearBoneWeights() {
    	numboneWeights = 0;
        boneWeights.clear();
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
