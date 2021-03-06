package cn.github.lly.blocks;

import cn.github.lly.Utils;
import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockRegistry {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Utils.MOD_ID);
    public static final RegistryObject<Block> liangBlock = BLOCKS.register("liang_block", LiangBlock::new);
    public static final RegistryObject<GlassJar> glassJar = BLOCKS.register("glass_jar", GlassJar::new);
    public static final RegistryObject<Block> LiangOre = BLOCKS.register("liang_ore", LiangOre::new);

}
