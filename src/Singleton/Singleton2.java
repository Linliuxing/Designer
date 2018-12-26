package Singleton;

/**
 * @Title: Singleton
 * @Description: 懒汉式，线程不安全
 *               是否 Lazy 初始化：是
 *               是否多线程安全：否
 *               实现难度：易
 *               描述：这种方式是最基本的实现方式，这种实现最大的问题就是不支持多线程。
 *               因为没有加锁 synchronized，所以严格意义上它并不算单例模式。
 * @author: youqing
 * @version: 1.0
 * @date: 2018/12/26 10:55
 */
public class Singleton2 {

    private static Singleton2 instance;

    private Singleton2(){}

    public static Singleton2 getInstance(){
        if(instance == null){
            instance = new Singleton2();
        }
        return instance;
    }



}
