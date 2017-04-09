
package org.tes.hkx.lib.ext;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.eclipse.persistence.oxm.annotations.XmlPath;
import org.tes.hkx.lib.HkParenthesysVectorAdapter;

@XmlType(propOrder = {
    "vectorData",
    "floatData",
    "uint32Data",
    "uint16Data",
    "uint8Data",
    "numVerts",
    "vectorStride",
    "floatStride",
    "uint32Stride",
    "uint16Stride",
    "uint8Stride"
})
public class Unnamed39 {

    @XmlJavaTypeAdapter(HkParenthesysVectorAdapter.class)
    @XmlPath("hkparam[@name=\"vectorData\"]/text()")
    private ArrayList<String> vectorData;
    @XmlPath("hkparam[@name=\"vectorData\"]/@numelements")
    private Integer numvectorData;
    @XmlJavaTypeAdapter(HkParenthesysVectorAdapter.class)
    @XmlPath("hkparam[@name=\"floatData\"]/text()")
    private ArrayList<String> floatData;
    @XmlPath("hkparam[@name=\"floatData\"]/@numelements")
    private Integer numfloatData;
    @XmlJavaTypeAdapter(HkParenthesysVectorAdapter.class)
    @XmlPath("hkparam[@name=\"uint32Data\"]/text()")
    private ArrayList<String> uint32Data;
    @XmlPath("hkparam[@name=\"uint32Data\"]/@numelements")
    private Integer numuint32Data;
    @XmlJavaTypeAdapter(HkParenthesysVectorAdapter.class)
    @XmlPath("hkparam[@name=\"uint16Data\"]/text()")
    private ArrayList<String> uint16Data;
    @XmlPath("hkparam[@name=\"uint16Data\"]/@numelements")
    private Integer numuint16Data;
    @XmlJavaTypeAdapter(HkParenthesysVectorAdapter.class)
    @XmlPath("hkparam[@name=\"uint8Data\"]/text()")
    private ArrayList<String> uint8Data;
    @XmlPath("hkparam[@name=\"uint8Data\"]/@numelements")
    private Integer numuint8Data;
    private String numVerts;
    private String vectorStride;
    private String floatStride;
    private String uint32Stride;
    private String uint16Stride;
    private String uint8Stride;

    public Unnamed39() {
        vectorData = new ArrayList<String>();
        numvectorData = 0;
        floatData = new ArrayList<String>();
        numfloatData = 0;
        uint32Data = new ArrayList<String>();
        numuint32Data = 0;
        uint16Data = new ArrayList<String>();
        numuint16Data = 0;
        uint8Data = new ArrayList<String>();
        numuint8Data = 0;
        setNumVerts(null);
        setVectorStride("-1");
        setFloatStride("-1");
        setUint32Stride("-1");
        setUint16Stride("-1");
        setUint8Stride("-1");
    }

