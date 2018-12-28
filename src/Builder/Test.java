package Builder;

/**
 * @Title: Test
 * @Description: 建造者模式
 *               意图：将一个复杂的构建与其表示相分离，使得同样的构建过程可以创建不同的表示。
 *
 *               主要解决：主要解决在软件系统中，有时候面临着"一个复杂对象"的创建工作，其通常由各个部分的子对象用一定的算法构成；由于需求的变化，这个复杂对象的各个部分经常面临着剧烈的变化，但是将它们组合在一起的算法却相对稳定。
 *
 *               何时使用：一些基本部件不会变，而其组合经常变化的时候。
 *
 *               如何解决：将变与不变分离开。
 *
 *               优点： 1、建造者独立，易扩展。
 *                     2、便于控制细节风险。
 *
 *               缺点： 1、产品必须有共同点，范围有限制。
 *                     2、如内部变化复杂，会有很多的建造类。
 *
 *               使用场景： 1、需要生成的对象具有复杂的内部结构。
 *                        2、需要生成的对象内部属性本身相互依赖。
 *
 *               注意事项：与工厂模式的区别是：建造者模式更加关注与零件装配的顺序。
 * @author: youqing
 * @version: 1.0
 * @date: 2018/12/28 10:18
 */
public class Test {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost: " +vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("\n\nNon-Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost: " +nonVegMeal.getCost());

    }
}
