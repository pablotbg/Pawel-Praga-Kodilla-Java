package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaOrderTestSuit {

    @Test
    void testPizzaOrderWithExtraToppingsGetCostOne() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraCheesDecorator(theOrder);
        theOrder = new ExtraHamDecorator(theOrder);
        theOrder = new ExtraMushroomsDecorator(theOrder);
        theOrder = new ExtraTomatoDecorator(theOrder);
        System.out.println(theOrder.getCost());

        //When
        BigDecimal theCost = theOrder.getCost();

        //Then
        assertEquals(new BigDecimal(26), theCost);
    }

    @Test
    void testPizzaOrderWithExtraToppingsGetDescriptionOne() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraCheesDecorator(theOrder);
        theOrder = new ExtraHamDecorator(theOrder);
        theOrder = new ExtraMushroomsDecorator(theOrder);
        theOrder = new ExtraTomatoDecorator(theOrder);
        System.out.println(theOrder.getDescription());

        //When
        String descripion = theOrder.getDescription();

        //Then
        assertEquals("You order a basic pizza with extra chees with ham with mushrooms with tomato", descripion);
    }

    @Test
    void testPizzaOrderWithExtraToppingsGetCostTwo() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraCheesDecorator(theOrder);
        theOrder = new ExtraPrawnDecorator(theOrder);
        theOrder = new ExtraPrawnDecorator(theOrder);
        theOrder = new ExtraOnionDecorator(theOrder);
        System.out.println(theOrder.getCost());

        //When
        BigDecimal theCost = theOrder.getCost();

        //Then
        assertEquals(new BigDecimal(28), theCost);
    }

    @Test
    void testPizzaOrderWithExtraToppingsGetDescriptionTwo() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraCheesDecorator(theOrder);
        theOrder = new ExtraPrawnDecorator(theOrder);
        theOrder = new ExtraPrawnDecorator(theOrder);
        theOrder = new ExtraOnionDecorator(theOrder);
        System.out.println(theOrder.getDescription());

        //When
        String descripion = theOrder.getDescription();

        //Then
        assertEquals("You order a basic pizza with extra chees with prawns with prawns with onion", descripion);
    }
}
