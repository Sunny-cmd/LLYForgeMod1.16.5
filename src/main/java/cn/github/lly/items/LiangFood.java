package cn.github.lly.items;

import cn.github.lly.groups.ModGroup;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class LiangFood extends Item {

    private static final Food food = (new Food.Builder())
            .saturationMod(10)
            .nutrition(20)
            .build();

    public LiangFood() {

        super(new Properties().food(food).tab(ModGroup.LIANG_GROUP));

    }

}
