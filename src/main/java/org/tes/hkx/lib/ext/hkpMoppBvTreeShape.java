
package org.tes.hkx.lib.ext;

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
@XmlDiscriminatorValue("0x90b29d39")
@XmlType(propOrder = {
    "userData",
    "bvTreeType",
    "code",
    "child"
})
public class hkpMoppBvTreeShape
    extends HkobjectType
    implements IHkContainer, IHkVisitable
{

    private String userData;
    private String bvTreeType;
    private hkpMoppCode code;
    private innerListShapeInfo child;

    public hkpMoppBvTreeShape() {
        setUserData("0");
        setBvTreeType("BVTREE_MOPP");
        setCode(null);
        setChild(null);
        setClazz("hkpMoppBvTreeShape");
    }

    @XmlPath("hkparam[@name=\"userData\"]/text()")
    public String getUserData() {
        return userData;
    }

    @XmlPath("hkparam[@name=\"userData\"]/text()")
    public void setUserData(String newUserData) {
        this.userData = newUserData;
    }

    @XmlPath("hkparam[@name=\"bvTreeType\"]/text()")
    public String getBvTreeType() {
        return bvTreeType;
    }

    @XmlPath("hkparam[@name=\"bvTreeType\"]/text()")
    public void setBvTreeType(String newBvTreeType) {
        this.bvTreeType = newBvTreeType;
    }

    @XmlIDREF
    @XmlPath("hkparam[@name=\"code\"]/text()")
    @ObjectLink
    public hkpMoppCode getCode() {
        return code;
    }

    public void setCode(hkpMoppCode newCode) {
        this.code = newCode;
    }

    @XmlElement(name = "hkparam[@name=\"child\"]/hkobject")
    public innerListShapeInfo getChild() {
        return child;
    }

    public void setChild(innerListShapeInfo newChild) {
        this.child = newChild;
    }

    @Override
    public<T >T accept(IHkVisitor<T> visitor) {
        visitor.visit(this);
        if (!(null == getCode())) {
            getCode().accept(visitor);
        }
        if (!(null == getChild())) {
            getChild().accept(visitor);
        }
        return visitor.getResults();
    }

    @Override
    public<T >T accept(IHkParentVisitor<T> visitor, IHkVisitable parent) {
        visitor.visit(this, parent);
        if (!(null == getCode())) {
            getCode().accept(visitor, this);
        }
        if (!(null == getChild())) {
            getChild().accept(visitor, this);
        }
        return visitor.getResults();
    }

    @Override
    public Collection<IHkVisitable> objects() {
        Collection<IHkVisitable> theseObjects = new ArrayList<IHkVisitable>();
        if (!(null == getCode())) {
            theseObjects.add(getCode());
        }
        if (!(null == getChild())) {
            theseObjects.add(getChild());
        }
        return theseObjects;
    }

    @Override
    public boolean remove(Object toRemove) {
        if ((getCode()!= null)&&getCode().equals(toRemove)) {
            setCode(null);
            return true;
        }
        if ((getChild()!= null)&&getChild().equals(toRemove)) {
            setChild(null);
            return true;
        }
        return false;
    }

}
