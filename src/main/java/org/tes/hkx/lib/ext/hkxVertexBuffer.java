
package org.tes.hkx.lib.ext;

import java.util.Collection;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.eclipse.persistence.oxm.annotations.XmlDiscriminatorValue;
import org.tes.hkx.lib.HkobjectType;
import org.tes.hkx.model.IHkContainer;
import org.tes.hkx.model.IHkVisitable;

@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlDiscriminatorValue("0x4ab10615")
@XmlType(propOrder = {
    "data",
    "desc"
})
public class hkxVertexBuffer
    extends HkobjectType
    implements IHkContainer
{

    private Unnamed39 data;
    private Unnamed40 desc;

    public hkxVertexBuffer() {
        setData(null);
        setDesc(null);
    }

    public hkxVertexBuffer(hkxVertexBuffer toCopy, Boolean deepCopy) {
        super(toCopy, deepCopy);
        if (toCopy == null) {
            return ;
        }
        if (!(toCopy.getData() == null)) {
            if (deepCopy == true) {
                setData(new Unnamed39(toCopy.getData(), deepCopy));
            } else {
                setData(toCopy.getData());
            }
        }
        if (!(toCopy.getDesc() == null)) {
            if (deepCopy == true) {
                setDesc(new Unnamed40(toCopy.getDesc(), deepCopy));
            } else {
                setDesc(toCopy.getDesc());
            }
        }
    }

    @XmlElement(name = "hkparam[@name=\"data\"]/hkobject", required = true, nillable = true)
    public Unnamed39 getData() {
        return data;
    }

    @XmlElement(name = "hkparam[@name=\"data\"]/hkobject", required = true, nillable = true)
    public void setData(Unnamed39 newData) {
        this.data = newData;
    }

    @XmlElement(name = "hkparam[@name=\"desc\"]/hkobject", required = true, nillable = true)
    public Unnamed40 getDesc() {
        return desc;
    }

    @XmlElement(name = "hkparam[@name=\"desc\"]/hkobject", required = true, nillable = true)
    public void setDesc(Unnamed40 newDesc) {
        this.desc = newDesc;
    }

    public boolean remove(Object toRemove) {
        if ((getData()!= null)&&getData().equals(toRemove)) {
            setData(null);
            return true;
        }
        if ((getDesc()!= null)&&getDesc().equals(toRemove)) {
            setDesc(null);
            return true;
        }
        return false;
    }

	@Override
	public Collection<IHkVisitable> objects() {
		// TODO Auto-generated method stub
		return null;
	}

}
