package Decorator;


/**
 * @Title: American
 * @Description: Person接口的一个实体类
 * @author: youqing
 * @version: 1.0
 * @date: 2018/12/26 9:40
 */
public class American implements Person {
    @Override
    public void speak() {
        System.out.println("I speak American English");
    }
}
