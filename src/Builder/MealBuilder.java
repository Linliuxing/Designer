package Builder;

import Builder.Burger.ChickenBurger;
import Builder.Burger.VegBurger;
import Builder.ColdDrink.Coke;
import Builder.ColdDrink.Pepsi;

/**
 * @Title: MealBuilder
 * @Description: 负责创建 Meal 对象
 * @author: youqing
 * @version: 1.0
 * @date: 2018/12/28 10:15
 */
public class MealBuilder {

    public Meal prepareVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return  meal;
    }

    public Meal prepareNonVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }

}
