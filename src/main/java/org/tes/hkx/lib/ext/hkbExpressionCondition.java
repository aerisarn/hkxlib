
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
@XmlDiscriminatorValue("0x1c3c1045")
@XmlType(propOrder = {
    "expression"
})
public class hkbExpressionCondition
    extends HkobjectType
    implements IHkVisitable
{

    private String expression;

    public hkbExpressionCondition() {
        setExpression("");
        setClazz("hkbExpressionCondition");
    }

    @XmlPath("hkparam[@name=\"expression\"]/text()")
    public String getExpression() {
        return expression;
    }

    @XmlPath("hkparam[@name=\"expression\"]/text()")
    public void setExpression(String newExpression) {
        this.expression = newExpression;
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
