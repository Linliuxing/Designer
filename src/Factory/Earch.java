package Factory;


/**
 * @Title: Earch
 * @Description: global village 工厂类
 * @author: youqing
 * @version: 1.0
 * @date: 2018/12/26 9:46
 */
public class Earch {

    public Person getPerson(String type){
        if(type == null){
            return null;
        }
        if(type.equalsIgnoreCase("CHINESE")){
            return new Chinese();
        }else if(type.equalsIgnoreCase("AMERICAN")){
            return new American();
        }else if(type.equalsIgnoreCase("ENGLISH")){
            return new English();
        }else if(type.equalsIgnoreCase("FRANCH")){
            return new Franch();
        }
        return null;
    }
}
