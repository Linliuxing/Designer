package AbstractFactory.Phone;

import AbstractFactory.interfaceType.Phone;

/**
 * @Title: Iphone
 * @Description:
 * @author: youqing
 * @version: 1.0
 * @date: 2018/12/26 10:22
 */
public class Iphone implements Phone {
    @Override
    public void from() {
        System.out.println("I am from apple");
    }
}
