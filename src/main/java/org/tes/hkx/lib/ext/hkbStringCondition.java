
package org.tes.hkx.lib.ext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.eclipse.persistence.oxm.annotations.XmlDiscriminatorValue;
import org.eclipse.persistence.oxm.annotations.XmlPath;
import org.tes.hkx.lib.HkobjectType;
import org.tes.hkx.model.IHkParentVisitor;
import org.tes.hkx.model.IHkVisitable;
import org.tes.hkx.model.IHkVisitor;

@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlDiscriminatorValue("0x5ab50487")
@XmlType(propOrder = {
    "conditionString"
})
public class hkbStringCondition
    extends HkobjectType
    implements IHkVisitable
{

    private String conditionString;

    public hkbStringCondition() {
        setConditionString("");
        setClazz("hkbStringCondition");
    }

    @XmlPath("hkparam[@name=\"conditionString\"]/text()")
    public String getConditionString() {
        return conditionString;
    }

    @XmlPath("hkparam[@name=\"conditionString\"]/text()")
    public void setConditionString(String newConditionString) {
        this.conditionString = newConditionString;
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
