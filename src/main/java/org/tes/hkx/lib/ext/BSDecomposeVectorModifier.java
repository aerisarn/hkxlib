
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
@XmlDiscriminatorValue("0x31f6b8b6")
@XmlType(propOrder = {
    "variableBindingSet",
    "userData",
    "name",
    "enable",
    "vector",
    "x",
    "y",
    "z",
    "w"
})
public class BSDecomposeVectorModifier
    extends HkobjectType
    implements IHkContainer, IHkVisitable
{

    private hkbVariableBindingSet variableBindingSet;
    private String userData;
    private String childname;
    private String enable;
    private String vector;
    private String x;
    private String y;
    private String z;
    private String w;

    public BSDecomposeVectorModifier() {
        setVariableBindingSet(null);
        setUserData("2");
        setName("BSDecomposeVectorModifier_MovementDirection");
        setEnable("true");
        setVector("(0.000000 0.000000 0.000000 0.000000)");
        setX("0.000000");
        setY("0.000000");
        setZ("0.000000");
        setW("0.000000");
        setClazz("BSDecomposeVectorModifier");
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

    @XmlPath("hkparam[@name=\"enable\"]/text()")
    public String getEnable() {
        return enable;
    }

    @XmlPath("hkparam[@name=\"enable\"]/text()")
    public void setEnable(String newEnable) {
        this.enable = newEnable;
    }

    @XmlPath("hkparam[@name=\"vector\"]/text()")
    public String getVector() {
        return vector;
    }

    @XmlPath("hkparam[@name=\"vector\"]/text()")
    public void setVector(String newVector) {
        this.vector = newVector;
    }

    @XmlPath("hkparam[@name=\"x\"]/text()")
    public String getX() {
        return x;
    }

    @XmlPath("hkparam[@name=\"x\"]/text()")
    public void setX(String newX) {
        this.x = newX;
    }

    @XmlPath("hkparam[@name=\"y\"]/text()")
    public String getY() {
        return y;
    }

    @XmlPath("hkparam[@name=\"y\"]/text()")
    public void setY(String newY) {
        this.y = newY;
    }

    @XmlPath("hkparam[@name=\"z\"]/text()")
    public String getZ() {
        return z;
    }

    @XmlPath("hkparam[@name=\"z\"]/text()")
    public void setZ(String newZ) {
        this.z = newZ;
    }

    @XmlPath("hkparam[@name=\"w\"]/text()")
    public String getW() {
        return w;
    }

    @XmlPath("hkparam[@name=\"w\"]/text()")
    public void setW(String newW) {
        this.w = newW;
    }

    @Override
    public<T >T accept(IHkVisitor<T> visitor) {
        visitor.visit(this);
        if (!(null == getVariableBindingSet())) {
            getVariableBindingSet().accept(visitor);
        }
        return visitor.getResults();
    }

    @Override
    public<T >T accept(IHkParentVisitor<T> visitor, IHkVisitable parent) {
        visitor.visit(this, parent);
        if (!(null == getVariableBindingSet())) {
            getVariableBindingSet().accept(visitor, this);
        }
        return visitor.getResults();
    }

    @Override
    public Collection<IHkVisitable> objects() {
        Collection<IHkVisitable> theseObjects = new ArrayList<IHkVisitable>();
        if (!(null == getVariableBindingSet())) {
            theseObjects.add(getVariableBindingSet());
        }
        return theseObjects;
    }

    @Override
    public boolean remove(Object toRemove) {
        if ((getVariableBindingSet()!= null)&&getVariableBindingSet().equals(toRemove)) {
            setVariableBindingSet(null);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString()+" ["+this.getName()+"]";
    }

}
