package net.shadowmage.ancientwarfare.vehicle.model;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.shadowmage.ancientwarfare.core.util.Trig;

@SideOnly(Side.CLIENT)
public class ModelCannonStandTurret extends ModelVehicleBase {

	ModelRenderer cannonBaseMid;
	ModelRenderer cannonBaseMid2;
	ModelRenderer cannonBaseLeft1;
	ModelRenderer cannonBaseLeft2;
	ModelRenderer cannonBaseLeft3;
	ModelRenderer cannonBaseLeft4;
	ModelRenderer cannonBaseTopLeft;
	ModelRenderer cannonBaseTopLeft2;
	ModelRenderer cannonBaseTopLeft4;
	ModelRenderer cannonBaseTopLeft3;
	ModelRenderer cannonBaseLeft2copy10;
	ModelRenderer cannonBaseLeft1copy9;
	ModelRenderer cannonBaseLeft3copy11;
	ModelRenderer cannonBaseLeft4copy12;
	ModelRenderer cannonBaseTopLeftcopy13;
	ModelRenderer cannonBaseTopLeft2copy14;
	ModelRenderer cannonBaseTopLeft4copy15;
	ModelRenderer cannonBaseTopLeft3copy16;
	ModelRenderer axleRight;
	ModelRenderer cannonRightPanel;
	ModelRenderer cannonFlareRearRight;
	ModelRenderer cannonFlareRearTopRight;
	ModelRenderer cannonFlareRearTop;
	ModelRenderer cannonFlareRearTopLeft;
	ModelRenderer cannonFlareRearLeft;
	ModelRenderer cannonFlareRearBottomLeft;
	ModelRenderer cannonFlareRearBottom;
	ModelRenderer cannonFlareRearBottomRight;
	ModelRenderer cannonBottomRear;
	ModelRenderer cannonRightSide;
	ModelRenderer cannonBottomPanel;
	ModelRenderer cannonRearBreech;
	ModelRenderer cannonTopRear;
	ModelRenderer cannonLeftPanel;
	ModelRenderer cannonLeftSide;
	ModelRenderer cannonTopPanel;
	ModelRenderer cannonBottomFront;
	ModelRenderer cannonTopFront;
	ModelRenderer axleLeft;
	ModelRenderer cannonFlareLipTop;
	ModelRenderer cannonFlareLipTR;
	ModelRenderer cannonFlareLipRight;
	ModelRenderer cannonFlareLipBR;
	ModelRenderer cannonFlareLipBottom;
	ModelRenderer cannonFlareLipBL;
	ModelRenderer cannonFlareLipLeft;
	ModelRenderer cannonFlareLipTL;
	ModelRenderer chairBrace;
	ModelRenderer chairBottom;
	ModelRenderer chairBack;
	ModelRenderer cannonBaseMidChairBrace;
	ModelRenderer cannonBaseMidcopy17;
	ModelRenderer flagPole;
	ModelRenderer flagCloth;

