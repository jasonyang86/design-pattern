package org.nocoder.decorator;

/**
 * 通过装饰器模式，把猴子包装成孙悟空或六耳猕猴
 * 实现步骤：
 * 1、定义IMonkey接口，增加接口方法
 * 2、定义实现了IMonkey接口的实现类Monkey（被装饰的类）
 * 3、定义实现了IMonkey接口的抽象类AbstractMonkeyDecorator，作为抽象装饰类，构造方法中接收被装饰的类
 * 4、定义具体的装饰器类SunWuKongDecorator，继承自AbstractMonkeyDecorator，实现具体的装饰方法
 * 5、定义具体的装饰器类SixEarsDecorator，继承自AbstractMonkeyDecorator，实现具体的装饰方法
 * @author jason
 * @date 18/5/19.
 */
public class DecoratorDemo {

    public static void main(String[] args) {
        System.out.println("装饰前：");
        Monkey stoneMonkeyImpl = new Monkey();
        stoneMonkeyImpl.introduce();

        System.out.println();

        System.out.println("装饰后：");
        SunWuKongDecorator sunWuKongDecorator = new SunWuKongDecorator(new Monkey());
        sunWuKongDecorator.introduce();

        SixEarsMonkeyDecorator sixEarsMonkeyDecorator = new SixEarsMonkeyDecorator(new Monkey());
        sixEarsMonkeyDecorator.introduce();
    }
}
