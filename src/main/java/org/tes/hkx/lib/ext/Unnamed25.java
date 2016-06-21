
package org.tes.hkx.lib.ext;

import javax.xml.bind.annotation.XmlType;
import org.eclipse.persistence.oxm.annotations.XmlPath;
import org.tes.hkx.model.IHkParentVisitor;
import org.tes.hkx.model.IHkVisitable;
import org.tes.hkx.model.IHkVisitor;

@XmlType(propOrder = {
    "capsuleHeight",
    "capsuleRadius",
    "collisionFilterInfo",
    "characterControllerCinfo"
})
public class Unnamed25 implements IHkVisitable
{

    private String capsuleHeight;
    private String capsuleRadius;
    private String collisionFilterInfo;
    private String characterControllerCinfo;

    public Unnamed25() {
        setCapsuleHeight(null);
        setCapsuleRadius(null);
        setCollisionFilterInfo(null);
        setCharacterControllerCinfo(null);
    }

    @XmlPath("hkparam[@name=\"capsuleHeight\"]/text()")
    public String getCapsuleHeight() {
        return capsuleHeight;
    }

    @XmlPath("hkparam[@name=\"capsuleHeight\"]/text()")
    public void setCapsuleHeight(String newCapsuleHeight) {
        this.capsuleHeight = newCapsuleHeight;
    }

    @XmlPath("hkparam[@name=\"capsuleRadius\"]/text()")
    public String getCapsuleRadius() {
        return capsuleRadius;
    }

    @XmlPath("hkparam[@name=\"capsuleRadius\"]/text()")
    public void setCapsuleRadius(String newCapsuleRadius) {
        this.capsuleRadius = newCapsuleRadius;
    }

    @XmlPath("hkparam[@name=\"collisionFilterInfo\"]/text()")
    public String getCollisionFilterInfo() {
        return collisionFilterInfo;
    }

    @XmlPath("hkparam[@name=\"collisionFilterInfo\"]/text()")
    public void setCollisionFilterInfo(String newCollisionFilterInfo) {
        this.collisionFilterInfo = newCollisionFilterInfo;
    }

    @XmlPath("hkparam[@name=\"characterControllerCinfo\"]/text()")
    public String getCharacterControllerCinfo() {
        return characterControllerCinfo;
    }

    @XmlPath("hkparam[@name=\"characterControllerCinfo\"]/text()")
    public void setCharacterControllerCinfo(String newCharacterControllerCinfo) {
        this.characterControllerCinfo = newCharacterControllerCinfo;
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
