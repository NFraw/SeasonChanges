package SeasonChange.seasonchanges.items;

import SeasonChange.seasonchanges.Seasonchanges;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public final class ModItems {

    private ModItems() {}

    // 新物品的实例
    public static final Item ICE_CREAM = register("ice_cream", new Item(new Item.Settings()));

    public static <T extends Item> T register(String id, T item) {
        // 对于 1.21 之前的版本，请将 ''Identifier.of'' 替换为 ''new Identifier''
        return Registry.register(Registries.ITEM, Identifier.of(Seasonchanges.MOD_ID, id), item);
    }

    public static void initialize() {
        Seasonchanges.LOGGER.info("Resgistering Items");
    }

}
