package org.jasonyang.factory;

import org.jasonyang.pojo.Pizza;

/**
 * Created by jason on 17/9/9.
 */
public abstract class PizzaStore {
    public Pizza orderPizza(){
        Pizza pizza;
        pizza = createPizza("cheese");

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}
