package Builder.Burger;


/**
 * @Title: VegBurger
 * @Description: 素食汉堡
 * @author: youqing
 * @version: 1.0
 * @date: 2018/12/28 10:06
 */
public class VegBurger extends Burger {
    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
