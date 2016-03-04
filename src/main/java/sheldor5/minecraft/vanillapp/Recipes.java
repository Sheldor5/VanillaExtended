package sheldor5.minecraft.vanillapp;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import sheldor5.minecraft.vanillapp.items.VanillaPPItems;

/**
 * Created by Michael Palata <a href="https://github.com/Sheldor5">@github.com/Sheldor5</a> on 27.02.2016.
 */
public class Recipes {

    public static void registerVanillaRecipes() {
        GameRegistry.addRecipe(new ItemStack(Blocks.enchanting_table), " H ", "0#0", "###", 'H', Items.book, '0', Items.emerald, '#', Blocks.obsidian);
        GameRegistry.addRecipe(new ItemStack(Blocks.jukebox), "mmm", "m0m", "mmm", 'm', Blocks.planks, '0', Items.emerald);
        GameRegistry.addRecipe(new ItemStack(Items.saddle), "lll", "lwl", "l l", 'l', Items.leather, 'w', Blocks.wool);
    }

    public static void registerEmeraldRecipes() {
        GameRegistry.addRecipe(new ItemStack(VanillaPPItems.emerald_sword), "0", "0", "I", '0', Items.emerald, 'I', Items.stick);
        GameRegistry.addRecipe(new ItemStack(VanillaPPItems.emerald_pickaxe), "000", " I ", " I ", '0', Items.emerald, 'I', Items.stick);
        GameRegistry.addRecipe(new ItemStack(VanillaPPItems.emerald_axe), "00", "0I", " I", '0', Items.emerald, 'I', Items.stick);
        GameRegistry.addRecipe(new ItemStack(VanillaPPItems.emerald_spade), "0", "I", "I", '0', Items.emerald, 'I', Items.stick);
        GameRegistry.addRecipe(new ItemStack(VanillaPPItems.emerald_hoe), "00", " I", " I", '0', Items.emerald, 'I', Items.stick);
        GameRegistry.addRecipe(new ItemStack(VanillaPPItems.emerald_helmet), "000", "0 0", '0', Items.emerald);
        GameRegistry.addRecipe(new ItemStack(VanillaPPItems.emerald_chestplate), "0 0", "000", "000", '0', Items.emerald);
        GameRegistry.addRecipe(new ItemStack(VanillaPPItems.emerald_leggings), "000", "0 0", "0 0", '0', Items.emerald);
        GameRegistry.addRecipe(new ItemStack(VanillaPPItems.emerald_boots), "0 0", "0 0", '0', Items.emerald);
    }

    public static void registerObsidianRecipes() {
        GameRegistry.addRecipe(new ItemStack(VanillaPPItems.obsidian_sword), "#", "#", "I", '#', Blocks.obsidian, 'I', Items.stick);
        GameRegistry.addRecipe(new ItemStack(VanillaPPItems.obsidian_pickaxe), "###", " I ", " I ", '#', Blocks.obsidian, 'I', Items.stick);
        GameRegistry.addRecipe(new ItemStack(VanillaPPItems.obsidian_axe), "##", "#I", " I", '#', Blocks.obsidian, 'I', Items.stick);
        GameRegistry.addRecipe(new ItemStack(VanillaPPItems.obsidian_spade), "#", "I", "I", '#', Blocks.obsidian, 'I', Items.stick);
        GameRegistry.addRecipe(new ItemStack(VanillaPPItems.obsidian_hoe), "##", " I", " I", '#', Blocks.obsidian, 'I', Items.stick);
    }

}
