
package org.tes.hkx.lib.ext;

import javax.xml.bind.annotation.XmlType;
import org.eclipse.persistence.oxm.annotations.XmlPath;

@XmlType(propOrder = {
    "byteOffset",
    "type",
    "usage",
    "byteStride",
    "numElements"
})
public class Unnamed41 {

    private String byteOffset;
    private String type;
    private String usage;
    private String byteStride;
    private String numElements;

    public Unnamed41() {
        setByteOffset(null);
        setType(null);
        setUsage(null);
        setByteStride("-1");
        setNumElements(null);
    }

    public Unnamed41(Unnamed41 toCopy, Boolean deepCopy) {
        if (toCopy == null) {
            return ;
        }
        if (!(toCopy.getByteOffset() == null)) {
            if (deepCopy == true) {
                setByteOffset(new String(toCopy.getByteOffset()));
            } else {
                setByteOffset(toCopy.getByteOffset());
            }
        }
        if (!(toCopy.getType() == null)) {
            if (deepCopy == true) {
                setType(new String(toCopy.getType()));
            } else {
                setType(toCopy.getType());
            }
        }
        if (!(toCopy.getUsage() == null)) {
            if (deepCopy == true) {
                setUsage(new String(toCopy.getUsage()));
            } else {
                setUsage(toCopy.getUsage());
            }
        }
        if (!(toCopy.getByteStride() == null)) {
            if (deepCopy == true) {
                setByteStride(new String(toCopy.getByteStride()));
            } else {
                setByteStride(toCopy.getByteStride());
            }
        }
        if (!(toCopy.getNumElements() == null)) {
            if (deepCopy == true) {
                setNumElements(new String(toCopy.getNumElements()));
            } else {
                setNumElements(toCopy.getNumElements());
            }
        }
    }

    @XmlPath("hkparam[@name=\"byteOffset\"]/text()")
    public String getByteOffset() {
        return byteOffset;
    }

    @XmlPath("hkparam[@name=\"byteOffset\"]/text()")
    public void setByteOffset(String newByteOffset) {
        this.byteOffset = newByteOffset;
    }

    @XmlPath("hkparam[@name=\"type\"]/text()")
    public String getType() {
        return type;
    }

    @XmlPath("hkparam[@name=\"type\"]/text()")
    public void setType(String newType) {
        this.type = newType;
    }

    @XmlPath("hkparam[@name=\"usage\"]/text()")
    public String getUsage() {
        return usage;
    }

    @XmlPath("hkparam[@name=\"usage\"]/text()")
    public void setUsage(String newUsage) {
        this.usage = newUsage;
    }

    @XmlPath("hkparam[@name=\"byteStride\"]/text()")
    public String getByteStride() {
        return byteStride;
    }

    @XmlPath("hkparam[@name=\"byteStride\"]/text()")
    public void setByteStride(String newByteStride) {
        this.byteStride = newByteStride;
    }

    @XmlPath("hkparam[@name=\"numElements\"]/text()")
    public String getNumElements() {
        return numElements;
    }

    @XmlPath("hkparam[@name=\"numElements\"]/text()")
    public void setNumElements(String newNumElements) {
        this.numElements = newNumElements;
    }

    public Object clone(boolean deepCopy) {
        return new Unnamed41(this, deepCopy);
    }

}
