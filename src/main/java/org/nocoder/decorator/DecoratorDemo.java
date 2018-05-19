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
        // 首先看看一个普通的猴子的自我介绍
        System.out.print("使用装饰器前的猴子：");
        Monkey monkey = new Monkey();
        monkey.introduce();

        System.out.println();

        // 使用孙悟空装饰器装饰猴子
        System.out.print("使用孙悟空装饰器装饰后的猴子：");
        SunWuKongDecorator swkDecorator = new SunWuKongDecorator(new Monkey());
        swkDecorator.introduce();

        System.out.println();

        // 使用六耳猕猴装饰器装饰猴子
        System.out.print("使用六耳猕猴装饰器装饰后的猴子：");
        SixEarsMonkeyDecorator semDecorator = new SixEarsMonkeyDecorator(new Monkey());
        semDecorator.introduce();
    }
}
