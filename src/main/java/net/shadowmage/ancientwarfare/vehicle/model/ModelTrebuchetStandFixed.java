package net.shadowmage.ancientwarfare.vehicle.model;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.shadowmage.ancientwarfare.core.util.Trig;

@SideOnly(Side.CLIENT)
public class ModelTrebuchetStandFixed extends ModelVehicleBase {

	ModelRenderer turretMidBeam;
	ModelRenderer upright1;
	ModelRenderer upright2;
	ModelRenderer turretFrontBeam;
	ModelRenderer turretRearBeam;
	ModelRenderer turretLeftBeam1;
	ModelRenderer turretLeftBeam2;
	ModelRenderer turretRightBeam1;
	ModelRenderer turretRightBeam2;
	ModelRenderer trebuchetAxle;
	ModelRenderer trebBeamFront;
	ModelRenderer trebuchetWeightAxle;
	ModelRenderer trebuchetWeightSide1;
	ModelRenderer trebuchetWeight1;
	ModelRenderer trebuchetWeightSide2;
	ModelRenderer trebuchetArm2;
	ModelRenderer trebuchetSlingString;
	ModelRenderer trebuchetSlingPouchT3;
	ModelRenderer trebuchetRFAngle;
	ModelRenderer trebuchetLFAngle;
	ModelRenderer trebuchetLeftAngle;
	ModelRenderer trebuchetRightAngle;
	ModelRenderer trebuchetRRAngle;
	ModelRenderer trebuchetLRAngle;
	ModelRenderer flagPole;
	ModelRenderer flagCloth;

