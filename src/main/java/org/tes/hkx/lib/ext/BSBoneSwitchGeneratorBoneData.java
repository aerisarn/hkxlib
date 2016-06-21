
package org.tes.hkx.lib.ext;

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlIDREF;
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
@XmlDiscriminatorValue("0xc1215be6")
@XmlType(propOrder = {
    "variableBindingSet",
    "PGenerator",
    "spBoneWeight"
})
public class BSBoneSwitchGeneratorBoneData
    extends HkobjectType
    implements IHkContainer, IHkVisitable
{

    private hkbVariableBindingSet variableBindingSet;
    private HkobjectType pGenerator;
    private hkbBoneWeightArray spBoneWeight;

    public BSBoneSwitchGeneratorBoneData() {
        setVariableBindingSet(null);
        setPGenerator(null);
        setSpBoneWeight(null);
        setClazz("BSBoneSwitchGeneratorBoneData");
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

    @XmlIDREF
    @XmlPath("hkparam[@name=\"pGenerator\"]/text()")
    @ObjectLink
    public HkobjectType getPGenerator() {
        return pGenerator;
    }

    public void setPGenerator(HkobjectType newPGenerator) {
        this.pGenerator = newPGenerator;
    }

    @XmlIDREF
    @XmlPath("hkparam[@name=\"spBoneWeight\"]/text()")
    @ObjectLink
    public hkbBoneWeightArray getSpBoneWeight() {
        return spBoneWeight;
    }

    public void setSpBoneWeight(hkbBoneWeightArray newSpBoneWeight) {
        this.spBoneWeight = newSpBoneWeight;
    }

    @Override
    public<T >T accept(IHkVisitor<T> visitor) {
        visitor.visit(this);
        if (!(null == getVariableBindingSet())) {
            getVariableBindingSet().accept(visitor);
        }
        if (!(null == getPGenerator())) {
            getPGenerator().accept(visitor);
        }
        if (!(null == getSpBoneWeight())) {
            getSpBoneWeight().accept(visitor);
        }
        return visitor.getResults();
    }

    @Override
    public<T >T accept(IHkParentVisitor<T> visitor, IHkVisitable parent) {
        visitor.visit(this, parent);
        if (!(null == getVariableBindingSet())) {
            getVariableBindingSet().accept(visitor, this);
        }
        if (!(null == getPGenerator())) {
            getPGenerator().accept(visitor, this);
        }
        if (!(null == getSpBoneWeight())) {
            getSpBoneWeight().accept(visitor, this);
        }
        return visitor.getResults();
    }

    @Override
    public Collection<IHkVisitable> objects() {
        Collection<IHkVisitable> theseObjects = new ArrayList<IHkVisitable>();
        if (!(null == getVariableBindingSet())) {
            theseObjects.add(getVariableBindingSet());
        }
        if (!(null == getPGenerator())) {
            theseObjects.add(getPGenerator());
        }
        if (!(null == getSpBoneWeight())) {
            theseObjects.add(getSpBoneWeight());
        }
        return theseObjects;
    }

    @Override
    public boolean remove(Object toRemove) {
        if ((getVariableBindingSet()!= null)&&getVariableBindingSet().equals(toRemove)) {
            setVariableBindingSet(null);
            return true;
        }
        if ((getPGenerator()!= null)&&getPGenerator().equals(toRemove)) {
            setPGenerator(null);
            return true;
        }
        if ((getSpBoneWeight()!= null)&&getSpBoneWeight().equals(toRemove)) {
            setSpBoneWeight(null);
            return true;
        }
        return false;
    }

}
