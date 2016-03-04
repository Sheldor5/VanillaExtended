package sheldor5.minecraft.vanillapp;

import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

/**
 * Created by Michael Palata <a href="https://github.com/Sheldor5">@github.com/Sheldor5</a> on 26.02.2016.
 */
public class Materials {

    public static final Item.ToolMaterial CREATIVE_TOOLS = EnumHelper.addToolMaterial("CREATIVE", Integer.MAX_VALUE, Integer.MAX_VALUE, Float.MAX_VALUE, Float.MAX_VALUE, Integer.MAX_VALUE);

    public static final Item.ToolMaterial EMERALD_TOOLS = EnumHelper.addToolMaterial("EMERALD", 3, 781, 7.0f, 2.0f, 8);
    public static final Item.ToolMaterial OBSIDIAN_TOOLS = EnumHelper.addToolMaterial("OBSIDIAN", 1, 1024, 4.0f, 1.0f, 5);

    public static final ItemArmor.ArmorMaterial EMERALD_ARMOR = EnumHelper.addArmorMaterial("EMERALD", 781, new int[]{2, 7, 5, 2}, 8);

}