	public ModelTrebuchetStandFixed() {
		turretMidBeam = new ModelRenderer(this, "turretMidBeam");
		turretMidBeam.setTextureOffset(0, 128);
		turretMidBeam.setTextureSize(256, 256);
		turretMidBeam.setRotationPoint(0.0f, -1.0f, 0.0f);
		setPieceRotation(turretMidBeam, 0.0f, 0.0f, 0.0f);
		turretMidBeam.addBox(-21.0f, -1.0f, -1.5f, 42, 2, 3);
		upright1 = new ModelRenderer(this, "upright1");
		upright1.setTextureOffset(0, 140);
		upright1.setTextureSize(256, 256);
		upright1.setRotationPoint(-6.0f, -1.0f, -1.5f);
		setPieceRotation(upright1, 0.0f, 0.0f, 0.0f);
		upright1.addBox(-2.5f, -33.0f, 0.0f, 3, 33, 3);
		turretMidBeam.addChild(upright1);
		upright2 = new ModelRenderer(this, "upright2");
		upright2.setTextureOffset(0, 140);
		upright2.setTextureSize(256, 256);
		upright2.setRotationPoint(5.0f, -1.0f, -1.5f);
		setPieceRotation(upright2, 1.4564162E-8f, 0.0f, 1.0402973E-9f);
		upright2.addBox(0.5f, -33.0f, 0.0f, 3, 33, 3);
		turretMidBeam.addChild(upright2);
		turretFrontBeam = new ModelRenderer(this, "turretFrontBeam");
		turretFrontBeam.setTextureOffset(0, 134);
		turretFrontBeam.setTextureSize(256, 256);
		turretFrontBeam.setRotationPoint(0.0f, 0.0f, -18.0f);
		setPieceRotation(turretFrontBeam, 0.0f, 0.0f, 0.0f);
		turretFrontBeam.addBox(-15.0f, -1.0f, -1.5f, 30, 2, 3);
		turretMidBeam.addChild(turretFrontBeam);
		turretRearBeam = new ModelRenderer(this, "turretRearBeam");
		turretRearBeam.setTextureOffset(0, 134);
		turretRearBeam.setTextureSize(256, 256);
		turretRearBeam.setRotationPoint(0.0f, 0.0f, 18.0f);
		setPieceRotation(turretRearBeam, 0.0f, 0.0f, 0.0f);
		turretRearBeam.addBox(-15.0f, -1.0f, -1.5f, 30, 2, 3);
		turretMidBeam.addChild(turretRearBeam);
		turretLeftBeam1 = new ModelRenderer(this, "turretLeftBeam1");
		turretLeftBeam1.setTextureOffset(13, 140);
		turretLeftBeam1.setTextureSize(256, 256);
		turretLeftBeam1.setRotationPoint(12.0f, 0.0f, -16.5f);
		setPieceRotation(turretLeftBeam1, 0.0f, 0.0f, 0.0f);
		turretLeftBeam1.addBox(0.0f, -1.0f, 0.0f, 3, 2, 15);
		turretMidBeam.addChild(turretLeftBeam1);
		turretLeftBeam2 = new ModelRenderer(this, "turretLeftBeam2");
		turretLeftBeam2.setTextureOffset(13, 140);
		turretLeftBeam2.setTextureSize(256, 256);
		turretLeftBeam2.setRotationPoint(12.0f, 0.0f, 1.5f);
		setPieceRotation(turretLeftBeam2, 0.0f, 0.0f, 0.0f);
		turretLeftBeam2.addBox(0.0f, -1.0f, 0.0f, 3, 2, 15);
		turretMidBeam.addChild(turretLeftBeam2);
		turretRightBeam1 = new ModelRenderer(this, "turretRightBeam1");
		turretRightBeam1.setTextureOffset(13, 140);
		turretRightBeam1.setTextureSize(256, 256);
		turretRightBeam1.setRotationPoint(-15.0f, 0.0f, -16.5f);
		setPieceRotation(turretRightBeam1, 0.0f, 0.0f, 0.0f);
		turretRightBeam1.addBox(0.0f, -1.0f, 0.0f, 3, 2, 15);
		turretMidBeam.addChild(turretRightBeam1);
		turretRightBeam2 = new ModelRenderer(this, "turretRightBeam2");
		turretRightBeam2.setTextureOffset(13, 140);
		turretRightBeam2.setTextureSize(256, 256);
		turretRightBeam2.setRotationPoint(-15.0f, 0.0f, 1.5f);
		setPieceRotation(turretRightBeam2, 0.0f, 0.0f, 0.0f);
		turretRightBeam2.addBox(0.0f, -1.0f, 0.0f, 3, 2, 15);
		turretMidBeam.addChild(turretRightBeam2);
		trebuchetAxle = new ModelRenderer(this, "trebuchetAxle");
		trebuchetAxle.setTextureOffset(67, 134);
		trebuchetAxle.setTextureSize(256, 256);
		trebuchetAxle.setRotationPoint(0.0f, -33.0f, 0.0f);
		setPieceRotation(trebuchetAxle, 0.0f, 0.0f, 0.0f);
		trebuchetAxle.addBox(-6.0f, -0.5f, -0.5f, 12, 1, 1);
		trebBeamFront = new ModelRenderer(this, "trebBeamFront");
		trebBeamFront.setTextureOffset(94, 128);
		trebBeamFront.setTextureSize(256, 256);
		trebBeamFront.setRotationPoint(0.0f, 0.0f, 0.0f);
		setPieceRotation(trebBeamFront, 0.0f, 0.0f, 0.0f);
		trebBeamFront.addBox(-1.5f, -1.5f, -10.5f, 3, 3, 40);
		trebuchetWeightAxle = new ModelRenderer(this, "trebuchetWeightAxle");
		trebuchetWeightAxle.setTextureOffset(67, 137);
		trebuchetWeightAxle.setTextureSize(256, 256);
		trebuchetWeightAxle.setRotationPoint(0.0f, 0.0f, -9.0f);
		setPieceRotation(trebuchetWeightAxle, 0.0f, 0.0f, 0.0f);
		trebuchetWeightAxle.addBox(-3.5f, -0.5f, -0.5f, 7, 1, 1);
		trebuchetWeightSide1 = new ModelRenderer(this, "trebuchetWeightSide1");
		trebuchetWeightSide1.setTextureOffset(50, 140);
		trebuchetWeightSide1.setTextureSize(256, 256);
		trebuchetWeightSide1.setRotationPoint(-3.0f, 0.0f, 0.0f);
		setPieceRotation(trebuchetWeightSide1, 0.0f, 0.0f, 0.0f);
		trebuchetWeightSide1.addBox(0.0f, -2.0f, -1.0f, 1, 7, 2);
		trebuchetWeight1 = new ModelRenderer(this, "trebuchetWeight1");
		trebuchetWeight1.setTextureOffset(13, 158);
		trebuchetWeight1.setTextureSize(256, 256);
		trebuchetWeight1.setRotationPoint(0.0f, 5.0f, 0.0f);
		setPieceRotation(trebuchetWeight1, -1.0402973E-9f, 0.0f, 0.0f);
		trebuchetWeight1.addBox(-2.0f, 0.0f, -6.0f, 10, 15, 12);
		trebuchetWeightSide1.addChild(trebuchetWeight1);
		trebuchetWeightAxle.addChild(trebuchetWeightSide1);
		trebuchetWeightSide2 = new ModelRenderer(this, "trebuchetWeightSide2");
		trebuchetWeightSide2.setTextureOffset(50, 140);
		trebuchetWeightSide2.setTextureSize(256, 256);
		trebuchetWeightSide2.setRotationPoint(2.0f, 0.0f, 0.0f);
		setPieceRotation(trebuchetWeightSide2, 0.0f, 0.0f, 0.0f);
		trebuchetWeightSide2.addBox(0.0f, -2.0f, -1.0f, 1, 7, 2);
		trebuchetWeightAxle.addChild(trebuchetWeightSide2);
		trebBeamFront.addChild(trebuchetWeightAxle);
		trebuchetArm2 = new ModelRenderer(this, "trebuchetArm2");
		trebuchetArm2.setTextureOffset(94, 172);
		trebuchetArm2.setTextureSize(256, 256);
		trebuchetArm2.setRotationPoint(0.0f, -1.0f, 28.5f);
		setPieceRotation(trebuchetArm2, 0.0f, 0.0f, 0.0f);
		trebuchetArm2.addBox(-1.0f, 0.0f, 0.0f, 2, 2, 40);
		trebuchetSlingString = new ModelRenderer(this, "trebuchetSlingString");
		trebuchetSlingString.setTextureOffset(58, 140);
		trebuchetSlingString.setTextureSize(256, 256);
		trebuchetSlingString.setRotationPoint(0.0f, 1.0f, 39.0f);
		setPieceRotation(trebuchetSlingString, 0.0f, -1.0402973E-9f, 0.0f);
		trebuchetSlingString.addBox(-0.5f, -0.5f, -0.5f, 1, 24, 1);
		trebuchetSlingPouchT3 = new ModelRenderer(this, "trebuchetSlingPouchT3");
		trebuchetSlingPouchT3.setTextureOffset(63, 149);
		trebuchetSlingPouchT3.setTextureSize(256, 256);
		trebuchetSlingPouchT3.setRotationPoint(0.0f, 23.0f, 0.0f);
		setPieceRotation(trebuchetSlingPouchT3, 0.0f, 0.0f, 0.0f);
		trebuchetSlingPouchT3.addBox(-3.0f, -2.0f, -3.0f, 6, 6, 6);
		trebuchetSlingString.addChild(trebuchetSlingPouchT3);
		trebuchetArm2.addChild(trebuchetSlingString);
		trebBeamFront.addChild(trebuchetArm2);
		trebuchetAxle.addChild(trebBeamFront);
		turretMidBeam.addChild(trebuchetAxle);
		trebuchetRFAngle = new ModelRenderer(this, "trebuchetRFAngle");
		trebuchetRFAngle.setTextureOffset(0, 177);
		trebuchetRFAngle.setTextureSize(256, 256);
		trebuchetRFAngle.setRotationPoint(-8.0f, -33.0f, 0.0f);
		setPieceRotation(trebuchetRFAngle, -0.5061452f, 0.366519f, 0.0f);
		trebuchetRFAngle.addBox(0.0f, 0.0f, -1.0f, 2, 38, 2);
		turretMidBeam.addChild(trebuchetRFAngle);
		trebuchetLFAngle = new ModelRenderer(this, "trebuchetLFAngle");
		trebuchetLFAngle.setTextureOffset(0, 177);
		trebuchetLFAngle.setTextureSize(256, 256);
		trebuchetLFAngle.setRotationPoint(8.0f, -33.0f, 0.0f);
		setPieceRotation(trebuchetLFAngle, -0.5061452f, -0.36651903f, 0.0f);
		trebuchetLFAngle.addBox(-2.0f, 0.0f, -1.0f, 2, 38, 2);
		turretMidBeam.addChild(trebuchetLFAngle);
		trebuchetLeftAngle = new ModelRenderer(this, "trebuchetLeftAngle");
		trebuchetLeftAngle.setTextureOffset(0, 218);
		trebuchetLeftAngle.setTextureSize(256, 256);
		trebuchetLeftAngle.setRotationPoint(8.0f, -34.0f, 1.0f);
		setPieceRotation(trebuchetLeftAngle, 5.0558447E-7f, 0.0f, -0.34906563f);
		trebuchetLeftAngle.addBox(-2.0f, 0.0f, -2.0f, 2, 36, 2);
		turretMidBeam.addChild(trebuchetLeftAngle);
		trebuchetRightAngle = new ModelRenderer(this, "trebuchetRightAngle");
		trebuchetRightAngle.setTextureOffset(0, 218);
		trebuchetRightAngle.setTextureSize(256, 256);
		trebuchetRightAngle.setRotationPoint(-8.0f, -34.0f, 1.0f);
		setPieceRotation(trebuchetRightAngle, 5.0558447E-7f, 0.0f, 0.34906584f);
		trebuchetRightAngle.addBox(0.0f, 0.0f, -2.0f, 2, 36, 2);
		turretMidBeam.addChild(trebuchetRightAngle);
		trebuchetRRAngle = new ModelRenderer(this, "trebuchetRRAngle");
		trebuchetRRAngle.setTextureOffset(0, 177);
		trebuchetRRAngle.setTextureSize(256, 256);
		trebuchetRRAngle.setRotationPoint(-8.0f, -33.0f, 0.0f);
		setPieceRotation(trebuchetRRAngle, 0.5061455f, -0.36651894f, -1.2483568E-8f);
		trebuchetRRAngle.addBox(0.0f, 0.0f, -1.0f, 2, 38, 2);
		turretMidBeam.addChild(trebuchetRRAngle);
		trebuchetLRAngle = new ModelRenderer(this, "trebuchetLRAngle");
		trebuchetLRAngle.setTextureOffset(0, 177);
		trebuchetLRAngle.setTextureSize(256, 256);
		trebuchetLRAngle.setRotationPoint(8.0f, -33.0f, 0.0f);
		setPieceRotation(trebuchetLRAngle, 0.5061455f, 0.34906572f, 0.0f);
		trebuchetLRAngle.addBox(-2.0f, 0.0f, -1.0f, 2, 38, 2);
		turretMidBeam.addChild(trebuchetLRAngle);
		flagPole = new ModelRenderer(this, "flagPole");
		flagPole.setTextureOffset(19, 78);
		flagPole.setTextureSize(256, 256);
		flagPole.setRotationPoint(-7.5f, -51.0f, -0.5f);
		setPieceRotation(flagPole, 0.0f, 0.0f, 0.0f);
		flagPole.addBox(0.0f, 0.0f, 0.0f, 1, 16, 1);
		flagCloth = new ModelRenderer(this, "flagCloth");
		flagCloth.setTextureOffset(24, 78);
		flagCloth.setTextureSize(256, 256);
		flagCloth.setRotationPoint(-7.5f, -51.0f, 0.5f);
		setPieceRotation(flagCloth, 0.0f, 0.0f, 0.0f);
		flagCloth.addBox(0.0f, 0.0f, 0.0f, 1, 8, 11);

		setArmRotations(-27.f, -64.f);
	}

	@Override
	public void render(Entity entity, float f1, float f2, float f3, float f4, float f5, float f6) {
		super.render(entity, f1, f2, f3, f4, f5, f6);
		setRotationAngles(f1, f2, f3, f4, f5, f6, entity);
		turretMidBeam.render(f6);
		flagPole.render(f6);
	}

	public void setArmRotations(float main, float string) {
		trebuchetAxle.rotateAngleX = Trig.toRadians(main);
		trebuchetWeightAxle.rotateAngleX = Trig.toRadians(-main);
		trebuchetSlingString.rotateAngleX = Trig.toRadians(string);
	}

	public void setPieceRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	@Override
	public void renderFlag() {
		flagCloth.render(0.0625f);
	}
}
