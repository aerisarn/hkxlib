
package org.tes.hkx.lib.ext;

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlType;
import org.eclipse.persistence.oxm.annotations.XmlPath;
import org.tes.hkx.model.IHkContainer;
import org.tes.hkx.model.IHkParentVisitor;
import org.tes.hkx.model.IHkVisitable;
import org.tes.hkx.model.IHkVisitor;
import org.tes.hkx.model.ObjectLink;

@XmlType(propOrder = {
    "id",
    "payload"
})
public class Unnamed17 implements IHkContainer, IHkVisitable
{

    private String id;
    private hkbStringEventPayload payload;

    public Unnamed17() {
        setId("-1");
        setPayload(null);
    }

    @XmlPath("hkparam[@name=\"id\"]/text()")
    public String getId() {
        return id;
    }

    @XmlPath("hkparam[@name=\"id\"]/text()")
    public void setId(String newId) {
        this.id = newId;
    }

    @XmlIDREF
    @XmlPath("hkparam[@name=\"payload\"]/text()")
    @ObjectLink
    public hkbStringEventPayload getPayload() {
        return payload;
    }

    public void setPayload(hkbStringEventPayload newPayload) {
        this.payload = newPayload;
    }

    @Override
    public<T >T accept(IHkVisitor<T> visitor) {
        visitor.visit(this);
        if (!(null == getPayload())) {
            getPayload().accept(visitor);
        }
        return visitor.getResults();
    }

    @Override
    public<T >T accept(IHkParentVisitor<T> visitor, IHkVisitable parent) {
        visitor.visit(this, parent);
        if (!(null == getPayload())) {
            getPayload().accept(visitor, this);
        }
        return visitor.getResults();
    }

    @Override
    public Collection<IHkVisitable> objects() {
        Collection<IHkVisitable> theseObjects = new ArrayList<IHkVisitable>();
        if (!(null == getPayload())) {
            theseObjects.add(getPayload());
        }
        return theseObjects;
    }

    @Override
    public boolean remove(Object toRemove) {
        if ((getPayload()!= null)&&getPayload().equals(toRemove)) {
            setPayload(null);
            return true;
        }
        return false;
    }

}
