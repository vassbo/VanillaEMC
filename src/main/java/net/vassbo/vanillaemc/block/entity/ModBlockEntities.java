package net.vassbo.vanillaemc.block.entity;

import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.block.entity.BlockEntityType.Builder;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.vassbo.vanillaemc.block.ModBlocks;

public class ModBlockEntities {
    public static BlockEntityType<DissolverBlockEntity> DISSOLVER_BLOCK_ENTITY = create("dissolver_block_entity", BlockEntityType.Builder.create(DissolverBlockEntity::new, ModBlocks.DISSOLVER_BLOCK));
    
    static <T extends BlockEntity> BlockEntityType<T> create(String id, Builder<T> builder) {
        return Registry.register(Registries.BLOCK_ENTITY_TYPE, id, builder.build(null));
    }

    public static void init() {
    }
}