    public Unnamed39(Unnamed39 toCopy, Boolean deepCopy) {
        if (toCopy == null) {
            return ;
        }
        vectorData = new ArrayList<String>();
        numvectorData = 0;
        for (String obj: toCopy.getVectorData()) {
            if (deepCopy == true) {
                addToVectorData(new String(obj));
            } else {
                addToVectorData(obj);
            }
        }
        floatData = new ArrayList<String>();
        numfloatData = 0;
        for (String obj: toCopy.getFloatData()) {
            if (deepCopy == true) {
                addToFloatData(new String(obj));
            } else {
                addToFloatData(obj);
            }
        }
        uint32Data = new ArrayList<String>();
        numuint32Data = 0;
        for (String obj: toCopy.getUint32Data()) {
            if (deepCopy == true) {
                addToUint32Data(new String(obj));
            } else {
                addToUint32Data(obj);
            }
        }
        uint16Data = new ArrayList<String>();
        numuint16Data = 0;
        for (String obj: toCopy.getUint16Data()) {
            if (deepCopy == true) {
                addToUint16Data(new String(obj));
            } else {
                addToUint16Data(obj);
            }
        }
        uint8Data = new ArrayList<String>();
        numuint8Data = 0;
        for (String obj: toCopy.getUint8Data()) {
            if (deepCopy == true) {
                addToUint8Data(new String(obj));
            } else {
                addToUint8Data(obj);
            }
        }
        if (!(toCopy.getNumVerts() == null)) {
            if (deepCopy == true) {
                setNumVerts(new String(toCopy.getNumVerts()));
            } else {
                setNumVerts(toCopy.getNumVerts());
            }
        }
        if (!(toCopy.getVectorStride() == null)) {
            if (deepCopy == true) {
                setVectorStride(new String(toCopy.getVectorStride()));
            } else {
                setVectorStride(toCopy.getVectorStride());
            }
        }
        if (!(toCopy.getFloatStride() == null)) {
            if (deepCopy == true) {
                setFloatStride(new String(toCopy.getFloatStride()));
            } else {
                setFloatStride(toCopy.getFloatStride());
            }
        }
        if (!(toCopy.getUint32Stride() == null)) {
            if (deepCopy == true) {
                setUint32Stride(new String(toCopy.getUint32Stride()));
            } else {
                setUint32Stride(toCopy.getUint32Stride());
            }
        }
        if (!(toCopy.getUint16Stride() == null)) {
            if (deepCopy == true) {
                setUint16Stride(new String(toCopy.getUint16Stride()));
            } else {
                setUint16Stride(toCopy.getUint16Stride());
            }
        }
        if (!(toCopy.getUint8Stride() == null)) {
            if (deepCopy == true) {
                setUint8Stride(new String(toCopy.getUint8Stride()));
            } else {
                setUint8Stride(toCopy.getUint8Stride());
            }
        }
    }

    public Integer getNumVectorData() {
        return numvectorData;
    }

    public Iterable<String> getVectorData() {
        return vectorData;
    }

    public String getVectorDataAt(int index) {
        return vectorData.get(index);
    }

    public boolean addToVectorData(String newVectorData) {
        if (vectorData.add(newVectorData)) {
            numvectorData += 1;
            return true;
        }
        return false;
    }

    public boolean removeFromVectorData(String vectorDataToRemove) {
        if (vectorData.remove(vectorDataToRemove)) {
            numvectorData += -1;
            return true;
        }
        return false;
    }

    public String removeFromVectorDataAt(int index) {
        String toRemove;
        toRemove = vectorData.remove(index);
        if (!(null == toRemove)) {
            numvectorData += -1;
            return toRemove;
        }
        return null;
    }

    public Integer getNumFloatData() {
        return numfloatData;
    }

    public Iterable<String> getFloatData() {
        return floatData;
    }

    public String getFloatDataAt(int index) {
        return floatData.get(index);
    }

    public boolean addToFloatData(String newFloatData) {
        if (floatData.add(newFloatData)) {
            numfloatData += 1;
            return true;
        }
        return false;
    }

    public boolean removeFromFloatData(String floatDataToRemove) {
        if (floatData.remove(floatDataToRemove)) {
            numfloatData += -1;
            return true;
        }
        return false;
    }

    public String removeFromFloatDataAt(int index) {
        String toRemove;
        toRemove = floatData.remove(index);
        if (!(null == toRemove)) {
            numfloatData += -1;
            return toRemove;
        }
        return null;
    }

    public Integer getNumUint32Data() {
        return numuint32Data;
    }

    public Iterable<String> getUint32Data() {
        return uint32Data;
    }

    public String getUint32DataAt(int index) {
        return uint32Data.get(index);
    }

    public boolean addToUint32Data(String newUint32Data) {
        if (uint32Data.add(newUint32Data)) {
            numuint32Data += 1;
            return true;
        }
        return false;
    }

    public boolean removeFromUint32Data(String uint32DataToRemove) {
        if (uint32Data.remove(uint32DataToRemove)) {
            numuint32Data += -1;
            return true;
        }
        return false;
    }

