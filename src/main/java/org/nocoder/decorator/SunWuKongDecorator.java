package org.nocoder.decorator;

/**
 * 孙悟空装饰器类
 * @author jason
 * @date 18/5/19.
 */
public class SunWuKongDecorator extends AbstractMonkeyDecorator {
    public SunWuKongDecorator(IMonkey monkey) {
        super(monkey);
    }

    @Override
    public void introduce(){
        monkey.introduce();
        decorate(monkey);
    }

    private void decorate(IMonkey monkey){
        System.out.print("我是美猴王，我会七十二变！");
        System.out.print("我师傅是大唐高僧！");
    }
}
