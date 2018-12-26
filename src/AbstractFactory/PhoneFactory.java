package AbstractFactory;

import AbstractFactory.Phone.Iphone;
import AbstractFactory.Phone.Mate;
import AbstractFactory.Phone.Xperia;
import AbstractFactory.interfaceType.Pc;
import AbstractFactory.interfaceType.Phone;

/**
 * @Title: PhoneFactory
 * @Description: 手机工厂
 * @author: youqing
 * @version: 1.0
 * @date: 2018/12/26 10:35
 */
public class PhoneFactory extends AbstractFactory {
    @Override
    public Phone getPhone(String type) {
        if(type == null){
            return null;
        }
        if(type.equalsIgnoreCase("Iphone")){
            return new Iphone();
        }else if(type.equalsIgnoreCase("Mate")){
            return new Mate();
        }else if(type.equalsIgnoreCase("Xperia")){
            return new Xperia();
        }
        return null;
    }

    @Override
    public Pc getPc(String type) {
        return null;
    }
}
