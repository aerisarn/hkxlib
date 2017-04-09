
package org.tes.hkx.lib.ext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.eclipse.persistence.oxm.annotations.XmlDiscriminatorValue;
import org.eclipse.persistence.oxm.annotations.XmlPath;
import org.tes.hkx.lib.HkobjectType;

@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlDiscriminatorValue("0xe3597b02")
@XmlType(propOrder = {
    "from",
    "focus",
    "up",
    "fov",
    "far",
    "near",
    "leftHanded"
})
public class hkxCamera
    extends HkobjectType
{

    private String from;
    private String focus;
    private String up;
    private String fov;
    private String far;
    private String near;
    private String leftHanded;

    public hkxCamera() {
        setFrom("(3318.092529 -670.329407 559.509644 0.000000)");
        setFocus("(466.876434 -129.121735 396.690155 0.000000)");
        setUp("(-0.055033 0.010446 0.998430 0.000000)");
        setFov("0.602416");
        setFar("23253.523438");
        setNear("2.906691");
        setLeftHanded("false");
    }

    public hkxCamera(hkxCamera toCopy, Boolean deepCopy) {
        super(toCopy, deepCopy);
        if (toCopy == null) {
            return ;
        }
        if (!(toCopy.getFrom() == null)) {
            if (deepCopy == true) {
                setFrom(new String(toCopy.getFrom()));
            } else {
                setFrom(toCopy.getFrom());
            }
        }
        if (!(toCopy.getFocus() == null)) {
            if (deepCopy == true) {
                setFocus(new String(toCopy.getFocus()));
            } else {
                setFocus(toCopy.getFocus());
            }
        }
        if (!(toCopy.getUp() == null)) {
            if (deepCopy == true) {
                setUp(new String(toCopy.getUp()));
            } else {
                setUp(toCopy.getUp());
            }
        }
        if (!(toCopy.getFov() == null)) {
            if (deepCopy == true) {
                setFov(new String(toCopy.getFov()));
            } else {
                setFov(toCopy.getFov());
            }
        }
        if (!(toCopy.getFar() == null)) {
            if (deepCopy == true) {
                setFar(new String(toCopy.getFar()));
            } else {
                setFar(toCopy.getFar());
            }
        }
        if (!(toCopy.getNear() == null)) {
            if (deepCopy == true) {
                setNear(new String(toCopy.getNear()));
            } else {
                setNear(toCopy.getNear());
            }
        }
        if (!(toCopy.getLeftHanded() == null)) {
            if (deepCopy == true) {
                setLeftHanded(new String(toCopy.getLeftHanded()));
            } else {
                setLeftHanded(toCopy.getLeftHanded());
            }
        }
    }

    @XmlPath("hkparam[@name=\"from\"]/text()")
    public String getFrom() {
        return from;
    }

    @XmlPath("hkparam[@name=\"from\"]/text()")
    public void setFrom(String newFrom) {
        this.from = newFrom;
    }

    @XmlPath("hkparam[@name=\"focus\"]/text()")
    public String getFocus() {
        return focus;
    }

    @XmlPath("hkparam[@name=\"focus\"]/text()")
    public void setFocus(String newFocus) {
        this.focus = newFocus;
    }

    @XmlPath("hkparam[@name=\"up\"]/text()")
    public String getUp() {
        return up;
    }

    @XmlPath("hkparam[@name=\"up\"]/text()")
    public void setUp(String newUp) {
        this.up = newUp;
    }

    @XmlPath("hkparam[@name=\"fov\"]/text()")
    public String getFov() {
        return fov;
    }

    @XmlPath("hkparam[@name=\"fov\"]/text()")
    public void setFov(String newFov) {
        this.fov = newFov;
    }

    @XmlPath("hkparam[@name=\"far\"]/text()")
    public String getFar() {
        return far;
    }

    @XmlPath("hkparam[@name=\"far\"]/text()")
    public void setFar(String newFar) {
        this.far = newFar;
    }

    @XmlPath("hkparam[@name=\"near\"]/text()")
    public String getNear() {
        return near;
    }

    @XmlPath("hkparam[@name=\"near\"]/text()")
    public void setNear(String newNear) {
        this.near = newNear;
    }

    @XmlPath("hkparam[@name=\"leftHanded\"]/text()")
    public String getLeftHanded() {
        return leftHanded;
    }

    @XmlPath("hkparam[@name=\"leftHanded\"]/text()")
    public void setLeftHanded(String newLeftHanded) {
        this.leftHanded = newLeftHanded;
    }

}
