
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
@XmlDiscriminatorValue("0xb8571122")
@XmlType(propOrder = {
    "variableBindingSet",
    "userData",
    "name",
    "PDefaultGenerator",
    "POffsetClipGenerator",
    "FOffsetVariable",
    "FOffsetRangeStart",
    "FOffsetRangeEnd"
})
public class BSOffsetAnimationGenerator
    extends HkobjectType
    implements IHkContainer, IHkVisitable
{

    private hkbVariableBindingSet variableBindingSet;
    private String userData;
    private String childname;
    private HkobjectType pDefaultGenerator;
    private HkobjectType pOffsetClipGenerator;
    private String fOffsetVariable;
    private String fOffsetRangeStart;
    private String fOffsetRangeEnd;

    public BSOffsetAnimationGenerator() {
        setVariableBindingSet(null);
        setUserData("0");
        setName("WeaponAdjustment_OffsetAnimationGen");
        setPDefaultGenerator(null);
        setPOffsetClipGenerator(null);
        setFOffsetVariable("0.000000");
        setFOffsetRangeStart("0.000000");
        setFOffsetRangeEnd("1.000000");
        setClazz("BSOffsetAnimationGenerator");
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

    @XmlIDREF
    @XmlPath("hkparam[@name=\"pDefaultGenerator\"]/text()")
    @ObjectLink
    public HkobjectType getPDefaultGenerator() {
        return pDefaultGenerator;
    }

    public void setPDefaultGenerator(HkobjectType newPDefaultGenerator) {
        this.pDefaultGenerator = newPDefaultGenerator;
    }

    @XmlIDREF
    @XmlPath("hkparam[@name=\"pOffsetClipGenerator\"]/text()")
    @ObjectLink
    public HkobjectType getPOffsetClipGenerator() {
        return pOffsetClipGenerator;
    }

    public void setPOffsetClipGenerator(HkobjectType newPOffsetClipGenerator) {
        this.pOffsetClipGenerator = newPOffsetClipGenerator;
    }

    @XmlPath("hkparam[@name=\"fOffsetVariable\"]/text()")
    public String getFOffsetVariable() {
        return fOffsetVariable;
    }

    @XmlPath("hkparam[@name=\"fOffsetVariable\"]/text()")
    public void setFOffsetVariable(String newFOffsetVariable) {
        this.fOffsetVariable = newFOffsetVariable;
    }

    @XmlPath("hkparam[@name=\"fOffsetRangeStart\"]/text()")
    public String getFOffsetRangeStart() {
        return fOffsetRangeStart;
    }

    @XmlPath("hkparam[@name=\"fOffsetRangeStart\"]/text()")
    public void setFOffsetRangeStart(String newFOffsetRangeStart) {
        this.fOffsetRangeStart = newFOffsetRangeStart;
    }

    @XmlPath("hkparam[@name=\"fOffsetRangeEnd\"]/text()")
    public String getFOffsetRangeEnd() {
        return fOffsetRangeEnd;
    }

    @XmlPath("hkparam[@name=\"fOffsetRangeEnd\"]/text()")
    public void setFOffsetRangeEnd(String newFOffsetRangeEnd) {
        this.fOffsetRangeEnd = newFOffsetRangeEnd;
    }

    @Override
    public<T >T accept(IHkVisitor<T> visitor) {
        visitor.visit(this);
        if (!(null == getVariableBindingSet())) {
            getVariableBindingSet().accept(visitor);
        }
        if (!(null == getPDefaultGenerator())) {
            getPDefaultGenerator().accept(visitor);
        }
        if (!(null == getPOffsetClipGenerator())) {
            getPOffsetClipGenerator().accept(visitor);
        }
        return visitor.getResults();
    }

    @Override
    public<T >T accept(IHkParentVisitor<T> visitor, IHkVisitable parent) {
        visitor.visit(this, parent);
        if (!(null == getVariableBindingSet())) {
            getVariableBindingSet().accept(visitor, this);
        }
        if (!(null == getPDefaultGenerator())) {
            getPDefaultGenerator().accept(visitor, this);
        }
        if (!(null == getPOffsetClipGenerator())) {
            getPOffsetClipGenerator().accept(visitor, this);
        }
        return visitor.getResults();
    }

    @Override
    public Collection<IHkVisitable> objects() {
        Collection<IHkVisitable> theseObjects = new ArrayList<IHkVisitable>();
        if (!(null == getVariableBindingSet())) {
            theseObjects.add(getVariableBindingSet());
        }
        if (!(null == getPDefaultGenerator())) {
            theseObjects.add(getPDefaultGenerator());
        }
        if (!(null == getPOffsetClipGenerator())) {
            theseObjects.add(getPOffsetClipGenerator());
        }
        return theseObjects;
    }

    @Override
    public boolean remove(Object toRemove) {
        if ((getVariableBindingSet()!= null)&&getVariableBindingSet().equals(toRemove)) {
            setVariableBindingSet(null);
            return true;
        }
        if ((getPDefaultGenerator()!= null)&&getPDefaultGenerator().equals(toRemove)) {
            setPDefaultGenerator(null);
            return true;
        }
        if ((getPOffsetClipGenerator()!= null)&&getPOffsetClipGenerator().equals(toRemove)) {
            setPOffsetClipGenerator(null);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString()+" ["+this.getName()+"]";
    }

}
