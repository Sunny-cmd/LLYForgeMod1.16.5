package cn.github.lly.groups.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class GlassJar extends Block {

    public GlassJar() {

        super(Properties.of(Material.WOOD).harvestLevel(5).noOcclusion());

    }

}
