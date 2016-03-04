package sheldor5.minecraft.vanillapp.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import sheldor5.minecraft.vanillapp.enums.Entity;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Michael Palata <a href="https://github.com/Sheldor5">@github.com/Sheldor5</a> on 03.03.2016.
 */
public class VanillaPPBlocks {

    public static final Map<Entity, EntitySpawnerBlock> entitySpawners = new HashMap<Entity, EntitySpawnerBlock>();

    static {
        for (final Entity mob : Entity.values()) {
            entitySpawners.put(mob, new EntitySpawnerBlock(mob));
        }
    }

    public static void registerVanillaBlocks() {
        for (final EntitySpawnerBlock entitySpawnerBlock : entitySpawners.values()) {
            GameRegistry.registerBlock(entitySpawnerBlock, EntitySpawnerItemBlock.class, entitySpawnerBlock.getUnlocalizedName());
        }
    }
}