	public ModelCannonStandTurret() {
		cannonBaseMid = new ModelRenderer(this, "cannonBaseMid");
		cannonBaseMid.setTextureOffset(134, 155);
		cannonBaseMid.setTextureSize(256, 256);
		cannonBaseMid.setRotationPoint(0.0f, -2.0f, 0.0f);
		setPieceRotation(cannonBaseMid, 0.0f, 3.1415846f, 0.0f);
		cannonBaseMid.addBox(-8.0f, -2.0f, -21.5f, 16, 2, 28);
		cannonBaseMid2 = new ModelRenderer(this, "cannonBaseMid2");
		cannonBaseMid2.setTextureOffset(134, 186);
		cannonBaseMid2.setTextureSize(256, 256);
		cannonBaseMid2.setRotationPoint(0.0f, -2.0f, -3.0f);
		setPieceRotation(cannonBaseMid2, 0.0f, 0.0f, 0.0f);
		cannonBaseMid2.addBox(-6.0f, -2.0f, -14.5f, 12, 2, 24);
		cannonBaseLeft1 = new ModelRenderer(this, "cannonBaseLeft1");
		cannonBaseLeft1.setTextureOffset(134, 213);
		cannonBaseLeft1.setTextureSize(256, 256);
		cannonBaseLeft1.setRotationPoint(-2.0f, 0.0f, -1.0f);
		setPieceRotation(cannonBaseLeft1, 0.0f, 0.0f, 0.0f);
		cannonBaseLeft1.addBox(-6.0f, -2.0f, -14.5f, 2, 2, 25);
		cannonBaseMid2.addChild(cannonBaseLeft1);
		cannonBaseLeft2 = new ModelRenderer(this, "cannonBaseLeft2");
		cannonBaseLeft2.setTextureOffset(189, 213);
		cannonBaseLeft2.setTextureSize(256, 256);
		cannonBaseLeft2.setRotationPoint(-2.0f, -2.0f, 2.0f);
		setPieceRotation(cannonBaseLeft2, 0.0f, 0.0f, 0.0f);
		cannonBaseLeft2.addBox(-6.0f, -2.0f, -14.5f, 2, 2, 22);
		cannonBaseMid2.addChild(cannonBaseLeft2);
		cannonBaseLeft3 = new ModelRenderer(this, "cannonBaseLeft3");
		cannonBaseLeft3.setTextureOffset(207, 190);
		cannonBaseLeft3.setTextureSize(256, 256);
		cannonBaseLeft3.setRotationPoint(-2.0f, -4.0f, 4.0f);
		setPieceRotation(cannonBaseLeft3, 0.0f, 0.0f, 0.0f);
		cannonBaseLeft3.addBox(-6.0f, -2.0f, -14.5f, 2, 2, 20);
		cannonBaseMid2.addChild(cannonBaseLeft3);
		cannonBaseLeft4 = new ModelRenderer(this, "cannonBaseLeft4");
		cannonBaseLeft4.setTextureOffset(93, 213);
		cannonBaseLeft4.setTextureSize(256, 256);
		cannonBaseLeft4.setRotationPoint(-2.0f, -6.0f, 6.0f);
		setPieceRotation(cannonBaseLeft4, 0.0f, 0.0f, 0.0f);
		cannonBaseLeft4.addBox(-6.0f, -2.0f, -14.5f, 2, 2, 18);
		cannonBaseMid2.addChild(cannonBaseLeft4);
		cannonBaseTopLeft = new ModelRenderer(this, "cannonBaseTopLeft");
		cannonBaseTopLeft.setTextureOffset(204, 128);
		cannonBaseTopLeft.setTextureSize(256, 256);
		cannonBaseTopLeft.setRotationPoint(-8.0f, -9.0f, -4.5f);
		setPieceRotation(cannonBaseTopLeft, 0.0f, 0.0f, 0.0f);
		cannonBaseTopLeft.addBox(0.0f, 0.0f, 0.0f, 2, 1, 14);
		cannonBaseMid2.addChild(cannonBaseTopLeft);
		cannonBaseTopLeft2 = new ModelRenderer(this, "cannonBaseTopLeft2");
		cannonBaseTopLeft2.setTextureOffset(204, 144);
		cannonBaseTopLeft2.setTextureSize(256, 256);
		cannonBaseTopLeft2.setRotationPoint(-8.0f, -10.0f, -0.5f);
		setPieceRotation(cannonBaseTopLeft2, 0.0f, 0.0f, 0.0f);
		cannonBaseTopLeft2.addBox(0.0f, 0.0f, 0.0f, 2, 1, 3);
		cannonBaseMid2.addChild(cannonBaseTopLeft2);
		cannonBaseTopLeft4 = new ModelRenderer(this, "cannonBaseTopLeft4");
		cannonBaseTopLeft4.setTextureOffset(204, 144);
		cannonBaseTopLeft4.setTextureSize(256, 256);
		cannonBaseTopLeft4.setRotationPoint(-8.0f, -11.0f, 1.5f);
		setPieceRotation(cannonBaseTopLeft4, 0.0f, 0.0f, 0.0f);
		cannonBaseTopLeft4.addBox(0.0f, 0.0f, 0.0f, 2, 1, 3);
		cannonBaseMid2.addChild(cannonBaseTopLeft4);
		cannonBaseTopLeft3 = new ModelRenderer(this, "cannonBaseTopLeft3");
		cannonBaseTopLeft3.setTextureOffset(204, 144);
		cannonBaseTopLeft3.setTextureSize(256, 256);
		cannonBaseTopLeft3.setRotationPoint(-8.0f, -10.0f, 3.5f);
		setPieceRotation(cannonBaseTopLeft3, 0.0f, 0.0f, 0.0f);
		cannonBaseTopLeft3.addBox(0.0f, 0.0f, 0.0f, 2, 1, 3);
		cannonBaseMid2.addChild(cannonBaseTopLeft3);
		cannonBaseLeft2copy10 = new ModelRenderer(this, "cannonBaseLeft2copy10");
		cannonBaseLeft2copy10.setTextureOffset(189, 213);
		cannonBaseLeft2copy10.setTextureSize(256, 256);
		cannonBaseLeft2copy10.setRotationPoint(12.0f, -2.0f, 2.0f);
		setPieceRotation(cannonBaseLeft2copy10, 0.0f, 0.0f, 0.0f);
		cannonBaseLeft2copy10.addBox(-6.0f, -2.0f, -14.5f, 2, 2, 22);
		cannonBaseMid2.addChild(cannonBaseLeft2copy10);
		cannonBaseLeft1copy9 = new ModelRenderer(this, "cannonBaseLeft1copy9");
		cannonBaseLeft1copy9.setTextureOffset(134, 213);
		cannonBaseLeft1copy9.setTextureSize(256, 256);
		cannonBaseLeft1copy9.setRotationPoint(12.0f, 0.0f, -1.0f);
		setPieceRotation(cannonBaseLeft1copy9, 0.0f, 0.0f, 0.0f);
		cannonBaseLeft1copy9.addBox(-6.0f, -2.0f, -14.5f, 2, 2, 25);
		cannonBaseMid2.addChild(cannonBaseLeft1copy9);
		cannonBaseLeft3copy11 = new ModelRenderer(this, "cannonBaseLeft3copy11");
		cannonBaseLeft3copy11.setTextureOffset(207, 190);
		cannonBaseLeft3copy11.setTextureSize(256, 256);
		cannonBaseLeft3copy11.setRotationPoint(12.0f, -4.0f, 4.0f);
		setPieceRotation(cannonBaseLeft3copy11, 0.0f, 0.0f, 0.0f);
		cannonBaseLeft3copy11.addBox(-6.0f, -2.0f, -14.5f, 2, 2, 20);
		cannonBaseMid2.addChild(cannonBaseLeft3copy11);
		cannonBaseLeft4copy12 = new ModelRenderer(this, "cannonBaseLeft4copy12");
		cannonBaseLeft4copy12.setTextureOffset(93, 213);
		cannonBaseLeft4copy12.setTextureSize(256, 256);
		cannonBaseLeft4copy12.setRotationPoint(12.0f, -6.0f, 6.0f);
		setPieceRotation(cannonBaseLeft4copy12, 0.0f, 0.0f, 0.0f);
		cannonBaseLeft4copy12.addBox(-6.0f, -2.0f, -14.5f, 2, 2, 18);
		cannonBaseMid2.addChild(cannonBaseLeft4copy12);
		cannonBaseTopLeftcopy13 = new ModelRenderer(this, "cannonBaseTopLeftcopy13");
		cannonBaseTopLeftcopy13.setTextureOffset(204, 128);
		cannonBaseTopLeftcopy13.setTextureSize(256, 256);
		cannonBaseTopLeftcopy13.setRotationPoint(6.0f, -9.0f, -4.5f);
		setPieceRotation(cannonBaseTopLeftcopy13, 0.0f, 0.0f, 0.0f);
		cannonBaseTopLeftcopy13.addBox(0.0f, 0.0f, 0.0f, 2, 1, 14);
		cannonBaseMid2.addChild(cannonBaseTopLeftcopy13);
		cannonBaseTopLeft2copy14 = new ModelRenderer(this, "cannonBaseTopLeft2copy14");
		cannonBaseTopLeft2copy14.setTextureOffset(204, 144);
		cannonBaseTopLeft2copy14.setTextureSize(256, 256);
		cannonBaseTopLeft2copy14.setRotationPoint(6.0f, -10.0f, -0.5f);
		setPieceRotation(cannonBaseTopLeft2copy14, 0.0f, 0.0f, 0.0f);
		cannonBaseTopLeft2copy14.addBox(0.0f, 0.0f, 0.0f, 2, 1, 3);
		cannonBaseMid2.addChild(cannonBaseTopLeft2copy14);
		cannonBaseTopLeft4copy15 = new ModelRenderer(this, "cannonBaseTopLeft4copy15");
		cannonBaseTopLeft4copy15.setTextureOffset(204, 144);
		cannonBaseTopLeft4copy15.setTextureSize(256, 256);
		cannonBaseTopLeft4copy15.setRotationPoint(6.0f, -11.0f, 1.5f);
		setPieceRotation(cannonBaseTopLeft4copy15, 0.0f, 0.0f, 0.0f);
		cannonBaseTopLeft4copy15.addBox(0.0f, 0.0f, 0.0f, 2, 1, 3);
		cannonBaseMid2.addChild(cannonBaseTopLeft4copy15);
		cannonBaseTopLeft3copy16 = new ModelRenderer(this, "cannonBaseTopLeft3copy16");
		cannonBaseTopLeft3copy16.setTextureOffset(204, 144);
		cannonBaseTopLeft3copy16.setTextureSize(256, 256);
		cannonBaseTopLeft3copy16.setRotationPoint(6.0f, -10.0f, 3.5f);
		setPieceRotation(cannonBaseTopLeft3copy16, 0.0f, 0.0f, 0.0f);
		cannonBaseTopLeft3copy16.addBox(0.0f, 0.0f, 0.0f, 2, 1, 3);
		cannonBaseMid2.addChild(cannonBaseTopLeft3copy16);
		axleRight = new ModelRenderer(this, "axleRight");
		axleRight.setTextureOffset(0, 207);
		axleRight.setTextureSize(256, 256);
		axleRight.setRotationPoint(5.5f, -9.5f, 3.0f);
		setPieceRotation(axleRight, -7.1052307E-7f, 0.0f, 0.0f);
		axleRight.addBox(-0.5f, -0.5f, -0.5f, 3, 1, 1);
		cannonRightPanel = new ModelRenderer(this, "cannonRightPanel");
		cannonRightPanel.setTextureOffset(0, 128);
		cannonRightPanel.setTextureSize(256, 256);
		cannonRightPanel.setRotationPoint(-1.5f, -3.0f, -9.0f);
		setPieceRotation(cannonRightPanel, 0.0f, 0.0f, 0.0f);
		cannonRightPanel.addBox(0.0f, 0.0f, 0.0f, 1, 6, 11);
		axleRight.addChild(cannonRightPanel);
		cannonFlareRearRight = new ModelRenderer(this, "cannonFlareRearRight");
		cannonFlareRearRight.setTextureOffset(0, 213);
		cannonFlareRearRight.setTextureSize(256, 256);
		cannonFlareRearRight.setRotationPoint(-1.0f, -3.5f, -5.0f);
		setPieceRotation(cannonFlareRearRight, 0.0f, 0.0f, 0.0f);
		cannonFlareRearRight.addBox(0.0f, 0.0f, 0.0f, 1, 7, 1);
		axleRight.addChild(cannonFlareRearRight);
		cannonFlareRearTopRight = new ModelRenderer(this, "cannonFlareRearTopRight");
		cannonFlareRearTopRight.setTextureOffset(65, 207);
		cannonFlareRearTopRight.setTextureSize(256, 256);
		cannonFlareRearTopRight.setRotationPoint(-3.0f, -4.5f, -5.0f);
		setPieceRotation(cannonFlareRearTopRight, 0.0f, 0.0f, 0.0f);
		cannonFlareRearTopRight.addBox(0.0f, 0.0f, 0.0f, 2, 2, 1);
		axleRight.addChild(cannonFlareRearTopRight);
		cannonFlareRearTop = new ModelRenderer(this, "cannonFlareRearTop");
		cannonFlareRearTop.setTextureOffset(72, 207);
		cannonFlareRearTop.setTextureSize(256, 256);
		cannonFlareRearTop.setRotationPoint(-9.0f, -5.5f, -5.0f);
		setPieceRotation(cannonFlareRearTop, 0.0f, 0.0f, 0.0f);
		cannonFlareRearTop.addBox(0.0f, 0.0f, 0.0f, 7, 1, 1);
		axleRight.addChild(cannonFlareRearTop);
		cannonFlareRearTopLeft = new ModelRenderer(this, "cannonFlareRearTopLeft");
		cannonFlareRearTopLeft.setTextureOffset(89, 207);
		cannonFlareRearTopLeft.setTextureSize(256, 256);
		cannonFlareRearTopLeft.setRotationPoint(-10.0f, -4.5f, -5.0f);
		setPieceRotation(cannonFlareRearTopLeft, 0.0f, 0.0f, 0.0f);
		cannonFlareRearTopLeft.addBox(0.0f, 0.0f, 0.0f, 2, 2, 1);
		axleRight.addChild(cannonFlareRearTopLeft);
		cannonFlareRearLeft = new ModelRenderer(this, "cannonFlareRearLeft");
		cannonFlareRearLeft.setTextureOffset(5, 213);
		cannonFlareRearLeft.setTextureSize(256, 256);
		cannonFlareRearLeft.setRotationPoint(-11.0f, -3.5f, -5.0f);
		setPieceRotation(cannonFlareRearLeft, 0.0f, 0.0f, 0.0f);
		cannonFlareRearLeft.addBox(0.0f, 0.0f, 0.0f, 1, 7, 1);
		axleRight.addChild(cannonFlareRearLeft);
		cannonFlareRearBottomLeft = new ModelRenderer(this, "cannonFlareRearBottomLeft");
		cannonFlareRearBottomLeft.setTextureOffset(89, 211);
		cannonFlareRearBottomLeft.setTextureSize(256, 256);
		cannonFlareRearBottomLeft.setRotationPoint(-10.0f, 2.5f, -5.0f);
		setPieceRotation(cannonFlareRearBottomLeft, 0.0f, 0.0f, 0.0f);
		cannonFlareRearBottomLeft.addBox(0.0f, 0.0f, 0.0f, 2, 2, 1);
		axleRight.addChild(cannonFlareRearBottomLeft);
		cannonFlareRearBottom = new ModelRenderer(this, "cannonFlareRearBottom");
		cannonFlareRearBottom.setTextureOffset(72, 211);
		cannonFlareRearBottom.setTextureSize(256, 256);
		cannonFlareRearBottom.setRotationPoint(-9.0f, 4.5f, -5.0f);
		setPieceRotation(cannonFlareRearBottom, 0.0f, 0.0f, 0.0f);
		cannonFlareRearBottom.addBox(0.0f, 0.0f, 0.0f, 7, 1, 1);
		axleRight.addChild(cannonFlareRearBottom);
		cannonFlareRearBottomRight = new ModelRenderer(this, "cannonFlareRearBottomRight");
		cannonFlareRearBottomRight.setTextureOffset(65, 211);
		cannonFlareRearBottomRight.setTextureSize(256, 256);
		cannonFlareRearBottomRight.setRotationPoint(-3.0f, 2.5f, -5.0f);
		setPieceRotation(cannonFlareRearBottomRight, 0.0f, 0.0f, 0.0f);
		cannonFlareRearBottomRight.addBox(0.0f, 0.0f, 0.0f, 2, 2, 1);
		axleRight.addChild(cannonFlareRearBottomRight);
		cannonBottomRear = new ModelRenderer(this, "cannonBottomRear");
		cannonBottomRear.setTextureOffset(106, 128);
		cannonBottomRear.setTextureSize(256, 256);
		cannonBottomRear.setRotationPoint(-9.5f, 3.0f, -10.0f);
		setPieceRotation(cannonBottomRear, 0.0f, 0.0f, 0.0f);
		cannonBottomRear.addBox(0.0f, 0.0f, 0.0f, 8, 1, 12);
		axleRight.addChild(cannonBottomRear);
		cannonRightSide = new ModelRenderer(this, "cannonRightSide");
		cannonRightSide.setTextureOffset(0, 146);
		cannonRightSide.setTextureSize(256, 256);
		cannonRightSide.setRotationPoint(-2.5f, -3.0f, -10.0f);
		setPieceRotation(cannonRightSide, 0.0f, 0.0f, 0.0f);
		cannonRightSide.addBox(0.0f, 0.0f, 0.0f, 1, 6, 32);
		axleRight.addChild(cannonRightSide);
		cannonBottomPanel = new ModelRenderer(this, "cannonBottomPanel");
		cannonBottomPanel.setTextureOffset(134, 142);
		cannonBottomPanel.setTextureSize(256, 256);
		cannonBottomPanel.setRotationPoint(-8.5f, 4.0f, -9.0f);
		setPieceRotation(cannonBottomPanel, 0.0f, 0.0f, 0.0f);
		cannonBottomPanel.addBox(0.0f, 0.0f, 0.0f, 6, 1, 11);
		axleRight.addChild(cannonBottomPanel);
		cannonRearBreech = new ModelRenderer(this, "cannonRearBreech");
		cannonRearBreech.setTextureOffset(50, 128);
		cannonRearBreech.setTextureSize(256, 256);
		cannonRearBreech.setRotationPoint(-8.5f, -3.0f, -11.0f);
		setPieceRotation(cannonRearBreech, 0.0f, 0.0f, 0.0f);
		cannonRearBreech.addBox(0.0f, 0.0f, 0.0f, 6, 6, 1);
		axleRight.addChild(cannonRearBreech);
		cannonTopRear = new ModelRenderer(this, "cannonTopRear");
		cannonTopRear.setTextureOffset(147, 128);
		cannonTopRear.setTextureSize(256, 256);
		cannonTopRear.setRotationPoint(-9.5f, -4.0f, -10.0f);
		setPieceRotation(cannonTopRear, 0.0f, 0.0f, 0.0f);
		cannonTopRear.addBox(0.0f, 0.0f, 0.0f, 8, 1, 12);
		axleRight.addChild(cannonTopRear);
		cannonLeftPanel = new ModelRenderer(this, "cannonLeftPanel");
		cannonLeftPanel.setTextureOffset(25, 128);
		cannonLeftPanel.setTextureSize(256, 256);
		cannonLeftPanel.setRotationPoint(-10.5f, -3.0f, -9.0f);
		setPieceRotation(cannonLeftPanel, 0.0f, 0.0f, 0.0f);
		cannonLeftPanel.addBox(0.0f, 0.0f, 0.0f, 1, 6, 11);
		axleRight.addChild(cannonLeftPanel);
		cannonLeftSide = new ModelRenderer(this, "cannonLeftSide");
		cannonLeftSide.setTextureOffset(67, 146);
		cannonLeftSide.setTextureSize(256, 256);
		cannonLeftSide.setRotationPoint(-9.5f, -3.0f, -10.0f);
		setPieceRotation(cannonLeftSide, 0.0f, 0.0f, 0.0f);
		cannonLeftSide.addBox(0.0f, 0.0f, 0.0f, 1, 6, 32);
		axleRight.addChild(cannonLeftSide);
		cannonTopPanel = new ModelRenderer(this, "cannonTopPanel");
		cannonTopPanel.setTextureOffset(169, 142);
		cannonTopPanel.setTextureSize(256, 256);
		cannonTopPanel.setRotationPoint(-8.5f, -5.0f, -9.0f);
		setPieceRotation(cannonTopPanel, 0.0f, 0.0f, 0.0f);
		cannonTopPanel.addBox(0.0f, 0.0f, 0.0f, 6, 1, 11);
		axleRight.addChild(cannonTopPanel);
		cannonBottomFront = new ModelRenderer(this, "cannonBottomFront");
		cannonBottomFront.setTextureOffset(0, 185);
		cannonBottomFront.setTextureSize(256, 256);
		cannonBottomFront.setRotationPoint(-8.5f, 3.0f, 2.0f);
		setPieceRotation(cannonBottomFront, 0.0f, 0.0f, 0.0f);
		cannonBottomFront.addBox(0.0f, 0.0f, 0.0f, 6, 1, 20);
		axleRight.addChild(cannonBottomFront);
		cannonTopFront = new ModelRenderer(this, "cannonTopFront");
		cannonTopFront.setTextureOffset(53, 185);
		cannonTopFront.setTextureSize(256, 256);
		cannonTopFront.setRotationPoint(-8.5f, -4.0f, 2.0f);
		setPieceRotation(cannonTopFront, 0.0f, 0.0f, 0.0f);
		cannonTopFront.addBox(0.0f, 0.0f, 0.0f, 6, 1, 20);
		axleRight.addChild(cannonTopFront);
		axleLeft = new ModelRenderer(this, "axleLeft");
		axleLeft.setTextureOffset(0, 207);
		axleLeft.setTextureSize(256, 256);
		axleLeft.setRotationPoint(-13.5f, -0.5f, -0.5f);
		setPieceRotation(axleLeft, 0.0f, 0.0f, 0.0f);
		axleLeft.addBox(0.0f, 0.0f, 0.0f, 3, 1, 1);
		axleRight.addChild(axleLeft);
		cannonFlareLipTop = new ModelRenderer(this, "cannonFlareLipTop");
		cannonFlareLipTop.setTextureOffset(17, 210);
		cannonFlareLipTop.setTextureSize(256, 256);
		cannonFlareLipTop.setRotationPoint(-9.0f, -4.5f, 21.5f);
		setPieceRotation(cannonFlareLipTop, 0.0f, 0.0f, 0.0f);
		cannonFlareLipTop.addBox(0.0f, 0.0f, 0.0f, 7, 1, 1);
		axleRight.addChild(cannonFlareLipTop);
		cannonFlareLipTR = new ModelRenderer(this, "cannonFlareLipTR");
		cannonFlareLipTR.setTextureOffset(15, 207);
		cannonFlareLipTR.setTextureSize(256, 256);
		cannonFlareLipTR.setRotationPoint(-2.5f, -4.0f, 21.5f);
		setPieceRotation(cannonFlareLipTR, 0.0f, 0.0f, 0.0f);
		cannonFlareLipTR.addBox(0.0f, 0.0f, 0.0f, 1, 1, 1);
		axleRight.addChild(cannonFlareLipTR);
		cannonFlareLipRight = new ModelRenderer(this, "cannonFlareLipRight");
		cannonFlareLipRight.setTextureOffset(0, 222);
		cannonFlareLipRight.setTextureSize(256, 256);
		cannonFlareLipRight.setRotationPoint(-2.0f, -3.5f, 21.5f);
		setPieceRotation(cannonFlareLipRight, 0.0f, 0.0f, 0.0f);
		cannonFlareLipRight.addBox(0.0f, 0.0f, 0.0f, 1, 7, 1);
		axleRight.addChild(cannonFlareLipRight);
		cannonFlareLipBR = new ModelRenderer(this, "cannonFlareLipBR");
		cannonFlareLipBR.setTextureOffset(10, 207);
		cannonFlareLipBR.setTextureSize(256, 256);
		cannonFlareLipBR.setRotationPoint(-2.5f, 3.0f, 21.5f);
		setPieceRotation(cannonFlareLipBR, 0.0f, 0.0f, 0.0f);
		cannonFlareLipBR.addBox(0.0f, 0.0f, 0.0f, 1, 1, 1);
		axleRight.addChild(cannonFlareLipBR);
		cannonFlareLipBottom = new ModelRenderer(this, "cannonFlareLipBottom");
		cannonFlareLipBottom.setTextureOffset(0, 210);
		cannonFlareLipBottom.setTextureSize(256, 256);
		cannonFlareLipBottom.setRotationPoint(-9.0f, 3.5f, 21.5f);
		setPieceRotation(cannonFlareLipBottom, 0.0f, 0.0f, 0.0f);
		cannonFlareLipBottom.addBox(0.0f, 0.0f, 0.0f, 7, 1, 1);
		axleRight.addChild(cannonFlareLipBottom);
		cannonFlareLipBL = new ModelRenderer(this, "cannonFlareLipBL");
		cannonFlareLipBL.setTextureOffset(10, 213);
		cannonFlareLipBL.setTextureSize(256, 256);
		cannonFlareLipBL.setRotationPoint(-9.5f, 3.0f, 21.5f);
		setPieceRotation(cannonFlareLipBL, 0.0f, 0.0f, 0.0f);
		cannonFlareLipBL.addBox(0.0f, 0.0f, 0.0f, 1, 1, 1);
		axleRight.addChild(cannonFlareLipBL);
		cannonFlareLipLeft = new ModelRenderer(this, "cannonFlareLipLeft");
		cannonFlareLipLeft.setTextureOffset(5, 222);
		cannonFlareLipLeft.setTextureSize(256, 256);
		cannonFlareLipLeft.setRotationPoint(-10.0f, -3.5f, 21.5f);
		setPieceRotation(cannonFlareLipLeft, 0.0f, 0.0f, 0.0f);
		cannonFlareLipLeft.addBox(0.0f, 0.0f, 0.0f, 1, 7, 1);
		axleRight.addChild(cannonFlareLipLeft);
		cannonFlareLipTL = new ModelRenderer(this, "cannonFlareLipTL");
		cannonFlareLipTL.setTextureOffset(15, 213);
		cannonFlareLipTL.setTextureSize(256, 256);
		cannonFlareLipTL.setRotationPoint(-9.5f, -4.0f, 21.5f);
		setPieceRotation(cannonFlareLipTL, 0.0f, 0.0f, 0.0f);
		cannonFlareLipTL.addBox(0.0f, 0.0f, 0.0f, 1, 1, 1);
		axleRight.addChild(cannonFlareLipTL);
		cannonBaseMid2.addChild(axleRight);
		chairBrace = new ModelRenderer(this, "chairBrace");
		chairBrace.setTextureOffset(70, 59);
		chairBrace.setTextureSize(256, 256);
		chairBrace.setRotationPoint(1.5f, -4.5f, -20.0f);
		setPieceRotation(chairBrace, 0.0f, 3.1415927f, 0.0f);
		chairBrace.addBox(0.0f, 0.0f, -8.0f, 3, 1, 7);
		chairBottom = new ModelRenderer(this, "chairBottom");
		chairBottom.setTextureOffset(54, 68);
		chairBottom.setTextureSize(256, 256);
		chairBottom.setRotationPoint(-3.5f, -1.5f, -1.0f);
		setPieceRotation(chairBottom, 0.1570796f, 0.0f, 0.0f);
		chairBottom.addBox(0.0f, 0.0f, -9.0f, 10, 1, 9);
		chairBrace.addChild(chairBottom);
		chairBack = new ModelRenderer(this, "chairBack");
		chairBack.setTextureOffset(49, 79);
		chairBack.setTextureSize(256, 256);
		chairBack.setRotationPoint(-3.5f, -1.0f, -1.0f);
		setPieceRotation(chairBack, -0.1745329f, 0.0f, 0.0f);
		chairBack.addBox(0.0f, -10.0f, 0.0f, 10, 10, 1);
		chairBrace.addChild(chairBack);
		cannonBaseMid2.addChild(chairBrace);
		cannonBaseMid.addChild(cannonBaseMid2);
		cannonBaseMidChairBrace = new ModelRenderer(this, "cannonBaseMidChairBrace");
		cannonBaseMidChairBrace.setTextureOffset(134, 241);
		cannonBaseMidChairBrace.setTextureSize(256, 256);
		cannonBaseMidChairBrace.setRotationPoint(0.0f, -4.0f, -3.0f);
		setPieceRotation(cannonBaseMidChairBrace, 0.0f, 0.0f, 0.0f);
		cannonBaseMidChairBrace.addBox(-6.0f, -2.0f, -14.5f, 12, 2, 8);
		cannonBaseMid.addChild(cannonBaseMidChairBrace);
		cannonBaseMidcopy17 = new ModelRenderer(this, "cannonBaseMidcopy17");
		cannonBaseMidcopy17.setTextureOffset(134, 155);
		cannonBaseMidcopy17.setTextureSize(256, 256);
		cannonBaseMidcopy17.setRotationPoint(0.0f, 0.0f, 0.0f);
		setPieceRotation(cannonBaseMidcopy17, 0.0f, 3.1415927f, 0.0f);
		cannonBaseMidcopy17.addBox(-8.0f, -2.0f, -21.5f, 16, 2, 28);
		flagPole = new ModelRenderer(this, "flagPole");
		flagPole.setTextureOffset(19, 78);
		flagPole.setTextureSize(256, 256);
		flagPole.setRotationPoint(0.0f, 0.0f, 0.0f);
		setPieceRotation(flagPole, 0.0f, 3.141591f, 0.0f);
		flagPole.addBox(6.5f, -29.0f, 4.5f, 1, 16, 1);
		flagCloth = new ModelRenderer(this, "flagCloth");
		flagCloth.setTextureOffset(24, 78);
		flagCloth.setTextureSize(256, 256);
		flagCloth.setRotationPoint(0.0f, 0.0f, 0.0f);
		setPieceRotation(flagCloth, 0.0f, 3.1415927f, 0.0f);
		flagCloth.addBox(6.5f, -29.0f, -6.5f, 1, 8, 11);

	}

	@Override
	public void render(Entity entity, float f1, float f2, float f3, float f4, float f5, float f6) {
		super.render(entity, f1, f2, f3, f4, f5, f6);
		setRotationAngles(f1, f2, f3, f4, f5, f6, entity);
		cannonBaseMid.render(f6);
		cannonBaseMidcopy17.render(f6);
		flagPole.render(0.0625f);
	}

	public void setPieceRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setTurretRotation(float yaw, float pitch) {
		this.cannonBaseMid.rotateAngleY = Trig.toRadians(yaw + 180);
		this.axleRight.rotateAngleX = Trig.toRadians(pitch);
		this.flagPole.rotateAngleY = cannonBaseMid.rotateAngleY;
		this.flagCloth.rotateAngleY = cannonBaseMid.rotateAngleY;
	}

	@Override
	public void renderFlag() {
		flagCloth.render(0.0625f);
	}

}
