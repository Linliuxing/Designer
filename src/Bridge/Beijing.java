package Bridge;

/**
 * @Title: Beijing
 * @Description: 桥接接口CityAPI的实现类
 * @author: youqing
 * @version: 1.0
 * @date: 2018/12/27 10:02
 */
public class Beijing implements CityAPI{
    @Override
    public void coordinate(int x, int y) {
        System.out.println("Beijing's coordinate is [ x: "+x+", y: "+y+" ]");
    }
}
