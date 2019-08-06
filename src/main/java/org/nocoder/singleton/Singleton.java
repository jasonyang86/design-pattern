package org.nocoder.singleton;

/**
 * 单例模式
 * @author jason
 * @date 18/5/19.
 */
public class Singleton {
    /**
     * 私有构造方法
     */
    private Singleton(){}

    /**
     * 自身提供对象的实例
     */
    private static Singleton singleton = new Singleton();

    /**
     * 对外提供获取唯一实例的方法
     */
    public static Singleton getInstance(){
        return singleton;
    }

    public void showMessage(){
        System.out.println("hello, I'm a single object!");
    }

}
