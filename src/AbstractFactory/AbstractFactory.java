package AbstractFactory;

import AbstractFactory.interfaceType.Pc;
import AbstractFactory.interfaceType.Phone;

/**
 * @Title: AbstractFactory
 * @Description:
 * @author: youqing
 * @version: 1.0
 * @date: 2018/12/26 10:33
 */
public abstract class AbstractFactory {
    public abstract Phone getPhone(String type);
    public abstract Pc getPc(String type) ;
}
