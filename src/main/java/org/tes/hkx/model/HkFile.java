package org.tes.hkx.model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.namespace.QName;

import org.tes.hkx.lib.HkobjectType;
import org.tes.hkx.lib.HkpackfileType;
import org.tes.hkx.lib.HksectionType;
import org.tes.hkx.lib.ext.*;
import org.tes.hkx.model.visitors.HkTreeReferencedList;

public class HkFile {

	File thisFile = null;
	HkpackfileType hkx = null;
	JAXBContext context = JAXBContext.newInstance(new Class[] { HkpackfileType.class, HksectionType.class,
			BSiStateTaggingGenerator.class, hkbBehaviorGraphStringData.class, hkbStateMachine.class, Unnamed1.class,
			hkbPoweredRagdollControlsModifier.class, Unnamed2.class, Unnamed3.class, BSTimerModifier.class,
			Unnamed4.class, BSCyclicBlendTransitionGenerator.class, Unnamed5.class, Unnamed6.class,
			hkpMoppBvTreeShape.class, Unnamed7.class, BSModifyOnceModifier.class, hkpPhysicsSystem.class,
			BSLimbIKModifier.class, hkaRagdollInstance.class, BSOffsetAnimationGenerator.class, hkbTimerModifier.class,
			Unnamed8.class, BSIStateManagerModifier.class, Unnamed9.class, BSRagdollContactListenerModifier.class,
			Unnamed10.class, hkRootLevelContainer.class, Unnamed11.class, hkbFootIkModifier.class, Unnamed12.class,
			Unnamed13.class, Unnamed14.class, hkbEventRangeDataArray.class, Unnamed15.class, Unnamed16.class,
			BSTweenerModifier.class, hkbPoseMatchingGenerator.class, hkbStateMachineTransitionInfoArray.class,
			Unnamed17.class, Unnamed18.class, Unnamed19.class, hkbModifierList.class, hkbStringEventPayload.class,
			hkpLimitedHingeConstraintData.class, Unnamed20.class, Unnamed21.class, Unnamed22.class, Unnamed23.class,
			Unnamed24.class, Unnamed25.class, Unnamed26.class, Unnamed27.class, hkbManualSelectorGenerator.class,
			hkpShapeInfo.class, hkaSkeletonMapper.class, Unnamed28.class, Unnamed29.class,
			BSEventEveryNEventsModifier.class, Unnamed30.class, Unnamed31.class, hkbStateMachineStateInfo.class,
			hkbProjectStringData.class, hkbProjectData.class, hkbVariableBindingSet.class, Unnamed32.class,
			hkpRagdollConstraintData.class, Unnamed33.class, Unnamed34.class, Unnamed35.class, Unnamed36.class,
			Unnamed37.class, Unnamed38.class, Unnamed39.class, Unnamed40.class, Unnamed41.class, hkbClipGenerator.class,
			hkbEventDrivenModifier.class, hkbBlenderGeneratorChild.class, BGSGamebryoSequenceGenerator.class,
			hkbDampingModifier.class, hkbModifierGenerator.class, hkbBoneIndexArray.class, hkbBlenderGenerator.class,
			BSBoneSwitchGenerator.class, BSEventOnDeactivateModifier.class, Unnamed42.class, hkaSkeleton.class,
			Unnamed43.class, hkpRigidBody.class, Unnamed44.class, Unnamed45.class, Unnamed46.class, Unnamed47.class,
			Unnamed48.class, Unnamed49.class, Unnamed50.class, Unnamed51.class, hkbGetUpModifier.class,
			hkpCapsuleShape.class, hkbKeyframeBonesModifier.class, hkbClipTriggerArray.class, Unnamed52.class,
			Unnamed53.class, hkbExpressionDataArray.class, Unnamed54.class, BSGetTimeStepModifier.class,
			hkbBehaviorGraph.class, hkpConvexTranslateShape.class, Unnamed55.class, BSPassByTargetTriggerModifier.class,
			Unnamed56.class, hkbFootIkControlsModifier.class, Unnamed57.class, Unnamed58.class, Unnamed59.class,
			Unnamed60.class, hkbMirroredSkeletonInfo.class, hkbBoneWeightArray.class, BSDecomposeVectorModifier.class,
			hkbBehaviorGraphData.class, Unnamed61.class, Unnamed62.class, Unnamed63.class, Unnamed64.class,
			Unnamed65.class, hkpPhysicsData.class, hkMemoryResourceContainer.class, hkbTransformVectorModifier.class,
			hkpConstraintInstance.class, hkbCharacterData.class, Unnamed66.class, Unnamed67.class, Unnamed68.class,
			hkaAnimationContainer.class, hkbReferencePoseGenerator.class, hkbTwistModifier.class,
			hkbFootIkDriverInfo.class, Unnamed69.class, hkpListShape.class, Unnamed70.class,
			BSSynchronizedClipGenerator.class, hkpConvexVerticesShape.class, Unnamed71.class,
			hkbBlendingTransitionEffect.class, hkMemoryResourceHandle.class, BSLookAtModifier.class, Unnamed72.class,
			Unnamed73.class, Unnamed74.class, hkpPositionConstraintMotor.class, hkbVariableValueSet.class,
			Unnamed75.class, hkpConvexTransformShape.class, Unnamed76.class, hkbRotateCharacterModifier.class,
			hkbStateMachineEventPropertyArray.class, Unnamed77.class, hkbEvaluateExpressionModifier.class,
			hkbBehaviorReferenceGenerator.class, hkbRigidBodyRagdollControlsModifier.class, Unnamed78.class,
			Unnamed79.class, hkpConvexVerticesConnectivity.class, hkpMoppCode.class, Unnamed80.class, hkpBoxShape.class,
			BSDirectAtModifier.class, BSSpeedSamplerModifier.class, BSInterpValueModifier.class,
			hkbCharacterStringData.class, BSIsActiveModifier.class, hkbExpressionCondition.class,
			BSEventOnFalseToTrueModifier.class, Unnamed81.class, Unnamed82.class, Unnamed83.class,
			hkbStringCondition.class, BSBoneSwitchGeneratorBoneData.class, hkbEventsFromRangeModifier.class });

