package Builder.ColdDrink;


/**
 * @Title: Coke
 * @Description: 可乐实体类
 * @author: youqing
 * @version: 1.0
 * @date: 2018/12/28 10:09
 */
public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 8.0f;
    }
}
