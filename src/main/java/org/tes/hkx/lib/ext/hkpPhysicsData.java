
package org.tes.hkx.lib.ext;

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlList;
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
@XmlDiscriminatorValue("0xc2a461e4")
@XmlType(propOrder = {
    "worldCinfo",
    "systems"
})
public class hkpPhysicsData
    extends HkobjectType
    implements IHkContainer, IHkVisitable
{

    private String worldCinfo;
    @XmlIDREF
    @XmlPath("hkparam[@name=\"systems\"]/text()")
    @XmlList
    private ArrayList<hkpPhysicsSystem> systems;
    @XmlPath("hkparam[@name=\"systems\"]/@numelements")
    private Integer numsystems;

    public hkpPhysicsData() {
        setWorldCinfo("null");
        systems = new ArrayList<hkpPhysicsSystem>();
        numsystems = 0;
        setClazz("hkpPhysicsData");
    }

    @XmlPath("hkparam[@name=\"worldCinfo\"]/text()")
    public String getWorldCinfo() {
        return worldCinfo;
    }

    @XmlPath("hkparam[@name=\"worldCinfo\"]/text()")
    public void setWorldCinfo(String newWorldCinfo) {
        this.worldCinfo = newWorldCinfo;
    }

    public Integer getNumSystems() {
        return numsystems;
    }

    public Iterable<hkpPhysicsSystem> getSystems() {
        return systems;
    }

    public hkpPhysicsSystem getSystemsAt(int index) {
        return systems.get(index);
    }

    public boolean addToSystems(hkpPhysicsSystem newSystems) {
        if (systems.add(newSystems)) {
            numsystems += 1;
            return true;
        }
        return false;
    }

    @ObjectLink
    public boolean removeFromSystems(hkpPhysicsSystem systemsToRemove) {
        if (systems.remove(systemsToRemove)) {
            numsystems += -1;
            return true;
        }
        return false;
    }

    public hkpPhysicsSystem removeFromSystemsAt(int index) {
        hkpPhysicsSystem toRemove;
        toRemove = systems.remove(index);
        if (!(null == toRemove)) {
            numsystems += -1;
            return toRemove;
        }
        return null;
    }

    @Override
    public<T >T accept(IHkVisitor<T> visitor) {
        visitor.visit(this);
        for (hkpPhysicsSystem child: getSystems()) {
            child.accept(visitor);
        }
        return visitor.getResults();
    }

    @Override
    public<T >T accept(IHkParentVisitor<T> visitor, IHkVisitable parent) {
        visitor.visit(this, parent);
        for (hkpPhysicsSystem child: getSystems()) {
            child.accept(visitor, this);
        }
        return visitor.getResults();
    }

    @Override
    public Collection<IHkVisitable> objects() {
        Collection<IHkVisitable> theseObjects = new ArrayList<IHkVisitable>();
        for (hkpPhysicsSystem child: getSystems()) {
            theseObjects.add(child);
        }
        return theseObjects;
    }

    @Override
    public boolean remove(Object toRemove) {
        if ((toRemove instanceof hkpPhysicsSystem)&&removeFromSystems(((hkpPhysicsSystem) toRemove))) {
            return true;
        }
        return false;
    }

}