	Marshaller marshaller = context.createMarshaller();

	JAXBElement<HkpackfileType> wrapper = null;
	hkRootLevelContainer root;
	ArrayList<HkobjectType> variants;

	public HkFile(File f) throws Exception {
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		thisFile = f;
		load(f);
	}

	public HkFile(HkpackfileType hkxpackfile, String outFilePath) throws JAXBException {
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		thisFile = new File(outFilePath);
		hkx = hkxpackfile;
		for (HkobjectType o : hkx.getHksection().getHkobject())
			if (o instanceof hkRootLevelContainer)
			{
				root = (hkRootLevelContainer) o;
				// Fix for double signature
				o.setSignature(null);
			}
		if (root == null)
			throw new JAXBException("Unable to find hkRootLevelContainer");
		wrapper = new JAXBElement<HkpackfileType>(new QName("hkpackfile"), HkpackfileType.class, hkxpackfile);
	}

	public HkFile(String outFilePath) throws JAXBException {
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		thisFile = new File(outFilePath);
		hkx = new HkpackfileType();
		hkx.setHksection(new HksectionType());
	}

	public void setHkClassVersion(Byte version) {
		hkx.setClassversion(version);
	}

	public void setHkContentsVersion(String version) {
		hkx.setContentsversion(version);
	}

	public void setOutputFile(File f) {
		thisFile = f;
	}

	public void load(File f) throws JAXBException, IOException {
		Unmarshaller unmarshaller = context.createUnmarshaller();
		wrapper = (JAXBElement<HkpackfileType>) unmarshaller.unmarshal(f);
		hkx = wrapper.getValue();
		String key = hkx.getToplevelobject();
		for (HkobjectType o : hkx.getHksection().getHkobject())
			if (o.getKey()
					.equals(key))/* && o instanceof hkRootLevelContainer) */
			{
				root = (hkRootLevelContainer) o;
				// Fix for double signature
				o.setSignature(null);
			}
		if (root == null)
			// TODO: better exception
			throw new IOException("Malformed HKX file: Unable to find hkRootLevelContainer");
	}

	public void save() throws JAXBException, IOException {
		setKeys();
		marshaller.marshal(wrapper, new FileWriter(thisFile));
	}

	public void save(File f) throws JAXBException, IOException {
		setKeys();
		marshaller.marshal(wrapper, new FileWriter(f));
	}

	public List<HkobjectType> getObjects() {
		return hkx.getHksection().getHkobject();
	}

	public HkobjectType getObject(String key) {
		for (HkobjectType o : hkx.getHksection().getHkobject())
			if (o.getKey().equals(key))
				return o;
		return null;
	}

	public <T extends HkobjectType> T getTypedObject(String key) {
		for (HkobjectType o : hkx.getHksection().getHkobject())
			if (o.getKey().equals(key))
				return (T) o;
		return null;
	}

	public hkRootLevelContainer getRoot() {
		return root;
	}

	public void out() throws JAXBException {
		setKeys();
		//marshaller.marshal(wrapper, System.out);
		
	}

	private int counter;
	
	private void setKeys() {
		List<HkobjectType> referenced = root.accept(new HkTreeReferencedList());
		//reset and remove unreferenced
		List<HkobjectType> unreferenced = new ArrayList<>();
		for (HkobjectType o : hkx.getHksection().getHkobject()) {
			o.setKey("-1");
			if (!referenced.contains(o)) {
				System.out.println("Removing Unreferenced "+o);
				unreferenced.add(o);
//				hkx.getHksection().getHkobject().remove(o);
			}
		}
		for (HkobjectType o : unreferenced) {
			 hkx.getHksection().getHkobject().remove(o);
		}
		
		//remove unreferenced
		
		counter = 100;
		
		try {
			visit(root);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		hkx.setToplevelobject(root.getKey());

	}

	private void visit(Object obj) throws Exception {
		
		if (obj instanceof HkobjectType ) {
			HkobjectType hkobj = (HkobjectType) obj;
			if (hkobj.getKey().equals("-1"))
				hkobj.setKey("#"+String.format("%04d",counter++));
		}

		for (Method m : obj.getClass().getMethods()) {

			if (m.getName().toLowerCase().contains("hkparam"))
				continue;

			Type c = m.getReturnType();
			String methodName = m.getName();

			// Type c1 = m.getParameterTypes()[0];
			if (methodName.contains("get") && (c.toString().contains("HkobjectType") || c.toString().contains("Unnamed")
					|| c.toString().contains("hk") || c.toString().contains("BS"))) {

				// Array
				if (m.getParameterTypes().length > 0 && m.getParameterTypes()[0].toString().contains("int")) {
					// get num method
					String getNumMethodName = "getNum" + methodName.substring(3, methodName.length() - 2);

					Method getNumElems = obj.getClass().getDeclaredMethod(getNumMethodName, null);
					Integer numElems = (Integer) getNumElems.invoke(obj);

					for (int i = 0; i < numElems; i++) {
						Object out = m.invoke(obj, i);
						if (out != null) {
							visit(out);
						}
					}
				} else {
					// invoke method
					Object out = m.invoke(obj);
					if (out != null) {
						visit(out);
					}
				}
			}
		}
	}

}
