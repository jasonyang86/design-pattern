package org.jasonyang.factory;


/**
 * Created by jason on 17/9/8.
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        if (choice == null){
            return null;
        }
        if(choice.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory();
        }else if(choice.equalsIgnoreCase("COLOR")){
            return new ColorFactory();
        }
        return null;
    }
}
