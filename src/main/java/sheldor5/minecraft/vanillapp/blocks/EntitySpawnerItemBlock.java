package sheldor5.minecraft.vanillapp.blocks;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.MobSpawnerBaseLogic;
import net.minecraft.tileentity.TileEntityMobSpawner;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;
import scala.util.control.Exception;
import sheldor5.minecraft.vanillapp.enums.Entity;

import java.util.InvalidPropertiesFormatException;
import java.util.List;

/**
 * Created by Michael Palata <a href="https://github.com/Sheldor5">@github.com/Sheldor5</a> on 03.03.2016.
 */
public class EntitySpawnerItemBlock extends ItemBlock {

    public static final String NAME = "entity_spawner";

    private static final Byte b = new Byte("1");
    private static final Integer i = new Integer(0);

    private static final Block spawner = Blocks.mob_spawner;

    private final Entity mob;

    public EntitySpawnerItemBlock(final Block paramBlock) {
        super(paramBlock);
        if (paramBlock instanceof EntitySpawnerBlock) {
            mob = ((EntitySpawnerBlock) paramBlock).getMob();
        } else {
            mob = null;
        }
    }

    /*
    */
    @Override
    public final String getItemStackDisplayName(final ItemStack paramItemStack) {
        return (StatCollector.translateToLocal("tile.mobSpawner.name")).trim();
    }

    @Override
    public final boolean onItemUse(final ItemStack paramItemStack, final EntityPlayer paramPlayer, final World paramWorld, int x, int y, int z, int p_77648_7_, float p_77648_8_, float p_77648_9_, float p_77648_10_) {

        if (null == mob) {
            return false;
        }

        final Block block = paramWorld.getBlock(x, y, z);
        if (block == Blocks.snow_layer && (paramWorld.getBlockMetadata(x, y, z) & 7) < 1) {
            p_77648_7_ = 1;
        } else if(block != Blocks.vine && block != Blocks.tallgrass && block != Blocks.deadbush && !block.isReplaceable(paramWorld, x, y, z)) {
            if(p_77648_7_ == 0) {
                --y;
            }

            if(p_77648_7_ == 1) {
                ++y;
            }

            if(p_77648_7_ == 2) {
                --z;
            }

            if(p_77648_7_ == 3) {
                ++z;
            }

            if(p_77648_7_ == 4) {
                --x;
            }

            if(p_77648_7_ == 5) {
                ++x;
            }
        }

        if (paramItemStack.stackSize == 0) {
            return false;
        } else if(!paramPlayer.canPlayerEdit(x, y, z, p_77648_7_, paramItemStack)) {
            return false;
        } else if(y == 255) {
            return false;
        } else if(paramWorld.canPlaceEntityOnSide(spawner, x, y, z, false, p_77648_7_, paramPlayer, paramItemStack)) {
            int i1 = this.getMetadata(paramItemStack.getItemDamage());
            int j1 = spawner.onBlockPlaced(paramWorld, x, y, z, p_77648_7_, p_77648_8_, p_77648_9_, p_77648_10_, i1);
            if(placeBlockAt(paramItemStack, paramPlayer, paramWorld, x, y, z, j1)) {
                changeSpawnerEntityID((TileEntityMobSpawner) paramWorld.getTileEntity(x, y, z));
                paramWorld.playSoundEffect((double)((float)x + 0.5F), (double)((float)y + 0.5F), (double)((float)z + 0.5F), spawner.stepSound.func_150496_b(), (spawner.stepSound.getVolume() + 1.0F) / 2.0F, spawner.stepSound.getPitch() * 0.8F);
                --paramItemStack.stackSize;
            }

            return true;
        } else {
            return false;
        }
    }

    private final void changeSpawnerEntityID(final TileEntityMobSpawner paramTileEntityMobSpawner) {
        if(null != paramTileEntityMobSpawner) {
            final MobSpawnerBaseLogic mobSpawnerBaseLogic = paramTileEntityMobSpawner.func_145881_a();
            if (mob.getEntityID().isEmpty()) {
                //
            } else {
                mobSpawnerBaseLogic.setEntityName(mob.getEntityID());
                if (mob.isSybType()) {
                    final NBTTagCompound spawnerNbt = new NBTTagCompound();
                    paramTileEntityMobSpawner.writeToNBT(spawnerNbt);
                    final NBTTagCompound entityNbt = spawnerNbt.getCompoundTag("SpawnData");
                    writeEntityToNbt(entityNbt);
                    spawnerNbt.setTag("SpawnData", entityNbt);
                    paramTileEntityMobSpawner.readFromNBT(spawnerNbt);
                }
            }
        }
    }

    private final void writeEntityToNbt(NBTTagCompound paramNBTTagCompound) {
        if (paramNBTTagCompound == null) {
            paramNBTTagCompound = new NBTTagCompound();
        }
        final String[] data = mob.getSubTypeKeys();
        for (final String d : data) {
            final String[] a = d.split(":");
            if (a.length == 3) {
                final String key = a[1];
                if ("i".equals(a[0])) {
                    paramNBTTagCompound.setInteger(key, Integer.parseInt(a[2]));
                } else if ("b".equals(a[0])) {
                    paramNBTTagCompound.setByte(key, Byte.parseByte(a[2]));
                } else if ("s".equals(a[0])) {
                    paramNBTTagCompound.setShort(key, Short.parseShort(a[2]));
                } else if ("S".equals(a[0])) {
                    paramNBTTagCompound.setString(key, a[2]);
                }
            }
        }
    }

    @Override
    final public void addInformation(final ItemStack paramItemStack, final EntityPlayer paramEntityPlayer, final List list, final boolean p_77624_4_) {
        if (null == mob) {
            return;
        }

        final String localizedName;

        switch (mob) {
            case WITHER_SKELETON:
                localizedName = "entity.vanillapp_wither_skeleton.name";
                break;
            default:
                localizedName = String.format("entity.%s.name", mob.getEntityID());
                break;
        }

        final String mobName = (StatCollector.translateToLocal(localizedName)).trim();
        list.add(EnumChatFormatting.GRAY + mobName);
    }

    @Override
    public final void onCreated(final ItemStack paramItemStack, final World paramWorld, final EntityPlayer paramEntityPlayer) {

    }

    private final boolean placeBlockAt(final ItemStack stack, final EntityPlayer player, final World world, int x, int y, int z, int metadata) {
        if(!world.setBlock(x, y, z, Blocks.mob_spawner, metadata, 3)) {
            return false;
        } else {
            if(world.getBlock(x, y, z) == Blocks.mob_spawner) {
                spawner.onBlockPlacedBy(world, x, y, z, player, stack);
                spawner.onPostBlockPlaced(world, x, y, z, metadata);
            }
            return true;
        }
    }

}
