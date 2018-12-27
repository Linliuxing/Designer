package Decorator;

/**
 * @Title: English
 * @Description: Person接口的一个实体类
 * @author: youqing
 * @version: 1.0
 * @date: 2018/12/26 9:42
 */
public class English implements Person {
    @Override
    public void speak() {
        System.out.println("I speak British English");
    }
}
