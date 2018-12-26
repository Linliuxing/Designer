package AbstractFactory.Pc;

import AbstractFactory.interfaceType.Pc;

/**
 * @Title: Mac
 * @Description:
 * @author: youqing
 * @version: 1.0
 * @date: 2018/12/26 10:29
 */
public class Mac implements Pc {
    @Override
    public void produce() {
        System.out.println("I am produced by Apple");
    }
}
