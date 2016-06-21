
package org.tes.hkx.lib.ext;

import javax.xml.bind.annotation.XmlType;
import org.eclipse.persistence.oxm.annotations.XmlPath;
import org.tes.hkx.model.IHkParentVisitor;
import org.tes.hkx.model.IHkVisitable;
import org.tes.hkx.model.IHkVisitor;

@XmlType(propOrder = {
    "memberPath",
    "variableIndex",
    "bitIndex",
    "bindingType"
})
public class Unnamed52 implements IHkVisitable
{

    private String memberPath;
    private String variableIndex;
    private String bitIndex;
    private String bindingType;

    public Unnamed52() {
        setMemberPath("isActive");
        setVariableIndex("-1");
        setBitIndex("-1");
        setBindingType("BINDING_TYPE_VARIABLE");
    }

    @XmlPath("hkparam[@name=\"memberPath\"]/text()")
    public String getMemberPath() {
        return memberPath;
    }

    @XmlPath("hkparam[@name=\"memberPath\"]/text()")
    public void setMemberPath(String newMemberPath) {
        this.memberPath = newMemberPath;
    }

    @XmlPath("hkparam[@name=\"variableIndex\"]/text()")
    public String getVariableIndex() {
        return variableIndex;
    }

    @XmlPath("hkparam[@name=\"variableIndex\"]/text()")
    public void setVariableIndex(String newVariableIndex) {
        this.variableIndex = newVariableIndex;
    }

    @XmlPath("hkparam[@name=\"bitIndex\"]/text()")
    public String getBitIndex() {
        return bitIndex;
    }

    @XmlPath("hkparam[@name=\"bitIndex\"]/text()")
    public void setBitIndex(String newBitIndex) {
        this.bitIndex = newBitIndex;
    }

    @XmlPath("hkparam[@name=\"bindingType\"]/text()")
    public String getBindingType() {
        return bindingType;
    }

    @XmlPath("hkparam[@name=\"bindingType\"]/text()")
    public void setBindingType(String newBindingType) {
        this.bindingType = newBindingType;
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
