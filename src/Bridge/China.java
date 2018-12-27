package Bridge;

/**
 * @Title: China
 * @Description: 抽象类City的继承类
 * @author: youqing
 * @version: 1.0
 * @date: 2018/12/27 10:09
 */
public class China extends City{

    private int x,y;

    public China(int x,int y,CityAPI cityAPI){
        super(cityAPI);
        this.x = x;
        this.y = y;
    }

    @Override
    public void getCityCoordinate() {
        cityAPI.coordinate(x,y);
    }
}
