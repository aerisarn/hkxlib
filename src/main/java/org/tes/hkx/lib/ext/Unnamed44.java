
package org.tes.hkx.lib.ext;

import javax.xml.bind.annotation.XmlType;
import org.eclipse.persistence.oxm.annotations.XmlPath;
import org.tes.hkx.model.IHkParentVisitor;
import org.tes.hkx.model.IHkVisitable;
import org.tes.hkx.model.IHkVisitor;

@XmlType(propOrder = {
    "onOffGain",
    "groundAscendingGain",
    "groundDescendingGain",
    "footPlantedGain",
    "footRaisedGain",
    "footUnlockGain",
    "worldFromModelFeedbackGain",
    "errorUpDownBias",
    "alignWorldFromModelGain",
    "hipOrientationGain",
    "maxKneeAngleDifference",
    "ankleOrientationGain"
})
public class Unnamed44 implements IHkVisitable
{

    private String onOffGain;
    private String groundAscendingGain;
    private String groundDescendingGain;
    private String footPlantedGain;
    private String footRaisedGain;
    private String footUnlockGain;
    private String worldFromModelFeedbackGain;
    private String errorUpDownBias;
    private String alignWorldFromModelGain;
    private String hipOrientationGain;
    private String maxKneeAngleDifference;
    private String ankleOrientationGain;

    public Unnamed44() {
        setOnOffGain(null);
        setGroundAscendingGain(null);
        setGroundDescendingGain(null);
        setFootPlantedGain(null);
        setFootRaisedGain(null);
        setFootUnlockGain(null);
        setWorldFromModelFeedbackGain(null);
        setErrorUpDownBias(null);
        setAlignWorldFromModelGain(null);
        setHipOrientationGain(null);
        setMaxKneeAngleDifference(null);
        setAnkleOrientationGain(null);
    }

    @XmlPath("hkparam[@name=\"onOffGain\"]/text()")
    public String getOnOffGain() {
        return onOffGain;
    }

    @XmlPath("hkparam[@name=\"onOffGain\"]/text()")
    public void setOnOffGain(String newOnOffGain) {
        this.onOffGain = newOnOffGain;
    }

    @XmlPath("hkparam[@name=\"groundAscendingGain\"]/text()")
    public String getGroundAscendingGain() {
        return groundAscendingGain;
    }

    @XmlPath("hkparam[@name=\"groundAscendingGain\"]/text()")
    public void setGroundAscendingGain(String newGroundAscendingGain) {
        this.groundAscendingGain = newGroundAscendingGain;
    }

    @XmlPath("hkparam[@name=\"groundDescendingGain\"]/text()")
    public String getGroundDescendingGain() {
        return groundDescendingGain;
    }

    @XmlPath("hkparam[@name=\"groundDescendingGain\"]/text()")
    public void setGroundDescendingGain(String newGroundDescendingGain) {
        this.groundDescendingGain = newGroundDescendingGain;
    }

    @XmlPath("hkparam[@name=\"footPlantedGain\"]/text()")
    public String getFootPlantedGain() {
        return footPlantedGain;
    }

    @XmlPath("hkparam[@name=\"footPlantedGain\"]/text()")
    public void setFootPlantedGain(String newFootPlantedGain) {
        this.footPlantedGain = newFootPlantedGain;
    }

    @XmlPath("hkparam[@name=\"footRaisedGain\"]/text()")
    public String getFootRaisedGain() {
        return footRaisedGain;
    }

    @XmlPath("hkparam[@name=\"footRaisedGain\"]/text()")
    public void setFootRaisedGain(String newFootRaisedGain) {
        this.footRaisedGain = newFootRaisedGain;
    }

    @XmlPath("hkparam[@name=\"footUnlockGain\"]/text()")
    public String getFootUnlockGain() {
        return footUnlockGain;
    }

    @XmlPath("hkparam[@name=\"footUnlockGain\"]/text()")
    public void setFootUnlockGain(String newFootUnlockGain) {
        this.footUnlockGain = newFootUnlockGain;
    }

    @XmlPath("hkparam[@name=\"worldFromModelFeedbackGain\"]/text()")
    public String getWorldFromModelFeedbackGain() {
        return worldFromModelFeedbackGain;
    }

    @XmlPath("hkparam[@name=\"worldFromModelFeedbackGain\"]/text()")
    public void setWorldFromModelFeedbackGain(String newWorldFromModelFeedbackGain) {
        this.worldFromModelFeedbackGain = newWorldFromModelFeedbackGain;
    }

    @XmlPath("hkparam[@name=\"errorUpDownBias\"]/text()")
    public String getErrorUpDownBias() {
        return errorUpDownBias;
    }

    @XmlPath("hkparam[@name=\"errorUpDownBias\"]/text()")
    public void setErrorUpDownBias(String newErrorUpDownBias) {
        this.errorUpDownBias = newErrorUpDownBias;
    }

    @XmlPath("hkparam[@name=\"alignWorldFromModelGain\"]/text()")
    public String getAlignWorldFromModelGain() {
        return alignWorldFromModelGain;
    }

    @XmlPath("hkparam[@name=\"alignWorldFromModelGain\"]/text()")
    public void setAlignWorldFromModelGain(String newAlignWorldFromModelGain) {
        this.alignWorldFromModelGain = newAlignWorldFromModelGain;
    }

    @XmlPath("hkparam[@name=\"hipOrientationGain\"]/text()")
    public String getHipOrientationGain() {
        return hipOrientationGain;
    }

    @XmlPath("hkparam[@name=\"hipOrientationGain\"]/text()")
    public void setHipOrientationGain(String newHipOrientationGain) {
        this.hipOrientationGain = newHipOrientationGain;
    }

    @XmlPath("hkparam[@name=\"maxKneeAngleDifference\"]/text()")
    public String getMaxKneeAngleDifference() {
        return maxKneeAngleDifference;
    }

    @XmlPath("hkparam[@name=\"maxKneeAngleDifference\"]/text()")
    public void setMaxKneeAngleDifference(String newMaxKneeAngleDifference) {
        this.maxKneeAngleDifference = newMaxKneeAngleDifference;
    }

    @XmlPath("hkparam[@name=\"ankleOrientationGain\"]/text()")
    public String getAnkleOrientationGain() {
        return ankleOrientationGain;
    }

    @XmlPath("hkparam[@name=\"ankleOrientationGain\"]/text()")
    public void setAnkleOrientationGain(String newAnkleOrientationGain) {
        this.ankleOrientationGain = newAnkleOrientationGain;
    }

    @Override
    public<T >T accept(IHkVisitor<T> visitor) {
        visitor.visit(this);
        return visitor.getResults();
    }

    @Override
    public<T >T accept(IHkParentVisitor<T> visitor, IHkVisitable parent) {
        visitor.visit(this, parent);
        return visitor.getResults();
    }

}
