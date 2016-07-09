
package org.tes.hkx.lib.ext;

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
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
import org.tes.hkx.model.ObjectLink;

@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlDiscriminatorValue("0x28726ad8")
@XmlType(propOrder = {
    "userData",
    "radius",
    "aabbHalfExtents",
    "aabbCenter",
    "rotatedVertices",
    "numVertices",
    "planeEquations",
    "connectivity"
})
public class hkpConvexVerticesShape
    extends HkobjectType
    implements IHkContainer, IHkVisitable
{

    private String userData;
    private String radius;
    private String aabbHalfExtents;
    private String aabbCenter;
    @XmlElement(name = "hkparam[@name=\"rotatedVertices\"]/hkobject", required = true, nillable = true)
    private ArrayList<org.tes.hkx.lib.ext.innerVertexRotation> rotatedVertices;
    @XmlPath("hkparam[@name=\"rotatedVertices\"]/@numelements")
    private Integer numrotatedVertices;
    private String numVertices;
    @XmlJavaTypeAdapter(HkParenthesysVectorAdapter.class)
    @XmlPath("hkparam[@name=\"planeEquations\"]/text()")
    private ArrayList<String> planeEquations;
    @XmlPath("hkparam[@name=\"planeEquations\"]/@numelements")
    private Integer numplaneEquations;
    private hkpConvexVerticesConnectivity connectivity;

    public hkpConvexVerticesShape() {
        setUserData("0");
        setRadius("0.013195");
        setAabbHalfExtents("(20.973045 20.566490 4.395403 0.000000)");
        setAabbCenter("(-0.000001 -22.677120 4.408597 0.000000)");
        rotatedVertices = new ArrayList<org.tes.hkx.lib.ext.innerVertexRotation>();
        numrotatedVertices = 0;
        setNumVertices("8");
        planeEquations = new ArrayList<String>();
        numplaneEquations = 0;
        setConnectivity(null);
        setClazz("hkpConvexVerticesShape");
    }

    @XmlPath("hkparam[@name=\"userData\"]/text()")
    public String getUserData() {
        return userData;
    }

    @XmlPath("hkparam[@name=\"userData\"]/text()")
    public void setUserData(String newUserData) {
        this.userData = newUserData;
    }

    @XmlPath("hkparam[@name=\"radius\"]/text()")
    public String getRadius() {
        return radius;
    }

    @XmlPath("hkparam[@name=\"radius\"]/text()")
    public void setRadius(String newRadius) {
        this.radius = newRadius;
    }

    @XmlPath("hkparam[@name=\"aabbHalfExtents\"]/text()")
    public String getAabbHalfExtents() {
        return aabbHalfExtents;
    }

    @XmlPath("hkparam[@name=\"aabbHalfExtents\"]/text()")
    public void setAabbHalfExtents(String newAabbHalfExtents) {
        this.aabbHalfExtents = newAabbHalfExtents;
    }

    @XmlPath("hkparam[@name=\"aabbCenter\"]/text()")
    public String getAabbCenter() {
        return aabbCenter;
    }

    @XmlPath("hkparam[@name=\"aabbCenter\"]/text()")
    public void setAabbCenter(String newAabbCenter) {
        this.aabbCenter = newAabbCenter;
    }

    public Integer getNumRotatedVertices() {
        return numrotatedVertices;
    }

    public Iterable<org.tes.hkx.lib.ext.innerVertexRotation> getRotatedVertices() {
        return rotatedVertices;
    }

    public org.tes.hkx.lib.ext.innerVertexRotation getRotatedVerticesAt(int index) {
        return rotatedVertices.get(index);
    }

    public boolean addToRotatedVertices(org.tes.hkx.lib.ext.innerVertexRotation newRotatedVertices) {
        if (rotatedVertices.add(newRotatedVertices)) {
            numrotatedVertices += 1;
            return true;
        }
        return false;
    }

    @ObjectLink
    public boolean removeFromRotatedVertices(org.tes.hkx.lib.ext.innerVertexRotation rotatedVerticesToRemove) {
        if (rotatedVertices.remove(rotatedVerticesToRemove)) {
            numrotatedVertices += -1;
            return true;
        }
        return false;
    }

    public org.tes.hkx.lib.ext.innerVertexRotation removeFromRotatedVerticesAt(int index) {
        org.tes.hkx.lib.ext.innerVertexRotation toRemove;
        toRemove = rotatedVertices.remove(index);
        if (!(null == toRemove)) {
            numrotatedVertices += -1;
            return toRemove;
        }
        return null;
    }

    @XmlPath("hkparam[@name=\"numVertices\"]/text()")
    public String getNumVertices() {
        return numVertices;
    }

    @XmlPath("hkparam[@name=\"numVertices\"]/text()")
    public void setNumVertices(String newNumVertices) {
        this.numVertices = newNumVertices;
    }

    public Integer getNumPlaneEquations() {
        return numplaneEquations;
    }

    public Iterable<String> getPlaneEquations() {
        return planeEquations;
    }

    public String getPlaneEquationsAt(int index) {
        return planeEquations.get(index);
    }

    public boolean addToPlaneEquations(String newPlaneEquations) {
        if (planeEquations.add(newPlaneEquations)) {
            numplaneEquations += 1;
            return true;
        }
        return false;
    }

    public boolean removeFromPlaneEquations(String planeEquationsToRemove) {
        if (planeEquations.remove(planeEquationsToRemove)) {
            numplaneEquations += -1;
            return true;
        }
        return false;
    }

    public String removeFromPlaneEquationsAt(int index) {
        String toRemove;
        toRemove = planeEquations.remove(index);
        if (!(null == toRemove)) {
            numplaneEquations += -1;
            return toRemove;
        }
        return null;
    }

    @XmlIDREF
    @XmlPath("hkparam[@name=\"connectivity\"]/text()")
    @ObjectLink
    public hkpConvexVerticesConnectivity getConnectivity() {
        return connectivity;
    }

    public void setConnectivity(hkpConvexVerticesConnectivity newConnectivity) {
        this.connectivity = newConnectivity;
    }

    @Override
    public<T >T accept(IHkVisitor<T> visitor) {
        visitor.visit(this);
        for (org.tes.hkx.lib.ext.innerVertexRotation child: getRotatedVertices()) {
            child.accept(visitor);
        }
        if (!(null == getConnectivity())) {
            getConnectivity().accept(visitor);
        }
        return visitor.getResults();
    }

    @Override
    public<T >T accept(IHkParentVisitor<T> visitor, IHkVisitable parent) {
        visitor.visit(this, parent);
        for (org.tes.hkx.lib.ext.innerVertexRotation child: getRotatedVertices()) {
            child.accept(visitor, this);
        }
        if (!(null == getConnectivity())) {
            getConnectivity().accept(visitor, this);
        }
        return visitor.getResults();
    }

    @Override
    public Collection<IHkVisitable> objects() {
        Collection<IHkVisitable> theseObjects = new ArrayList<IHkVisitable>();
        for (org.tes.hkx.lib.ext.innerVertexRotation child: getRotatedVertices()) {
            theseObjects.add(child);
        }
        if (!(null == getConnectivity())) {
            theseObjects.add(getConnectivity());
        }
        return theseObjects;
    }

    @Override
    public boolean remove(Object toRemove) {
        if ((toRemove instanceof org.tes.hkx.lib.ext.innerVertexRotation)&&removeFromRotatedVertices(((org.tes.hkx.lib.ext.innerVertexRotation) toRemove))) {
            return true;
        }
        if ((getConnectivity()!= null)&&getConnectivity().equals(toRemove)) {
            setConnectivity(null);
            return true;
        }
        return false;
    }

}
