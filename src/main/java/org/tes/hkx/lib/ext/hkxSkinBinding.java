
package org.tes.hkx.lib.ext;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.eclipse.persistence.oxm.annotations.XmlDiscriminatorValue;
import org.eclipse.persistence.oxm.annotations.XmlPath;
import org.tes.hkx.lib.HkParenthesysVectorAdapter;
import org.tes.hkx.lib.HkobjectType;

@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlDiscriminatorValue("0x5a93f338")
@XmlType(propOrder = {
    "mesh",
    "nodeNames",
    "bindPose",
    "initSkinTransform"
})
public class hkxSkinBinding
    extends HkobjectType
{

    private hkxMesh mesh;
    @XmlElement(name = "hkparam[@name=\"nodeNames\"]/hkcstring", required = true, nillable = true)
    private ArrayList<String> nodeNames;
    @XmlPath("hkparam[@name=\"nodeNames\"]/@numelements")
    private Integer numnodeNames;
    @XmlJavaTypeAdapter(HkParenthesysVectorAdapter.class)
    @XmlPath("hkparam[@name=\"bindPose\"]/text()")
    private ArrayList<String> bindPose;
    @XmlPath("hkparam[@name=\"bindPose\"]/@numelements")
    private Integer numbindPose;
    private String initSkinTransform;

    public hkxSkinBinding() {
        setMesh(null);
        nodeNames = new ArrayList<String>();
        numnodeNames = 0;
        bindPose = new ArrayList<String>();
        numbindPose = 0;
        setInitSkinTransform("(1.000000 0.000000 0.000000 0.000000)(0.000000 1.000000 0.000000 0.000000)(0.000000 0.000000 1.000000 0.000000)(0.000000 0.000000 0.000000 1.000000)");
    }

    public hkxSkinBinding(hkxSkinBinding toCopy, Boolean deepCopy) {
        super(toCopy, deepCopy);
        if (toCopy == null) {
            return ;
        }
        if (!(toCopy.getMesh() == null)) {
            if (deepCopy == true) {
                setMesh(new hkxMesh(toCopy.getMesh(), deepCopy));
            } else {
                setMesh(toCopy.getMesh());
            }
        }
        nodeNames = new ArrayList<String>();
        numnodeNames = 0;
        for (String obj: toCopy.getNodeNames()) {
            if (deepCopy == true) {
                addToNodeNames(new String(obj));
            } else {
                addToNodeNames(obj);
            }
        }
        bindPose = new ArrayList<String>();
        numbindPose = 0;
        for (String obj: toCopy.getBindPose()) {
            if (deepCopy == true) {
                addToBindPose(new String(obj));
            } else {
                addToBindPose(obj);
            }
        }
        if (!(toCopy.getInitSkinTransform() == null)) {
            if (deepCopy == true) {
                setInitSkinTransform(new String(toCopy.getInitSkinTransform()));
            } else {
                setInitSkinTransform(toCopy.getInitSkinTransform());
            }
        }
    }

    @XmlPath("hkparam[@name=\"mesh\"]/text()")
    public hkxMesh getMesh() {
        return mesh;
    }

    @XmlPath("hkparam[@name=\"mesh\"]/text()")
    public void setMesh(hkxMesh newMesh) {
        this.mesh = newMesh;
    }

    public Integer getNumNodeNames() {
        return numnodeNames;
    }

    public Iterable<String> getNodeNames() {
        return nodeNames;
    }

    public String getNodeNamesAt(int index) {
        return nodeNames.get(index);
    }

    public boolean addToNodeNames(String newNodeNames) {
        if (nodeNames.add(newNodeNames)) {
            numnodeNames += 1;
            return true;
        }
        return false;
    }

    public boolean removeFromNodeNames(String nodeNamesToRemove) {
        if (nodeNames.remove(nodeNamesToRemove)) {
            numnodeNames += -1;
            return true;
        }
        return false;
    }

    public String removeFromNodeNamesAt(int index) {
        String toRemove;
        toRemove = nodeNames.remove(index);
        if (!(null == toRemove)) {
            numnodeNames += -1;
            return toRemove;
        }
        return null;
    }

    public Integer getNumBindPose() {
        return numbindPose;
    }

    public Iterable<String> getBindPose() {
        return bindPose;
    }

    public String getBindPoseAt(int index) {
        return bindPose.get(index);
    }

    public boolean addToBindPose(String newBindPose) {
        if (bindPose.add(newBindPose)) {
            numbindPose += 1;
            return true;
        }
        return false;
    }

    public boolean removeFromBindPose(String bindPoseToRemove) {
        if (bindPose.remove(bindPoseToRemove)) {
            numbindPose += -1;
            return true;
        }
        return false;
    }

    public String removeFromBindPoseAt(int index) {
        String toRemove;
        toRemove = bindPose.remove(index);
        if (!(null == toRemove)) {
            numbindPose += -1;
            return toRemove;
        }
        return null;
    }

    @XmlPath("hkparam[@name=\"initSkinTransform\"]/text()")
    public String getInitSkinTransform() {
        return initSkinTransform;
    }

    @XmlPath("hkparam[@name=\"initSkinTransform\"]/text()")
    public void setInitSkinTransform(String newInitSkinTransform) {
        this.initSkinTransform = newInitSkinTransform;
    }
}
