package fr.minemobs.superpackutils.ritual;

import elucent.eidolon.network.Networking;
import elucent.eidolon.network.RitualConsumePacket;
import elucent.eidolon.ritual.IRequirement;
import elucent.eidolon.ritual.RequirementInfo;
import elucent.eidolon.ritual.Ritual;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.List;
import java.util.stream.Collectors;

public class EntityRequirement implements IRequirement {

    private final EntityType<?> entityType;
    private LivingEntity entity;

    public EntityRequirement(EntityType<?> entityType) {
        this.entityType = entityType;
    }

    @Override
    public RequirementInfo isMet(Ritual ritual, World world, BlockPos blockPos) {
        List<LivingEntity> entities = world.getEntitiesOfClass(LivingEntity.class, ritual.getSearchBounds(blockPos), LivingEntity::isInvertedHealAndHarm)
                .stream().filter(le -> le.getType() == entityType).collect(Collectors.toList());
        if (entities.isEmpty()) return RequirementInfo.FALSE;
        for (LivingEntity e : entities) {
            return new RequirementInfo(true, e.blockPosition());
        }
        return RequirementInfo.FALSE;
    }

    @Override
    public void whenMet(Ritual ritual, World world, BlockPos pos, RequirementInfo info) {
        LivingEntity entity = (LivingEntity) entityType.create(world);
        this.entity = entity;
        world.getEntitiesOfClass(entity.getClass(), new AxisAlignedBB(pos));
        if (!world.isClientSide) {
            Networking.sendToTracking(world, pos.above(2), new RitualConsumePacket(info.getPos(), pos.above(2), ritual.getRed(), ritual.getGreen(), ritual.getBlue()));
        }
    }

    public LivingEntity getEntity() {
        return entity;
    }
}
