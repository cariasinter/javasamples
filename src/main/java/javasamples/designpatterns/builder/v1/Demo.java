package javasamples.designpatterns.builder.v1;

import java.util.*;
import javasamples.designpatterns.builder.Pizza;
import javasamples.designpatterns.builder.PizzaBuilder;

public class Demo {
    public static void main(String[] args) {
        // Create a Margherita-style pizza by directing the builder
        Pizza margherita = new PizzaBuilder()
                .size(Pizza.Size.MEDIUM)
                .crust(Pizza.Crust.THIN)
                .sauce(Pizza.Sauce.TOMATO)
                .extraCheese(false)
                .name("Juana")
                .addTopping("Oregano")
                .clearToppings()
                .addTopping("Mozzarella")
                .addTopping("Basil")
                .build();

        // Create a Pepperoni with extra cheese
        Pizza pepperoni = new PizzaBuilder()
                .name("Pepperoni")
                .size(Pizza.Size.LARGE)
                .crust(Pizza.Crust.THICK)
                .sauce(Pizza.Sauce.TOMATO)
                .extraCheese(true)
                .addToppings(Arrays.asList("Pepperoni", "Oregano"))
                .build();

        // Create a Pesto Veggie pizza
        Pizza pestoVeggie = new PizzaBuilder()
                .name("Pesto Veggie")
                .size(Pizza.Size.SMALL)
                .sauce(Pizza.Sauce.PESTO)
                .extraCheese(false)
                .addToppings(Arrays.asList("Mushroom", "Bell Pepper", "Onion", "Olives"))
                .build();

        // Create a BBQ Chicken stuffed crust pizza
        Pizza bbqChicken = new PizzaBuilder()
                .name("BBQ Chicken")
                .size(Pizza.Size.LARGE)
                .crust(Pizza.Crust.STUFFED)
                .sauce(Pizza.Sauce.BBQ)
                .extraCheese(true)
                .addToppings(Arrays.asList("Chicken", "Red Onion", "Cilantro"))
                .build();

        List<Pizza> pizzas = Arrays.asList(margherita, pepperoni, pestoVeggie, bbqChicken);
        pizzas.forEach(p -> System.out.println(p));
    }
}
