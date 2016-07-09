
package org.tes.hkx.lib.ext;

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.eclipse.persistence.oxm.annotations.XmlDiscriminatorValue;
import org.eclipse.persistence.oxm.annotations.XmlPath;
import org.tes.hkx.lib.HkParenthesysVectorAdapter;
import org.tes.hkx.lib.HkobjectType;
import org.tes.hkx.model.IHkContainer;
import org.tes.hkx.model.IHkParentVisitor;
import org.tes.hkx.model.IHkVisitable;
import org.tes.hkx.model.IHkVisitor;

@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlDiscriminatorValue("0x924c2661")
@XmlType(propOrder = {
    "info",
    "data",
    "buildType"
})
public class hkpMoppCode
    extends HkobjectType
    implements IHkContainer, IHkVisitable
{

    private innerMoppCodeInfo info;
    @XmlJavaTypeAdapter(HkParenthesysVectorAdapter.class)
    @XmlPath("hkparam[@name=\"data\"]/text()")
    private ArrayList<String> data;
    @XmlPath("hkparam[@name=\"data\"]/@numelements")
    private Integer numdata;
    private String buildType;

    public hkpMoppCode() {
        setInfo(null);
        data = new ArrayList<String>();
        numdata = 0;
        setBuildType("BUILT_WITH_CHUNK_SUBDIVISION");
        setClazz("hkpMoppCode");
    }

    @XmlElement(name = "hkparam[@name=\"info\"]/hkobject")
    public innerMoppCodeInfo getInfo() {
        return info;
    }

    public void setInfo(innerMoppCodeInfo newInfo) {
        this.info = newInfo;
    }

    public Integer getNumData() {
        return numdata;
    }

    public Iterable<String> getData() {
        return data;
    }

    public String getDataAt(int index) {
        return data.get(index);
    }

    public boolean addToData(String newData) {
        if (data.add(newData)) {
            numdata += 1;
            return true;
        }
        return false;
    }

    public boolean removeFromData(String dataToRemove) {
        if (data.remove(dataToRemove)) {
            numdata += -1;
            return true;
        }
        return false;
    }

    public String removeFromDataAt(int index) {
        String toRemove;
        toRemove = data.remove(index);
        if (!(null == toRemove)) {
            numdata += -1;
            return toRemove;
        }
        return null;
    }

    @XmlPath("hkparam[@name=\"buildType\"]/text()")
    public String getBuildType() {
        return buildType;
    }

    @XmlPath("hkparam[@name=\"buildType\"]/text()")
    public void setBuildType(String newBuildType) {
        this.buildType = newBuildType;
    }

    @Override
    public<T >T accept(IHkVisitor<T> visitor) {
        visitor.visit(this);
        if (!(null == getInfo())) {
            getInfo().accept(visitor);
        }
        return visitor.getResults();
    }

    @Override
    public<T >T accept(IHkParentVisitor<T> visitor, IHkVisitable parent) {
        visitor.visit(this, parent);
        if (!(null == getInfo())) {
            getInfo().accept(visitor, this);
        }
        return visitor.getResults();
    }

    @Override
    public Collection<IHkVisitable> objects() {
        Collection<IHkVisitable> theseObjects = new ArrayList<IHkVisitable>();
        if (!(null == getInfo())) {
            theseObjects.add(getInfo());
        }
        return theseObjects;
    }

    @Override
    public boolean remove(Object toRemove) {
        if ((getInfo()!= null)&&getInfo().equals(toRemove)) {
            setInfo(null);
            return true;
        }
        return false;
    }

}
