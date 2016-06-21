
package org.tes.hkx.lib.ext;

import javax.xml.bind.annotation.XmlType;
import org.eclipse.persistence.oxm.annotations.XmlPath;
import org.tes.hkx.model.IHkParentVisitor;
import org.tes.hkx.model.IHkVisitable;
import org.tes.hkx.model.IHkVisitor;

@XmlType(propOrder = {
    "flags"
})
public class Unnamed24 implements IHkVisitable
{

    private String flags;

    public Unnamed24() {
        setFlags("0");
    }

    @XmlPath("hkparam[@name=\"flags\"]/text()")
    public String getFlags() {
        return flags;
    }

    @XmlPath("hkparam[@name=\"flags\"]/text()")
    public void setFlags(String newFlags) {
        this.flags = newFlags;
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
