package sheldor5.minecraft.vanillapp.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import sheldor5.minecraft.vanillapp.VanillaPP;
import sheldor5.minecraft.vanillapp.enums.Entity;

/**
 * Created by Michael Palata <a href="https://github.com/Sheldor5">@github.com/Sheldor5</a> on 03.03.2016.
 */
public class EntitySpawnerBlock extends Block {

    private final Entity mob;

    public EntitySpawnerBlock(final Entity paramEntity) {
        super(Material.rock);
        setBlockTextureName("mob_spawner");
        setBlockName(VanillaPP.MODID + "_entity_spawner_" + paramEntity.getUnlocalizedName());
        setCreativeTab(CreativeTabs.tabMisc);
        mob = paramEntity;
    }

    public final Entity getMob() {
        return mob;
    }
}
