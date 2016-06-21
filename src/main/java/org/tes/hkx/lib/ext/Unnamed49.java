
package org.tes.hkx.lib.ext;

import javax.xml.bind.annotation.XmlType;
import org.eclipse.persistence.oxm.annotations.XmlPath;
import org.tes.hkx.model.IHkParentVisitor;
import org.tes.hkx.model.IHkVisitable;
import org.tes.hkx.model.IHkVisitor;

@XmlType(propOrder = {
    "enterEventId",
    "exitEventId",
    "enterTime",
    "exitTime"
})
public class Unnamed49 implements IHkVisitable
{

    private String enterEventId;
    private String exitEventId;
    private String enterTime;
    private String exitTime;

    public Unnamed49() {
        setEnterEventId("-1");
        setExitEventId("-1");
        setEnterTime(null);
        setExitTime(null);
    }

    @XmlPath("hkparam[@name=\"enterEventId\"]/text()")
    public String getEnterEventId() {
        return enterEventId;
    }

    @XmlPath("hkparam[@name=\"enterEventId\"]/text()")
    public void setEnterEventId(String newEnterEventId) {
        this.enterEventId = newEnterEventId;
    }

    @XmlPath("hkparam[@name=\"exitEventId\"]/text()")
    public String getExitEventId() {
        return exitEventId;
    }

    @XmlPath("hkparam[@name=\"exitEventId\"]/text()")
    public void setExitEventId(String newExitEventId) {
        this.exitEventId = newExitEventId;
    }

    @XmlPath("hkparam[@name=\"enterTime\"]/text()")
    public String getEnterTime() {
        return enterTime;
    }

    @XmlPath("hkparam[@name=\"enterTime\"]/text()")
    public void setEnterTime(String newEnterTime) {
        this.enterTime = newEnterTime;
    }

    @XmlPath("hkparam[@name=\"exitTime\"]/text()")
    public String getExitTime() {
        return exitTime;
    }

    @XmlPath("hkparam[@name=\"exitTime\"]/text()")
    public void setExitTime(String newExitTime) {
        this.exitTime = newExitTime;
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