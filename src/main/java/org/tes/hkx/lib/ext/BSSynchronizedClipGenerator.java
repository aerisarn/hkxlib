
package org.tes.hkx.lib.ext;

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlType;
import org.eclipse.persistence.oxm.annotations.XmlDiscriminatorValue;
import org.eclipse.persistence.oxm.annotations.XmlPath;
import org.tes.hkx.lib.HkobjectType;
import org.tes.hkx.model.IHkContainer;
import org.tes.hkx.model.IHkParentVisitor;
import org.tes.hkx.model.IHkVisitable;
import org.tes.hkx.model.IHkVisitor;
import org.tes.hkx.model.ObjectLink;

@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlDiscriminatorValue("0xd83bea64")
@XmlType(propOrder = {
    "variableBindingSet",
    "userData",
    "name",
    "PClipGenerator",
    "syncAnimPrefix",
    "BSyncClipIgnoreMarkPlacement",
    "FGetToMarkTime",
    "FMarkErrorThreshold",
    "BLeadCharacter",
    "BReorientSupportChar",
    "BApplyMotionFromRoot",
    "SAnimationBindingIndex"
})
public class BSSynchronizedClipGenerator
    extends HkobjectType
    implements IHkContainer, IHkVisitable
{

    private hkbVariableBindingSet variableBindingSet;
    private String userData;
    private String childname;
    private HkobjectType pClipGenerator;
    private String SyncAnimPrefix;
    private String bSyncClipIgnoreMarkPlacement;
    private String fGetToMarkTime;
    private String fMarkErrorThreshold;
    private String bLeadCharacter;
    private String bReorientSupportChar;
    private String bApplyMotionFromRoot;
    private String sAnimationBindingIndex;

    public BSSynchronizedClipGenerator() {
        setVariableBindingSet(null);
        setUserData("0");
        setName("HorseEnterSwim");
        setPClipGenerator(null);
        setSyncAnimPrefix("\u2400");
        setBSyncClipIgnoreMarkPlacement("false");
        setFGetToMarkTime("0.000000");
        setFMarkErrorThreshold("0.100000");
        setBLeadCharacter("false");
        setBReorientSupportChar("true");
        setBApplyMotionFromRoot("false");
        setSAnimationBindingIndex("-1");
        setClazz("BSSynchronizedClipGenerator");
    }

    @XmlIDREF
    @XmlPath("hkparam[@name=\"variableBindingSet\"]/text()")
    @ObjectLink
    public hkbVariableBindingSet getVariableBindingSet() {
        return variableBindingSet;
    }

    public void setVariableBindingSet(hkbVariableBindingSet newVariableBindingSet) {
        this.variableBindingSet = newVariableBindingSet;
    }

    @XmlPath("hkparam[@name=\"userData\"]/text()")
    public String getUserData() {
        return userData;
    }

    @XmlPath("hkparam[@name=\"userData\"]/text()")
    public void setUserData(String newUserData) {
        this.userData = newUserData;
    }

    @XmlPath("hkparam[@name=\"name\"]/text()")
    public String getName() {
        return childname;
    }

    @XmlPath("hkparam[@name=\"name\"]/text()")
    public void setName(String newName) {
        this.childname = newName;
    }

    @XmlIDREF
    @XmlPath("hkparam[@name=\"pClipGenerator\"]/text()")
    @ObjectLink
    public HkobjectType getPClipGenerator() {
        return pClipGenerator;
    }

    public void setPClipGenerator(HkobjectType newPClipGenerator) {
        this.pClipGenerator = newPClipGenerator;
    }

    @XmlPath("hkparam[@name=\"SyncAnimPrefix\"]/text()")
    public String getSyncAnimPrefix() {
        return SyncAnimPrefix;
    }

    @XmlPath("hkparam[@name=\"SyncAnimPrefix\"]/text()")
    public void setSyncAnimPrefix(String newSyncAnimPrefix) {
        this.SyncAnimPrefix = newSyncAnimPrefix;
    }

    @XmlPath("hkparam[@name=\"bSyncClipIgnoreMarkPlacement\"]/text()")
    public String getBSyncClipIgnoreMarkPlacement() {
        return bSyncClipIgnoreMarkPlacement;
    }

    @XmlPath("hkparam[@name=\"bSyncClipIgnoreMarkPlacement\"]/text()")
    public void setBSyncClipIgnoreMarkPlacement(String newBSyncClipIgnoreMarkPlacement) {
        this.bSyncClipIgnoreMarkPlacement = newBSyncClipIgnoreMarkPlacement;
    }

    @XmlPath("hkparam[@name=\"fGetToMarkTime\"]/text()")
    public String getFGetToMarkTime() {
        return fGetToMarkTime;
    }

    @XmlPath("hkparam[@name=\"fGetToMarkTime\"]/text()")
    public void setFGetToMarkTime(String newFGetToMarkTime) {
        this.fGetToMarkTime = newFGetToMarkTime;
    }

    @XmlPath("hkparam[@name=\"fMarkErrorThreshold\"]/text()")
    public String getFMarkErrorThreshold() {
        return fMarkErrorThreshold;
    }

    @XmlPath("hkparam[@name=\"fMarkErrorThreshold\"]/text()")
    public void setFMarkErrorThreshold(String newFMarkErrorThreshold) {
        this.fMarkErrorThreshold = newFMarkErrorThreshold;
    }

    @XmlPath("hkparam[@name=\"bLeadCharacter\"]/text()")
    public String getBLeadCharacter() {
        return bLeadCharacter;
    }

    @XmlPath("hkparam[@name=\"bLeadCharacter\"]/text()")
    public void setBLeadCharacter(String newBLeadCharacter) {
        this.bLeadCharacter = newBLeadCharacter;
    }

    @XmlPath("hkparam[@name=\"bReorientSupportChar\"]/text()")
    public String getBReorientSupportChar() {
        return bReorientSupportChar;
    }

    @XmlPath("hkparam[@name=\"bReorientSupportChar\"]/text()")
    public void setBReorientSupportChar(String newBReorientSupportChar) {
        this.bReorientSupportChar = newBReorientSupportChar;
    }

    @XmlPath("hkparam[@name=\"bApplyMotionFromRoot\"]/text()")
    public String getBApplyMotionFromRoot() {
        return bApplyMotionFromRoot;
    }

    @XmlPath("hkparam[@name=\"bApplyMotionFromRoot\"]/text()")
    public void setBApplyMotionFromRoot(String newBApplyMotionFromRoot) {
        this.bApplyMotionFromRoot = newBApplyMotionFromRoot;
    }

    @XmlPath("hkparam[@name=\"sAnimationBindingIndex\"]/text()")
    public String getSAnimationBindingIndex() {
        return sAnimationBindingIndex;
    }

    @XmlPath("hkparam[@name=\"sAnimationBindingIndex\"]/text()")
    public void setSAnimationBindingIndex(String newSAnimationBindingIndex) {
        this.sAnimationBindingIndex = newSAnimationBindingIndex;
    }

    @Override
    public<T >T accept(IHkVisitor<T> visitor) {
        visitor.visit(this);
        if (!(null == getVariableBindingSet())) {
            getVariableBindingSet().accept(visitor);
        }
        if (!(null == getPClipGenerator())) {
            getPClipGenerator().accept(visitor);
        }
        return visitor.getResults();
    }

    @Override
    public<T >T accept(IHkParentVisitor<T> visitor, IHkVisitable parent) {
        visitor.visit(this, parent);
        if (!(null == getVariableBindingSet())) {
            getVariableBindingSet().accept(visitor, this);
        }
        if (!(null == getPClipGenerator())) {
            getPClipGenerator().accept(visitor, this);
        }
        return visitor.getResults();
    }

    @Override
    public Collection<IHkVisitable> objects() {
        Collection<IHkVisitable> theseObjects = new ArrayList<IHkVisitable>();
        if (!(null == getVariableBindingSet())) {
            theseObjects.add(getVariableBindingSet());
        }
        if (!(null == getPClipGenerator())) {
            theseObjects.add(getPClipGenerator());
        }
        return theseObjects;
    }

    @Override
    public boolean remove(Object toRemove) {
        if ((getVariableBindingSet()!= null)&&getVariableBindingSet().equals(toRemove)) {
            setVariableBindingSet(null);
            return true;
        }
        if ((getPClipGenerator()!= null)&&getPClipGenerator().equals(toRemove)) {
            setPClipGenerator(null);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString()+" ["+this.getName()+"]";
    }

}
