
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
@XmlDiscriminatorValue("0x34eba5f")
@XmlType(propOrder = {
    "data",
    "constraintModifiers",
    "entities",
    "priority",
    "wantRuntime",
    "destructionRemapInfo",
    "name",
    "userData"
})
public class hkpConstraintInstance
    extends HkobjectType
    implements IHkContainer, IHkVisitable
{

    private hkpRagdollConstraintData data;
    private HkobjectType constraintModifiers;
    private hkpRigidBody entities;
    private String priority;
    private String wantRuntime;
    private String destructionRemapInfo;
    private String childname;
    private String userData;

    public hkpConstraintInstance() {
        setData(null);
        setConstraintModifiers(null);
        setEntities(null);
        setPriority("PRIORITY_PSI");
        setWantRuntime("true");
        setDestructionRemapInfo("ON_DESTRUCTION_REMAP");
        setName("Ragdoll_NPC Spine2 [Spn2]");
        setUserData("0");
        setClazz("hkpConstraintInstance");
    }

    @XmlIDREF
    @XmlPath("hkparam[@name=\"data\"]/text()")
    @ObjectLink
    public hkpRagdollConstraintData getData() {
        return data;
    }

    public void setData(hkpRagdollConstraintData newData) {
        this.data = newData;
    }

    @XmlIDREF
    @XmlPath("hkparam[@name=\"constraintModifiers\"]/text()")
    @ObjectLink
    public HkobjectType getConstraintModifiers() {
        return constraintModifiers;
    }

    public void setConstraintModifiers(HkobjectType newConstraintModifiers) {
        this.constraintModifiers = newConstraintModifiers;
    }

    @XmlIDREF
    @XmlPath("hkparam[@name=\"entities\"]/text()")
    @ObjectLink
    public hkpRigidBody getEntities() {
        return entities;
    }

    public void setEntities(hkpRigidBody newEntities) {
        this.entities = newEntities;
    }

    @XmlPath("hkparam[@name=\"priority\"]/text()")
    public String getPriority() {
        return priority;
    }

    @XmlPath("hkparam[@name=\"priority\"]/text()")
    public void setPriority(String newPriority) {
        this.priority = newPriority;
    }

    @XmlPath("hkparam[@name=\"wantRuntime\"]/text()")
    public String getWantRuntime() {
        return wantRuntime;
    }

    @XmlPath("hkparam[@name=\"wantRuntime\"]/text()")
    public void setWantRuntime(String newWantRuntime) {
        this.wantRuntime = newWantRuntime;
    }

    @XmlPath("hkparam[@name=\"destructionRemapInfo\"]/text()")
    public String getDestructionRemapInfo() {
        return destructionRemapInfo;
    }

    @XmlPath("hkparam[@name=\"destructionRemapInfo\"]/text()")
    public void setDestructionRemapInfo(String newDestructionRemapInfo) {
        this.destructionRemapInfo = newDestructionRemapInfo;
    }

    @XmlPath("hkparam[@name=\"name\"]/text()")
    public String getName() {
        return childname;
    }

    @XmlPath("hkparam[@name=\"name\"]/text()")
    public void setName(String newName) {
        this.childname = newName;
    }

    @XmlPath("hkparam[@name=\"userData\"]/text()")
    public String getUserData() {
        return userData;
    }

    @XmlPath("hkparam[@name=\"userData\"]/text()")
    public void setUserData(String newUserData) {
        this.userData = newUserData;
    }

    @Override
    public<T >T accept(IHkVisitor<T> visitor) {
        visitor.visit(this);
        if (!(null == getData())) {
            getData().accept(visitor);
        }
        if (!(null == getConstraintModifiers())) {
            getConstraintModifiers().accept(visitor);
        }
        if (!(null == getEntities())) {
            getEntities().accept(visitor);
        }
        return visitor.getResults();
    }

    @Override
    public<T >T accept(IHkParentVisitor<T> visitor, IHkVisitable parent) {
        visitor.visit(this, parent);
        if (!(null == getData())) {
            getData().accept(visitor, this);
        }
        if (!(null == getConstraintModifiers())) {
            getConstraintModifiers().accept(visitor, this);
        }
        if (!(null == getEntities())) {
            getEntities().accept(visitor, this);
        }
        return visitor.getResults();
    }

    @Override
    public Collection<IHkVisitable> objects() {
        Collection<IHkVisitable> theseObjects = new ArrayList<IHkVisitable>();
        if (!(null == getData())) {
            theseObjects.add(getData());
        }
        if (!(null == getConstraintModifiers())) {
            theseObjects.add(getConstraintModifiers());
        }
        if (!(null == getEntities())) {
            theseObjects.add(getEntities());
        }
        return theseObjects;
    }

    @Override
    public boolean remove(Object toRemove) {
        if ((getData()!= null)&&getData().equals(toRemove)) {
            setData(null);
            return true;
        }
        if ((getConstraintModifiers()!= null)&&getConstraintModifiers().equals(toRemove)) {
            setConstraintModifiers(null);
            return true;
        }
        if ((getEntities()!= null)&&getEntities().equals(toRemove)) {
            setEntities(null);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString()+" ["+this.getName()+"]";
    }

}
