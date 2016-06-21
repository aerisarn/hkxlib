
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
    "angMotor",
    "angFriction",
    "angLimit",
    "2dAng",
    "ballSocket"
})
public class Unnamed5 implements IHkContainer, IHkVisitable
{

    private Unnamed6 transforms;
    private Unnamed7 setupStabilization;
    private Unnamed8 angMotor;
    private Unnamed9 angFriction;
    private Unnamed10 angLimit;
    private Unnamed11 fix_2dAng;
    private Unnamed12 ballSocket;

    public Unnamed5() {
        setTransforms(null);
        setSetupStabilization(null);
        setAngMotor(null);
        setAngFriction(null);
        setAngLimit(null);
        set2dAng(null);
        setBallSocket(null);
    }

    @XmlElement(name = "hkparam[@name=\"transforms\"]/hkobject")
    public Unnamed6 getTransforms() {
        return transforms;
    }

    public void setTransforms(Unnamed6 newTransforms) {
        this.transforms = newTransforms;
    }

    @XmlElement(name = "hkparam[@name=\"setupStabilization\"]/hkobject")
    public Unnamed7 getSetupStabilization() {
        return setupStabilization;
    }

    public void setSetupStabilization(Unnamed7 newSetupStabilization) {
        this.setupStabilization = newSetupStabilization;
    }

    @XmlElement(name = "hkparam[@name=\"angMotor\"]/hkobject")
    public Unnamed8 getAngMotor() {
        return angMotor;
    }

    public void setAngMotor(Unnamed8 newAngMotor) {
        this.angMotor = newAngMotor;
    }

    @XmlElement(name = "hkparam[@name=\"angFriction\"]/hkobject")
    public Unnamed9 getAngFriction() {
        return angFriction;
    }

    public void setAngFriction(Unnamed9 newAngFriction) {
        this.angFriction = newAngFriction;
    }

    @XmlElement(name = "hkparam[@name=\"angLimit\"]/hkobject")
    public Unnamed10 getAngLimit() {
        return angLimit;
    }

    public void setAngLimit(Unnamed10 newAngLimit) {
        this.angLimit = newAngLimit;
    }

    @XmlElement(name = "hkparam[@name=\"2dAng\"]/hkobject")
    public Unnamed11 get2dAng() {
        return fix_2dAng;
    }

    public void set2dAng(Unnamed11 new2dAng) {
        this.fix_2dAng = new2dAng;
    }

    @XmlElement(name = "hkparam[@name=\"ballSocket\"]/hkobject")
    public Unnamed12 getBallSocket() {
        return ballSocket;
    }

    public void setBallSocket(Unnamed12 newBallSocket) {
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
        if (!(null == getAngMotor())) {
            getAngMotor().accept(visitor);
        }
        if (!(null == getAngFriction())) {
            getAngFriction().accept(visitor);
        }
        if (!(null == getAngLimit())) {
            getAngLimit().accept(visitor);
        }
        if (!(null == get2dAng())) {
            get2dAng().accept(visitor);
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
        if (!(null == getAngMotor())) {
            getAngMotor().accept(visitor, this);
        }
        if (!(null == getAngFriction())) {
            getAngFriction().accept(visitor, this);
        }
        if (!(null == getAngLimit())) {
            getAngLimit().accept(visitor, this);
        }
        if (!(null == get2dAng())) {
            get2dAng().accept(visitor, this);
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
        if (!(null == getAngMotor())) {
            theseObjects.add(getAngMotor());
        }
        if (!(null == getAngFriction())) {
            theseObjects.add(getAngFriction());
        }
        if (!(null == getAngLimit())) {
            theseObjects.add(getAngLimit());
        }
        if (!(null == get2dAng())) {
            theseObjects.add(get2dAng());
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
        if ((getAngMotor()!= null)&&getAngMotor().equals(toRemove)) {
            setAngMotor(null);
            return true;
        }
        if ((getAngFriction()!= null)&&getAngFriction().equals(toRemove)) {
            setAngFriction(null);
            return true;
        }
        if ((getAngLimit()!= null)&&getAngLimit().equals(toRemove)) {
            setAngLimit(null);
            return true;
        }
        if ((get2dAng()!= null)&&get2dAng().equals(toRemove)) {
            set2dAng(null);
            return true;
        }
        if ((getBallSocket()!= null)&&getBallSocket().equals(toRemove)) {
            setBallSocket(null);
            return true;
        }
        return false;
    }

}
