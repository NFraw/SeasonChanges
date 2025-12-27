package SeasonChange.seasonchanges.items;

import SeasonChange.seasonchanges.Seasonchanges;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    // 自定义物品组实例
    public static final ItemGroup TEST_GROUP = FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModItems.ICE_CREAM)) // 物品组图标：冰淇淋
            .displayName(Text.translatable("itemGroup.seasonchanges.test_group")) // 翻译键匹配模组ID
            .entries((context, entries) -> {
                entries.add(ModItems.ICE_CREAM); // 物品组内添加冰淇淋
            })
            .build();

    public static void initialize() {
        // 修正：使用模组自身的MOD_ID作为命名空间，避免冲突
        Registry.register(
                Registries.ITEM_GROUP,
                Identifier.of(Seasonchanges.MOD_ID, "test_group"),
                TEST_GROUP
        );
    }
}
