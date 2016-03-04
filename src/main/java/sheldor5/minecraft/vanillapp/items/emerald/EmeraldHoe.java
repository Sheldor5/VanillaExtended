package sheldor5.minecraft.vanillapp.items.emerald;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemHoe;
import sheldor5.minecraft.vanillapp.Materials;
import sheldor5.minecraft.vanillapp.VanillaPP;

/**
 * Created by Michael Palata <a href="https://github.com/Sheldor5">@github.com/Sheldor5</a> on 27.02.2016.
 */
public class EmeraldHoe extends ItemHoe {

    public static final String NAME = "emerald_hoe";

    public EmeraldHoe() {
        super(Materials.EMERALD_TOOLS);
        setUnlocalizedName(VanillaPP.MODID + "_" + NAME);
        setTextureName(VanillaPP.MODID + ":" + NAME);

        setCreativeTab(CreativeTabs.tabTools);
    }
}
