package SeasonChange.seasonchanges;

import SeasonChange.seasonchanges.items.ModItemGroups;
import SeasonChange.seasonchanges.items.ModItems;
import net.fabricmc.api.ModInitializer;
//import net.minecraft.item.Item;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Seasonchanges implements ModInitializer {

    public static final String MOD_ID = "seasonchanges";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);



    @Override
    public void onInitialize() {
        ModItems.initialize();
//        ModItems.registerToVanillaItemGroups();
//        直接注册到已有物品组中
        ModItemGroups.initialize();

        LOGGER.info("Hello Fabric World!");
    }
}
