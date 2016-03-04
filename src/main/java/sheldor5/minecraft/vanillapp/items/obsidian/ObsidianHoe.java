package sheldor5.minecraft.vanillapp.items.obsidian;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemHoe;
import sheldor5.minecraft.vanillapp.Materials;
import sheldor5.minecraft.vanillapp.VanillaPP;

/**
 * Created by Michael Palata <a href="https://github.com/Sheldor5">@github.com/Sheldor5</a> on 27.02.2016.
 */
public class ObsidianHoe extends ItemHoe {

    public static final String NAME = "obsidian_hoe";

    public ObsidianHoe() {
        super(Materials.OBSIDIAN_TOOLS);
        setUnlocalizedName(VanillaPP.MODID + "_" + NAME);
        setTextureName(VanillaPP.MODID + ":" + NAME);

        setCreativeTab(CreativeTabs.tabTools);
    }
}
