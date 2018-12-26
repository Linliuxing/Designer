package Singleton;

/**
 * @Title: Singleton
 * @Description: 饿汉式
 *               是否 Lazy 初始化：否
 *               是否多线程安全：是
 *               实现难度：易
 *               描述：这种方式比较常用，但容易产生垃圾对象。
 *               优点：没有加锁，执行效率会提高。
 *               缺点：类加载时就初始化，浪费内存。
 * @author: youqing
 * @version: 1.0
 * @date: 2018/12/26 10:55
 */
public class Singleton {
    //创建 Singleton 的一个对象
    private static  Singleton instance = new Singleton();

    //让构造函数为 private，这样该类就不会被实例化
    private Singleton(){}

    //获取唯一可用的对象
    public static Singleton getInstance(){
        return instance;
    }

    public void sayHello(){
        System.out.println("Hi");
    }

}
