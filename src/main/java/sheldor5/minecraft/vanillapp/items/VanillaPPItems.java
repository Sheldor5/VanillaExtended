package sheldor5.minecraft.vanillapp.items;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.*;
import sheldor5.minecraft.vanillapp.Materials;
import sheldor5.minecraft.vanillapp.Recipes;
import sheldor5.minecraft.vanillapp.VanillaPP;
import sheldor5.minecraft.vanillapp.items.emerald.*;
import sheldor5.minecraft.vanillapp.items.obsidian.*;

/**
 * Created by Michael Palata <a href="https://github.com/Sheldor5">@github.com/Sheldor5</a> on 26.02.2016.
 */
public class VanillaPPItems {

    public static ItemSword creative_sword = (ItemSword) new ItemSword(Materials.CREATIVE_TOOLS).setCreativeTab(CreativeTabs.tabMisc).setUnlocalizedName(VanillaPP.MODID+ "_creative_sword").setTextureName(VanillaPP.MODID + ":creative_sword");;

    public static ItemSword emerald_sword = new EmeraldSword();
    public static final ItemSword e = new ItemSword(Materials.EMERALD_TOOLS);

    public static ItemPickaxe emerald_pickaxe = new EmeraldPickaxe();
    public static ItemAxe emerald_axe = new EmeraldAxe();
    public static ItemSpade emerald_spade = new EmeraldSpade();
    public static ItemHoe emerald_hoe = new EmeraldHoe();

    public static ItemArmor emerald_helmet = new EmeraldArmor(EmeraldArmor.HELMET_NAME, 0);
    public static ItemArmor emerald_chestplate = new EmeraldArmor(EmeraldArmor.CHESTPLATE_NAME, 1);
    public static ItemArmor emerald_leggings = new EmeraldArmor(EmeraldArmor.LEGGINGS_NAME, 2);
    public static ItemArmor emerald_boots = new EmeraldArmor(EmeraldArmor.BOOTS_NAME, 3);

    public static ItemSword obsidian_sword = new ObsidianSword();

    public static ItemPickaxe obsidian_pickaxe = new ObsidianPickaxe();
    public static ItemAxe obsidian_axe = new ObsidianAxe();
    public static ItemSpade obsidian_spade = new ObsidianSpade();
    public static ItemHoe obsidian_hoe = new ObsidianHoe();

    public static void registerVanillaItems() {
        GameRegistry.registerItem(creative_sword, "creative_sword");
    }

    /**
     * Register emerald items to the {@link GameRegistry}
     */
    public static void registerEmeraldItems() {
        // Sword
        GameRegistry.registerItem(emerald_sword, EmeraldSword.NAME);

        // Tools
        GameRegistry.registerItem(emerald_pickaxe, EmeraldPickaxe.NAME);
        GameRegistry.registerItem(emerald_axe, EmeraldAxe.NAME);
        GameRegistry.registerItem(emerald_spade, EmeraldSpade.NAME);
        GameRegistry.registerItem(emerald_hoe, EmeraldHoe.NAME);

        // Armor
        GameRegistry.registerItem(emerald_helmet, EmeraldArmor.HELMET_NAME);
        GameRegistry.registerItem(emerald_chestplate, EmeraldArmor.CHESTPLATE_NAME);
        GameRegistry.registerItem(emerald_leggings, EmeraldArmor.LEGGINGS_NAME);
        GameRegistry.registerItem(emerald_boots, EmeraldArmor.BOOTS_NAME);

        // Recipes
        Recipes.registerEmeraldRecipes();
    }


    /**
     * Register emerald items to the {@link GameRegistry}
     */
    public static void registerObsidianItems() {
        // Sword
        GameRegistry.registerItem(obsidian_sword, ObsidianSword.NAME);

        // Tools
        GameRegistry.registerItem(obsidian_pickaxe, ObsidianPickaxe.NAME);
        GameRegistry.registerItem(obsidian_axe, ObsidianAxe.NAME);
        GameRegistry.registerItem(obsidian_spade, ObsidianSpade.NAME);
        GameRegistry.registerItem(obsidian_hoe, ObsidianHoe.NAME);

        // Recipes
        Recipes.registerObsidianRecipes();
    }
}
