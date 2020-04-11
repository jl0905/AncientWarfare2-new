package net.shadowmage.ancientwarfare.structure.template.plugin.defaultplugins.entityrules;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.monster.IMob;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.shadowmage.ancientwarfare.core.util.BlockTools;
import net.shadowmage.ancientwarfare.structure.AncientWarfareStructure;
import net.shadowmage.ancientwarfare.structure.api.IStructureBuilder;
import net.shadowmage.ancientwarfare.structure.api.TemplateRuleEntityBase;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static net.shadowmage.ancientwarfare.npc.event.EventHandler.NO_SPAWN_PREVENTION_TAG;

public class TemplateRuleEntity extends TemplateRuleEntityBase {
	public static final String PLUGIN_NAME = "entity";
	private NBTTagCompound tag;

	public ResourceLocation registryName;
	public float xOffset;
	public float zOffset;
	public float yOffset;
	public float rotation;

	public TemplateRuleEntity() {
		super();
	}

	public TemplateRuleEntity(World world, Entity entity, int turns, int x, int y, int z) {
		super();

		registryName = EntityList.getKey(entity);

		rotation = (entity.rotationYaw + 90.f * turns) % 360.f;
		float x1 = (float) (entity.posX % 1.d);
		float z1 = (float) (entity.posZ % 1.d);
		if (x1 < 0) {
			x1++;
		}
		if (z1 < 0) {
			z1++;
		}
		xOffset = BlockTools.rotateFloatX(x1, z1, turns);
		zOffset = BlockTools.rotateFloatZ(x1, z1, turns);
		yOffset = (float) (entity.posY % 1d);

		tag = entity.writeToNBT(new NBTTagCompound());
		tag.removeTag("UUIDMost");
		tag.removeTag("UUIDLeast");
	}

	@Override
	public void handlePlacement(World world, int turns, BlockPos pos, IStructureBuilder builder) {
		createEntity(world, turns, pos).ifPresent(world::spawnEntity);
	}

	private Optional<Entity> createEntity(World world, int turns, BlockPos pos) {
		Entity e = EntityList.createEntityByIDFromName(registryName, world);
		if (e == null) {
			AncientWarfareStructure.LOG.warn("Could not create entity for name: {} Entity skipped during structure creation.", registryName.toString());
			return Optional.empty();
		}
		e.readFromNBT(getEntityNBT(pos, turns));
		updateEntityOnPlacement(turns, pos, e);
		addNoSpawnPreventionTag(e);
		return Optional.of(e);
	}

	private void addNoSpawnPreventionTag(Entity e) {
		if (IMob.MOB_SELECTOR.apply(e)) {
			e.getTags().add(NO_SPAWN_PREVENTION_TAG);
		}
	}

	@SuppressWarnings("unused") //parameters used in overrides
	protected NBTTagCompound getEntityNBT(BlockPos pos, int turns) {
		return tag;
	}

	protected void updateEntityOnPlacement(int turns, BlockPos pos, Entity e) {
		e.setPositionAndRotation(pos.getX() + BlockTools.rotateFloatX(xOffset, zOffset, turns), pos.getY() + yOffset,
				pos.getZ() + BlockTools.rotateFloatZ(xOffset, zOffset, turns), (rotation + 90.f * turns) % 360.f, 0);
	}

	@Override
	public void writeRuleData(NBTTagCompound tag) {
		super.writeRuleData(tag);
		tag.setString("mobID", registryName.toString());
		tag.setFloat("xOffset", xOffset);
		tag.setFloat("yOffset", yOffset);
		tag.setFloat("zOffset", zOffset);
		tag.setFloat("rotation", rotation);
		tag.setTag("entityData", this.tag);
	}

	@Override
	public void parseRule(NBTTagCompound tag) {
		super.parseRule(tag);
		registryName = new ResourceLocation(tag.getString("mobID"));
		xOffset = tag.getFloat("xOffset");
		yOffset = tag.getFloat("yOffset");
		zOffset = tag.getFloat("zOffset");
		rotation = tag.getFloat("rotation");
		this.tag = tag.getCompoundTag("entityData");
	}

	@Override
	public String getPluginName() {
		return PLUGIN_NAME;
	}

	@Override
	public boolean shouldPlaceOnBuildPass(World world, int turns, BlockPos pos, int buildPass) {
		return buildPass == 3;
	}

	@Override
	public List<ItemStack> getResources() {
		return Collections.emptyList();
	}
}
