package sheldor5.minecraft.vanillapp.items.emerald;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;
import sheldor5.minecraft.vanillapp.Materials;
import sheldor5.minecraft.vanillapp.VanillaPP;

/**
 * Created by Michael Palata <a href="https://github.com/Sheldor5">@github.com/Sheldor5</a> on 26.02.2016.
 */
public class EmeraldSword extends ItemSword {

    public static final String NAME = "emerald_sword";

    public EmeraldSword() {
        super(Materials.EMERALD_TOOLS);
        setUnlocalizedName(VanillaPP.MODID + "_" + NAME);
        setTextureName(VanillaPP.MODID + ":" + NAME);

        setCreativeTab(CreativeTabs.tabCombat);
    }
}
