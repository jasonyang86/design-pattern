package org.jasonyang.factory;

import org.jasonyang.pojo.Blue;
import org.jasonyang.pojo.Color;
import org.jasonyang.pojo.Red;
import org.jasonyang.pojo.Shape;

/**
 * Created by jason on 17/9/8.
 */
public class ColorFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        if(color == null){
            return null;
        }
        if(color.equalsIgnoreCase("RED")){
            return new Red();
        }else if(color.equalsIgnoreCase("BLUE")){
            return new Blue();
        }
        return null;
    }

    @Override
    public Shape getShape(String shapeType){
        return null;
    }
}
