package SeasonChange.seasonchanges;

import SeasonChange.seasonchanges.items.ModItems;import net.fabricmc.api.ModInitializer;import org.slf4j.LoggerFactory;import java.util.logging.Logger;

public class Seasonchanges implements ModInitializer {

    public static final String MOD_ID = "seasonchanges";

    public static final Logger LOGGER = Logger.getLogger(MOD_ID);

    @Override
    public void onInitialize() {

        ModItems.initialize();
//        初始化items
        LOGGER.info("Hello Fabirc World!");
    }
}
