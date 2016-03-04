package sheldor5.minecraft.vanillapp.enums;

/**
 * Created by Michael Palata <a href="https://github.com/Sheldor5">@github.com/Sheldor5</a> on 29.02.2016.
 */
public enum Head {
    MHF_Alex("MHF_Alex"),
    MHF_Blaze("MHF_Blaze"),
    MHF_CaveSpider("MHF_CaveSpider"),
    MHF_Chicken("MHF_Chicken"),
    MHF_Cow("MHF_Cow"),
    MHF_Creeper("MHF_Creeper"),
    MHF_EnderDragon("MHF_EnderDragon"),
    MHF_Enderman("MHF_Enderman"),
    MHF_Ghast("MHF_Ghast"),
    MHF_Golem("MHF_Golem"),
    MHF_Herobrine("MHF_Herobrine"),
    MHF_LavaSlime("MHF_LavaSlime"),
    MHF_MushroomCow("MHF_MushroomCow"),
    MHF_Ocelot("MHF_Ocelot"),
    MHF_Pig("MHF_Pig"),
    MHF_PigZombie("MHF_PigZombie"),
    MHF_Sheep("MHF_Sheep"),
    MHF_Skeleton("MHF_Skeleton"),
    MHF_Slime("MHF_Slime"),
    MHF_SnowGolem("MHF_SnowGolem"),
    MHF_Spider("MHF_Spider"),
    MHF_Squid("MHF_Squid"),
    MHF_Steve("MHF_Steve"),
    MHF_Villager("MHF_Villager"),
    MHF_Wolf("MHF_Wolf"),
    MHF_WSkeleton("MHF_WSkeleton"),
    MHF_Zombie("MHF_Zombie"),
    MHF_Cactus("MHF_Cactus"),
    MHF_Cake("MHF_Cake"),
    MHF_Chest("MHF_Chest"),
    MHF_CoconutB("MHF_CoconutB"),
    MHF_CoconutG("MHF_CoconutG"),
    MHF_Melon("MHF_Melon"),
    MHF_OakLog("MHF_OakLog"),
    MHF_Present1("MHF_Present1"),
    MHF_Present2("MHF_Present2"),
    MHF_Pumpkin("MHF_Pumpkin"),
    MHF_TNT("MHF_TNT"),
    MHF_TNT2("MHF_TNT2"),
    MHF_ArrowUp("MHF_ArrowUp"),
    MHF_ArrowDown("MHF_ArrowDown"),
    MHF_ArrowLeft("MHF_ArrowLeft"),
    MHF_ArrowRight("MHF_ArrowRight"),
    MHF_Exclamation("MHF_Exclamation"),
    MHF_Question("MHF_Question");

    private final String mhf_name;

    Head(final String paramS) {
        mhf_name = paramS;
    }

    public String getMHFName() {
        return mhf_name;
    }
}
