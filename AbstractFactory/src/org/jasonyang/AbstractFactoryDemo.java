package org.jasonyang;

import org.jasonyang.factory.AbstractFactory;
import org.jasonyang.factory.FactoryProducer;
import org.jasonyang.pojo.Color;
import org.jasonyang.pojo.Shape;

/**
 * Created by jason on 17/9/8.
 */
public class AbstractFactoryDemo {
    public static void main (String[] args){
        // 获取图形工厂
        AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");
        // 获取圆形
        Shape circle = shapeFactory.getShape("CIRCLE");
        // 画一个圆形
        circle.draw();

        // 获取颜色工厂
        AbstractFactory colorFactory = FactoryProducer.getFactory("color");
        // 获取红色
        Color red = colorFactory.getColor("RED");
        // 用红色填充
        red.fill();


    }
}
