
package org.tes.hkx.lib.ext;

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlList;
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
@XmlDiscriminatorValue("0x27812d8d")
@XmlType(propOrder = {
    "wordVariableValues",
    "quadVariableValues",
    "variantVariableValues"
})
public class hkbVariableValueSet
    extends HkobjectType
    implements IHkContainer, IHkVisitable
{

    @XmlElement(name = "hkparam[@name=\"wordVariableValues\"]/hkobject", required = true, nillable = true)
    private ArrayList<org.tes.hkx.lib.ext.innerWordVariableValue> wordVariableValues;
    @XmlPath("hkparam[@name=\"wordVariableValues\"]/@numelements")
    private Integer numwordVariableValues;
    @XmlJavaTypeAdapter(HkParenthesysVectorAdapter.class)
    @XmlPath("hkparam[@name=\"quadVariableValues\"]/text()")
    private ArrayList<String> quadVariableValues;
    @XmlPath("hkparam[@name=\"quadVariableValues\"]/@numelements")
    private Integer numquadVariableValues;
    @XmlIDREF
    @XmlPath("hkparam[@name=\"variantVariableValues\"]/text()")
    @XmlList
    private ArrayList<hkbBoneWeightArray> variantVariableValues;
    @XmlPath("hkparam[@name=\"variantVariableValues\"]/@numelements")
    private Integer numvariantVariableValues;

    public hkbVariableValueSet() {
        wordVariableValues = new ArrayList<org.tes.hkx.lib.ext.innerWordVariableValue>();
        numwordVariableValues = 0;
        quadVariableValues = new ArrayList<String>();
        numquadVariableValues = 0;
        variantVariableValues = new ArrayList<hkbBoneWeightArray>();
        numvariantVariableValues = 0;
        setClazz("hkbVariableValueSet");
    }

    public Integer getNumWordVariableValues() {
        return numwordVariableValues;
    }

    public Iterable<org.tes.hkx.lib.ext.innerWordVariableValue> getWordVariableValues() {
        return wordVariableValues;
    }

    public org.tes.hkx.lib.ext.innerWordVariableValue getWordVariableValuesAt(int index) {
        return wordVariableValues.get(index);
    }

    public boolean addToWordVariableValues(org.tes.hkx.lib.ext.innerWordVariableValue newWordVariableValues) {
        if (wordVariableValues.add(newWordVariableValues)) {
            numwordVariableValues += 1;
            return true;
        }
        return false;
    }

    @ObjectLink
    public boolean removeFromWordVariableValues(org.tes.hkx.lib.ext.innerWordVariableValue wordVariableValuesToRemove) {
        if (wordVariableValues.remove(wordVariableValuesToRemove)) {
            numwordVariableValues += -1;
            return true;
        }
        return false;
    }

    public org.tes.hkx.lib.ext.innerWordVariableValue removeFromWordVariableValuesAt(int index) {
        org.tes.hkx.lib.ext.innerWordVariableValue toRemove;
        toRemove = wordVariableValues.remove(index);
        if (!(null == toRemove)) {
            numwordVariableValues += -1;
            return toRemove;
        }
        return null;
    }

    public Integer getNumQuadVariableValues() {
        return numquadVariableValues;
    }

    public Iterable<String> getQuadVariableValues() {
        return quadVariableValues;
    }

    public String getQuadVariableValuesAt(int index) {
        return quadVariableValues.get(index);
    }

    public boolean addToQuadVariableValues(String newQuadVariableValues) {
        if (quadVariableValues.add(newQuadVariableValues)) {
            numquadVariableValues += 1;
            return true;
        }
        return false;
    }

    public boolean removeFromQuadVariableValues(String quadVariableValuesToRemove) {
        if (quadVariableValues.remove(quadVariableValuesToRemove)) {
            numquadVariableValues += -1;
            return true;
        }
        return false;
    }

    public String removeFromQuadVariableValuesAt(int index) {
        String toRemove;
        toRemove = quadVariableValues.remove(index);
        if (!(null == toRemove)) {
            numquadVariableValues += -1;
            return toRemove;
        }
        return null;
    }

    public Integer getNumVariantVariableValues() {
        return numvariantVariableValues;
    }

    public Iterable<hkbBoneWeightArray> getVariantVariableValues() {
        return variantVariableValues;
    }

    public hkbBoneWeightArray getVariantVariableValuesAt(int index) {
        return variantVariableValues.get(index);
    }

    public boolean addToVariantVariableValues(hkbBoneWeightArray newVariantVariableValues) {
        if (variantVariableValues.add(newVariantVariableValues)) {
            numvariantVariableValues += 1;
            return true;
        }
        return false;
    }

    @ObjectLink
    public boolean removeFromVariantVariableValues(hkbBoneWeightArray variantVariableValuesToRemove) {
        if (variantVariableValues.remove(variantVariableValuesToRemove)) {
            numvariantVariableValues += -1;
            return true;
        }
        return false;
    }

    public hkbBoneWeightArray removeFromVariantVariableValuesAt(int index) {
        hkbBoneWeightArray toRemove;
        toRemove = variantVariableValues.remove(index);
        if (!(null == toRemove)) {
            numvariantVariableValues += -1;
            return toRemove;
        }
        return null;
    }

    @Override
    public<T >T accept(IHkVisitor<T> visitor) {
        visitor.visit(this);
        for (org.tes.hkx.lib.ext.innerWordVariableValue child: getWordVariableValues()) {
            child.accept(visitor);
        }
        for (hkbBoneWeightArray child: getVariantVariableValues()) {
            child.accept(visitor);
        }
        return visitor.getResults();
    }

    @Override
    public<T >T accept(IHkParentVisitor<T> visitor, IHkVisitable parent) {
        visitor.visit(this, parent);
        for (org.tes.hkx.lib.ext.innerWordVariableValue child: getWordVariableValues()) {
            child.accept(visitor, this);
        }
        for (hkbBoneWeightArray child: getVariantVariableValues()) {
            child.accept(visitor, this);
        }
        return visitor.getResults();
    }

    @Override
    public Collection<IHkVisitable> objects() {
        Collection<IHkVisitable> theseObjects = new ArrayList<IHkVisitable>();
        for (org.tes.hkx.lib.ext.innerWordVariableValue child: getWordVariableValues()) {
            theseObjects.add(child);
        }
        for (hkbBoneWeightArray child: getVariantVariableValues()) {
            theseObjects.add(child);
        }
        return theseObjects;
    }

    @Override
    public boolean remove(Object toRemove) {
        if ((toRemove instanceof org.tes.hkx.lib.ext.innerWordVariableValue)&&removeFromWordVariableValues(((org.tes.hkx.lib.ext.innerWordVariableValue) toRemove))) {
            return true;
        }
        if ((toRemove instanceof hkbBoneWeightArray)&&removeFromVariantVariableValues(((hkbBoneWeightArray) toRemove))) {
            return true;
        }
        return false;
    }

}
