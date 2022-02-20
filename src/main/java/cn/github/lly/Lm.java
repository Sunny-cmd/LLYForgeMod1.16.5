package cn.github.lly;

import cn.github.lly.groups.blocks.BlockRegistry;
import cn.github.lly.items.ItemRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Utils.MOD_ID)
public class Lm {

    public Lm() {

        ItemRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BlockRegistry.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());

    }

}
