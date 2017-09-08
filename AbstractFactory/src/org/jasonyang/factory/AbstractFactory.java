package org.jasonyang.factory;

import org.jasonyang.pojo.Color;
import org.jasonyang.pojo.Shape;

/**
 * 为 Color 和 Shape 对象创建抽象类来获取工厂
 * Created by jason on 17/9/8.
 */
public abstract class AbstractFactory {

    public abstract Color getColor(String color);

    public abstract Shape getShape(String shape);
}
