package cn.github.lly.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;


public class LiangBlock extends Block {

    public LiangBlock() {

        super(Properties.of(Material.METAL).harvestLevel(5).strength(4));

    }

}
