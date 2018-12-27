package Bridge;

/**
 * @Title: Shanghai
 * @Description: 桥接接口CityAPI的实现类
 * @author: youqing
 * @version: 1.0
 * @date: 2018/12/27 10:05
 */
public class Shanghai implements CityAPI {
    @Override
    public void coordinate(int x, int y) {
        System.out.println("Shanghai's coordinate is [ x: "+x+", y: "+y+" ]");
    }
}
