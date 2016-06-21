
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
import org.tes.hkx.model.IHkParentVisitor;
import org.tes.hkx.model.IHkVisitable;
import org.tes.hkx.model.IHkVisitor;

@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlDiscriminatorValue("0x63d38e9c")
@XmlType(propOrder = {
    "vertexIndices",
    "numVerticesPerFace"
})
public class hkpConvexVerticesConnectivity
    extends HkobjectType
    implements IHkVisitable
{

    @XmlJavaTypeAdapter(HkParenthesysVectorAdapter.class)
    @XmlPath("hkparam[@name=\"vertexIndices\"]/text()")
    private ArrayList<String> vertexIndices;
    @XmlPath("hkparam[@name=\"vertexIndices\"]/@numelements")
    private Integer numvertexIndices;
    @XmlJavaTypeAdapter(HkParenthesysVectorAdapter.class)
    @XmlPath("hkparam[@name=\"numVerticesPerFace\"]/text()")
    private ArrayList<String> numVerticesPerFace;
    @XmlPath("hkparam[@name=\"numVerticesPerFace\"]/@numelements")
    private Integer numnumVerticesPerFace;

    public hkpConvexVerticesConnectivity() {
        vertexIndices = new ArrayList<String>();
        numvertexIndices = 0;
        numVerticesPerFace = new ArrayList<String>();
        numnumVerticesPerFace = 0;
        setClazz("hkpConvexVerticesConnectivity");
    }

    public Integer getNumVertexIndices() {
        return numvertexIndices;
    }

    public Iterable<String> getVertexIndices() {
        return vertexIndices;
    }

    public String getVertexIndicesAt(int index) {
        return vertexIndices.get(index);
    }

    public boolean addToVertexIndices(String newVertexIndices) {
        if (vertexIndices.add(newVertexIndices)) {
            numvertexIndices += 1;
            return true;
        }
        return false;
    }

    public boolean removeFromVertexIndices(String vertexIndicesToRemove) {
        if (vertexIndices.remove(vertexIndicesToRemove)) {
            numvertexIndices += -1;
            return true;
        }
        return false;
    }

    public String removeFromVertexIndicesAt(int index) {
        String toRemove;
        toRemove = vertexIndices.remove(index);
        if (!(null == toRemove)) {
            numvertexIndices += -1;
            return toRemove;
        }
        return null;
    }

    public Integer getNumNumVerticesPerFace() {
        return numnumVerticesPerFace;
    }

    public Iterable<String> getNumVerticesPerFace() {
        return numVerticesPerFace;
    }

    public String getNumVerticesPerFaceAt(int index) {
        return numVerticesPerFace.get(index);
    }

    public boolean addToNumVerticesPerFace(String newNumVerticesPerFace) {
        if (numVerticesPerFace.add(newNumVerticesPerFace)) {
            numnumVerticesPerFace += 1;
            return true;
        }
        return false;
    }

    public boolean removeFromNumVerticesPerFace(String numVerticesPerFaceToRemove) {
        if (numVerticesPerFace.remove(numVerticesPerFaceToRemove)) {
            numnumVerticesPerFace += -1;
            return true;
        }
        return false;
    }

    public String removeFromNumVerticesPerFaceAt(int index) {
        String toRemove;
        toRemove = numVerticesPerFace.remove(index);
        if (!(null == toRemove)) {
            numnumVerticesPerFace += -1;
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
