package Bridge;

/**
 * @Title: City
 * @Description: CityAPI接口的抽象类City
 * @author: youqing
 * @version: 1.0
 * @date: 2018/12/27 10:06
 */
public abstract class City {
    protected CityAPI cityAPI;
    protected City(CityAPI cityAPI){
        this.cityAPI = cityAPI;
    }

    public abstract void getCityCoordinate();

}
