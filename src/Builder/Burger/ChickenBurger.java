package Builder.Burger;


/**
 * @Title: ChickenBurger
 * @Description: 鸡肉汉堡
 * @author: youqing
 * @version: 1.0
 * @date: 2018/12/28 10:07
 */
public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 50.5f;
    }
}
