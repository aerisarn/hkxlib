
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
@XmlDiscriminatorValue("0x333b85b9")
@XmlType(propOrder = {
    "variableBindingSet",
    "userData",
    "name",
    "animationName",
    "triggers",
    "cropStartAmountLocalTime",
    "cropEndAmountLocalTime",
    "startTime",
    "playbackSpeed",
    "enforcedDuration",
    "userControlledTimeFraction",
    "animationBindingIndex",
    "mode",
    "flags"
})
public class hkbClipGenerator
    extends HkobjectType
    implements IHkContainer, IHkVisitable
{

    private hkbVariableBindingSet variableBindingSet;
    private String userData;
    private String childname;
    private String animationName;
    private hkbClipTriggerArray triggers;
    private String cropStartAmountLocalTime;
    private String cropEndAmountLocalTime;
    private String startTime;
    private String playbackSpeed;
    private String enforcedDuration;
    private String userControlledTimeFraction;
    private String animationBindingIndex;
    private String mode;
    private String flags;

    public hkbClipGenerator() {
        setVariableBindingSet(null);
        setUserData("0");
        setName("Clip01");
        setAnimationName("Animations\\down.hkx");
        setTriggers(null);
        setCropStartAmountLocalTime("0.000000");
        setCropEndAmountLocalTime("0.000000");
        setStartTime("0.000000");
        setPlaybackSpeed("1.000000");
        setEnforcedDuration("0.000000");
        setUserControlledTimeFraction("0.000000");
        setAnimationBindingIndex("-1");
        setMode("MODE_SINGLE_PLAY");
        setFlags("0");
        setClazz("hkbClipGenerator");
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

    @XmlPath("hkparam[@name=\"animationName\"]/text()")
    public String getAnimationName() {
        return animationName;
    }

    @XmlPath("hkparam[@name=\"animationName\"]/text()")
    public void setAnimationName(String newAnimationName) {
        this.animationName = newAnimationName;
    }

    @XmlIDREF
    @XmlPath("hkparam[@name=\"triggers\"]/text()")
    @ObjectLink
    public hkbClipTriggerArray getTriggers() {
        return triggers;
    }

    public void setTriggers(hkbClipTriggerArray newTriggers) {
        this.triggers = newTriggers;
    }

    @XmlPath("hkparam[@name=\"cropStartAmountLocalTime\"]/text()")
    public String getCropStartAmountLocalTime() {
        return cropStartAmountLocalTime;
    }

    @XmlPath("hkparam[@name=\"cropStartAmountLocalTime\"]/text()")
    public void setCropStartAmountLocalTime(String newCropStartAmountLocalTime) {
        this.cropStartAmountLocalTime = newCropStartAmountLocalTime;
    }

    @XmlPath("hkparam[@name=\"cropEndAmountLocalTime\"]/text()")
    public String getCropEndAmountLocalTime() {
        return cropEndAmountLocalTime;
    }

    @XmlPath("hkparam[@name=\"cropEndAmountLocalTime\"]/text()")
    public void setCropEndAmountLocalTime(String newCropEndAmountLocalTime) {
        this.cropEndAmountLocalTime = newCropEndAmountLocalTime;
    }

    @XmlPath("hkparam[@name=\"startTime\"]/text()")
    public String getStartTime() {
        return startTime;
    }

    @XmlPath("hkparam[@name=\"startTime\"]/text()")
    public void setStartTime(String newStartTime) {
        this.startTime = newStartTime;
    }

    @XmlPath("hkparam[@name=\"playbackSpeed\"]/text()")
    public String getPlaybackSpeed() {
        return playbackSpeed;
    }

    @XmlPath("hkparam[@name=\"playbackSpeed\"]/text()")
    public void setPlaybackSpeed(String newPlaybackSpeed) {
        this.playbackSpeed = newPlaybackSpeed;
    }

    @XmlPath("hkparam[@name=\"enforcedDuration\"]/text()")
    public String getEnforcedDuration() {
        return enforcedDuration;
    }

    @XmlPath("hkparam[@name=\"enforcedDuration\"]/text()")
    public void setEnforcedDuration(String newEnforcedDuration) {
        this.enforcedDuration = newEnforcedDuration;
    }

    @XmlPath("hkparam[@name=\"userControlledTimeFraction\"]/text()")
    public String getUserControlledTimeFraction() {
        return userControlledTimeFraction;
    }

    @XmlPath("hkparam[@name=\"userControlledTimeFraction\"]/text()")
    public void setUserControlledTimeFraction(String newUserControlledTimeFraction) {
        this.userControlledTimeFraction = newUserControlledTimeFraction;
    }

    @XmlPath("hkparam[@name=\"animationBindingIndex\"]/text()")
    public String getAnimationBindingIndex() {
        return animationBindingIndex;
    }

    @XmlPath("hkparam[@name=\"animationBindingIndex\"]/text()")
    public void setAnimationBindingIndex(String newAnimationBindingIndex) {
        this.animationBindingIndex = newAnimationBindingIndex;
    }

    @XmlPath("hkparam[@name=\"mode\"]/text()")
    public String getMode() {
        return mode;
    }

    @XmlPath("hkparam[@name=\"mode\"]/text()")
    public void setMode(String newMode) {
        this.mode = newMode;
    }

    @XmlPath("hkparam[@name=\"flags\"]/text()")
    public String getFlags() {
        return flags;
    }

    @XmlPath("hkparam[@name=\"flags\"]/text()")
    public void setFlags(String newFlags) {
        this.flags = newFlags;
    }

    @Override
    public<T >T accept(IHkVisitor<T> visitor) {
        visitor.visit(this);
        if (!(null == getVariableBindingSet())) {
            getVariableBindingSet().accept(visitor);
        }
        if (!(null == getTriggers())) {
            getTriggers().accept(visitor);
        }
        return visitor.getResults();
    }

    @Override
    public<T >T accept(IHkParentVisitor<T> visitor, IHkVisitable parent) {
        visitor.visit(this, parent);
        if (!(null == getVariableBindingSet())) {
            getVariableBindingSet().accept(visitor, this);
        }
        if (!(null == getTriggers())) {
            getTriggers().accept(visitor, this);
        }
        return visitor.getResults();
    }

    @Override
    public Collection<IHkVisitable> objects() {
        Collection<IHkVisitable> theseObjects = new ArrayList<IHkVisitable>();
        if (!(null == getVariableBindingSet())) {
            theseObjects.add(getVariableBindingSet());
        }
        if (!(null == getTriggers())) {
            theseObjects.add(getTriggers());
        }
        return theseObjects;
    }

    @Override
    public boolean remove(Object toRemove) {
        if ((getVariableBindingSet()!= null)&&getVariableBindingSet().equals(toRemove)) {
            setVariableBindingSet(null);
            return true;
        }
        if ((getTriggers()!= null)&&getTriggers().equals(toRemove)) {
            setTriggers(null);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString()+" ["+this.getName()+"]";
    }

}
