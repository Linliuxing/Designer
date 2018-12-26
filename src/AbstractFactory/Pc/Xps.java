package AbstractFactory.Pc;


import AbstractFactory.interfaceType.Pc;

/**
 * @Title: Xps
 * @Description:
 * @author: youqing
 * @version: 1.0
 * @date: 2018/12/26 10:30
 */
public class Xps implements Pc {
    @Override
    public void produce() {
        System.out.println("I am produced by Dell");
    }
}
