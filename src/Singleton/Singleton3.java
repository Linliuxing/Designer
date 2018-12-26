package Singleton;

/**
 * @Title: Singleton
 * @Description: 懒汉式，线程不安全
 *               是否 Lazy 初始化：是
 *               是否多线程安全：是
 *               实现难度：易
 *               描述：这种方式具备很好的 lazy loading，能够在多线程中很好的工作，但是，效率很低，99% 情况下不需要同步。
 *               优点：第一次调用才初始化，避免内存浪费。
 *               缺点：必须加锁 synchronized 才能保证单例，但加锁会影响效率。
 * @author: youqing
 * @version: 1.0
 * @date: 2018/12/26 10:55
 */
public class Singleton3 {

    private static Singleton3 instance;

    private Singleton3(){}

    public static synchronized Singleton3 getInstance(){
        if(instance == null){
            instance = new Singleton3();
        }
        return instance;
    }



}
