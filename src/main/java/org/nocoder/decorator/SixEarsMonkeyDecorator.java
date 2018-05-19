package org.nocoder.decorator;

/**
 * 六耳猕猴装饰器类
 * @author jason
 * @date 18/5/19.
 */
public class SixEarsMonkeyDecorator extends AbstractMonkeyDecorator {
    public SixEarsMonkeyDecorator(IMonkey monkey) {
        super(monkey);
    }

    @Override
    public void introduce(){
        monkey.introduce();
        decorate(monkey);
    }

    private void decorate(IMonkey monkey){
        System.out.print("我才是美猴王，我会七十二变！");
        System.out.print("大唐高僧是我师傅！");
    }
}