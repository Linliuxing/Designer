package Builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @Title: Meal
 * @Description:  一个 Meal 类，带有定义的 Item 对象
 * @author: youqing
 * @version: 1.0
 * @date: 2018/12/28 10:12
 */
public class Meal {
    private List<Item> items = new ArrayList <>();

    public void addItem(Item item){
        items.add(item);
    }

    public float getCost(){
        float cost = 0.0f;
        for(Item item : items){
            cost += item.price();
        }
        return cost;
    }

    public void showItems(){
        for(Item item : items){
            System.out.print("Item : "+item.name());
            System.out.print(", Packing : "+item.packing().pack());
            System.out.println(", Price : "+item.price());
        }
    }

}
