package Proxy;

/**
 * @Title: RealImage
 * @Description: 被代理的对象
 * @author: youqing
 * @version: 1.0
 * @date: 2018/12/27 11:37
 */
public class RealImage implements Image{

    private String fileName;

    public RealImage(String fileName){
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }

    private void loadFromDisk(String fileName){
        System.out.println("Loading  " + fileName);
    }
}
