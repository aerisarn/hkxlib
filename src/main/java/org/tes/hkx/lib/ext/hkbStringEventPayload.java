
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
@XmlDiscriminatorValue("0xed04256a")
@XmlType(propOrder = {
    "data"
})
public class hkbStringEventPayload
    extends HkobjectType
    implements IHkVisitable
{

    private String data;

    public hkbStringEventPayload() {
        setData("Left");
        setClazz("hkbStringEventPayload");
    }

    @XmlPath("hkparam[@name=\"data\"]/text()")
    public String getData() {
        return data;
    }

    @XmlPath("hkparam[@name=\"data\"]/text()")
    public void setData(String newData) {
        this.data = newData;
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
