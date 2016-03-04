package sheldor5.minecraft.vanillapp.items.emerald;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import sheldor5.minecraft.vanillapp.Materials;
import sheldor5.minecraft.vanillapp.VanillaPP;

/**
 * Created by Michael Palata <a href="https://github.com/Sheldor5">@github.com/Sheldor5</a> on 27.02.2016.
 */
public class EmeraldArmor extends ItemArmor {

    public static final String HELMET_NAME = "emerald_helmet";
    public static final String CHESTPLATE_NAME = "emerald_chestplate";
    public static final String LEGGINGS_NAME = "emerald_leggings";
    public static final String BOOTS_NAME = "emerald_boots";

    private static final String TEXTURE = "emerald";

    public EmeraldArmor(final String unlocalizedName, final int type) {
        super(Materials.EMERALD_ARMOR, 0, type);
        setUnlocalizedName(VanillaPP.MODID + "_" + unlocalizedName);
        setTextureName(VanillaPP.MODID + ":" + unlocalizedName);
    }

    @Override
    public String getArmorTexture(final ItemStack stack, final Entity entity, final int slot, final String type)
    {
        return VanillaPP.MODID + ":textures/armor/" + TEXTURE + "_" + (this.armorType == 2 ? "2" : "1") + ".png";
    }
}
