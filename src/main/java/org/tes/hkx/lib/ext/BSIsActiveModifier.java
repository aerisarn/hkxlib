
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
@XmlDiscriminatorValue("0xb0fde45a")
@XmlType(propOrder = {
    "variableBindingSet",
    "userData",
    "name",
    "enable",
    "BIsActive0",
    "BInvertActive0",
    "BIsActive1",
    "BInvertActive1",
    "BIsActive2",
    "BInvertActive2",
    "BIsActive3",
    "BInvertActive3",
    "BIsActive4",
    "BInvertActive4"
})
public class BSIsActiveModifier
    extends HkobjectType
    implements IHkContainer, IHkVisitable
{

    private hkbVariableBindingSet variableBindingSet;
    private String userData;
    private String childname;
    private String enable;
    private String bIsActive0;
    private String bInvertActive0;
    private String bIsActive1;
    private String bInvertActive1;
    private String bIsActive2;
    private String bInvertActive2;
    private String bIsActive3;
    private String bInvertActive3;
    private String bIsActive4;
    private String bInvertActive4;

    public BSIsActiveModifier() {
        setVariableBindingSet(null);
        setUserData("2");
        setName("BSIsActiveModifier_Stagger");
        setEnable("true");
        setBIsActive0("false");
        setBInvertActive0("false");
        setBIsActive1("false");
        setBInvertActive1("false");
        setBIsActive2("false");
        setBInvertActive2("false");
        setBIsActive3("false");
        setBInvertActive3("false");
        setBIsActive4("false");
        setBInvertActive4("false");
        setClazz("BSIsActiveModifier");
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

    @XmlPath("hkparam[@name=\"enable\"]/text()")
    public String getEnable() {
        return enable;
    }

    @XmlPath("hkparam[@name=\"enable\"]/text()")
    public void setEnable(String newEnable) {
        this.enable = newEnable;
    }

    @XmlPath("hkparam[@name=\"bIsActive0\"]/text()")
    public String getBIsActive0() {
        return bIsActive0;
    }

    @XmlPath("hkparam[@name=\"bIsActive0\"]/text()")
    public void setBIsActive0(String newBIsActive0) {
        this.bIsActive0 = newBIsActive0;
    }

    @XmlPath("hkparam[@name=\"bInvertActive0\"]/text()")
    public String getBInvertActive0() {
        return bInvertActive0;
    }

    @XmlPath("hkparam[@name=\"bInvertActive0\"]/text()")
    public void setBInvertActive0(String newBInvertActive0) {
        this.bInvertActive0 = newBInvertActive0;
    }

    @XmlPath("hkparam[@name=\"bIsActive1\"]/text()")
    public String getBIsActive1() {
        return bIsActive1;
    }

    @XmlPath("hkparam[@name=\"bIsActive1\"]/text()")
    public void setBIsActive1(String newBIsActive1) {
        this.bIsActive1 = newBIsActive1;
    }

    @XmlPath("hkparam[@name=\"bInvertActive1\"]/text()")
    public String getBInvertActive1() {
        return bInvertActive1;
    }

    @XmlPath("hkparam[@name=\"bInvertActive1\"]/text()")
    public void setBInvertActive1(String newBInvertActive1) {
        this.bInvertActive1 = newBInvertActive1;
    }

    @XmlPath("hkparam[@name=\"bIsActive2\"]/text()")
    public String getBIsActive2() {
        return bIsActive2;
    }

    @XmlPath("hkparam[@name=\"bIsActive2\"]/text()")
    public void setBIsActive2(String newBIsActive2) {
        this.bIsActive2 = newBIsActive2;
    }

    @XmlPath("hkparam[@name=\"bInvertActive2\"]/text()")
    public String getBInvertActive2() {
        return bInvertActive2;
    }

    @XmlPath("hkparam[@name=\"bInvertActive2\"]/text()")
    public void setBInvertActive2(String newBInvertActive2) {
        this.bInvertActive2 = newBInvertActive2;
    }

    @XmlPath("hkparam[@name=\"bIsActive3\"]/text()")
    public String getBIsActive3() {
        return bIsActive3;
    }

    @XmlPath("hkparam[@name=\"bIsActive3\"]/text()")
    public void setBIsActive3(String newBIsActive3) {
        this.bIsActive3 = newBIsActive3;
    }

    @XmlPath("hkparam[@name=\"bInvertActive3\"]/text()")
    public String getBInvertActive3() {
        return bInvertActive3;
    }

    @XmlPath("hkparam[@name=\"bInvertActive3\"]/text()")
    public void setBInvertActive3(String newBInvertActive3) {
        this.bInvertActive3 = newBInvertActive3;
    }

    @XmlPath("hkparam[@name=\"bIsActive4\"]/text()")
    public String getBIsActive4() {
        return bIsActive4;
    }

    @XmlPath("hkparam[@name=\"bIsActive4\"]/text()")
    public void setBIsActive4(String newBIsActive4) {
        this.bIsActive4 = newBIsActive4;
    }

    @XmlPath("hkparam[@name=\"bInvertActive4\"]/text()")
    public String getBInvertActive4() {
        return bInvertActive4;
    }

    @XmlPath("hkparam[@name=\"bInvertActive4\"]/text()")
    public void setBInvertActive4(String newBInvertActive4) {
        this.bInvertActive4 = newBInvertActive4;
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

    @Override
    public String toString() {
        return super.toString()+" ["+this.getName()+"]";
    }

}
