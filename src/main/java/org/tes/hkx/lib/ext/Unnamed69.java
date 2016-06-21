
package org.tes.hkx.lib.ext;

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.eclipse.persistence.oxm.annotations.XmlPath;
import org.tes.hkx.model.IHkContainer;
import org.tes.hkx.model.IHkParentVisitor;
import org.tes.hkx.model.IHkVisitable;
import org.tes.hkx.model.IHkVisitor;

@XmlType(propOrder = {
    "type",
    "deactivationIntegrateCounter",
    "deactivationNumInactiveFrames",
    "motionState",
    "inertiaAndMassInv",
    "linearVelocity",
    "angularVelocity",
    "deactivationRefPosition",
    "deactivationRefOrientation",
    "savedMotion",
    "savedQualityTypeIndex",
    "gravityFactor"
})
public class Unnamed69 implements IHkContainer, IHkVisitable
{

    private String type;
    private String deactivationIntegrateCounter;
    private String deactivationNumInactiveFrames;
    private Unnamed70 motionState;
    private String inertiaAndMassInv;
    private String linearVelocity;
    private String angularVelocity;
    private String deactivationRefPosition;
    private String deactivationRefOrientation;
    private String savedMotion;
    private String savedQualityTypeIndex;
    private String gravityFactor;

    public Unnamed69() {
        setType(null);
        setDeactivationIntegrateCounter(null);
        setDeactivationNumInactiveFrames(null);
        setMotionState(null);
        setInertiaAndMassInv(null);
        setLinearVelocity(null);
        setAngularVelocity(null);
        setDeactivationRefPosition(null);
        setDeactivationRefOrientation(null);
        setSavedMotion(null);
        setSavedQualityTypeIndex("-1");
        setGravityFactor(null);
    }

    @XmlPath("hkparam[@name=\"type\"]/text()")
    public String getType() {
        return type;
    }

    @XmlPath("hkparam[@name=\"type\"]/text()")
    public void setType(String newType) {
        this.type = newType;
    }

    @XmlPath("hkparam[@name=\"deactivationIntegrateCounter\"]/text()")
    public String getDeactivationIntegrateCounter() {
        return deactivationIntegrateCounter;
    }

    @XmlPath("hkparam[@name=\"deactivationIntegrateCounter\"]/text()")
    public void setDeactivationIntegrateCounter(String newDeactivationIntegrateCounter) {
        this.deactivationIntegrateCounter = newDeactivationIntegrateCounter;
    }

    @XmlPath("hkparam[@name=\"deactivationNumInactiveFrames\"]/text()")
    public String getDeactivationNumInactiveFrames() {
        return deactivationNumInactiveFrames;
    }

    @XmlPath("hkparam[@name=\"deactivationNumInactiveFrames\"]/text()")
    public void setDeactivationNumInactiveFrames(String newDeactivationNumInactiveFrames) {
        this.deactivationNumInactiveFrames = newDeactivationNumInactiveFrames;
    }

    @XmlElement(name = "hkparam[@name=\"motionState\"]/hkobject")
    public Unnamed70 getMotionState() {
        return motionState;
    }

    public void setMotionState(Unnamed70 newMotionState) {
        this.motionState = newMotionState;
    }

    @XmlPath("hkparam[@name=\"inertiaAndMassInv\"]/text()")
    public String getInertiaAndMassInv() {
        return inertiaAndMassInv;
    }

    @XmlPath("hkparam[@name=\"inertiaAndMassInv\"]/text()")
    public void setInertiaAndMassInv(String newInertiaAndMassInv) {
        this.inertiaAndMassInv = newInertiaAndMassInv;
    }

    @XmlPath("hkparam[@name=\"linearVelocity\"]/text()")
    public String getLinearVelocity() {
        return linearVelocity;
    }

    @XmlPath("hkparam[@name=\"linearVelocity\"]/text()")
    public void setLinearVelocity(String newLinearVelocity) {
        this.linearVelocity = newLinearVelocity;
    }

    @XmlPath("hkparam[@name=\"angularVelocity\"]/text()")
    public String getAngularVelocity() {
        return angularVelocity;
    }

    @XmlPath("hkparam[@name=\"angularVelocity\"]/text()")
    public void setAngularVelocity(String newAngularVelocity) {
        this.angularVelocity = newAngularVelocity;
    }

    @XmlPath("hkparam[@name=\"deactivationRefPosition\"]/text()")
    public String getDeactivationRefPosition() {
        return deactivationRefPosition;
    }

    @XmlPath("hkparam[@name=\"deactivationRefPosition\"]/text()")
    public void setDeactivationRefPosition(String newDeactivationRefPosition) {
        this.deactivationRefPosition = newDeactivationRefPosition;
    }

    @XmlPath("hkparam[@name=\"deactivationRefOrientation\"]/text()")
    public String getDeactivationRefOrientation() {
        return deactivationRefOrientation;
    }

    @XmlPath("hkparam[@name=\"deactivationRefOrientation\"]/text()")
    public void setDeactivationRefOrientation(String newDeactivationRefOrientation) {
        this.deactivationRefOrientation = newDeactivationRefOrientation;
    }

    @XmlPath("hkparam[@name=\"savedMotion\"]/text()")
    public String getSavedMotion() {
        return savedMotion;
    }

    @XmlPath("hkparam[@name=\"savedMotion\"]/text()")
    public void setSavedMotion(String newSavedMotion) {
        this.savedMotion = newSavedMotion;
    }

    @XmlPath("hkparam[@name=\"savedQualityTypeIndex\"]/text()")
    public String getSavedQualityTypeIndex() {
        return savedQualityTypeIndex;
    }

    @XmlPath("hkparam[@name=\"savedQualityTypeIndex\"]/text()")
    public void setSavedQualityTypeIndex(String newSavedQualityTypeIndex) {
        this.savedQualityTypeIndex = newSavedQualityTypeIndex;
    }

    @XmlPath("hkparam[@name=\"gravityFactor\"]/text()")
    public String getGravityFactor() {
        return gravityFactor;
    }

    @XmlPath("hkparam[@name=\"gravityFactor\"]/text()")
    public void setGravityFactor(String newGravityFactor) {
        this.gravityFactor = newGravityFactor;
    }

    @Override
    public<T >T accept(IHkVisitor<T> visitor) {
        visitor.visit(this);
        if (!(null == getMotionState())) {
            getMotionState().accept(visitor);
        }
        return visitor.getResults();
    }

    @Override
    public<T >T accept(IHkParentVisitor<T> visitor, IHkVisitable parent) {
        visitor.visit(this, parent);
        if (!(null == getMotionState())) {
            getMotionState().accept(visitor, this);
        }
        return visitor.getResults();
    }

    @Override
    public Collection<IHkVisitable> objects() {
        Collection<IHkVisitable> theseObjects = new ArrayList<IHkVisitable>();
        if (!(null == getMotionState())) {
            theseObjects.add(getMotionState());
        }
        return theseObjects;
    }

    @Override
    public boolean remove(Object toRemove) {
        if ((getMotionState()!= null)&&getMotionState().equals(toRemove)) {
            setMotionState(null);
            return true;
        }
        return false;
    }

}
