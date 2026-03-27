package javasamples.designpatterns.builder.v2;

import java.util.*;
import javasamples.designpatterns.builder.Pizza;
import javasamples.designpatterns.builder.PizzaBuilder;

public class PizzaDirector {


    public Pizza buildMargherita(String name) {
        PizzaBuilder builder = new PizzaBuilder();
        if (name != null && !name.trim().isEmpty()) {
            builder.name(name);
        } else {
            builder.name("Margherita");
        }
        return builder
            .size(Pizza.Size.MEDIUM)
            .crust(Pizza.Crust.THIN)
            .sauce(Pizza.Sauce.TOMATO)
            .extraCheese(false)
            .addToppings(Arrays.asList("Mozzarella", "Basil"))
            .build();
    }

    public Pizza buildBBQ(String name) {
        PizzaBuilder builder = new PizzaBuilder();
        if (name != null && !name.trim().isEmpty()) {
            builder.name(name);
        } else {
            builder.name("BBQ Chicken");
        }
        return builder
            .size(Pizza.Size.LARGE)
            .crust(Pizza.Crust.STUFFED)
            .sauce(Pizza.Sauce.BBQ)
            .extraCheese(true)
            .addToppings(Arrays.asList("Chicken", "Red Onion", "Cilantro"))
            .build();
    }

    public Pizza buildPepperoni(String name) {
        PizzaBuilder builder = new PizzaBuilder();
        if (name != null && !name.trim().isEmpty()) {
            builder.name(name);
        } else {
            builder.name("Pepperoni");
        }
        return builder
            .size(Pizza.Size.LARGE)
            .crust(Pizza.Crust.THICK)
            .sauce(Pizza.Sauce.TOMATO)
            .extraCheese(true)
            .addToppings(Arrays.asList("Pepperoni", "Oregano"))
            .build();
    }
}
