
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
@XmlDiscriminatorValue("0x13a39ba7")
@XmlType(propOrder = {
    "worldUpWS",
    "stringData",
    "defaultEventMode"
})
public class hkbProjectData
    extends HkobjectType
    implements IHkContainer, IHkVisitable
{

    private String worldUpWS;
    private hkbProjectStringData stringData;
    private String defaultEventMode;

    public hkbProjectData() {
        setWorldUpWS("(0.000000 0.000000 1.000000 0.000000)");
        setStringData(null);
        setDefaultEventMode("EVENT_MODE_IGNORE_FROM_GENERATOR");
        setClazz("hkbProjectData");
    }

    @XmlPath("hkparam[@name=\"worldUpWS\"]/text()")
    public String getWorldUpWS() {
        return worldUpWS;
    }

    @XmlPath("hkparam[@name=\"worldUpWS\"]/text()")
    public void setWorldUpWS(String newWorldUpWS) {
        this.worldUpWS = newWorldUpWS;
    }

    @XmlIDREF
    @XmlPath("hkparam[@name=\"stringData\"]/text()")
    @ObjectLink
    public hkbProjectStringData getStringData() {
        return stringData;
    }

    public void setStringData(hkbProjectStringData newStringData) {
        this.stringData = newStringData;
    }

    @XmlPath("hkparam[@name=\"defaultEventMode\"]/text()")
    public String getDefaultEventMode() {
        return defaultEventMode;
    }

    @XmlPath("hkparam[@name=\"defaultEventMode\"]/text()")
    public void setDefaultEventMode(String newDefaultEventMode) {
        this.defaultEventMode = newDefaultEventMode;
    }

    @Override
    public<T >T accept(IHkVisitor<T> visitor) {
        visitor.visit(this);
        if (!(null == getStringData())) {
            getStringData().accept(visitor);
        }
        return visitor.getResults();
    }

    @Override
    public<T >T accept(IHkParentVisitor<T> visitor, IHkVisitable parent) {
        visitor.visit(this, parent);
        if (!(null == getStringData())) {
            getStringData().accept(visitor, this);
        }
        return visitor.getResults();
    }

    @Override
    public Collection<IHkVisitable> objects() {
        Collection<IHkVisitable> theseObjects = new ArrayList<IHkVisitable>();
        if (!(null == getStringData())) {
            theseObjects.add(getStringData());
        }
        return theseObjects;
    }

    @Override
    public boolean remove(Object toRemove) {
        if ((getStringData()!= null)&&getStringData().equals(toRemove)) {
            setStringData(null);
            return true;
        }
        return false;
    }

}
