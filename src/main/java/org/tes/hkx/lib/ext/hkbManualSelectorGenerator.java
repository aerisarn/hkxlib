
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
@XmlDiscriminatorValue("0xd932fab8")
@XmlType(propOrder = {
    "variableBindingSet",
    "userData",
    "name",
    "generators",
    "selectedGeneratorIndex",
    "currentGeneratorIndex"
})
public class hkbManualSelectorGenerator
    extends HkobjectType
    implements IHkContainer, IHkVisitable
{

    private hkbVariableBindingSet variableBindingSet;
    private String userData;
    private String childname;
    @XmlIDREF
    @XmlPath("hkparam[@name=\"generators\"]/text()")
    @XmlList
    private ArrayList<HkobjectType> generators;
    @XmlPath("hkparam[@name=\"generators\"]/@numelements")
    private Integer numgenerators;
    private HkobjectType selectedGeneratorIndex;
    private HkobjectType currentGeneratorIndex;

    public hkbManualSelectorGenerator() {
        setVariableBindingSet(null);
        setUserData("0");
        setName("PoseMatching MSG");
        generators = new ArrayList<HkobjectType>();
        numgenerators = 0;
        setSelectedGeneratorIndex(null);
        setCurrentGeneratorIndex(null);
        setClazz("hkbManualSelectorGenerator");
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

    @XmlPath("hkparam[@name=\"userData\"]/text()")
    public String getUserData() {
        return userData;
    }

    @XmlPath("hkparam[@name=\"userData\"]/text()")
    public void setUserData(String newUserData) {
        this.userData = newUserData;
    }

    @XmlPath("hkparam[@name=\"name\"]/text()")
    public String getName() {
        return childname;
    }

    @XmlPath("hkparam[@name=\"name\"]/text()")
    public void setName(String newName) {
        this.childname = newName;
    }

    public Integer getNumGenerators() {
        return numgenerators;
    }

    public Iterable<HkobjectType> getGenerators() {
        return generators;
    }

    public HkobjectType getGeneratorsAt(int index) {
        return generators.get(index);
    }

    public boolean addToGenerators(HkobjectType newGenerators) {
        if (generators.add(newGenerators)) {
            numgenerators += 1;
            return true;
        }
        return false;
    }

    @ObjectLink
    public boolean removeFromGenerators(HkobjectType generatorsToRemove) {
        if (generators.remove(generatorsToRemove)) {
            numgenerators += -1;
            return true;
        }
        return false;
    }

    public HkobjectType removeFromGeneratorsAt(int index) {
        HkobjectType toRemove;
        toRemove = generators.remove(index);
        if (!(null == toRemove)) {
            numgenerators += -1;
            return toRemove;
        }
        return null;
    }

    @XmlIDREF
    @XmlPath("hkparam[@name=\"selectedGeneratorIndex\"]/text()")
    @ObjectLink
    public HkobjectType getSelectedGeneratorIndex() {
        return selectedGeneratorIndex;
    }

    public void setSelectedGeneratorIndex(HkobjectType newSelectedGeneratorIndex) {
        this.selectedGeneratorIndex = newSelectedGeneratorIndex;
    }

    @XmlIDREF
    @XmlPath("hkparam[@name=\"currentGeneratorIndex\"]/text()")
    @ObjectLink
    public HkobjectType getCurrentGeneratorIndex() {
        return currentGeneratorIndex;
    }

    public void setCurrentGeneratorIndex(HkobjectType newCurrentGeneratorIndex) {
        this.currentGeneratorIndex = newCurrentGeneratorIndex;
    }

    @Override
    public<T >T accept(IHkVisitor<T> visitor) {
        visitor.visit(this);
        if (!(null == getVariableBindingSet())) {
            getVariableBindingSet().accept(visitor);
        }
        for (HkobjectType child: getGenerators()) {
            child.accept(visitor);
        }
        if (!(null == getSelectedGeneratorIndex())) {
            getSelectedGeneratorIndex().accept(visitor);
        }
        if (!(null == getCurrentGeneratorIndex())) {
            getCurrentGeneratorIndex().accept(visitor);
        }
        return visitor.getResults();
    }

    @Override
    public<T >T accept(IHkParentVisitor<T> visitor, IHkVisitable parent) {
        visitor.visit(this, parent);
        if (!(null == getVariableBindingSet())) {
            getVariableBindingSet().accept(visitor, this);
        }
        for (HkobjectType child: getGenerators()) {
            child.accept(visitor, this);
        }
        if (!(null == getSelectedGeneratorIndex())) {
            getSelectedGeneratorIndex().accept(visitor, this);
        }
        if (!(null == getCurrentGeneratorIndex())) {
            getCurrentGeneratorIndex().accept(visitor, this);
        }
        return visitor.getResults();
    }

    @Override
    public Collection<IHkVisitable> objects() {
        Collection<IHkVisitable> theseObjects = new ArrayList<IHkVisitable>();
        if (!(null == getVariableBindingSet())) {
            theseObjects.add(getVariableBindingSet());
        }
        for (HkobjectType child: getGenerators()) {
            theseObjects.add(child);
        }
        if (!(null == getSelectedGeneratorIndex())) {
            theseObjects.add(getSelectedGeneratorIndex());
        }
        if (!(null == getCurrentGeneratorIndex())) {
            theseObjects.add(getCurrentGeneratorIndex());
        }
        return theseObjects;
    }

    @Override
    public boolean remove(Object toRemove) {
        if ((getVariableBindingSet()!= null)&&getVariableBindingSet().equals(toRemove)) {
            setVariableBindingSet(null);
            return true;
        }
        if ((toRemove instanceof HkobjectType)&&removeFromGenerators(((HkobjectType) toRemove))) {
            return true;
        }
        if ((getSelectedGeneratorIndex()!= null)&&getSelectedGeneratorIndex().equals(toRemove)) {
            setSelectedGeneratorIndex(null);
            return true;
        }
        if ((getCurrentGeneratorIndex()!= null)&&getCurrentGeneratorIndex().equals(toRemove)) {
            setCurrentGeneratorIndex(null);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString()+" ["+this.getName()+"]";
    }

}
