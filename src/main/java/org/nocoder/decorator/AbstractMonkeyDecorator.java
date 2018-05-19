package org.nocoder.decorator;

/**
 * 抽象装饰类
 * 实现IMonkey接口的抽象类
 * 包含接收被装饰的对象的构造器
 * 用来包装Monkey对象的实例
 * @author jason
 * @date 18/5/19.
 */
public abstract class AbstractMonkeyDecorator implements IMonkey {
    protected IMonkey monkey;
    public AbstractMonkeyDecorator(IMonkey monkey){
        this.monkey = monkey;
    }

    @Override
    public void introduce(){
        monkey.introduce();
    }
}