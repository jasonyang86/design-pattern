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
        // 调用monkey自身的方法
        monkey.introduce();
        // 调用装饰方法
        decorate(monkey);
    }

    /**
     * 具体的装饰方法
     * @param monkey
     */
    private void decorate(IMonkey monkey){
        monkey.toString();
        System.out.println(this.getClass().getName() + "：我是六耳猕猴，看我七十二变！");
    }
}
