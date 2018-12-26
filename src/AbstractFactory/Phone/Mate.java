package AbstractFactory.Phone;

import AbstractFactory.interfaceType.Phone;

/**
 * @Title: Mate
 * @Description:
 * @author: youqing
 * @version: 1.0
 * @date: 2018/12/26 10:24
 */
public class Mate implements Phone {
    @Override
    public void from() {
        System.out.println("I am from huawei");
    }
}
