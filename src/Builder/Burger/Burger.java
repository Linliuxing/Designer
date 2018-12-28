package Builder.Burger;

import Builder.Item;
import Builder.Packing.Packing;
import Builder.Packing.Wrapper;

/**
 * @Title: Burger
 * @Description: 汉堡的抽象类
 * @author: youqing
 * @version: 1.0
 * @date: 2018/12/28 10:03
 */
public abstract class Burger implements Item {


    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
