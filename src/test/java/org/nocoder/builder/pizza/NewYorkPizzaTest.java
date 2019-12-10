package org.nocoder.builder.pizza;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class NewYorkPizzaTest {

    @Test
    public void createNewYorkPizza(){
        NewYorkPizza newYorkPizza = new NewYorkPizza.Builder(NewYorkPizza.Size.LARGE)
                .addTopping(Pizza.Topping.ONION).build();
        assertEquals(NewYorkPizza.Size.LARGE, newYorkPizza.getSize());
        assertTrue(newYorkPizza.toppings.contains(Pizza.Topping.ONION));
    }
}
