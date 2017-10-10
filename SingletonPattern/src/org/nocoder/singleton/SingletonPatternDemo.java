package org.nocoder.singleton;

/**
 * Created by YANGJINLONG on 2017-10-10.
 */
public class SingletonPatternDemo {
    public static void main(String[] args){
        // 编译错误，构造方法是私有的，不能被实例化
        // SingleObject singleObject = new SingleObject();

        SingleObject s1 = SingleObject.getInstance();
        s1.showMessage();

        SingleObject s2 = SingleObject.getInstance();
        s2.showMessage();

        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode() == s2.hashCode());
    }

}
