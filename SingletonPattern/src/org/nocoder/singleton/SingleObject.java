package org.nocoder.singleton;

/**
 * Created by YANGJINLONG on 2017-10-10.
 */
public class SingleObject {
    // 创建私有的实例化对象
    private static SingleObject instance = new SingleObject();

    // 将构造方法私有化，这样这个对象就不能被实例化
    private SingleObject(){}

    // 获取唯一可用的实例化对象
    public static SingleObject getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello, World!");
    }
}
