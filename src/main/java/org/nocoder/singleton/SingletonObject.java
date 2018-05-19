package org.nocoder.singleton;

/**
 * 单例模式
 * @author jason
 * @date 18/5/19.
 */
public class SingletonObject {
    /**
     * 私有构造方法
     */
    private SingletonObject(){}

    /**
     * 自身提供对象的实例
     */
    private static SingletonObject singletonObject = new SingletonObject();

    /**
     * 对外提供获取唯一实例的方法
     */
    public static SingletonObject getInstance(){
        return singletonObject;
    }

    public void showMessage(){
        System.out.println("hello, singleton object!");
    }

    public static void main(String[] args) {
        System.out.println(SingletonObject.getInstance() == SingletonObject.getInstance());
        SingletonObject.getInstance().showMessage();
    }


}
