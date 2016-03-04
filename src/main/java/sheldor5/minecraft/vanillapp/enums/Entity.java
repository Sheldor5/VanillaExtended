package sheldor5.minecraft.vanillapp.enums;

/**
 * Created by Michael Palata <a href="https://github.com/Sheldor5">@github.com/Sheldor5</a> on 27.02.2016.
 */
public enum Entity {

    BLAZE("blaze", "Blaze", EntityType.HOSTILE, Head.MHF_Blaze, ""),
    CAVE_SPIDER("cave_spider", "CaveSpider", EntityType.HOSTILE, Head.MHF_CaveSpider, ""),
    CHICKEN("chicken", "Chicken", EntityType.NEUTRAL, Head.MHF_Chicken, ""),
    COW("cow", "Cow",  EntityType.NEUTRAL, Head.MHF_Cow, null),
    CREEPER("creeper", "Creeper", EntityType.HOSTILE, Head.MHF_Creeper, ""),
    ENDERMAN("enderman", "Enderman", EntityType.PASSIVE, Head.MHF_Enderman, ""),
    ENDER_DRAGON("ender_dragon", "EnderDragon", EntityType.BOSS, Head.MHF_EnderDragon, ""),
    GHAST("ghast", "Ghast", EntityType.HOSTILE, Head.MHF_Ghast, ""),
    //HORSE("horse", "EntityHorse", EntityType.NEUTRAL, null, "i:Type:0", "i:Variant:256", "b:SkeletonTrap:0"),
    IRON_GOLEM("golem", "VillagerGolem", EntityType.UTILITY, Head.MHF_Golem, ""),
    LAVA_SLIME("lava_slime", "LavaSlime", EntityType.HOSTILE, Head.MHF_LavaSlime, ""),
    MUSHROOM_COW("mooshroom", "MushroomCow", EntityType.NEUTRAL, Head.MHF_MushroomCow, ""),
    OZELOT("ozelot", "Ozelot", EntityType.NEUTRAL, Head.MHF_Ocelot, null),
    PIG("pig", "Pig", EntityType.NEUTRAL, Head.MHF_Pig, null),
    PIG_ZOMBIE("zombie_pigman", "PigZombie", EntityType.PASSIVE, Head.MHF_PigZombie, ""),
    SHEEP("sheep", "Sheep", EntityType.NEUTRAL, Head.MHF_Sheep, ""),
    SILVERFISH("silverfish", "Silverfish", EntityType.HOSTILE, null, ""),
    SKELETON("skeleton", "Skeleton", EntityType.HOSTILE, Head.MHF_WSkeleton, ""),
    SLIME("slime", "Slime",  EntityType.PASSIVE, Head.MHF_Slime, ""),
    SNOW_MAN("snow_man", "SnowMan", EntityType.UTILITY, Head.MHF_SnowGolem, ""),
    SPIDER("spider", "Spider", EntityType.PASSIVE, Head.MHF_Spider, ""),
    WITCH("witch", "Witch", EntityType.HOSTILE, Head.MHF_Villager, ""),
    WITHER_BOSS("wither_boss", "WitherBoss", EntityType.BOSS, Head.MHF_WSkeleton, ""),
    WITHER_SKELETON("wither_skeleton", "Skeleton", EntityType.HOSTILE, Head.MHF_WSkeleton, "b:SkeletonType:1"),
    WOLF("wolf", "Wolf", EntityType.PASSIVE, Head.MHF_Wolf, ""),
    ZOMBIE("zombie", "Zombie", EntityType.HOSTILE, Head.MHF_Zombie, ""),
    XPORB("xporb", "XPOrb", EntityType.MISC, null, "s:Value:10");

    private final String entityID;
    private final EntityType mobType;
    private final String unlocalizedName;

    private boolean isSubType = false;
    private boolean hasHead = false;
    private String[] subTybeKeys;
    private final Head head;

    Entity(final String paramUnlocalizedName, final String paramEntityID, final EntityType paramMobType, final Head paramHead, final String... paramSubTybe) {
        unlocalizedName = paramUnlocalizedName;
        entityID = paramEntityID;

        if (paramSubTybe != null && paramSubTybe.length > 0) {
            subTybeKeys = paramSubTybe;
            isSubType = true;
        }

        mobType = paramMobType;
        if (paramHead == null) {
            head = Head.MHF_Question;
        } else {
            head = paramHead;
            hasHead = true;
        }
    }

    public String getEntityID() {
        return entityID;
    }

    public EntityType getMobType() {
        return mobType;
    }

    public boolean isSybType() {
        return isSubType;
    }

    public String[] getSubTypeKeys() {
        return subTybeKeys;
    }

    public String getUnlocalizedName() {
        return unlocalizedName;
    }

    public boolean hasHead() { return hasHead; }

    public Head getHead() {
        return head;
    }
}
