
package org.tes.hkx.lib.ext;

import java.util.Iterator;

import javax.xml.bind.annotation.XmlType;

import org.eclipse.persistence.oxm.annotations.XmlPath;
import org.tes.hkx.model.IHkInnerObject;
import org.tes.hkx.model.IHkParentVisitor;
import org.tes.hkx.model.IHkParented;
import org.tes.hkx.model.IHkVisitable;
import org.tes.hkx.model.IHkVisitor;
import org.tes.hkx.model.innerVisitable;

@XmlType(propOrder = { "flags" })
public class innerEventInfo extends innerVisitable implements IHkVisitable, IHkInnerObject {

	private String flags;

	public innerEventInfo() {
		setFlags("0");
	}

	@XmlPath("hkparam[@name=\"flags\"]/text()")
	public String getFlags() {
		return flags;
	}

	@XmlPath("hkparam[@name=\"flags\"]/text()")
	public void setFlags(String newFlags) {
		this.flags = newFlags;
	}

	@Override
	public <T> T accept(IHkVisitor<T> visitor) {
		visitor.visit(this);
		return visitor.getResults();
	}

	@Override
	public <T> T accept(IHkParentVisitor<T> visitor, IHkVisitable parent) {
		visitor.visit(this, parent);
		return visitor.getResults();
	}

	@Override
	public String toString() {
		hkbBehaviorGraph root = findParentWithClass(hkbBehaviorGraph.class);
		if (root != null) {
			for (int i = 0; i < root.getData().getNumEventInfos(); i++)
				if (root.getData().getEventInfosAt(i).equals(this))
					return "EventInfo: " + root.getData().getStringData().getEventNamesAt(i) + " [" + i + "]";
		}
		return "EventInfo";
	}
}
