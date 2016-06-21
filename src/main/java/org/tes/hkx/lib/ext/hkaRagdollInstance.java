
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
@XmlDiscriminatorValue("0x154948e8")
@XmlType(propOrder = {
    "rigidBodies",
    "constraints",
    "boneToRigidBodyMap",
    "skeleton"
})
public class hkaRagdollInstance
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
    @XmlList
    @XmlPath("hkparam[@name=\"boneToRigidBodyMap\"]/text()")
    private ArrayList<String> boneToRigidBodyMap;
    @XmlPath("hkparam[@name=\"boneToRigidBodyMap\"]/@numelements")
    private Integer numboneToRigidBodyMap;
    private hkaSkeleton skeleton;

    public hkaRagdollInstance() {
        rigidBodies = new ArrayList<hkpRigidBody>();
        numrigidBodies = 0;
        constraints = new ArrayList<hkpConstraintInstance>();
        numconstraints = 0;
        boneToRigidBodyMap = new ArrayList<String>();
        numboneToRigidBodyMap = 0;
        setSkeleton(null);
        setClazz("hkaRagdollInstance");
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

    public Integer getNumBoneToRigidBodyMap() {
        return numboneToRigidBodyMap;
    }

    public Iterable<String> getBoneToRigidBodyMap() {
        return boneToRigidBodyMap;
    }

    public String getBoneToRigidBodyMapAt(int index) {
        return boneToRigidBodyMap.get(index);
    }

    public boolean addToBoneToRigidBodyMap(String newBoneToRigidBodyMap) {
        if (boneToRigidBodyMap.add(newBoneToRigidBodyMap)) {
            numboneToRigidBodyMap += 1;
            return true;
        }
        return false;
    }

    public boolean removeFromBoneToRigidBodyMap(String boneToRigidBodyMapToRemove) {
        if (boneToRigidBodyMap.remove(boneToRigidBodyMapToRemove)) {
            numboneToRigidBodyMap += -1;
            return true;
        }
        return false;
    }

    public String removeFromBoneToRigidBodyMapAt(int index) {
        String toRemove;
        toRemove = boneToRigidBodyMap.remove(index);
        if (!(null == toRemove)) {
            numboneToRigidBodyMap += -1;
            return toRemove;
        }
        return null;
    }

    @XmlIDREF
    @XmlPath("hkparam[@name=\"skeleton\"]/text()")
    @ObjectLink
    public hkaSkeleton getSkeleton() {
        return skeleton;
    }

    public void setSkeleton(hkaSkeleton newSkeleton) {
        this.skeleton = newSkeleton;
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
        if (!(null == getSkeleton())) {
            getSkeleton().accept(visitor);
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
        if (!(null == getSkeleton())) {
            getSkeleton().accept(visitor, this);
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
        if (!(null == getSkeleton())) {
            theseObjects.add(getSkeleton());
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
        if ((getSkeleton()!= null)&&getSkeleton().equals(toRemove)) {
            setSkeleton(null);
            return true;
        }
        return false;
    }

}
