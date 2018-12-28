package Builder.ColdDrink;


/**
 * @Title: Pepsi
 * @Description: 百事实体类
 * @author: youqing
 * @version: 1.0
 * @date: 2018/12/28 10:10
 */
public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 9.0f;
    }
}
