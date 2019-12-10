package org.nocoder.builder.pizza;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.nocoder.builder.pizza.Pizza.Topping.ONION;

public class CalzonePizzaTest {

    @Test
    public void createCalzonePizza(){
        CalzonePizza calzonePizza = new CalzonePizza.Builder().addTopping(ONION).isSauceInside().build();
        assertTrue(calzonePizza.toppings.contains(ONION));
        assertTrue(calzonePizza.isSauceInside());
    }
}
