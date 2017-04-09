
package org.tes.hkx.lib.ext;

import java.util.ArrayList;
import java.util.Collection;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.eclipse.persistence.oxm.annotations.XmlPath;
import org.tes.hkx.model.IHkContainer;
import org.tes.hkx.model.IHkVisitable;

@XmlType(propOrder = {
    "decls"
})
public class Unnamed40 implements IHkContainer
{

    @XmlElement(name = "hkparam[@name=\"decls\"]/hkobject", required = true, nillable = true)
    private ArrayList<org.tes.hkx.lib.ext.Unnamed41> decls;
    @XmlPath("hkparam[@name=\"decls\"]/@numelements")
    private Integer numdecls;

    public Unnamed40() {
        decls = new ArrayList<org.tes.hkx.lib.ext.Unnamed41>();
        numdecls = 0;
    }

    public Unnamed40(Unnamed40 toCopy, Boolean deepCopy) {
        if (toCopy == null) {
            return ;
        }
        decls = new ArrayList<org.tes.hkx.lib.ext.Unnamed41>();
        numdecls = 0;
        for (org.tes.hkx.lib.ext.Unnamed41 obj: toCopy.getDecls()) {
            if (deepCopy == true) {
                addToDecls(new org.tes.hkx.lib.ext.Unnamed41(obj, deepCopy));
            } else {
                addToDecls(obj);
            }
        }
    }

    public Integer getNumDecls() {
        return numdecls;
    }

    public Iterable<org.tes.hkx.lib.ext.Unnamed41> getDecls() {
        return decls;
    }

    public org.tes.hkx.lib.ext.Unnamed41 getDeclsAt(int index) {
        return decls.get(index);
    }

    public boolean addToDecls(org.tes.hkx.lib.ext.Unnamed41 newDecls) {
        if (decls.add(newDecls)) {
            numdecls += 1;
            return true;
        }
        return false;
    }

    public boolean removeFromDecls(org.tes.hkx.lib.ext.Unnamed41 declsToRemove) {
        if (decls.remove(declsToRemove)) {
            numdecls += -1;
            return true;
        }
        return false;
    }

    public org.tes.hkx.lib.ext.Unnamed41 removeFromDeclsAt(int index) {
        org.tes.hkx.lib.ext.Unnamed41 toRemove;
        toRemove = decls.remove(index);
        if (!(null == toRemove)) {
            numdecls += -1;
            return toRemove;
        }
        return null;
    }

    public boolean remove(Object toRemove) {
        if ((toRemove instanceof org.tes.hkx.lib.ext.Unnamed41)&&removeFromDecls(((org.tes.hkx.lib.ext.Unnamed41) toRemove))) {
            return true;
        }
        return false;
    }

    public Object clone(boolean deepCopy) {
        return new Unnamed40(this, deepCopy);
    }

	@Override
	public Collection<IHkVisitable> objects() {
		// TODO Auto-generated method stub
		return null;
	}

}
