package org.jasonyang.factory;

import org.jasonyang.pojo.Pizza;

/**
 * Created by jason on 17/9/9.
 */
public class ChicagoPizzaStore extends PizzaStore {
    @Override
    public Pizza orderPizza() {
        return super.orderPizza();
    }

    @Override
    protected Pizza createPizza(String type) {
        return null;
    }
}
