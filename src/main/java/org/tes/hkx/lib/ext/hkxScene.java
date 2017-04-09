
package org.tes.hkx.lib.ext;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.eclipse.persistence.oxm.annotations.XmlDiscriminatorValue;
import org.eclipse.persistence.oxm.annotations.XmlPath;
import org.tes.hkx.lib.HkobjectType;

@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlDiscriminatorValue("0x5f673ddd")
@XmlType(propOrder = {
    "modeller",
    "asset",
    "sceneLength",
    "rootNode",
    "selectionSets",
    "cameras",
    "lights",
    "meshes",
    "materials",
    "inplaceTextures",
    "externalTextures",
    "skinBindings",
    "appliedTransform"
})
public class hkxScene
    extends HkobjectType
{

    private String modeller;
    private String asset;
    private String sceneLength;
    private org.tes.hkx.lib.ext.hkxNode rootNode;
    @XmlPath("hkparam[@name=\"selectionSets\"]/hkobject")
    private ArrayList<org.tes.hkx.lib.ext.hkxNode> selectionSets;
    @XmlPath("hkparam[@name=\"selectionSets\"]/@numelements")
    private Integer numselectionSets;
    @XmlPath("hkparam[@name=\"cameras\"]/hkobject")
    private ArrayList<org.tes.hkx.lib.ext.hkxCamera> cameras;
    @XmlPath("hkparam[@name=\"cameras\"]/@numelements")
    private Integer numcameras;
    @XmlPath("hkparam[@name=\"lights\"]/hkobject")
    private ArrayList<org.tes.hkx.lib.ext.hkxCamera> lights;
    @XmlPath("hkparam[@name=\"lights\"]/@numelements")
    private Integer numlights;
    @XmlPath("hkparam[@name=\"meshes\"]/hkobject")
    private ArrayList<org.tes.hkx.lib.ext.hkxMesh> meshes;
    @XmlPath("hkparam[@name=\"meshes\"]/@numelements")
    private Integer nummeshes;
    @XmlPath("hkparam[@name=\"materials\"]/hkobject")
    private ArrayList<org.tes.hkx.lib.ext.hkxMaterial> materials;
    @XmlPath("hkparam[@name=\"materials\"]/@numelements")
    private Integer nummaterials;
    @XmlPath("hkparam[@name=\"inplaceTextures\"]/hkobject")
    private ArrayList<org.tes.hkx.lib.ext.hkxMaterial> inplaceTextures;
    @XmlPath("hkparam[@name=\"inplaceTextures\"]/@numelements")
    private Integer numinplaceTextures;
    @XmlPath("hkparam[@name=\"externalTextures\"]/hkobject")
    private ArrayList<org.tes.hkx.lib.ext.hkxTextureFile> externalTextures;
    @XmlPath("hkparam[@name=\"externalTextures\"]/@numelements")
    private Integer numexternalTextures;
    @XmlPath("hkparam[@name=\"skinBindings\"]/hkobject")
    private ArrayList<org.tes.hkx.lib.ext.hkxSkinBinding> skinBindings;
    @XmlPath("hkparam[@name=\"skinBindings\"]/@numelements")
    private Integer numskinBindings;
    private String appliedTransform;

    public hkxScene() {
        setModeller("3ds max 12.0.0");
        setAsset("");
        setSceneLength("8.000000");
        setRootNode(null);
        selectionSets = new ArrayList<org.tes.hkx.lib.ext.hkxNode>();
        numselectionSets = 0;
        cameras = new ArrayList<org.tes.hkx.lib.ext.hkxCamera>();
        numcameras = 0;
        lights = new ArrayList<org.tes.hkx.lib.ext.hkxCamera>();
        numlights = 0;
        meshes = new ArrayList<org.tes.hkx.lib.ext.hkxMesh>();
        nummeshes = 0;
        materials = new ArrayList<org.tes.hkx.lib.ext.hkxMaterial>();
        nummaterials = 0;
        inplaceTextures = new ArrayList<org.tes.hkx.lib.ext.hkxMaterial>();
        numinplaceTextures = 0;
        externalTextures = new ArrayList<org.tes.hkx.lib.ext.hkxTextureFile>();
        numexternalTextures = 0;
        skinBindings = new ArrayList<org.tes.hkx.lib.ext.hkxSkinBinding>();
        numskinBindings = 0;
        setAppliedTransform("(1.000000 0.000000 0.000000)(0.000000 1.000000 0.000000)(0.000000 0.000000 1.000000)");
    }

    public hkxScene(hkxScene toCopy, Boolean deepCopy) {
        super(toCopy, deepCopy);
        if (toCopy == null) {
            return ;
        }
        if (!(toCopy.getModeller() == null)) {
            if (deepCopy == true) {
                setModeller(new String(toCopy.getModeller()));
            } else {
                setModeller(toCopy.getModeller());
            }
        }
        if (!(toCopy.getAsset() == null)) {
            if (deepCopy == true) {
                setAsset(new String(toCopy.getAsset()));
            } else {
                setAsset(toCopy.getAsset());
            }
        }
        if (!(toCopy.getSceneLength() == null)) {
            if (deepCopy == true) {
                setSceneLength(new String(toCopy.getSceneLength()));
            } else {
                setSceneLength(toCopy.getSceneLength());
            }
        }
        if (!(toCopy.getRootNode() == null)) {
            if (deepCopy == true) {
                setRootNode(new org.tes.hkx.lib.ext.hkxNode(toCopy.getRootNode(), deepCopy));
            } else {
                setRootNode(toCopy.getRootNode());
            }
        }
        selectionSets = new ArrayList<org.tes.hkx.lib.ext.hkxNode>();
        numselectionSets = 0;
        for (org.tes.hkx.lib.ext.hkxNode obj: toCopy.getSelectionSets()) {
            if (deepCopy == true) {
                addToSelectionSets(new org.tes.hkx.lib.ext.hkxNode(obj, deepCopy));
            } else {
                addToSelectionSets(obj);
            }
        }
        cameras = new ArrayList<org.tes.hkx.lib.ext.hkxCamera>();
        numcameras = 0;
        for (org.tes.hkx.lib.ext.hkxCamera obj: toCopy.getCameras()) {
            if (deepCopy == true) {
                addToCameras(new org.tes.hkx.lib.ext.hkxCamera(obj, deepCopy));
            } else {
                addToCameras(obj);
            }
        }
        lights = new ArrayList<org.tes.hkx.lib.ext.hkxCamera>();
        numlights = 0;
        for (org.tes.hkx.lib.ext.hkxCamera obj: toCopy.getLights()) {
            if (deepCopy == true) {
                addToLights(new org.tes.hkx.lib.ext.hkxCamera(obj, deepCopy));
            } else {
                addToLights(obj);
            }
        }
        meshes = new ArrayList<org.tes.hkx.lib.ext.hkxMesh>();
        nummeshes = 0;
        for (org.tes.hkx.lib.ext.hkxMesh obj: toCopy.getMeshes()) {
            if (deepCopy == true) {
                addToMeshes(new org.tes.hkx.lib.ext.hkxMesh(obj, deepCopy));
            } else {
                addToMeshes(obj);
            }
        }
        materials = new ArrayList<org.tes.hkx.lib.ext.hkxMaterial>();
        nummaterials = 0;
        for (org.tes.hkx.lib.ext.hkxMaterial obj: toCopy.getMaterials()) {
            if (deepCopy == true) {
                addToMaterials(new org.tes.hkx.lib.ext.hkxMaterial(obj, deepCopy));
            } else {
                addToMaterials(obj);
            }
        }
        inplaceTextures = new ArrayList<org.tes.hkx.lib.ext.hkxMaterial>();
        numinplaceTextures = 0;
        for (org.tes.hkx.lib.ext.hkxMaterial obj: toCopy.getInplaceTextures()) {
            if (deepCopy == true) {
                addToInplaceTextures(new org.tes.hkx.lib.ext.hkxMaterial(obj, deepCopy));
            } else {
                addToInplaceTextures(obj);
            }
        }
        externalTextures = new ArrayList<org.tes.hkx.lib.ext.hkxTextureFile>();
        numexternalTextures = 0;
        for (org.tes.hkx.lib.ext.hkxTextureFile obj: toCopy.getExternalTextures()) {
            if (deepCopy == true) {
                addToExternalTextures(new org.tes.hkx.lib.ext.hkxTextureFile(obj, deepCopy));
            } else {
                addToExternalTextures(obj);
            }
        }
        skinBindings = new ArrayList<org.tes.hkx.lib.ext.hkxSkinBinding>();
        numskinBindings = 0;
        for (org.tes.hkx.lib.ext.hkxSkinBinding obj: toCopy.getSkinBindings()) {
            if (deepCopy == true) {
                addToSkinBindings(new org.tes.hkx.lib.ext.hkxSkinBinding(obj, deepCopy));
            } else {
                addToSkinBindings(obj);
            }
        }
        if (!(toCopy.getAppliedTransform() == null)) {
            if (deepCopy == true) {
                setAppliedTransform(new String(toCopy.getAppliedTransform()));
            } else {
                setAppliedTransform(toCopy.getAppliedTransform());
            }
        }
    }

    @XmlPath("hkparam[@name=\"modeller\"]/text()")
    public String getModeller() {
        return modeller;
    }

    @XmlPath("hkparam[@name=\"modeller\"]/text()")
    public void setModeller(String newModeller) {
        this.modeller = newModeller;
    }

    @XmlPath("hkparam[@name=\"asset\"]/text()")
    public String getAsset() {
        return asset;
    }

    @XmlPath("hkparam[@name=\"asset\"]/text()")
    public void setAsset(String newAsset) {
        this.asset = newAsset;
    }

    @XmlPath("hkparam[@name=\"sceneLength\"]/text()")
    public String getSceneLength() {
        return sceneLength;
    }

    @XmlPath("hkparam[@name=\"sceneLength\"]/text()")
    public void setSceneLength(String newSceneLength) {
        this.sceneLength = newSceneLength;
    }

    @XmlPath("hkparam[@name=\"rootNode\"]/text()")
    public org.tes.hkx.lib.ext.hkxNode getRootNode() {
        return rootNode;
    }

    @XmlPath("hkparam[@name=\"rootNode\"]/text()")
    public void setRootNode(org.tes.hkx.lib.ext.hkxNode newRootNode) {
        this.rootNode = newRootNode;
    }

    public Integer getNumSelectionSets() {
        return numselectionSets;
    }

    public Iterable<org.tes.hkx.lib.ext.hkxNode> getSelectionSets() {
        return selectionSets;
    }

    public org.tes.hkx.lib.ext.hkxNode getSelectionSetsAt(int index) {
        return selectionSets.get(index);
    }

    public boolean addToSelectionSets(org.tes.hkx.lib.ext.hkxNode newSelectionSets) {
        if (selectionSets.add(newSelectionSets)) {
            numselectionSets += 1;
            return true;
        }
        return false;
    }

    public boolean removeFromSelectionSets(org.tes.hkx.lib.ext.hkxNode selectionSetsToRemove) {
        if (selectionSets.remove(selectionSetsToRemove)) {
            numselectionSets += -1;
            return true;
        }
        return false;
    }

    public org.tes.hkx.lib.ext.hkxNode removeFromSelectionSetsAt(int index) {
        org.tes.hkx.lib.ext.hkxNode toRemove;
        toRemove = selectionSets.remove(index);
        if (!(null == toRemove)) {
            numselectionSets += -1;
            return toRemove;
        }
        return null;
    }

    public Integer getNumCameras() {
        return numcameras;
    }

    public Iterable<org.tes.hkx.lib.ext.hkxCamera> getCameras() {
        return cameras;
    }

    public org.tes.hkx.lib.ext.hkxCamera getCamerasAt(int index) {
        return cameras.get(index);
    }

    public boolean addToCameras(org.tes.hkx.lib.ext.hkxCamera newCameras) {
        if (cameras.add(newCameras)) {
            numcameras += 1;
            return true;
        }
        return false;
    }

    public boolean removeFromCameras(org.tes.hkx.lib.ext.hkxCamera camerasToRemove) {
        if (cameras.remove(camerasToRemove)) {
            numcameras += -1;
            return true;
        }
        return false;
    }

    public org.tes.hkx.lib.ext.hkxCamera removeFromCamerasAt(int index) {
        org.tes.hkx.lib.ext.hkxCamera toRemove;
        toRemove = cameras.remove(index);
        if (!(null == toRemove)) {
            numcameras += -1;
            return toRemove;
        }
        return null;
    }

    public Integer getNumLights() {
        return numlights;
    }

    public Iterable<org.tes.hkx.lib.ext.hkxCamera> getLights() {
        return lights;
    }

    public org.tes.hkx.lib.ext.hkxCamera getLightsAt(int index) {
        return lights.get(index);
    }

    public boolean addToLights(org.tes.hkx.lib.ext.hkxCamera newLights) {
        if (lights.add(newLights)) {
            numlights += 1;
            return true;
        }
        return false;
    }

    public boolean removeFromLights(org.tes.hkx.lib.ext.hkxCamera lightsToRemove) {
        if (lights.remove(lightsToRemove)) {
            numlights += -1;
            return true;
        }
        return false;
    }

    public org.tes.hkx.lib.ext.hkxCamera removeFromLightsAt(int index) {
        org.tes.hkx.lib.ext.hkxCamera toRemove;
        toRemove = lights.remove(index);
        if (!(null == toRemove)) {
            numlights += -1;
            return toRemove;
        }
        return null;
    }

    public Integer getNumMeshes() {
        return nummeshes;
    }

    public Iterable<org.tes.hkx.lib.ext.hkxMesh> getMeshes() {
        return meshes;
    }

    public org.tes.hkx.lib.ext.hkxMesh getMeshesAt(int index) {
        return meshes.get(index);
    }

    public boolean addToMeshes(org.tes.hkx.lib.ext.hkxMesh newMeshes) {
        if (meshes.add(newMeshes)) {
            nummeshes += 1;
            return true;
        }
        return false;
    }

    public boolean removeFromMeshes(org.tes.hkx.lib.ext.hkxMesh meshesToRemove) {
        if (meshes.remove(meshesToRemove)) {
            nummeshes += -1;
            return true;
        }
        return false;
    }

    public org.tes.hkx.lib.ext.hkxMesh removeFromMeshesAt(int index) {
        org.tes.hkx.lib.ext.hkxMesh toRemove;
        toRemove = meshes.remove(index);
        if (!(null == toRemove)) {
            nummeshes += -1;
            return toRemove;
        }
        return null;
    }

    public Integer getNumMaterials() {
        return nummaterials;
    }

    public Iterable<org.tes.hkx.lib.ext.hkxMaterial> getMaterials() {
        return materials;
    }

    public org.tes.hkx.lib.ext.hkxMaterial getMaterialsAt(int index) {
        return materials.get(index);
    }

    public boolean addToMaterials(org.tes.hkx.lib.ext.hkxMaterial newMaterials) {
        if (materials.add(newMaterials)) {
            nummaterials += 1;
            return true;
        }
        return false;
    }

    public boolean removeFromMaterials(org.tes.hkx.lib.ext.hkxMaterial materialsToRemove) {
        if (materials.remove(materialsToRemove)) {
            nummaterials += -1;
            return true;
        }
        return false;
    }

    public org.tes.hkx.lib.ext.hkxMaterial removeFromMaterialsAt(int index) {
        org.tes.hkx.lib.ext.hkxMaterial toRemove;
        toRemove = materials.remove(index);
        if (!(null == toRemove)) {
            nummaterials += -1;
            return toRemove;
        }
        return null;
    }

    public Integer getNumInplaceTextures() {
        return numinplaceTextures;
    }

    public Iterable<org.tes.hkx.lib.ext.hkxMaterial> getInplaceTextures() {
        return inplaceTextures;
    }

    public org.tes.hkx.lib.ext.hkxMaterial getInplaceTexturesAt(int index) {
        return inplaceTextures.get(index);
    }

    public boolean addToInplaceTextures(org.tes.hkx.lib.ext.hkxMaterial newInplaceTextures) {
        if (inplaceTextures.add(newInplaceTextures)) {
            numinplaceTextures += 1;
            return true;
        }
        return false;
    }

    public boolean removeFromInplaceTextures(org.tes.hkx.lib.ext.hkxMaterial inplaceTexturesToRemove) {
        if (inplaceTextures.remove(inplaceTexturesToRemove)) {
            numinplaceTextures += -1;
            return true;
        }
        return false;
    }

    public org.tes.hkx.lib.ext.hkxMaterial removeFromInplaceTexturesAt(int index) {
        org.tes.hkx.lib.ext.hkxMaterial toRemove;
        toRemove = inplaceTextures.remove(index);
        if (!(null == toRemove)) {
            numinplaceTextures += -1;
            return toRemove;
        }
        return null;
    }

    public Integer getNumExternalTextures() {
        return numexternalTextures;
    }

    public Iterable<org.tes.hkx.lib.ext.hkxTextureFile> getExternalTextures() {
        return externalTextures;
    }

    public org.tes.hkx.lib.ext.hkxTextureFile getExternalTexturesAt(int index) {
        return externalTextures.get(index);
    }

    public boolean addToExternalTextures(org.tes.hkx.lib.ext.hkxTextureFile newExternalTextures) {
        if (externalTextures.add(newExternalTextures)) {
            numexternalTextures += 1;
            return true;
        }
        return false;
    }

    public boolean removeFromExternalTextures(org.tes.hkx.lib.ext.hkxTextureFile externalTexturesToRemove) {
        if (externalTextures.remove(externalTexturesToRemove)) {
            numexternalTextures += -1;
            return true;
        }
        return false;
    }

    public org.tes.hkx.lib.ext.hkxTextureFile removeFromExternalTexturesAt(int index) {
        org.tes.hkx.lib.ext.hkxTextureFile toRemove;
        toRemove = externalTextures.remove(index);
        if (!(null == toRemove)) {
            numexternalTextures += -1;
            return toRemove;
        }
        return null;
    }

    public Integer getNumSkinBindings() {
        return numskinBindings;
    }

    public Iterable<org.tes.hkx.lib.ext.hkxSkinBinding> getSkinBindings() {
        return skinBindings;
    }

    public org.tes.hkx.lib.ext.hkxSkinBinding getSkinBindingsAt(int index) {
        return skinBindings.get(index);
    }

    public boolean addToSkinBindings(org.tes.hkx.lib.ext.hkxSkinBinding newSkinBindings) {
        if (skinBindings.add(newSkinBindings)) {
            numskinBindings += 1;
            return true;
        }
        return false;
    }

    public boolean removeFromSkinBindings(org.tes.hkx.lib.ext.hkxSkinBinding skinBindingsToRemove) {
        if (skinBindings.remove(skinBindingsToRemove)) {
            numskinBindings += -1;
            return true;
        }
        return false;
    }

    public org.tes.hkx.lib.ext.hkxSkinBinding removeFromSkinBindingsAt(int index) {
        org.tes.hkx.lib.ext.hkxSkinBinding toRemove;
        toRemove = skinBindings.remove(index);
        if (!(null == toRemove)) {
            numskinBindings += -1;
            return toRemove;
        }
        return null;
    }

    @XmlPath("hkparam[@name=\"appliedTransform\"]/text()")
    public String getAppliedTransform() {
        return appliedTransform;
    }

    @XmlPath("hkparam[@name=\"appliedTransform\"]/text()")
    public void setAppliedTransform(String newAppliedTransform) {
        this.appliedTransform = newAppliedTransform;
    }

}
