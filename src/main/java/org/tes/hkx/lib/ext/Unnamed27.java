
package org.tes.hkx.lib.ext;

import javax.xml.bind.annotation.XmlType;
import org.eclipse.persistence.oxm.annotations.XmlPath;
import org.tes.hkx.model.IHkParentVisitor;
import org.tes.hkx.model.IHkVisitable;
import org.tes.hkx.model.IHkVisitor;

@XmlType(propOrder = {
    "role",
    "flags"
})
public class Unnamed27 implements IHkVisitable
{

    private String role;
    private String flags;

    public Unnamed27() {
        setRole(null);
        setFlags(null);
    }

    @XmlPath("hkparam[@name=\"role\"]/text()")
    public String getRole() {
        return role;
    }

    @XmlPath("hkparam[@name=\"role\"]/text()")
    public void setRole(String newRole) {
        this.role = newRole;
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
