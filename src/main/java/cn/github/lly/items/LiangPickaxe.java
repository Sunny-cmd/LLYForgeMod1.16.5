package cn.github.lly.items;

import cn.github.lly.groups.ModGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemTier;
import net.minecraft.item.PickaxeItem;

public class LiangPickaxe extends PickaxeItem {

    public LiangPickaxe() {

        super(ItemTier.IRON, 2, -3f, (new Item.Properties()).tab(ModGroup.LIANG_GROUP));

    }

}
