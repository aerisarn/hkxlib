
package org.tes.hkx.lib.ext;

import javax.xml.bind.annotation.XmlType;

import org.eclipse.persistence.oxm.annotations.XmlPath;
import org.tes.hkx.model.IHkInnerObject;
import org.tes.hkx.model.IHkParentVisitor;
import org.tes.hkx.model.IHkVisitable;
import org.tes.hkx.model.IHkVisitor;
import org.tes.hkx.model.innerVisitable;

@XmlType(propOrder = { "time", "text" })
public class innerAnnotation extends innerVisitable implements IHkVisitable, IHkInnerObject {

	private String time;
	private String text;

	public innerAnnotation() {
		setTime("0.000000");
		setText("true");
	}

	@XmlPath("hkparam[@name=\"time\"]/text()")
	public String getTime() {
		return time;
	}

	@XmlPath("hkparam[@name=\"time\"]/text()")
	public void setTime(String newTime) {
		this.time = newTime;
	}

	@XmlPath("hkparam[@name=\"text\"]/text()")
	public String getText() {
		return text;
	}

	@XmlPath("hkparam[@name=\"text\"]/text()")
	public void setText(String newText) {
		this.text = newText;
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
		return "Time "+ this.getTime() +" [" + this.getText() + "]";
	}

}
