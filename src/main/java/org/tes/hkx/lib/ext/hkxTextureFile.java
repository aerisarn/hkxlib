
package org.tes.hkx.lib.ext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.eclipse.persistence.oxm.annotations.XmlDiscriminatorValue;
import org.eclipse.persistence.oxm.annotations.XmlPath;
import org.tes.hkx.lib.HkobjectType;

@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlDiscriminatorValue("0x1e289259")
@XmlType(propOrder = {
    "filename",
    "name",
    "originalFilename"
})
public class hkxTextureFile
    extends HkobjectType
{

    private String filename;
    private String childname;
    private String originalFilename;

    public hkxTextureFile() {
        setFilename("C:\\users\\edocan\\My Documents\\3dsMax\\import\\siltidlev2\\meshes\\actors\\siltstrider\\Character assets\\textures\\actors\\siltstrider\\SiltStrider_n.dds");
        setName("textures\\actors\\siltstrider\\SiltStrider_n.dds");
        setOriginalFilename("C:\\users\\edocan\\My Documents\\3dsMax\\import\\siltidlev2\\meshes\\actors\\siltstrider\\Character assets\\textures\\actors\\siltstrider\\SiltStrider_n.dds");
    }

    public hkxTextureFile(hkxTextureFile toCopy, Boolean deepCopy) {
        super(toCopy, deepCopy);
        if (toCopy == null) {
            return ;
        }
        if (!(toCopy.getFilename() == null)) {
            if (deepCopy == true) {
                setFilename(new String(toCopy.getFilename()));
            } else {
                setFilename(toCopy.getFilename());
            }
        }
        if (!(toCopy.getName() == null)) {
            if (deepCopy == true) {
                setName(new String(toCopy.getName()));
            } else {
                setName(toCopy.getName());
            }
        }
        if (!(toCopy.getOriginalFilename() == null)) {
            if (deepCopy == true) {
                setOriginalFilename(new String(toCopy.getOriginalFilename()));
            } else {
                setOriginalFilename(toCopy.getOriginalFilename());
            }
        }
    }

    @XmlPath("hkparam[@name=\"filename\"]/text()")
    public String getFilename() {
        return filename;
    }

    @XmlPath("hkparam[@name=\"filename\"]/text()")
    public void setFilename(String newFilename) {
        this.filename = newFilename;
    }

    @XmlPath("hkparam[@name=\"name\"]/text()")
    public String getName() {
        return childname;
    }

    @XmlPath("hkparam[@name=\"name\"]/text()")
    public void setName(String newName) {
        this.childname = newName;
    }

    @XmlPath("hkparam[@name=\"originalFilename\"]/text()")
    public String getOriginalFilename() {
        return originalFilename;
    }

    @XmlPath("hkparam[@name=\"originalFilename\"]/text()")
    public void setOriginalFilename(String newOriginalFilename) {
        this.originalFilename = newOriginalFilename;
    }

    @Override
    public String toString() {
        return super.toString()+" ["+this.getName()+"]";
    }

}
