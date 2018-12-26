package AbstractFactory.Pc;

import AbstractFactory.interfaceType.Pc;

/**
 * @Title: MateBook
 * @Description:
 * @author: youqing
 * @version: 1.0
 * @date: 2018/12/26 10:32
 */
public class MateBook implements Pc {
    @Override
    public void produce() {
        System.out.println("I am produced by HUAWEI");
    }
}
