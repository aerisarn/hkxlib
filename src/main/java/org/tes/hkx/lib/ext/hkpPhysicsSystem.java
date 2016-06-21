
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
@XmlDiscriminatorValue("0xff724c17")
@XmlType(propOrder = {
    "rigidBodies",
    "constraints",
    "actions",
    "phantoms",
    "name",
    "userData",
    "active"
})
public class hkpPhysicsSystem
    extends HkobjectType
    implements IHkContainer, IHkVisitable
{

    @XmlIDREF
    @XmlPath("hkparam[@name=\"rigidBodies\"]/text()")
    @XmlList
    private ArrayList<hkpRigidBody> rigidBodies;
    @XmlPath("hkparam[@name=\"rigidBodies\"]/@numelements")
    private Integer numrigidBodies;
    @XmlIDREF
    @XmlPath("hkparam[@name=\"constraints\"]/text()")
    @XmlList
    private ArrayList<hkpConstraintInstance> constraints;
    @XmlPath("hkparam[@name=\"constraints\"]/@numelements")
    private Integer numconstraints;
    @XmlIDREF
    @XmlPath("hkparam[@name=\"actions\"]/text()")
    @XmlList
    private ArrayList<hkpConstraintInstance> actions;
    @XmlPath("hkparam[@name=\"actions\"]/@numelements")
    private Integer numactions;
    @XmlIDREF
    @XmlPath("hkparam[@name=\"phantoms\"]/text()")
    @XmlList
    private ArrayList<hkpConstraintInstance> phantoms;
    @XmlPath("hkparam[@name=\"phantoms\"]/@numelements")
    private Integer numphantoms;
    private String childname;
    private String userData;
    private String active;

    public hkpPhysicsSystem() {
        rigidBodies = new ArrayList<hkpRigidBody>();
        numrigidBodies = 0;
        constraints = new ArrayList<hkpConstraintInstance>();
        numconstraints = 0;
        actions = new ArrayList<hkpConstraintInstance>();
        numactions = 0;
        phantoms = new ArrayList<hkpConstraintInstance>();
        numphantoms = 0;
        setName("Default Physics System");
        setUserData("0");
        setActive("true");
        setClazz("hkpPhysicsSystem");
    }

    public Integer getNumRigidBodies() {
        return numrigidBodies;
    }

    public Iterable<hkpRigidBody> getRigidBodies() {
        return rigidBodies;
    }

    public hkpRigidBody getRigidBodiesAt(int index) {
        return rigidBodies.get(index);
    }

    public boolean addToRigidBodies(hkpRigidBody newRigidBodies) {
        if (rigidBodies.add(newRigidBodies)) {
            numrigidBodies += 1;
            return true;
        }
        return false;
    }

    @ObjectLink
    public boolean removeFromRigidBodies(hkpRigidBody rigidBodiesToRemove) {
        if (rigidBodies.remove(rigidBodiesToRemove)) {
            numrigidBodies += -1;
            return true;
        }
        return false;
    }

    public hkpRigidBody removeFromRigidBodiesAt(int index) {
        hkpRigidBody toRemove;
        toRemove = rigidBodies.remove(index);
        if (!(null == toRemove)) {
            numrigidBodies += -1;
            return toRemove;
        }
        return null;
    }

    public Integer getNumConstraints() {
        return numconstraints;
    }

    public Iterable<hkpConstraintInstance> getConstraints() {
        return constraints;
    }

    public hkpConstraintInstance getConstraintsAt(int index) {
        return constraints.get(index);
    }

    public boolean addToConstraints(hkpConstraintInstance newConstraints) {
        if (constraints.add(newConstraints)) {
            numconstraints += 1;
            return true;
        }
        return false;
    }

    @ObjectLink
    public boolean removeFromConstraints(hkpConstraintInstance constraintsToRemove) {
        if (constraints.remove(constraintsToRemove)) {
            numconstraints += -1;
            return true;
        }
        return false;
    }

    public hkpConstraintInstance removeFromConstraintsAt(int index) {
        hkpConstraintInstance toRemove;
        toRemove = constraints.remove(index);
        if (!(null == toRemove)) {
            numconstraints += -1;
            return toRemove;
        }
        return null;
    }

    public Integer getNumActions() {
        return numactions;
    }

    public Iterable<hkpConstraintInstance> getActions() {
        return actions;
    }

    public hkpConstraintInstance getActionsAt(int index) {
        return actions.get(index);
    }

    public boolean addToActions(hkpConstraintInstance newActions) {
        if (actions.add(newActions)) {
            numactions += 1;
            return true;
        }
        return false;
    }

    @ObjectLink
    public boolean removeFromActions(hkpConstraintInstance actionsToRemove) {
        if (actions.remove(actionsToRemove)) {
            numactions += -1;
            return true;
        }
        return false;
    }

    public hkpConstraintInstance removeFromActionsAt(int index) {
        hkpConstraintInstance toRemove;
        toRemove = actions.remove(index);
        if (!(null == toRemove)) {
            numactions += -1;
            return toRemove;
        }
        return null;
    }

    public Integer getNumPhantoms() {
        return numphantoms;
    }

    public Iterable<hkpConstraintInstance> getPhantoms() {
        return phantoms;
    }

    public hkpConstraintInstance getPhantomsAt(int index) {
        return phantoms.get(index);
    }

    public boolean addToPhantoms(hkpConstraintInstance newPhantoms) {
        if (phantoms.add(newPhantoms)) {
            numphantoms += 1;
            return true;
        }
        return false;
    }

    @ObjectLink
    public boolean removeFromPhantoms(hkpConstraintInstance phantomsToRemove) {
        if (phantoms.remove(phantomsToRemove)) {
            numphantoms += -1;
            return true;
        }
        return false;
    }

    public hkpConstraintInstance removeFromPhantomsAt(int index) {
        hkpConstraintInstance toRemove;
        toRemove = phantoms.remove(index);
        if (!(null == toRemove)) {
            numphantoms += -1;
            return toRemove;
        }
        return null;
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

    @XmlPath("hkparam[@name=\"active\"]/text()")
    public String getActive() {
        return active;
    }

    @XmlPath("hkparam[@name=\"active\"]/text()")
    public void setActive(String newActive) {
        this.active = newActive;
    }

    @Override
    public<T >T accept(IHkVisitor<T> visitor) {
        visitor.visit(this);
        for (hkpRigidBody child: getRigidBodies()) {
            child.accept(visitor);
        }
        for (hkpConstraintInstance child: getConstraints()) {
            child.accept(visitor);
        }
        for (hkpConstraintInstance child: getActions()) {
            child.accept(visitor);
        }
        for (hkpConstraintInstance child: getPhantoms()) {
            child.accept(visitor);
        }
        return visitor.getResults();
    }

    @Override
    public<T >T accept(IHkParentVisitor<T> visitor, IHkVisitable parent) {
        visitor.visit(this, parent);
        for (hkpRigidBody child: getRigidBodies()) {
            child.accept(visitor, this);
        }
        for (hkpConstraintInstance child: getConstraints()) {
            child.accept(visitor, this);
        }
        for (hkpConstraintInstance child: getActions()) {
            child.accept(visitor, this);
        }
        for (hkpConstraintInstance child: getPhantoms()) {
            child.accept(visitor, this);
        }
        return visitor.getResults();
    }

    @Override
    public Collection<IHkVisitable> objects() {
        Collection<IHkVisitable> theseObjects = new ArrayList<IHkVisitable>();
        for (hkpRigidBody child: getRigidBodies()) {
            theseObjects.add(child);
        }
        for (hkpConstraintInstance child: getConstraints()) {
            theseObjects.add(child);
        }
        for (hkpConstraintInstance child: getActions()) {
            theseObjects.add(child);
        }
        for (hkpConstraintInstance child: getPhantoms()) {
            theseObjects.add(child);
        }
        return theseObjects;
    }

    @Override
    public boolean remove(Object toRemove) {
        if ((toRemove instanceof hkpRigidBody)&&removeFromRigidBodies(((hkpRigidBody) toRemove))) {
            return true;
        }
        if ((toRemove instanceof hkpConstraintInstance)&&removeFromConstraints(((hkpConstraintInstance) toRemove))) {
            return true;
        }
        if ((toRemove instanceof hkpConstraintInstance)&&removeFromActions(((hkpConstraintInstance) toRemove))) {
            return true;
        }
        if ((toRemove instanceof hkpConstraintInstance)&&removeFromPhantoms(((hkpConstraintInstance) toRemove))) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString()+" ["+this.getName()+"]";
    }

}
