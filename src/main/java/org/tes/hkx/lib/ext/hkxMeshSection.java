
package org.tes.hkx.lib.ext;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.eclipse.persistence.oxm.annotations.XmlDiscriminatorValue;
import org.eclipse.persistence.oxm.annotations.XmlPath;
import org.tes.hkx.lib.HkobjectType;

@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlDiscriminatorValue("0xe2286cf8")
@XmlType(propOrder = {
    "vertexBuffer",
    "indexBuffers",
    "material",
    "userChannels"
})
public class hkxMeshSection
    extends HkobjectType
{

    private hkxVertexBuffer vertexBuffer;
    @XmlPath("hkparam[@name=\"indexBuffers\"]/hkobject")
    private ArrayList<org.tes.hkx.lib.ext.hkxIndexBuffer> indexBuffers;
    @XmlPath("hkparam[@name=\"indexBuffers\"]/@numelements")
    private Integer numindexBuffers;
    private org.tes.hkx.lib.ext.hkxMaterial material;
    @XmlPath("hkparam[@name=\"userChannels\"]/hkobject")
    private ArrayList<org.tes.hkx.lib.ext.hkxMaterial> userChannels;
    @XmlPath("hkparam[@name=\"userChannels\"]/@numelements")
    private Integer numuserChannels;

    public hkxMeshSection() {
        setVertexBuffer(null);
        indexBuffers = new ArrayList<org.tes.hkx.lib.ext.hkxIndexBuffer>();
        numindexBuffers = 0;
        setMaterial(null);
        userChannels = new ArrayList<org.tes.hkx.lib.ext.hkxMaterial>();
        numuserChannels = 0;
    }

    public hkxMeshSection(hkxMeshSection toCopy, Boolean deepCopy) {
        super(toCopy, deepCopy);
        if (toCopy == null) {
            return ;
        }
        if (!(toCopy.getVertexBuffer() == null)) {
            if (deepCopy == true) {
                setVertexBuffer(new hkxVertexBuffer(toCopy.getVertexBuffer(), deepCopy));
            } else {
                setVertexBuffer(toCopy.getVertexBuffer());
            }
        }
        indexBuffers = new ArrayList<org.tes.hkx.lib.ext.hkxIndexBuffer>();
        numindexBuffers = 0;
        for (org.tes.hkx.lib.ext.hkxIndexBuffer obj: toCopy.getIndexBuffers()) {
            if (deepCopy == true) {
                addToIndexBuffers(new org.tes.hkx.lib.ext.hkxIndexBuffer(obj, deepCopy));
            } else {
                addToIndexBuffers(obj);
            }
        }
        if (!(toCopy.getMaterial() == null)) {
            if (deepCopy == true) {
                setMaterial(new org.tes.hkx.lib.ext.hkxMaterial(toCopy.getMaterial(), deepCopy));
            } else {
                setMaterial(toCopy.getMaterial());
            }
        }
        userChannels = new ArrayList<org.tes.hkx.lib.ext.hkxMaterial>();
        numuserChannels = 0;
        for (org.tes.hkx.lib.ext.hkxMaterial obj: toCopy.getUserChannels()) {
            if (deepCopy == true) {
                addToUserChannels(new org.tes.hkx.lib.ext.hkxMaterial(obj, deepCopy));
            } else {
                addToUserChannels(obj);
            }
        }
    }

    @XmlPath("hkparam[@name=\"vertexBuffer\"]/text()")
    public hkxVertexBuffer getVertexBuffer() {
        return vertexBuffer;
    }

    @XmlPath("hkparam[@name=\"vertexBuffer\"]/text()")
    public void setVertexBuffer(hkxVertexBuffer newVertexBuffer) {
        this.vertexBuffer = newVertexBuffer;
    }

    public Integer getNumIndexBuffers() {
        return numindexBuffers;
    }

    public Iterable<org.tes.hkx.lib.ext.hkxIndexBuffer> getIndexBuffers() {
        return indexBuffers;
    }

    public org.tes.hkx.lib.ext.hkxIndexBuffer getIndexBuffersAt(int index) {
        return indexBuffers.get(index);
    }

    public boolean addToIndexBuffers(org.tes.hkx.lib.ext.hkxIndexBuffer newIndexBuffers) {
        if (indexBuffers.add(newIndexBuffers)) {
            numindexBuffers += 1;
            return true;
        }
        return false;
    }

    public boolean removeFromIndexBuffers(org.tes.hkx.lib.ext.hkxIndexBuffer indexBuffersToRemove) {
        if (indexBuffers.remove(indexBuffersToRemove)) {
            numindexBuffers += -1;
            return true;
        }
        return false;
    }

    public org.tes.hkx.lib.ext.hkxIndexBuffer removeFromIndexBuffersAt(int index) {
        org.tes.hkx.lib.ext.hkxIndexBuffer toRemove;
        toRemove = indexBuffers.remove(index);
        if (!(null == toRemove)) {
            numindexBuffers += -1;
            return toRemove;
        }
        return null;
    }

    @XmlPath("hkparam[@name=\"material\"]/text()")
    public org.tes.hkx.lib.ext.hkxMaterial getMaterial() {
        return material;
    }

    @XmlPath("hkparam[@name=\"material\"]/text()")
    public void setMaterial(org.tes.hkx.lib.ext.hkxMaterial newMaterial) {
        this.material = newMaterial;
    }

    public Integer getNumUserChannels() {
        return numuserChannels;
    }

    public Iterable<org.tes.hkx.lib.ext.hkxMaterial> getUserChannels() {
        return userChannels;
    }

    public org.tes.hkx.lib.ext.hkxMaterial getUserChannelsAt(int index) {
        return userChannels.get(index);
    }

    public boolean addToUserChannels(org.tes.hkx.lib.ext.hkxMaterial newUserChannels) {
        if (userChannels.add(newUserChannels)) {
            numuserChannels += 1;
            return true;
        }
        return false;
    }

    public boolean removeFromUserChannels(org.tes.hkx.lib.ext.hkxMaterial userChannelsToRemove) {
        if (userChannels.remove(userChannelsToRemove)) {
            numuserChannels += -1;
            return true;
        }
        return false;
    }

    public org.tes.hkx.lib.ext.hkxMaterial removeFromUserChannelsAt(int index) {
        org.tes.hkx.lib.ext.hkxMaterial toRemove;
        toRemove = userChannels.remove(index);
        if (!(null == toRemove)) {
            numuserChannels += -1;
            return toRemove;
        }
        return null;
    }

}
