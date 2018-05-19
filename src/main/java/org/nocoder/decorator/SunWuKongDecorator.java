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
        // 调用monkey自身的方法
        monkey.introduce();
        // 增加装饰方法
        decorate(monkey);
    }

    /**
     * 具体的装饰方法
     * @param monkey
     */
    private void decorate(IMonkey monkey){
        monkey.toString();
        System.out.println(this.getClass().getName() + "：我是孙悟空，看我七十二变！");
    }
}
