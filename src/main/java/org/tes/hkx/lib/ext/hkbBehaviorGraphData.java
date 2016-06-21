
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
@XmlDiscriminatorValue("0x95aca5d")
@XmlType(propOrder = {
    "attributeDefaults",
    "variableInfos",
    "characterPropertyInfos",
    "eventInfos",
    "wordMinVariableValues",
    "wordMaxVariableValues",
    "variableInitialValues",
    "stringData"
})
public class hkbBehaviorGraphData
    extends HkobjectType
    implements IHkContainer, IHkVisitable
{

    @XmlJavaTypeAdapter(HkParenthesysVectorAdapter.class)
    @XmlPath("hkparam[@name=\"attributeDefaults\"]/text()")
    private ArrayList<String> attributeDefaults;
    @XmlPath("hkparam[@name=\"attributeDefaults\"]/@numelements")
    private Integer numattributeDefaults;
    @XmlElement(name = "hkparam[@name=\"variableInfos\"]/hkobject", required = true, nillable = true)
    private ArrayList<org.tes.hkx.lib.ext.Unnamed20> variableInfos;
    @XmlPath("hkparam[@name=\"variableInfos\"]/@numelements")
    private Integer numvariableInfos;
    @XmlElement(name = "hkparam[@name=\"characterPropertyInfos\"]/hkobject", required = true, nillable = true)
    private ArrayList<org.tes.hkx.lib.ext.Unnamed22> characterPropertyInfos;
    @XmlPath("hkparam[@name=\"characterPropertyInfos\"]/@numelements")
    private Integer numcharacterPropertyInfos;
    @XmlElement(name = "hkparam[@name=\"eventInfos\"]/hkobject", required = true, nillable = true)
    private ArrayList<org.tes.hkx.lib.ext.Unnamed24> eventInfos;
    @XmlPath("hkparam[@name=\"eventInfos\"]/@numelements")
    private Integer numeventInfos;
    @XmlElement(name = "hkparam[@name=\"wordMinVariableValues\"]/hkobject", required = true, nillable = true)
    private ArrayList<org.tes.hkx.lib.ext.Unnamed24> wordMinVariableValues;
    @XmlPath("hkparam[@name=\"wordMinVariableValues\"]/@numelements")
    private Integer numwordMinVariableValues;
    @XmlElement(name = "hkparam[@name=\"wordMaxVariableValues\"]/hkobject", required = true, nillable = true)
    private ArrayList<org.tes.hkx.lib.ext.Unnamed24> wordMaxVariableValues;
    @XmlPath("hkparam[@name=\"wordMaxVariableValues\"]/@numelements")
    private Integer numwordMaxVariableValues;
    private hkbVariableValueSet variableInitialValues;
    private hkbBehaviorGraphStringData stringData;

    public hkbBehaviorGraphData() {
        attributeDefaults = new ArrayList<String>();
        numattributeDefaults = 0;
        variableInfos = new ArrayList<org.tes.hkx.lib.ext.Unnamed20>();
        numvariableInfos = 0;
        characterPropertyInfos = new ArrayList<org.tes.hkx.lib.ext.Unnamed22>();
        numcharacterPropertyInfos = 0;
        eventInfos = new ArrayList<org.tes.hkx.lib.ext.Unnamed24>();
        numeventInfos = 0;
        wordMinVariableValues = new ArrayList<org.tes.hkx.lib.ext.Unnamed24>();
        numwordMinVariableValues = 0;
        wordMaxVariableValues = new ArrayList<org.tes.hkx.lib.ext.Unnamed24>();
        numwordMaxVariableValues = 0;
        setVariableInitialValues(null);
        setStringData(null);
        setClazz("hkbBehaviorGraphData");
    }

    public Integer getNumAttributeDefaults() {
        return numattributeDefaults;
    }

    public Iterable<String> getAttributeDefaults() {
        return attributeDefaults;
    }

    public String getAttributeDefaultsAt(int index) {
        return attributeDefaults.get(index);
    }

    public boolean addToAttributeDefaults(String newAttributeDefaults) {
        if (attributeDefaults.add(newAttributeDefaults)) {
            numattributeDefaults += 1;
            return true;
        }
        return false;
    }

    public boolean removeFromAttributeDefaults(String attributeDefaultsToRemove) {
        if (attributeDefaults.remove(attributeDefaultsToRemove)) {
            numattributeDefaults += -1;
            return true;
        }
        return false;
    }

    public String removeFromAttributeDefaultsAt(int index) {
        String toRemove;
        toRemove = attributeDefaults.remove(index);
        if (!(null == toRemove)) {
            numattributeDefaults += -1;
            return toRemove;
        }
        return null;
    }

    public Integer getNumVariableInfos() {
        return numvariableInfos;
    }

    public Iterable<org.tes.hkx.lib.ext.Unnamed20> getVariableInfos() {
        return variableInfos;
    }

    public org.tes.hkx.lib.ext.Unnamed20 getVariableInfosAt(int index) {
        return variableInfos.get(index);
    }

    public boolean addToVariableInfos(org.tes.hkx.lib.ext.Unnamed20 newVariableInfos) {
        if (variableInfos.add(newVariableInfos)) {
            numvariableInfos += 1;
            return true;
        }
        return false;
    }

    @ObjectLink
    public boolean removeFromVariableInfos(org.tes.hkx.lib.ext.Unnamed20 variableInfosToRemove) {
        if (variableInfos.remove(variableInfosToRemove)) {
            numvariableInfos += -1;
            return true;
        }
        return false;
    }

    public org.tes.hkx.lib.ext.Unnamed20 removeFromVariableInfosAt(int index) {
        org.tes.hkx.lib.ext.Unnamed20 toRemove;
        toRemove = variableInfos.remove(index);
        if (!(null == toRemove)) {
            numvariableInfos += -1;
            return toRemove;
        }
        return null;
    }

    public Integer getNumCharacterPropertyInfos() {
        return numcharacterPropertyInfos;
    }

    public Iterable<org.tes.hkx.lib.ext.Unnamed22> getCharacterPropertyInfos() {
        return characterPropertyInfos;
    }

    public org.tes.hkx.lib.ext.Unnamed22 getCharacterPropertyInfosAt(int index) {
        return characterPropertyInfos.get(index);
    }

    public boolean addToCharacterPropertyInfos(org.tes.hkx.lib.ext.Unnamed22 newCharacterPropertyInfos) {
        if (characterPropertyInfos.add(newCharacterPropertyInfos)) {
            numcharacterPropertyInfos += 1;
            return true;
        }
        return false;
    }

    @ObjectLink
    public boolean removeFromCharacterPropertyInfos(org.tes.hkx.lib.ext.Unnamed22 characterPropertyInfosToRemove) {
        if (characterPropertyInfos.remove(characterPropertyInfosToRemove)) {
            numcharacterPropertyInfos += -1;
            return true;
        }
        return false;
    }

    public org.tes.hkx.lib.ext.Unnamed22 removeFromCharacterPropertyInfosAt(int index) {
        org.tes.hkx.lib.ext.Unnamed22 toRemove;
        toRemove = characterPropertyInfos.remove(index);
        if (!(null == toRemove)) {
            numcharacterPropertyInfos += -1;
            return toRemove;
        }
        return null;
    }

    public Integer getNumEventInfos() {
        return numeventInfos;
    }

    public Iterable<org.tes.hkx.lib.ext.Unnamed24> getEventInfos() {
        return eventInfos;
    }

    public org.tes.hkx.lib.ext.Unnamed24 getEventInfosAt(int index) {
        return eventInfos.get(index);
    }

    public boolean addToEventInfos(org.tes.hkx.lib.ext.Unnamed24 newEventInfos) {
        if (eventInfos.add(newEventInfos)) {
            numeventInfos += 1;
            return true;
        }
        return false;
    }

    @ObjectLink
    public boolean removeFromEventInfos(org.tes.hkx.lib.ext.Unnamed24 eventInfosToRemove) {
        if (eventInfos.remove(eventInfosToRemove)) {
            numeventInfos += -1;
            return true;
        }
        return false;
    }

    public org.tes.hkx.lib.ext.Unnamed24 removeFromEventInfosAt(int index) {
        org.tes.hkx.lib.ext.Unnamed24 toRemove;
        toRemove = eventInfos.remove(index);
        if (!(null == toRemove)) {
            numeventInfos += -1;
            return toRemove;
        }
        return null;
    }

    public Integer getNumWordMinVariableValues() {
        return numwordMinVariableValues;
    }

    public Iterable<org.tes.hkx.lib.ext.Unnamed24> getWordMinVariableValues() {
        return wordMinVariableValues;
    }

    public org.tes.hkx.lib.ext.Unnamed24 getWordMinVariableValuesAt(int index) {
        return wordMinVariableValues.get(index);
    }

    public boolean addToWordMinVariableValues(org.tes.hkx.lib.ext.Unnamed24 newWordMinVariableValues) {
        if (wordMinVariableValues.add(newWordMinVariableValues)) {
            numwordMinVariableValues += 1;
            return true;
        }
        return false;
    }

    @ObjectLink
    public boolean removeFromWordMinVariableValues(org.tes.hkx.lib.ext.Unnamed24 wordMinVariableValuesToRemove) {
        if (wordMinVariableValues.remove(wordMinVariableValuesToRemove)) {
            numwordMinVariableValues += -1;
            return true;
        }
        return false;
    }

    public org.tes.hkx.lib.ext.Unnamed24 removeFromWordMinVariableValuesAt(int index) {
        org.tes.hkx.lib.ext.Unnamed24 toRemove;
        toRemove = wordMinVariableValues.remove(index);
        if (!(null == toRemove)) {
            numwordMinVariableValues += -1;
            return toRemove;
        }
        return null;
    }

    public Integer getNumWordMaxVariableValues() {
        return numwordMaxVariableValues;
    }

    public Iterable<org.tes.hkx.lib.ext.Unnamed24> getWordMaxVariableValues() {
        return wordMaxVariableValues;
    }

    public org.tes.hkx.lib.ext.Unnamed24 getWordMaxVariableValuesAt(int index) {
        return wordMaxVariableValues.get(index);
    }

    public boolean addToWordMaxVariableValues(org.tes.hkx.lib.ext.Unnamed24 newWordMaxVariableValues) {
        if (wordMaxVariableValues.add(newWordMaxVariableValues)) {
            numwordMaxVariableValues += 1;
            return true;
        }
        return false;
    }

    @ObjectLink
    public boolean removeFromWordMaxVariableValues(org.tes.hkx.lib.ext.Unnamed24 wordMaxVariableValuesToRemove) {
        if (wordMaxVariableValues.remove(wordMaxVariableValuesToRemove)) {
            numwordMaxVariableValues += -1;
            return true;
        }
        return false;
    }

    public org.tes.hkx.lib.ext.Unnamed24 removeFromWordMaxVariableValuesAt(int index) {
        org.tes.hkx.lib.ext.Unnamed24 toRemove;
        toRemove = wordMaxVariableValues.remove(index);
        if (!(null == toRemove)) {
            numwordMaxVariableValues += -1;
            return toRemove;
        }
        return null;
    }

    @XmlIDREF
    @XmlPath("hkparam[@name=\"variableInitialValues\"]/text()")
    @ObjectLink
    public hkbVariableValueSet getVariableInitialValues() {
        return variableInitialValues;
    }

    public void setVariableInitialValues(hkbVariableValueSet newVariableInitialValues) {
        this.variableInitialValues = newVariableInitialValues;
    }

    @XmlIDREF
    @XmlPath("hkparam[@name=\"stringData\"]/text()")
    @ObjectLink
    public hkbBehaviorGraphStringData getStringData() {
        return stringData;
    }

    public void setStringData(hkbBehaviorGraphStringData newStringData) {
        this.stringData = newStringData;
    }

    @Override
    public<T >T accept(IHkVisitor<T> visitor) {
        visitor.visit(this);
        for (org.tes.hkx.lib.ext.Unnamed20 child: getVariableInfos()) {
            child.accept(visitor);
        }
        for (org.tes.hkx.lib.ext.Unnamed22 child: getCharacterPropertyInfos()) {
            child.accept(visitor);
        }
        for (org.tes.hkx.lib.ext.Unnamed24 child: getEventInfos()) {
            child.accept(visitor);
        }
        for (org.tes.hkx.lib.ext.Unnamed24 child: getWordMinVariableValues()) {
            child.accept(visitor);
        }
        for (org.tes.hkx.lib.ext.Unnamed24 child: getWordMaxVariableValues()) {
            child.accept(visitor);
        }
        if (!(null == getVariableInitialValues())) {
            getVariableInitialValues().accept(visitor);
        }
        if (!(null == getStringData())) {
            getStringData().accept(visitor);
        }
        return visitor.getResults();
    }

    @Override
    public<T >T accept(IHkParentVisitor<T> visitor, IHkVisitable parent) {
        visitor.visit(this, parent);
        for (org.tes.hkx.lib.ext.Unnamed20 child: getVariableInfos()) {
            child.accept(visitor, this);
        }
        for (org.tes.hkx.lib.ext.Unnamed22 child: getCharacterPropertyInfos()) {
            child.accept(visitor, this);
        }
        for (org.tes.hkx.lib.ext.Unnamed24 child: getEventInfos()) {
            child.accept(visitor, this);
        }
        for (org.tes.hkx.lib.ext.Unnamed24 child: getWordMinVariableValues()) {
            child.accept(visitor, this);
        }
        for (org.tes.hkx.lib.ext.Unnamed24 child: getWordMaxVariableValues()) {
            child.accept(visitor, this);
        }
        if (!(null == getVariableInitialValues())) {
            getVariableInitialValues().accept(visitor, this);
        }
        if (!(null == getStringData())) {
            getStringData().accept(visitor, this);
        }
        return visitor.getResults();
    }

    @Override
    public Collection<IHkVisitable> objects() {
        Collection<IHkVisitable> theseObjects = new ArrayList<IHkVisitable>();
        for (org.tes.hkx.lib.ext.Unnamed20 child: getVariableInfos()) {
            theseObjects.add(child);
        }
        for (org.tes.hkx.lib.ext.Unnamed22 child: getCharacterPropertyInfos()) {
            theseObjects.add(child);
        }
        for (org.tes.hkx.lib.ext.Unnamed24 child: getEventInfos()) {
            theseObjects.add(child);
        }
        for (org.tes.hkx.lib.ext.Unnamed24 child: getWordMinVariableValues()) {
            theseObjects.add(child);
        }
        for (org.tes.hkx.lib.ext.Unnamed24 child: getWordMaxVariableValues()) {
            theseObjects.add(child);
        }
        if (!(null == getVariableInitialValues())) {
            theseObjects.add(getVariableInitialValues());
        }
        if (!(null == getStringData())) {
            theseObjects.add(getStringData());
        }
        return theseObjects;
    }

    @Override
    public boolean remove(Object toRemove) {
        if ((toRemove instanceof org.tes.hkx.lib.ext.Unnamed20)&&removeFromVariableInfos(((org.tes.hkx.lib.ext.Unnamed20) toRemove))) {
            return true;
        }
        if ((toRemove instanceof org.tes.hkx.lib.ext.Unnamed22)&&removeFromCharacterPropertyInfos(((org.tes.hkx.lib.ext.Unnamed22) toRemove))) {
            return true;
        }
        if ((toRemove instanceof org.tes.hkx.lib.ext.Unnamed24)&&removeFromEventInfos(((org.tes.hkx.lib.ext.Unnamed24) toRemove))) {
            return true;
        }
        if ((toRemove instanceof org.tes.hkx.lib.ext.Unnamed24)&&removeFromWordMinVariableValues(((org.tes.hkx.lib.ext.Unnamed24) toRemove))) {
            return true;
        }
        if ((toRemove instanceof org.tes.hkx.lib.ext.Unnamed24)&&removeFromWordMaxVariableValues(((org.tes.hkx.lib.ext.Unnamed24) toRemove))) {
            return true;
        }
        if ((getVariableInitialValues()!= null)&&getVariableInitialValues().equals(toRemove)) {
            setVariableInitialValues(null);
            return true;
        }
        if ((getStringData()!= null)&&getStringData().equals(toRemove)) {
            setStringData(null);
            return true;
        }
        return false;
    }

}