    public String removeFromUint32DataAt(int index) {
        String toRemove;
        toRemove = uint32Data.remove(index);
        if (!(null == toRemove)) {
            numuint32Data += -1;
            return toRemove;
        }
        return null;
    }

    public Integer getNumUint16Data() {
        return numuint16Data;
    }

    public Iterable<String> getUint16Data() {
        return uint16Data;
    }

    public String getUint16DataAt(int index) {
        return uint16Data.get(index);
    }

    public boolean addToUint16Data(String newUint16Data) {
        if (uint16Data.add(newUint16Data)) {
            numuint16Data += 1;
            return true;
        }
        return false;
    }

    public boolean removeFromUint16Data(String uint16DataToRemove) {
        if (uint16Data.remove(uint16DataToRemove)) {
            numuint16Data += -1;
            return true;
        }
        return false;
    }

    public String removeFromUint16DataAt(int index) {
        String toRemove;
        toRemove = uint16Data.remove(index);
        if (!(null == toRemove)) {
            numuint16Data += -1;
            return toRemove;
        }
        return null;
    }

    public Integer getNumUint8Data() {
        return numuint8Data;
    }

    public Iterable<String> getUint8Data() {
        return uint8Data;
    }

    public String getUint8DataAt(int index) {
        return uint8Data.get(index);
    }

    public boolean addToUint8Data(String newUint8Data) {
        if (uint8Data.add(newUint8Data)) {
            numuint8Data += 1;
            return true;
        }
        return false;
    }

    public boolean removeFromUint8Data(String uint8DataToRemove) {
        if (uint8Data.remove(uint8DataToRemove)) {
            numuint8Data += -1;
            return true;
        }
        return false;
    }

    public String removeFromUint8DataAt(int index) {
        String toRemove;
        toRemove = uint8Data.remove(index);
        if (!(null == toRemove)) {
            numuint8Data += -1;
            return toRemove;
        }
        return null;
    }

    @XmlPath("hkparam[@name=\"numVerts\"]/text()")
    public String getNumVerts() {
        return numVerts;
    }

    @XmlPath("hkparam[@name=\"numVerts\"]/text()")
    public void setNumVerts(String newNumVerts) {
        this.numVerts = newNumVerts;
    }

    @XmlPath("hkparam[@name=\"vectorStride\"]/text()")
    public String getVectorStride() {
        return vectorStride;
    }

    @XmlPath("hkparam[@name=\"vectorStride\"]/text()")
    public void setVectorStride(String newVectorStride) {
        this.vectorStride = newVectorStride;
    }

    @XmlPath("hkparam[@name=\"floatStride\"]/text()")
    public String getFloatStride() {
        return floatStride;
    }

    @XmlPath("hkparam[@name=\"floatStride\"]/text()")
    public void setFloatStride(String newFloatStride) {
        this.floatStride = newFloatStride;
    }

    @XmlPath("hkparam[@name=\"uint32Stride\"]/text()")
    public String getUint32Stride() {
        return uint32Stride;
    }

    @XmlPath("hkparam[@name=\"uint32Stride\"]/text()")
    public void setUint32Stride(String newUint32Stride) {
        this.uint32Stride = newUint32Stride;
    }

    @XmlPath("hkparam[@name=\"uint16Stride\"]/text()")
    public String getUint16Stride() {
        return uint16Stride;
    }

    @XmlPath("hkparam[@name=\"uint16Stride\"]/text()")
    public void setUint16Stride(String newUint16Stride) {
        this.uint16Stride = newUint16Stride;
    }

    @XmlPath("hkparam[@name=\"uint8Stride\"]/text()")
    public String getUint8Stride() {
        return uint8Stride;
    }

    @XmlPath("hkparam[@name=\"uint8Stride\"]/text()")
    public void setUint8Stride(String newUint8Stride) {
        this.uint8Stride = newUint8Stride;
    }

    public Object clone(boolean deepCopy) {
        return new Unnamed39(this, deepCopy);
    }

}
