
package org.tes.hkx.lib.ext;

import javax.xml.bind.annotation.XmlType;
import org.eclipse.persistence.oxm.annotations.XmlPath;
import org.tes.hkx.model.IHkParentVisitor;
import org.tes.hkx.model.IHkVisitable;
import org.tes.hkx.model.IHkVisitor;

@XmlType(propOrder = {
    "offset"
})
public class Unnamed84 implements IHkVisitable
{

    private String offset;

    public Unnamed84() {
        setOffset(null);
    }

    @XmlPath("hkparam[@name=\"offset\"]/text()")
    public String getOffset() {
        return offset;
    }

    @XmlPath("hkparam[@name=\"offset\"]/text()")
    public void setOffset(String newOffset) {
        this.offset = newOffset;
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
