
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
@XmlDiscriminatorValue("0xe2b384b0")
@XmlType(propOrder = {
    "variableBindingSet",
    "generator",
    "boneWeights",
    "weight",
    "worldFromModelWeight"
})
public class hkbBlenderGeneratorChild
    extends HkobjectType
    implements IHkContainer, IHkVisitable
{

    private hkbVariableBindingSet variableBindingSet;
    private HkobjectType generator;
    private hkbBoneWeightArray boneWeights;
    private String weight;
    private String worldFromModelWeight;

    public hkbBlenderGeneratorChild() {
        setVariableBindingSet(null);
        setGenerator(null);
        setBoneWeights(null);
        setWeight("1.000000");
        setWorldFromModelWeight("1.000000");
        setClazz("hkbBlenderGeneratorChild");
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
    @XmlPath("hkparam[@name=\"generator\"]/text()")
    @ObjectLink
    public HkobjectType getGenerator() {
        return generator;
    }

    public void setGenerator(HkobjectType newGenerator) {
        this.generator = newGenerator;
    }

    @XmlIDREF
    @XmlPath("hkparam[@name=\"boneWeights\"]/text()")
    @ObjectLink
    public hkbBoneWeightArray getBoneWeights() {
        return boneWeights;
    }

    public void setBoneWeights(hkbBoneWeightArray newBoneWeights) {
        this.boneWeights = newBoneWeights;
    }

    @XmlPath("hkparam[@name=\"weight\"]/text()")
    public String getWeight() {
        return weight;
    }

    @XmlPath("hkparam[@name=\"weight\"]/text()")
    public void setWeight(String newWeight) {
        this.weight = newWeight;
    }

    @XmlPath("hkparam[@name=\"worldFromModelWeight\"]/text()")
    public String getWorldFromModelWeight() {
        return worldFromModelWeight;
    }

    @XmlPath("hkparam[@name=\"worldFromModelWeight\"]/text()")
    public void setWorldFromModelWeight(String newWorldFromModelWeight) {
        this.worldFromModelWeight = newWorldFromModelWeight;
    }

    @Override
    public<T >T accept(IHkVisitor<T> visitor) {
        visitor.visit(this);
        if (!(null == getVariableBindingSet())) {
            getVariableBindingSet().accept(visitor);
        }
        if (!(null == getGenerator())) {
            getGenerator().accept(visitor);
        }
        if (!(null == getBoneWeights())) {
            getBoneWeights().accept(visitor);
        }
        return visitor.getResults();
    }

    @Override
    public<T >T accept(IHkParentVisitor<T> visitor, IHkVisitable parent) {
        visitor.visit(this, parent);
        if (!(null == getVariableBindingSet())) {
            getVariableBindingSet().accept(visitor, this);
        }
        if (!(null == getGenerator())) {
            getGenerator().accept(visitor, this);
        }
        if (!(null == getBoneWeights())) {
            getBoneWeights().accept(visitor, this);
        }
        return visitor.getResults();
    }

    @Override
    public Collection<IHkVisitable> objects() {
        Collection<IHkVisitable> theseObjects = new ArrayList<IHkVisitable>();
        if (!(null == getVariableBindingSet())) {
            theseObjects.add(getVariableBindingSet());
        }
        if (!(null == getGenerator())) {
            theseObjects.add(getGenerator());
        }
        if (!(null == getBoneWeights())) {
            theseObjects.add(getBoneWeights());
        }
        return theseObjects;
    }

    @Override
    public boolean remove(Object toRemove) {
        if ((getVariableBindingSet()!= null)&&getVariableBindingSet().equals(toRemove)) {
            setVariableBindingSet(null);
            return true;
        }
        if ((getGenerator()!= null)&&getGenerator().equals(toRemove)) {
            setGenerator(null);
            return true;
        }
        if ((getBoneWeights()!= null)&&getBoneWeights().equals(toRemove)) {
            setBoneWeights(null);
            return true;
        }
        return false;
    }

}
