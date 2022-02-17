package cn.github.lly.groups;

import cn.github.lly.items.ItemRegistry;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class LiangGroup extends ItemGroup {

    public LiangGroup() {

        super("liang_group");

    }

    @Override
    public ItemStack makeIcon() {

        return new ItemStack(ItemRegistry.liangitem.get());

    }
}
