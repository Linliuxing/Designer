package Proxy;

/**
 * @Title: ProxyImage
 * @Description: 代理对象
 * @author: youqing
 * @version: 1.0
 * @date: 2018/12/27 11:39
 */
public class ProxyImage implements Image{

    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if(realImage == null){
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
