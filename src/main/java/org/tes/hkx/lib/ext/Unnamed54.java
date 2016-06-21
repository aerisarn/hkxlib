
package org.tes.hkx.lib.ext;

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.tes.hkx.model.IHkContainer;
import org.tes.hkx.model.IHkParentVisitor;
import org.tes.hkx.model.IHkVisitable;
import org.tes.hkx.model.IHkVisitor;

@XmlType(propOrder = {
    "transforms",
    "setupStabilization",
    "ragdollMotors",
    "angFriction",
    "twistLimit",
    "coneLimit",
    "planesLimit",
    "ballSocket"
})
public class Unnamed54 implements IHkContainer, IHkVisitable
{

    private Unnamed55 transforms;
    private Unnamed56 setupStabilization;
    private Unnamed57 ragdollMotors;
    private Unnamed58 angFriction;
    private Unnamed59 twistLimit;
    private Unnamed60 coneLimit;
    private Unnamed61 planesLimit;
    private Unnamed62 ballSocket;

    public Unnamed54() {
        setTransforms(null);
        setSetupStabilization(null);
        setRagdollMotors(null);
        setAngFriction(null);
        setTwistLimit(null);
        setConeLimit(null);
        setPlanesLimit(null);
        setBallSocket(null);
    }

    @XmlElement(name = "hkparam[@name=\"transforms\"]/hkobject")
    public Unnamed55 getTransforms() {
        return transforms;
    }

    public void setTransforms(Unnamed55 newTransforms) {
        this.transforms = newTransforms;
    }

    @XmlElement(name = "hkparam[@name=\"setupStabilization\"]/hkobject")
    public Unnamed56 getSetupStabilization() {
        return setupStabilization;
    }

    public void setSetupStabilization(Unnamed56 newSetupStabilization) {
        this.setupStabilization = newSetupStabilization;
    }

    @XmlElement(name = "hkparam[@name=\"ragdollMotors\"]/hkobject")
    public Unnamed57 getRagdollMotors() {
        return ragdollMotors;
    }

    public void setRagdollMotors(Unnamed57 newRagdollMotors) {
        this.ragdollMotors = newRagdollMotors;
    }

    @XmlElement(name = "hkparam[@name=\"angFriction\"]/hkobject")
    public Unnamed58 getAngFriction() {
        return angFriction;
    }

    public void setAngFriction(Unnamed58 newAngFriction) {
        this.angFriction = newAngFriction;
    }

    @XmlElement(name = "hkparam[@name=\"twistLimit\"]/hkobject")
    public Unnamed59 getTwistLimit() {
        return twistLimit;
    }

    public void setTwistLimit(Unnamed59 newTwistLimit) {
        this.twistLimit = newTwistLimit;
    }

    @XmlElement(name = "hkparam[@name=\"coneLimit\"]/hkobject")
    public Unnamed60 getConeLimit() {
        return coneLimit;
    }

    public void setConeLimit(Unnamed60 newConeLimit) {
        this.coneLimit = newConeLimit;
    }

    @XmlElement(name = "hkparam[@name=\"planesLimit\"]/hkobject")
    public Unnamed61 getPlanesLimit() {
        return planesLimit;
    }

    public void setPlanesLimit(Unnamed61 newPlanesLimit) {
        this.planesLimit = newPlanesLimit;
    }

    @XmlElement(name = "hkparam[@name=\"ballSocket\"]/hkobject")
    public Unnamed62 getBallSocket() {
        return ballSocket;
    }

    public void setBallSocket(Unnamed62 newBallSocket) {
        this.ballSocket = newBallSocket;
    }

    @Override
    public<T >T accept(IHkVisitor<T> visitor) {
        visitor.visit(this);
        if (!(null == getTransforms())) {
            getTransforms().accept(visitor);
        }
        if (!(null == getSetupStabilization())) {
            getSetupStabilization().accept(visitor);
        }
        if (!(null == getRagdollMotors())) {
            getRagdollMotors().accept(visitor);
        }
        if (!(null == getAngFriction())) {
            getAngFriction().accept(visitor);
        }
        if (!(null == getTwistLimit())) {
            getTwistLimit().accept(visitor);
        }
        if (!(null == getConeLimit())) {
            getConeLimit().accept(visitor);
        }
        if (!(null == getPlanesLimit())) {
            getPlanesLimit().accept(visitor);
        }
        if (!(null == getBallSocket())) {
            getBallSocket().accept(visitor);
        }
        return visitor.getResults();
    }

    @Override
    public<T >T accept(IHkParentVisitor<T> visitor, IHkVisitable parent) {
        visitor.visit(this, parent);
        if (!(null == getTransforms())) {
            getTransforms().accept(visitor, this);
        }
        if (!(null == getSetupStabilization())) {
            getSetupStabilization().accept(visitor, this);
        }
        if (!(null == getRagdollMotors())) {
            getRagdollMotors().accept(visitor, this);
        }
        if (!(null == getAngFriction())) {
            getAngFriction().accept(visitor, this);
        }
        if (!(null == getTwistLimit())) {
            getTwistLimit().accept(visitor, this);
        }
        if (!(null == getConeLimit())) {
            getConeLimit().accept(visitor, this);
        }
        if (!(null == getPlanesLimit())) {
            getPlanesLimit().accept(visitor, this);
        }
        if (!(null == getBallSocket())) {
            getBallSocket().accept(visitor, this);
        }
        return visitor.getResults();
    }

    @Override
    public Collection<IHkVisitable> objects() {
        Collection<IHkVisitable> theseObjects = new ArrayList<IHkVisitable>();
        if (!(null == getTransforms())) {
            theseObjects.add(getTransforms());
        }
        if (!(null == getSetupStabilization())) {
            theseObjects.add(getSetupStabilization());
        }
        if (!(null == getRagdollMotors())) {
            theseObjects.add(getRagdollMotors());
        }
        if (!(null == getAngFriction())) {
            theseObjects.add(getAngFriction());
        }
        if (!(null == getTwistLimit())) {
            theseObjects.add(getTwistLimit());
        }
        if (!(null == getConeLimit())) {
            theseObjects.add(getConeLimit());
        }
        if (!(null == getPlanesLimit())) {
            theseObjects.add(getPlanesLimit());
        }
        if (!(null == getBallSocket())) {
            theseObjects.add(getBallSocket());
        }
        return theseObjects;
    }

    @Override
    public boolean remove(Object toRemove) {
        if ((getTransforms()!= null)&&getTransforms().equals(toRemove)) {
            setTransforms(null);
            return true;
        }
        if ((getSetupStabilization()!= null)&&getSetupStabilization().equals(toRemove)) {
            setSetupStabilization(null);
            return true;
        }
        if ((getRagdollMotors()!= null)&&getRagdollMotors().equals(toRemove)) {
            setRagdollMotors(null);
            return true;
        }
        if ((getAngFriction()!= null)&&getAngFriction().equals(toRemove)) {
            setAngFriction(null);
            return true;
        }
        if ((getTwistLimit()!= null)&&getTwistLimit().equals(toRemove)) {
            setTwistLimit(null);
            return true;
        }
        if ((getConeLimit()!= null)&&getConeLimit().equals(toRemove)) {
            setConeLimit(null);
            return true;
        }
        if ((getPlanesLimit()!= null)&&getPlanesLimit().equals(toRemove)) {
            setPlanesLimit(null);
            return true;
        }
        if ((getBallSocket()!= null)&&getBallSocket().equals(toRemove)) {
            setBallSocket(null);
            return true;
        }
        return false;
    }

}
