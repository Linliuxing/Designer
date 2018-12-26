package AbstractFactory.Phone;

import AbstractFactory.interfaceType.Phone;

/**
 * @Title: Xperia
 * @Description:
 * @author: youqing
 * @version: 1.0
 * @date: 2018/12/26 10:23
 */
public class Xperia implements Phone {
    @Override
    public void from() {
        System.out.println("I am from sony");
    }
}
