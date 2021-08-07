package fr.minemobs.superpackutils.ritual;

import elucent.eidolon.ritual.CrystalRitual;
import elucent.eidolon.ritual.IRequirement;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.stream.Collectors;

public class EntityRitual extends CrystalRitual {

    private final EntityType<? extends LivingEntity> entity;
    private final ResourceLocation rl;

    public EntityRitual(EntityType<? extends LivingEntity> entity, ResourceLocation registryName) {
        this.entity = entity;
        this.rl = registryName;
    }

    @Override
    public ResourceLocation getRegistryName() {
        return rl;
    }

    @Override
    public RitualResult start(World world, BlockPos pos) {
        for (IRequirement req : getRequirements().stream().filter(req -> req instanceof EntityRequirement).collect(Collectors.toList())) {
            EntityRequirement r = (EntityRequirement) req;
            r.getEntity().remove();
            LivingEntity e = entity.create(world);
            e.setPos(pos.getX(), pos.getY(), pos.getZ());
            world.addFreshEntity(e);
        }
        return RitualResult.TERMINATE;
    }
}
