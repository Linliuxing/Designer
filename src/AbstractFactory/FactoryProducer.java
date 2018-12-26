package AbstractFactory;

/**
 * @Title: FactoryProducer
 * @Description: 创建一个工厂创造器/生成器类，通过传递手机或电脑信息来获取工厂
 * @author: youqing
 * @version: 1.0
 * @date: 2018/12/26 10:44
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("PHONE")){
            return new PhoneFactory();
        } else if(choice.equalsIgnoreCase("PC")){
            return new PcFatory();
        }
        return null;
    }
}
