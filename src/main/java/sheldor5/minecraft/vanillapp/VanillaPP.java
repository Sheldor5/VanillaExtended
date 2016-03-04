package sheldor5.minecraft.vanillapp;

/**
 * Created by Michael Palata <a href="https://github.com/Sheldor5">@github.com/Sheldor5</a> on 26.02.2016.
 */

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import sheldor5.minecraft.vanillapp.blocks.VanillaPPBlocks;
import sheldor5.minecraft.vanillapp.items.VanillaPPItems;

@Mod(modid = VanillaPP.MODID, name = VanillaPP.NAME, version = VanillaPP.VERSION)
public class VanillaPP
{
    public static final String MODID = "vanillapp";
    public static final String NAME = "Vanilla++";
    public static final String VERSION = "0.0.1";

    @Mod.EventHandler
    public void init(final FMLInitializationEvent event)
    {
        VanillaPPItems.registerVanillaItems();
        VanillaPPItems.registerEmeraldItems();
        VanillaPPItems.registerObsidianItems();
        VanillaPPBlocks.registerVanillaBlocks();
        Recipes.registerVanillaRecipes();
    }
}

