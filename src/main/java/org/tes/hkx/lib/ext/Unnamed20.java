
package org.tes.hkx.lib.ext;

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.eclipse.persistence.oxm.annotations.XmlPath;
import org.tes.hkx.model.IHkContainer;
import org.tes.hkx.model.IHkParentVisitor;
import org.tes.hkx.model.IHkVisitable;
import org.tes.hkx.model.IHkVisitor;

@XmlType(propOrder = {
    "role",
    "type"
})
public class Unnamed20 implements IHkContainer, IHkVisitable
{

    private Unnamed21 role;
    private String type;

    public Unnamed20() {
        setRole(null);
        setType("VARIABLE_TYPE_REAL");
    }

    @XmlElement(name = "hkparam[@name=\"role\"]/hkobject")
    public Unnamed21 getRole() {
        return role;
    }

    public void setRole(Unnamed21 newRole) {
        this.role = newRole;
    }

    @XmlPath("hkparam[@name=\"type\"]/text()")
    public String getType() {
        return type;
    }

    @XmlPath("hkparam[@name=\"type\"]/text()")
    public void setType(String newType) {
        this.type = newType;
    }

    @Override
    public<T >T accept(IHkVisitor<T> visitor) {
        visitor.visit(this);
        if (!(null == getRole())) {
            getRole().accept(visitor);
        }
        return visitor.getResults();
    }

    @Override
    public<T >T accept(IHkParentVisitor<T> visitor, IHkVisitable parent) {
        visitor.visit(this, parent);
        if (!(null == getRole())) {
            getRole().accept(visitor, this);
        }
        return visitor.getResults();
    }

    @Override
    public Collection<IHkVisitable> objects() {
        Collection<IHkVisitable> theseObjects = new ArrayList<IHkVisitable>();
        if (!(null == getRole())) {
            theseObjects.add(getRole());
        }
        return theseObjects;
    }

    @Override
    public boolean remove(Object toRemove) {
        if ((getRole()!= null)&&getRole().equals(toRemove)) {
            setRole(null);
            return true;
        }
        return false;
    }

}
