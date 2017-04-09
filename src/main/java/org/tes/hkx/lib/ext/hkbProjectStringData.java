
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
import org.tes.hkx.model.IHkParentVisitor;
import org.tes.hkx.model.IHkVisitable;
import org.tes.hkx.model.IHkVisitor;

@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlDiscriminatorValue("0x76ad60a")
@XmlType(propOrder = {
    "animationFilenames",
    "behaviorFilenames",
    "characterFilenames",
    "eventNames",
    "animationPath",
    "behaviorPath",
    "characterPath",
    "fullPathToSource"
})
public class hkbProjectStringData
    extends HkobjectType
    implements IHkVisitable
{

    @XmlElement(name = "hkparam[@name=\"animationFilenames\"]/hkcstring", required = true, nillable = true)
    private ArrayList<String> animationFilenames;
    @XmlPath("hkparam[@name=\"animationFilenames\"]/@numelements")
    private Integer numanimationFilenames;
    @XmlElement(name = "hkparam[@name=\"behaviorFilenames\"]/hkcstring", required = true, nillable = true)
    private ArrayList<String> behaviorFilenames;
    @XmlPath("hkparam[@name=\"behaviorFilenames\"]/@numelements")
    private Integer numbehaviorFilenames;
    @XmlElement(name = "hkparam[@name=\"characterFilenames\"]/hkcstring", required = true, nillable = true)
    private ArrayList<String> characterFilenames;
    @XmlPath("hkparam[@name=\"characterFilenames\"]/@numelements")
    private Integer numcharacterFilenames;
    @XmlElement(name = "hkparam[@name=\"eventNames\"]/hkcstring", required = true, nillable = true)
    private ArrayList<String> eventNames;
    @XmlPath("hkparam[@name=\"eventNames\"]/@numelements")
    private Integer numeventNames;
    private String animationPath;
    private String behaviorPath;
    private String characterPath;
    private String fullPathToSource;

    public hkbProjectStringData() {
        animationFilenames = new ArrayList<String>();
        numanimationFilenames = 0;
        behaviorFilenames = new ArrayList<String>();
        numbehaviorFilenames = 0;
        characterFilenames = new ArrayList<String>();
        numcharacterFilenames = 0;
        eventNames = new ArrayList<String>();
        numeventNames = 0;
        setAnimationPath(null);
        setBehaviorPath(null);
        setCharacterPath(null);
        setFullPathToSource(null);
        setClazz("hkbProjectStringData");
    }

    public Integer getNumAnimationFilenames() {
        return numanimationFilenames;
    }

    public Iterable<String> getAnimationFilenames() {
        return animationFilenames;
    }

    public String getAnimationFilenamesAt(int index) {
        return animationFilenames.get(index);
    }

    public boolean addToAnimationFilenames(String newAnimationFilenames) {
        if (animationFilenames.add(newAnimationFilenames)) {
            numanimationFilenames += 1;
            return true;
        }
        return false;
    }

    public boolean removeFromAnimationFilenames(String animationFilenamesToRemove) {
        if (animationFilenames.remove(animationFilenamesToRemove)) {
            numanimationFilenames += -1;
            return true;
        }
        return false;
    }

    public String removeFromAnimationFilenamesAt(int index) {
        String toRemove;
        toRemove = animationFilenames.remove(index);
        if (!(null == toRemove)) {
            numanimationFilenames += -1;
            return toRemove;
        }
        return null;
    }

    public Integer getNumBehaviorFilenames() {
        return numbehaviorFilenames;
    }

    public Iterable<String> getBehaviorFilenames() {
        return behaviorFilenames;
    }

    public String getBehaviorFilenamesAt(int index) {
        return behaviorFilenames.get(index);
    }

    public boolean addToBehaviorFilenames(String newBehaviorFilenames) {
        if (behaviorFilenames.add(newBehaviorFilenames)) {
            numbehaviorFilenames += 1;
            return true;
        }
        return false;
    }

    public boolean removeFromBehaviorFilenames(String behaviorFilenamesToRemove) {
        if (behaviorFilenames.remove(behaviorFilenamesToRemove)) {
            numbehaviorFilenames += -1;
            return true;
        }
        return false;
    }

    public String removeFromBehaviorFilenamesAt(int index) {
        String toRemove;
        toRemove = behaviorFilenames.remove(index);
        if (!(null == toRemove)) {
            numbehaviorFilenames += -1;
            return toRemove;
        }
        return null;
    }

    public Integer getNumCharacterFilenames() {
        return numcharacterFilenames;
    }

    public Iterable<String> getCharacterFilenames() {
        return characterFilenames;
    }

    public String getCharacterFilenamesAt(int index) {
        return characterFilenames.get(index);
    }

    public boolean addToCharacterFilenames(String newCharacterFilenames) {
        if (characterFilenames.add(newCharacterFilenames)) {
            numcharacterFilenames += 1;
            return true;
        }
        return false;
    }

    public boolean removeFromCharacterFilenames(String characterFilenamesToRemove) {
        if (characterFilenames.remove(characterFilenamesToRemove)) {
            numcharacterFilenames += -1;
            return true;
        }
        return false;
    }

    public String removeFromCharacterFilenamesAt(int index) {
        String toRemove;
        toRemove = characterFilenames.remove(index);
        if (!(null == toRemove)) {
            numcharacterFilenames += -1;
            return toRemove;
        }
        return null;
    }

    public Integer getNumEventNames() {
        return numeventNames;
    }

    public Iterable<String> getEventNames() {
        return eventNames;
    }

    public String getEventNamesAt(int index) {
        return eventNames.get(index);
    }

    public boolean addToEventNames(String newEventNames) {
        if (eventNames.add(newEventNames)) {
            numeventNames += 1;
            return true;
        }
        return false;
    }

    public boolean removeFromEventNames(String eventNamesToRemove) {
        if (eventNames.remove(eventNamesToRemove)) {
            numeventNames += -1;
            return true;
        }
        return false;
    }

    public String removeFromEventNamesAt(int index) {
        String toRemove;
        toRemove = eventNames.remove(index);
        if (!(null == toRemove)) {
            numeventNames += -1;
            return toRemove;
        }
        return null;
    }

    @XmlPath("hkparam[@name=\"animationPath\"]/text()")
    public String getAnimationPath() {
        return animationPath;
    }

    @XmlPath("hkparam[@name=\"animationPath\"]/text()")
    public void setAnimationPath(String newAnimationPath) {
        this.animationPath = newAnimationPath;
    }

    @XmlPath("hkparam[@name=\"behaviorPath\"]/text()")
    public String getBehaviorPath() {
        return behaviorPath;
    }

    @XmlPath("hkparam[@name=\"behaviorPath\"]/text()")
    public void setBehaviorPath(String newBehaviorPath) {
        this.behaviorPath = newBehaviorPath;
    }

    @XmlPath("hkparam[@name=\"characterPath\"]/text()")
    public String getCharacterPath() {
        return characterPath;
    }

    @XmlPath("hkparam[@name=\"characterPath\"]/text()")
    public void setCharacterPath(String newCharacterPath) {
        this.characterPath = newCharacterPath;
    }

    @XmlPath("hkparam[@name=\"fullPathToSource\"]/text()")
    public String getFullPathToSource() {
        return fullPathToSource;
    }

    @XmlPath("hkparam[@name=\"fullPathToSource\"]/text()")
    public void setFullPathToSource(String newFullPathToSource) {
        this.fullPathToSource = newFullPathToSource;
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
