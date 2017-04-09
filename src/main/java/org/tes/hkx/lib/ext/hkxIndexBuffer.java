
package org.tes.hkx.lib.ext;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.eclipse.persistence.oxm.annotations.XmlDiscriminatorValue;
import org.eclipse.persistence.oxm.annotations.XmlPath;
import org.tes.hkx.lib.HkParenthesysVectorAdapter;
import org.tes.hkx.lib.HkobjectType;

@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlDiscriminatorValue("0xc12c8197")
@XmlType(propOrder = {
    "indexType",
    "indices16",
    "indices32",
    "vertexBaseOffset",
    "length"
})
public class hkxIndexBuffer
    extends HkobjectType
{

    private String indexType;
    @XmlJavaTypeAdapter(HkParenthesysVectorAdapter.class)
    @XmlPath("hkparam[@name=\"indices16\"]/text()")
    private ArrayList<String> indices16;
    @XmlPath("hkparam[@name=\"indices16\"]/@numelements")
    private Integer numindices16;
    @XmlJavaTypeAdapter(HkParenthesysVectorAdapter.class)
    @XmlPath("hkparam[@name=\"indices32\"]/text()")
    private ArrayList<String> indices32;
    @XmlPath("hkparam[@name=\"indices32\"]/@numelements")
    private Integer numindices32;
    private String vertexBaseOffset;
    private String length;

    public hkxIndexBuffer() {
        setIndexType("-1");
        indices16 = new ArrayList<String>();
        numindices16 = 0;
        indices32 = new ArrayList<String>();
        numindices32 = 0;
        setVertexBaseOffset("0");
        setLength("3456");
    }

    public hkxIndexBuffer(hkxIndexBuffer toCopy, Boolean deepCopy) {
        super(toCopy, deepCopy);
        if (toCopy == null) {
            return ;
        }
        if (!(toCopy.getIndexType() == null)) {
            if (deepCopy == true) {
                setIndexType(new String(toCopy.getIndexType()));
            } else {
                setIndexType(toCopy.getIndexType());
            }
        }
        indices16 = new ArrayList<String>();
        numindices16 = 0;
        for (String obj: toCopy.getIndices16()) {
            if (deepCopy == true) {
                addToIndices16(new String(obj));
            } else {
                addToIndices16(obj);
            }
        }
        indices32 = new ArrayList<String>();
        numindices32 = 0;
        for (String obj: toCopy.getIndices32()) {
            if (deepCopy == true) {
                addToIndices32(new String(obj));
            } else {
                addToIndices32(obj);
            }
        }
        if (!(toCopy.getVertexBaseOffset() == null)) {
            if (deepCopy == true) {
                setVertexBaseOffset(new String(toCopy.getVertexBaseOffset()));
            } else {
                setVertexBaseOffset(toCopy.getVertexBaseOffset());
            }
        }
        if (!(toCopy.getLength() == null)) {
            if (deepCopy == true) {
                setLength(new String(toCopy.getLength()));
            } else {
                setLength(toCopy.getLength());
            }
        }
    }

    @XmlPath("hkparam[@name=\"indexType\"]/text()")
    public String getIndexType() {
        return indexType;
    }

    @XmlPath("hkparam[@name=\"indexType\"]/text()")
    public void setIndexType(String newIndexType) {
        this.indexType = newIndexType;
    }

    public Integer getNumIndices16() {
        return numindices16;
    }

    public Iterable<String> getIndices16() {
        return indices16;
    }

    public String getIndices16At(int index) {
        return indices16 .get(index);
    }

    public boolean addToIndices16(String newIndices16) {
        if (indices16 .add(newIndices16)) {
            numindices16 += 1;
            return true;
        }
        return false;
    }

    public boolean removeFromIndices16(String indices16ToRemove) {
        if (indices16 .remove(indices16ToRemove)) {
            numindices16 += -1;
            return true;
        }
        return false;
    }

    public String removeFromIndices16At(int index) {
        String toRemove;
        toRemove = indices16 .remove(index);
        if (!(null == toRemove)) {
            numindices16 += -1;
            return toRemove;
        }
        return null;
    }

    public Integer getNumIndices32() {
        return numindices32;
    }

    public Iterable<String> getIndices32() {
        return indices32;
    }

    public String getIndices32At(int index) {
        return indices32 .get(index);
    }

    public boolean addToIndices32(String newIndices32) {
        if (indices32 .add(newIndices32)) {
            numindices32 += 1;
            return true;
        }
        return false;
    }

    public boolean removeFromIndices32(String indices32ToRemove) {
        if (indices32 .remove(indices32ToRemove)) {
            numindices32 += -1;
            return true;
        }
        return false;
    }

    public String removeFromIndices32At(int index) {
        String toRemove;
        toRemove = indices32 .remove(index);
        if (!(null == toRemove)) {
            numindices32 += -1;
            return toRemove;
        }
        return null;
    }

    @XmlPath("hkparam[@name=\"vertexBaseOffset\"]/text()")
    public String getVertexBaseOffset() {
        return vertexBaseOffset;
    }

    @XmlPath("hkparam[@name=\"vertexBaseOffset\"]/text()")
    public void setVertexBaseOffset(String newVertexBaseOffset) {
        this.vertexBaseOffset = newVertexBaseOffset;
    }

    @XmlPath("hkparam[@name=\"length\"]/text()")
    public String getLength() {
        return length;
    }

    @XmlPath("hkparam[@name=\"length\"]/text()")
    public void setLength(String newLength) {
        this.length = newLength;
    }

}
