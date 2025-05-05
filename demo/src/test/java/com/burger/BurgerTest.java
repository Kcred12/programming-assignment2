package com.burger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit tests for the Burger class.
 */
public class BurgerTest {

    // Makes sure the burger price is calculated correctly.
    @Test
    public void testBurgerPrice() {
        List<String> patties = new ArrayList<String>(4);
        List<String> cheeses = new ArrayList<String>(4);
        List<String> garnishes = new ArrayList<String>(4);
        patties.add("Beef");
        patties.add("Chicken");
        cheeses.add("Cheddar");
        cheeses.add("Swiss");
        garnishes.add("Lettuce");
        garnishes.add("Tomato");

        Burger burger = new Burger("Sesame", patties, cheeses, garnishes);
        double expectedPrice = 2.00 + (2 * 1.5) + (2 * 0.5) + (2 * 0.75); // Base price + patties + cheeses + garnishes
        assertEquals(expectedPrice, burger.getPrice());
    }

    // Make sure the price is correct when two burgers are assembled
    @Test
    public void testTwoBurgersPrice() {

        double expectedPrice = 0.0;

        List<String> patties = new ArrayList<String>(4);
        List<String> cheeses = new ArrayList<String>(4);
        List<String> garnishes = new ArrayList<String>(4);

        List<String> pattiesTwo = new ArrayList<String>(4);
        List<String> cheesesTwo = new ArrayList<String>(4);
        List<String> garnishesTwo = new ArrayList<String>(4);

        List<Burger> burgers = new ArrayList<Burger>(2);

        patties.add("Beef");
        patties.add("Chicken");
        cheeses.add("Cheddar");
        cheeses.add("Swiss");
        garnishes.add("Lettuce");
        garnishes.add("Tomato");

        pattiesTwo.add("Chicken");
        pattiesTwo.add("Pork");
        cheesesTwo.add("Gouda");
        garnishesTwo.add("Onion");

        Burger burger1 = new Burger("Sesame", patties, cheeses, garnishes);
        Burger burger2 = new Burger("Potato", patties, cheeses, garnishes);

        burgers.add(burger1);
        burgers.add(burger2);

        // Get the expected price by adding the prices of both burgers
        for (Burger burger : burgers) {
            expectedPrice += burger.getPrice();
        }

        assertEquals(expectedPrice, burger1.getPrice() + burger2.getPrice());
    }

}
