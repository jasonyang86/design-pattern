package org.nocoder.decorator;

/**
 * 猴子实现类
 * @author jason
 * @date 18/5/19.
 */
public class Monkey implements IMonkey {
    @Override
    public void introduce() {
        System.out.println(this.getClass().getName() + "：我是个猴子！");
    }
}
