package AbstractFactory;

import AbstractFactory.Pc.Mac;
import AbstractFactory.Pc.MateBook;
import AbstractFactory.Pc.Xps;
import AbstractFactory.interfaceType.Pc;
import AbstractFactory.interfaceType.Phone;

/**
 * @Title: PcFatory
 * @Description: 电脑工厂
 * @author: youqing
 * @version: 1.0
 * @date: 2018/12/26 10:42
 */
public class PcFatory extends AbstractFactory{
    @Override
    public Phone getPhone(String type) {
        return null;
    }

    @Override
    public Pc getPc(String type) {
        if(type == null){
            return null;
        }
        if(type.equalsIgnoreCase("Mac")){
            return new Mac();
        }else if(type.equalsIgnoreCase("MateBook")){
            return new MateBook();
        }else if(type.equalsIgnoreCase("Xps")){
            return new Xps();
        }
        return null;
    }
}
