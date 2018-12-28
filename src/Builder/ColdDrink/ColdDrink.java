package Builder.ColdDrink;

import Builder.Item;
import Builder.Packing.Bottle;
import Builder.Packing.Packing;

/**
 * @Title: ColdDrink
 * @Description: 冷饮抽象类
 * @author: youqing
 * @version: 1.0
 * @date: 2018/12/28 10:05
 */
public abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
