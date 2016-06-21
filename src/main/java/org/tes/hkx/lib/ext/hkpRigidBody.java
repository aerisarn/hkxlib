
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
@XmlDiscriminatorValue("0x75f8d805")
@XmlType(propOrder = {
    "userData",
    "collidable",
    "multiThreadCheck",
    "name",
    "properties",
    "material",
    "damageMultiplier",
    "storageIndex",
    "contactPointCallbackDelay",
    "autoRemoveLevel",
    "numShapeKeysInContactPointProperties",
    "responseModifierFlags",
    "uid",
    "spuCollisionCallback",
    "motion",
    "localFrame",
    "npData"
})
public class hkpRigidBody
    extends HkobjectType
    implements IHkContainer, IHkVisitable
{

    private String userData;
    private Unnamed64 collidable;
    private Unnamed66 multiThreadCheck;
    private String childname;
    @XmlJavaTypeAdapter(HkParenthesysVectorAdapter.class)
    @XmlPath("hkparam[@name=\"properties\"]/text()")
    private ArrayList<String> properties;
    @XmlPath("hkparam[@name=\"properties\"]/@numelements")
    private Integer numproperties;
    private Unnamed67 material;
    private String damageMultiplier;
    private String storageIndex;
    private String contactPointCallbackDelay;
    private String autoRemoveLevel;
    private String numShapeKeysInContactPointProperties;
    private HkobjectType responseModifierFlags;
    private String uid;
    private Unnamed68 spuCollisionCallback;
    private Unnamed69 motion;
    private String localFrame;
    private String npData;

    public hkpRigidBody() {
        setUserData("0");
        setCollidable(null);
        setMultiThreadCheck(null);
        setName("Capsule01");
        properties = new ArrayList<String>();
        numproperties = 0;
        setMaterial(null);
        setDamageMultiplier("1.000000");
        setStorageIndex("-1");
        setContactPointCallbackDelay("65535");
        setAutoRemoveLevel("0");
        setNumShapeKeysInContactPointProperties("0");
        setResponseModifierFlags(null);
        setUid("-1");
        setSpuCollisionCallback(null);
        setMotion(null);
        setLocalFrame("null");
        setNpData("0");
        setClazz("hkpRigidBody");
    }

    @XmlPath("hkparam[@name=\"userData\"]/text()")
    public String getUserData() {
        return userData;
    }

    @XmlPath("hkparam[@name=\"userData\"]/text()")
    public void setUserData(String newUserData) {
        this.userData = newUserData;
    }

    @XmlElement(name = "hkparam[@name=\"collidable\"]/hkobject")
    public Unnamed64 getCollidable() {
        return collidable;
    }

    public void setCollidable(Unnamed64 newCollidable) {
        this.collidable = newCollidable;
    }

    @XmlElement(name = "hkparam[@name=\"multiThreadCheck\"]/hkobject")
    public Unnamed66 getMultiThreadCheck() {
        return multiThreadCheck;
    }

    public void setMultiThreadCheck(Unnamed66 newMultiThreadCheck) {
        this.multiThreadCheck = newMultiThreadCheck;
    }

    @XmlPath("hkparam[@name=\"name\"]/text()")
    public String getName() {
        return childname;
    }

    @XmlPath("hkparam[@name=\"name\"]/text()")
    public void setName(String newName) {
        this.childname = newName;
    }

    public Integer getNumProperties() {
        return numproperties;
    }

    public Iterable<String> getProperties() {
        return properties;
    }

    public String getPropertiesAt(int index) {
        return properties.get(index);
    }

    public boolean addToProperties(String newProperties) {
        if (properties.add(newProperties)) {
            numproperties += 1;
            return true;
        }
        return false;
    }

    public boolean removeFromProperties(String propertiesToRemove) {
        if (properties.remove(propertiesToRemove)) {
            numproperties += -1;
            return true;
        }
        return false;
    }

    public String removeFromPropertiesAt(int index) {
        String toRemove;
        toRemove = properties.remove(index);
        if (!(null == toRemove)) {
            numproperties += -1;
            return toRemove;
        }
        return null;
    }

    @XmlElement(name = "hkparam[@name=\"material\"]/hkobject")
    public Unnamed67 getMaterial() {
        return material;
    }

    public void setMaterial(Unnamed67 newMaterial) {
        this.material = newMaterial;
    }

    @XmlPath("hkparam[@name=\"damageMultiplier\"]/text()")
    public String getDamageMultiplier() {
        return damageMultiplier;
    }

    @XmlPath("hkparam[@name=\"damageMultiplier\"]/text()")
    public void setDamageMultiplier(String newDamageMultiplier) {
        this.damageMultiplier = newDamageMultiplier;
    }

    @XmlPath("hkparam[@name=\"storageIndex\"]/text()")
    public String getStorageIndex() {
        return storageIndex;
    }

    @XmlPath("hkparam[@name=\"storageIndex\"]/text()")
    public void setStorageIndex(String newStorageIndex) {
        this.storageIndex = newStorageIndex;
    }

    @XmlPath("hkparam[@name=\"contactPointCallbackDelay\"]/text()")
    public String getContactPointCallbackDelay() {
        return contactPointCallbackDelay;
    }

    @XmlPath("hkparam[@name=\"contactPointCallbackDelay\"]/text()")
    public void setContactPointCallbackDelay(String newContactPointCallbackDelay) {
        this.contactPointCallbackDelay = newContactPointCallbackDelay;
    }

    @XmlPath("hkparam[@name=\"autoRemoveLevel\"]/text()")
    public String getAutoRemoveLevel() {
        return autoRemoveLevel;
    }

    @XmlPath("hkparam[@name=\"autoRemoveLevel\"]/text()")
    public void setAutoRemoveLevel(String newAutoRemoveLevel) {
        this.autoRemoveLevel = newAutoRemoveLevel;
    }

    @XmlPath("hkparam[@name=\"numShapeKeysInContactPointProperties\"]/text()")
    public String getNumShapeKeysInContactPointProperties() {
        return numShapeKeysInContactPointProperties;
    }

    @XmlPath("hkparam[@name=\"numShapeKeysInContactPointProperties\"]/text()")
    public void setNumShapeKeysInContactPointProperties(String newNumShapeKeysInContactPointProperties) {
        this.numShapeKeysInContactPointProperties = newNumShapeKeysInContactPointProperties;
    }

    @XmlIDREF
    @XmlPath("hkparam[@name=\"responseModifierFlags\"]/text()")
    @ObjectLink
    public HkobjectType getResponseModifierFlags() {
        return responseModifierFlags;
    }

    public void setResponseModifierFlags(HkobjectType newResponseModifierFlags) {
        this.responseModifierFlags = newResponseModifierFlags;
    }

    @XmlPath("hkparam[@name=\"uid\"]/text()")
    public String getUid() {
        return uid;
    }

    @XmlPath("hkparam[@name=\"uid\"]/text()")
    public void setUid(String newUid) {
        this.uid = newUid;
    }

    @XmlElement(name = "hkparam[@name=\"spuCollisionCallback\"]/hkobject")
    public Unnamed68 getSpuCollisionCallback() {
        return spuCollisionCallback;
    }

    public void setSpuCollisionCallback(Unnamed68 newSpuCollisionCallback) {
        this.spuCollisionCallback = newSpuCollisionCallback;
    }

    @XmlElement(name = "hkparam[@name=\"motion\"]/hkobject")
    public Unnamed69 getMotion() {
        return motion;
    }

    public void setMotion(Unnamed69 newMotion) {
        this.motion = newMotion;
    }

    @XmlPath("hkparam[@name=\"localFrame\"]/text()")
    public String getLocalFrame() {
        return localFrame;
    }

    @XmlPath("hkparam[@name=\"localFrame\"]/text()")
    public void setLocalFrame(String newLocalFrame) {
        this.localFrame = newLocalFrame;
    }

    @XmlPath("hkparam[@name=\"npData\"]/text()")
    public String getNpData() {
        return npData;
    }

    @XmlPath("hkparam[@name=\"npData\"]/text()")
    public void setNpData(String newNpData) {
        this.npData = newNpData;
    }

    @Override
    public<T >T accept(IHkVisitor<T> visitor) {
        visitor.visit(this);
        if (!(null == getCollidable())) {
            getCollidable().accept(visitor);
        }
        if (!(null == getMultiThreadCheck())) {
            getMultiThreadCheck().accept(visitor);
        }
        if (!(null == getMaterial())) {
            getMaterial().accept(visitor);
        }
        if (!(null == getResponseModifierFlags())) {
            getResponseModifierFlags().accept(visitor);
        }
        if (!(null == getSpuCollisionCallback())) {
            getSpuCollisionCallback().accept(visitor);
        }
        if (!(null == getMotion())) {
            getMotion().accept(visitor);
        }
        return visitor.getResults();
    }

    @Override
    public<T >T accept(IHkParentVisitor<T> visitor, IHkVisitable parent) {
        visitor.visit(this, parent);
        if (!(null == getCollidable())) {
            getCollidable().accept(visitor, this);
        }
        if (!(null == getMultiThreadCheck())) {
            getMultiThreadCheck().accept(visitor, this);
        }
        if (!(null == getMaterial())) {
            getMaterial().accept(visitor, this);
        }
        if (!(null == getResponseModifierFlags())) {
            getResponseModifierFlags().accept(visitor, this);
        }
        if (!(null == getSpuCollisionCallback())) {
            getSpuCollisionCallback().accept(visitor, this);
        }
        if (!(null == getMotion())) {
            getMotion().accept(visitor, this);
        }
        return visitor.getResults();
    }

    @Override
    public Collection<IHkVisitable> objects() {
        Collection<IHkVisitable> theseObjects = new ArrayList<IHkVisitable>();
        if (!(null == getCollidable())) {
            theseObjects.add(getCollidable());
        }
        if (!(null == getMultiThreadCheck())) {
            theseObjects.add(getMultiThreadCheck());
        }
        if (!(null == getMaterial())) {
            theseObjects.add(getMaterial());
        }
        if (!(null == getResponseModifierFlags())) {
            theseObjects.add(getResponseModifierFlags());
        }
        if (!(null == getSpuCollisionCallback())) {
            theseObjects.add(getSpuCollisionCallback());
        }
        if (!(null == getMotion())) {
            theseObjects.add(getMotion());
        }
        return theseObjects;
    }

    @Override
    public boolean remove(Object toRemove) {
        if ((getCollidable()!= null)&&getCollidable().equals(toRemove)) {
            setCollidable(null);
            return true;
        }
        if ((getMultiThreadCheck()!= null)&&getMultiThreadCheck().equals(toRemove)) {
            setMultiThreadCheck(null);
            return true;
        }
        if ((getMaterial()!= null)&&getMaterial().equals(toRemove)) {
            setMaterial(null);
            return true;
        }
        if ((getResponseModifierFlags()!= null)&&getResponseModifierFlags().equals(toRemove)) {
            setResponseModifierFlags(null);
            return true;
        }
        if ((getSpuCollisionCallback()!= null)&&getSpuCollisionCallback().equals(toRemove)) {
            setSpuCollisionCallback(null);
            return true;
        }
        if ((getMotion()!= null)&&getMotion().equals(toRemove)) {
            setMotion(null);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString()+" ["+this.getName()+"]";
    }

}
