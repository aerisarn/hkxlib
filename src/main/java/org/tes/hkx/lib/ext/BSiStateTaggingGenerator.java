
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
@XmlDiscriminatorValue("0xf0826fc1")
@XmlType(propOrder = {
    "variableBindingSet",
    "userData",
    "name",
    "PDefaultGenerator",
    "IStateToSetAs",
    "IPriority"
})
public class BSiStateTaggingGenerator
    extends HkobjectType
    implements IHkContainer, IHkVisitable
{

    private hkbVariableBindingSet variableBindingSet;
    private String userData;
    private String childname;
    private HkobjectType pDefaultGenerator;
    private String iStateToSetAs;
    private String iPriority;

    public BSiStateTaggingGenerator() {
        setVariableBindingSet(null);
        setUserData("1");
        setName("Z_ReadyFwdPowAtt_ISTG");
        setPDefaultGenerator(null);
        setIStateToSetAs("12");
        setIPriority("8");
        setClazz("BSiStateTaggingGenerator");
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

    @XmlIDREF
    @XmlPath("hkparam[@name=\"pDefaultGenerator\"]/text()")
    @ObjectLink
    public HkobjectType getPDefaultGenerator() {
        return pDefaultGenerator;
    }

    public void setPDefaultGenerator(HkobjectType newPDefaultGenerator) {
        this.pDefaultGenerator = newPDefaultGenerator;
    }

    @XmlPath("hkparam[@name=\"iStateToSetAs\"]/text()")
    public String getIStateToSetAs() {
        return iStateToSetAs;
    }

    @XmlPath("hkparam[@name=\"iStateToSetAs\"]/text()")
    public void setIStateToSetAs(String newIStateToSetAs) {
        this.iStateToSetAs = newIStateToSetAs;
    }

    @XmlPath("hkparam[@name=\"iPriority\"]/text()")
    public String getIPriority() {
        return iPriority;
    }

    @XmlPath("hkparam[@name=\"iPriority\"]/text()")
    public void setIPriority(String newIPriority) {
        this.iPriority = newIPriority;
    }

    @Override
    public<T >T accept(IHkVisitor<T> visitor) {
        visitor.visit(this);
        if (!(null == getVariableBindingSet())) {
            getVariableBindingSet().accept(visitor);
        }
        if (!(null == getPDefaultGenerator())) {
            getPDefaultGenerator().accept(visitor);
        }
        return visitor.getResults();
    }

    @Override
    public<T >T accept(IHkParentVisitor<T> visitor, IHkVisitable parent) {
        visitor.visit(this, parent);
        if (!(null == getVariableBindingSet())) {
            getVariableBindingSet().accept(visitor, this);
        }
        if (!(null == getPDefaultGenerator())) {
            getPDefaultGenerator().accept(visitor, this);
        }
        return visitor.getResults();
    }

    @Override
    public Collection<IHkVisitable> objects() {
        Collection<IHkVisitable> theseObjects = new ArrayList<IHkVisitable>();
        if (!(null == getVariableBindingSet())) {
            theseObjects.add(getVariableBindingSet());
        }
        if (!(null == getPDefaultGenerator())) {
            theseObjects.add(getPDefaultGenerator());
        }
        return theseObjects;
    }

    @Override
    public boolean remove(Object toRemove) {
        if ((getVariableBindingSet()!= null)&&getVariableBindingSet().equals(toRemove)) {
            setVariableBindingSet(null);
            return true;
        }
        if ((getPDefaultGenerator()!= null)&&getPDefaultGenerator().equals(toRemove)) {
            setPDefaultGenerator(null);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString()+" ["+this.getName()+"]";
    }

}
