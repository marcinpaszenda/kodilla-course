package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaTestSuite {

    @Test
    public void testBasicPizzaWithExtraCheeseGetCost() {
        //Given
        Pizza thePizza = new BasicPizza();
        thePizza = new ExtraCheeseDecorator(thePizza);
        //When
        BigDecimal theCost = thePizza.getCost();
        //Then
        assertEquals(new BigDecimal(19), theCost);
    }

    @Test
    public void testBasicPizzaWithExtraCheeseGetDescription() {
        //Given
        Pizza thePizza = new BasicPizza();
        thePizza = new ExtraCheeseDecorator(thePizza);
        //When
        String description = thePizza.getDescription();
        //Then
        assertEquals("Basic pizza + extra cheese", description);
    }

    @Test
    public void testBasicPizzaWithAllPizzaToppingsGetCost() {
        //Given
        Pizza thePizza = new BasicPizza();
        thePizza = new ExtraCheeseDecorator(thePizza);
        thePizza = new HamDecorator(thePizza);
        thePizza = new MushroomDecorator(thePizza);
        thePizza = new OlivesDecorator(thePizza);
        thePizza = new TomatoDecorator(thePizza);
        //When
        BigDecimal theCost = thePizza.getCost();
        //Then
        assertEquals(new BigDecimal(30), theCost);
    }

    @Test
    public void testBasicPizzaWithAllPizzaToppingsGetDescription() {
        //Given
        Pizza thePizza = new BasicPizza();
        thePizza = new ExtraCheeseDecorator(thePizza);
        thePizza = new HamDecorator(thePizza);
        thePizza = new MushroomDecorator(thePizza);
        thePizza = new OlivesDecorator(thePizza);
        thePizza = new TomatoDecorator(thePizza);
        //When
        String description = thePizza.getDescription();
        //Then
        assertEquals("Basic pizza + extra cheese + ham + mushrooms + " +
                "olives + tomatoes", description);
    }
}
