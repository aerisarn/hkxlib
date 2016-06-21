
package org.tes.hkx.lib.ext;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.eclipse.persistence.oxm.annotations.XmlDiscriminatorValue;
import org.eclipse.persistence.oxm.annotations.XmlPath;
import org.tes.hkx.lib.HkobjectType;
import org.tes.hkx.model.IHkParentVisitor;
import org.tes.hkx.model.IHkVisitable;
import org.tes.hkx.model.IHkVisitor;

@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlDiscriminatorValue("0xc713064e")
@XmlType(propOrder = {
    "eventNames",
    "attributeNames",
    "variableNames",
    "characterPropertyNames"
})
public class hkbBehaviorGraphStringData
    extends HkobjectType
    implements IHkVisitable
{

    @XmlElement(name = "hkparam[@name=\"eventNames\"]/hkcstring", required = true, nillable = true)
    private ArrayList<String> eventNames;
    @XmlPath("hkparam[@name=\"eventNames\"]/@numelements")
    private Integer numeventNames;
    @XmlElement(name = "hkparam[@name=\"attributeNames\"]/hkcstring", required = true, nillable = true)
    private ArrayList<String> attributeNames;
    @XmlPath("hkparam[@name=\"attributeNames\"]/@numelements")
    private Integer numattributeNames;
    @XmlElement(name = "hkparam[@name=\"variableNames\"]/hkcstring", required = true, nillable = true)
    private ArrayList<String> variableNames;
    @XmlPath("hkparam[@name=\"variableNames\"]/@numelements")
    private Integer numvariableNames;
    @XmlElement(name = "hkparam[@name=\"characterPropertyNames\"]/hkcstring", required = true, nillable = true)
    private ArrayList<String> characterPropertyNames;
    @XmlPath("hkparam[@name=\"characterPropertyNames\"]/@numelements")
    private Integer numcharacterPropertyNames;

    public hkbBehaviorGraphStringData() {
        eventNames = new ArrayList<String>();
        numeventNames = 0;
        attributeNames = new ArrayList<String>();
        numattributeNames = 0;
        variableNames = new ArrayList<String>();
        numvariableNames = 0;
        characterPropertyNames = new ArrayList<String>();
        numcharacterPropertyNames = 0;
        setClazz("hkbBehaviorGraphStringData");
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

    public Integer getNumAttributeNames() {
        return numattributeNames;
    }

    public Iterable<String> getAttributeNames() {
        return attributeNames;
    }

    public String getAttributeNamesAt(int index) {
        return attributeNames.get(index);
    }

    public boolean addToAttributeNames(String newAttributeNames) {
        if (attributeNames.add(newAttributeNames)) {
            numattributeNames += 1;
            return true;
        }
        return false;
    }

    public boolean removeFromAttributeNames(String attributeNamesToRemove) {
        if (attributeNames.remove(attributeNamesToRemove)) {
            numattributeNames += -1;
            return true;
        }
        return false;
    }

    public String removeFromAttributeNamesAt(int index) {
        String toRemove;
        toRemove = attributeNames.remove(index);
        if (!(null == toRemove)) {
            numattributeNames += -1;
            return toRemove;
        }
        return null;
    }

    public Integer getNumVariableNames() {
        return numvariableNames;
    }

    public Iterable<String> getVariableNames() {
        return variableNames;
    }

    public String getVariableNamesAt(int index) {
        return variableNames.get(index);
    }

    public boolean addToVariableNames(String newVariableNames) {
        if (variableNames.add(newVariableNames)) {
            numvariableNames += 1;
            return true;
        }
        return false;
    }

    public boolean removeFromVariableNames(String variableNamesToRemove) {
        if (variableNames.remove(variableNamesToRemove)) {
            numvariableNames += -1;
            return true;
        }
        return false;
    }

    public String removeFromVariableNamesAt(int index) {
        String toRemove;
        toRemove = variableNames.remove(index);
        if (!(null == toRemove)) {
            numvariableNames += -1;
            return toRemove;
        }
        return null;
    }

    public Integer getNumCharacterPropertyNames() {
        return numcharacterPropertyNames;
    }

    public Iterable<String> getCharacterPropertyNames() {
        return characterPropertyNames;
    }

    public String getCharacterPropertyNamesAt(int index) {
        return characterPropertyNames.get(index);
    }

    public boolean addToCharacterPropertyNames(String newCharacterPropertyNames) {
        if (characterPropertyNames.add(newCharacterPropertyNames)) {
            numcharacterPropertyNames += 1;
            return true;
        }
        return false;
    }

    public boolean removeFromCharacterPropertyNames(String characterPropertyNamesToRemove) {
        if (characterPropertyNames.remove(characterPropertyNamesToRemove)) {
            numcharacterPropertyNames += -1;
            return true;
        }
        return false;
    }

    public String removeFromCharacterPropertyNamesAt(int index) {
        String toRemove;
        toRemove = characterPropertyNames.remove(index);
        if (!(null == toRemove)) {
            numcharacterPropertyNames += -1;
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
