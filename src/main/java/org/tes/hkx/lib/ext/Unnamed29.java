
package org.tes.hkx.lib.ext;

import javax.xml.bind.annotation.XmlType;
import org.eclipse.persistence.oxm.annotations.XmlPath;

@XmlType(propOrder = {
    "texture",
    "usageHint",
    "tcoordChannel"
})
public class Unnamed29 {

    private hkxTextureFile texture;
    private String usageHint;
    private String tcoordChannel;

    public Unnamed29() {
        setTexture(null);
        setUsageHint("TEX_DIFFUSE");
        setTcoordChannel("0");
    }

    public Unnamed29(Unnamed29 toCopy, Boolean deepCopy) {
        if (toCopy == null) {
            return ;
        }
        if (!(toCopy.getTexture() == null)) {
            if (deepCopy == true) {
                setTexture(new hkxTextureFile(toCopy.getTexture(), deepCopy));
            } else {
                setTexture(toCopy.getTexture());
            }
        }
        if (!(toCopy.getUsageHint() == null)) {
            if (deepCopy == true) {
                setUsageHint(new String(toCopy.getUsageHint()));
            } else {
                setUsageHint(toCopy.getUsageHint());
            }
        }
        if (!(toCopy.getTcoordChannel() == null)) {
            if (deepCopy == true) {
                setTcoordChannel(new String(toCopy.getTcoordChannel()));
            } else {
                setTcoordChannel(toCopy.getTcoordChannel());
            }
        }
    }

    @XmlPath("hkparam[@name=\"texture\"]/text()")
    public hkxTextureFile getTexture() {
        return texture;
    }

    @XmlPath("hkparam[@name=\"texture\"]/text()")
    public void setTexture(hkxTextureFile newTexture) {
        this.texture = newTexture;
    }

    @XmlPath("hkparam[@name=\"usageHint\"]/text()")
    public String getUsageHint() {
        return usageHint;
    }

    @XmlPath("hkparam[@name=\"usageHint\"]/text()")
    public void setUsageHint(String newUsageHint) {
        this.usageHint = newUsageHint;
    }

    @XmlPath("hkparam[@name=\"tcoordChannel\"]/text()")
    public String getTcoordChannel() {
        return tcoordChannel;
    }

    @XmlPath("hkparam[@name=\"tcoordChannel\"]/text()")
    public void setTcoordChannel(String newTcoordChannel) {
        this.tcoordChannel = newTcoordChannel;
    }

    public Object clone(boolean deepCopy) {
        return new Unnamed29(this, deepCopy);
    }

}
