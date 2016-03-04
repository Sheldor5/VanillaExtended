package sheldor5.minecraft.vanillapp.items.obsidian;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;
import sheldor5.minecraft.vanillapp.Materials;
import sheldor5.minecraft.vanillapp.VanillaPP;

/**
 * Created by Michael Palata <a href="https://github.com/Sheldor5">@github.com/Sheldor5</a> on 26.02.2016.
 */
public class ObsidianSword extends ItemSword {

    public static final String NAME = "obsidian_sword";

    public ObsidianSword() {
        super(Materials.OBSIDIAN_TOOLS);
        setUnlocalizedName(VanillaPP.MODID + "_" + NAME);
        setTextureName(VanillaPP.MODID + ":" + NAME);

        setCreativeTab(CreativeTabs.tabCombat);
    }
}
