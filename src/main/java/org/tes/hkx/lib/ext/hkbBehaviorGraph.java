
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
@XmlDiscriminatorValue("0xb1218f86")
@XmlType(propOrder = {
    "variableBindingSet",
    "userData",
    "name",
    "variableMode",
    "rootGenerator",
    "data"
})
public class hkbBehaviorGraph
    extends HkobjectType
    implements IHkContainer, IHkVisitable
{

    private hkbVariableBindingSet variableBindingSet;
    private String userData;
    private String childname;
    private String variableMode;
    private HkobjectType rootGenerator;
    private hkbBehaviorGraphData data;

    public hkbBehaviorGraph() {
        setVariableBindingSet(null);
        setUserData("0");
        setName("Behavior00.hkb");
        setVariableMode("VARIABLE_MODE_DISCARD_WHEN_INACTIVE");
        setRootGenerator(null);
        setData(null);
        setClazz("hkbBehaviorGraph");
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

    @XmlPath("hkparam[@name=\"variableMode\"]/text()")
    public String getVariableMode() {
        return variableMode;
    }

    @XmlPath("hkparam[@name=\"variableMode\"]/text()")
    public void setVariableMode(String newVariableMode) {
        this.variableMode = newVariableMode;
    }

    @XmlIDREF
    @XmlPath("hkparam[@name=\"rootGenerator\"]/text()")
    @ObjectLink
    public HkobjectType getRootGenerator() {
        return rootGenerator;
    }

    public void setRootGenerator(HkobjectType newRootGenerator) {
        this.rootGenerator = newRootGenerator;
    }

    @XmlIDREF
    @XmlPath("hkparam[@name=\"data\"]/text()")
    @ObjectLink
    public hkbBehaviorGraphData getData() {
        return data;
    }

    public void setData(hkbBehaviorGraphData newData) {
        this.data = newData;
    }

    @Override
    public<T >T accept(IHkVisitor<T> visitor) {
        visitor.visit(this);
        if (!(null == getVariableBindingSet())) {
            getVariableBindingSet().accept(visitor);
        }
        if (!(null == getRootGenerator())) {
            getRootGenerator().accept(visitor);
        }
        if (!(null == getData())) {
            getData().accept(visitor);
        }
        return visitor.getResults();
    }

    @Override
    public<T >T accept(IHkParentVisitor<T> visitor, IHkVisitable parent) {
        visitor.visit(this, parent);
        if (!(null == getVariableBindingSet())) {
            getVariableBindingSet().accept(visitor, this);
        }
        if (!(null == getRootGenerator())) {
            getRootGenerator().accept(visitor, this);
        }
        if (!(null == getData())) {
            getData().accept(visitor, this);
        }
        return visitor.getResults();
    }

    @Override
    public Collection<IHkVisitable> objects() {
        Collection<IHkVisitable> theseObjects = new ArrayList<IHkVisitable>();
        if (!(null == getVariableBindingSet())) {
            theseObjects.add(getVariableBindingSet());
        }
        if (!(null == getRootGenerator())) {
            theseObjects.add(getRootGenerator());
        }
        if (!(null == getData())) {
            theseObjects.add(getData());
        }
        return theseObjects;
    }

    @Override
    public boolean remove(Object toRemove) {
        if ((getVariableBindingSet()!= null)&&getVariableBindingSet().equals(toRemove)) {
            setVariableBindingSet(null);
            return true;
        }
        if ((getRootGenerator()!= null)&&getRootGenerator().equals(toRemove)) {
            setRootGenerator(null);
            return true;
        }
        if ((getData()!= null)&&getData().equals(toRemove)) {
            setData(null);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString()+" ["+this.getName()+"]";
    }

}
