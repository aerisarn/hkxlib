
package org.tes.hkx.lib.ext;

import javax.xml.bind.annotation.XmlType;
import org.eclipse.persistence.oxm.annotations.XmlPath;
import org.tes.hkx.model.IHkParentVisitor;
import org.tes.hkx.model.IHkVisitable;
import org.tes.hkx.model.IHkVisitor;

@XmlType(propOrder = {
    "id",
    "payload"
})
public class Unnamed40 implements IHkVisitable
{

    private String id;
    private String payload;

    public Unnamed40() {
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

    @XmlPath("hkparam[@name=\"payload\"]/text()")
    public String getPayload() {
        return payload;
    }

    @XmlPath("hkparam[@name=\"payload\"]/text()")
    public void setPayload(String newPayload) {
        this.payload = newPayload;
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
