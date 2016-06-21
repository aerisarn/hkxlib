
package org.tes.hkx.lib.ext;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlType;
import org.eclipse.persistence.oxm.annotations.XmlDiscriminatorValue;
import org.eclipse.persistence.oxm.annotations.XmlPath;
import org.tes.hkx.lib.HkobjectType;
import org.tes.hkx.model.IHkParentVisitor;
import org.tes.hkx.model.IHkVisitable;
import org.tes.hkx.model.IHkVisitor;

@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlDiscriminatorValue("0xc6c2da4f")
@XmlType(propOrder = {
    "mirrorAxis",
    "bonePairMap"
})
public class hkbMirroredSkeletonInfo
    extends HkobjectType
    implements IHkVisitable
{

    private String mirrorAxis;
    @XmlList
    @XmlPath("hkparam[@name=\"bonePairMap\"]/text()")
    private ArrayList<String> bonePairMap;
    @XmlPath("hkparam[@name=\"bonePairMap\"]/@numelements")
    private Integer numbonePairMap;

    public hkbMirroredSkeletonInfo() {
        setMirrorAxis("(1.000000 0.000000 0.000000 0.000000)");
        bonePairMap = new ArrayList<String>();
        numbonePairMap = 0;
        setClazz("hkbMirroredSkeletonInfo");
    }

    @XmlPath("hkparam[@name=\"mirrorAxis\"]/text()")
    public String getMirrorAxis() {
        return mirrorAxis;
    }

    @XmlPath("hkparam[@name=\"mirrorAxis\"]/text()")
    public void setMirrorAxis(String newMirrorAxis) {
        this.mirrorAxis = newMirrorAxis;
    }

    public Integer getNumBonePairMap() {
        return numbonePairMap;
    }

    public Iterable<String> getBonePairMap() {
        return bonePairMap;
    }

    public String getBonePairMapAt(int index) {
        return bonePairMap.get(index);
    }

    public boolean addToBonePairMap(String newBonePairMap) {
        if (bonePairMap.add(newBonePairMap)) {
            numbonePairMap += 1;
            return true;
        }
        return false;
    }

    public boolean removeFromBonePairMap(String bonePairMapToRemove) {
        if (bonePairMap.remove(bonePairMapToRemove)) {
            numbonePairMap += -1;
            return true;
        }
        return false;
    }

    public String removeFromBonePairMapAt(int index) {
        String toRemove;
        toRemove = bonePairMap.remove(index);
        if (!(null == toRemove)) {
            numbonePairMap += -1;
            return toRemove;
        }
        return null;
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
