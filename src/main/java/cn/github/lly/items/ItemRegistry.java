package cn.github.lly.items;

import cn.github.lly.Utils;
import cn.github.lly.groups.blocks.BlockRegistry;
import cn.github.lly.groups.ModGroup;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegistry {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Utils.MOD_ID);
    public static final RegistryObject<Item> liangitem = ITEMS.register("liang_item", LiangItem::new);
    public static final RegistryObject<Item> liangfood = ITEMS.register("liang_food", LiangFood::new);
    public static final RegistryObject<Item> liangpickaxe = ITEMS.register("liang_pickaxe", LiangPickaxe::new);
    public static final RegistryObject<Item> liangblock = ITEMS.register("liang_block", () -> new BlockItem(BlockRegistry.liangBlock.get(), new Item.Properties().tab(ModGroup.LIANG_GROUP)));
    public static final RegistryObject<BlockItem> glassJar = ITEMS.register("glass_jar", () -> {
        return new BlockItem(BlockRegistry.glassJar.get(), new Item.Properties().tab(ModGroup.LIANG_GROUP));
    });
    public static final RegistryObject<Item> liangore = ITEMS.register("liang_ore", () -> new BlockItem(BlockRegistry.LiangOre.get(), new Item.Properties().tab(ModGroup.LIANG_GROUP)));
    public static final RegistryObject<Item> liangingot = ITEMS.register("liang_ingot", LiangIngot::new);

}
