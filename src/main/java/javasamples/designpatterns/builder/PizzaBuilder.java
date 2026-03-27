package javasamples.designpatterns.builder;

import java.util.*;

public class PizzaBuilder {
    private Pizza.Size size = Pizza.Size.MEDIUM; // sensible defaults
    private Pizza.Crust crust = Pizza.Crust.THIN;
    private Pizza.Sauce sauce = Pizza.Sauce.TOMATO;
    private boolean extraCheese = false;
    private final List<String> toppings = new ArrayList<>();
    private String name = "Custom Pizza";

    public PizzaBuilder name(String name) {
        this.name = name;
        return this;
    }
    // Fluent setters
    public PizzaBuilder size(Pizza.Size size) {
        this.size = size;
        return this;
    }

    public PizzaBuilder crust(Pizza.Crust crust) {
        this.crust = crust;
        return this;
    }

    public PizzaBuilder sauce(Pizza.Sauce sauce) {
        this.sauce = sauce;
        return this;
    }

    public PizzaBuilder extraCheese(boolean extraCheese) {
        this.extraCheese = extraCheese;
        return this;
    }

    public PizzaBuilder addTopping(String topping) {
        if (topping != null && !topping.trim().isEmpty()) {
            this.toppings.add(topping.trim());
        }
        return this;
    }

    public PizzaBuilder addToppings(Collection<String> toppings) {
        if (toppings != null) {
            for (String t : toppings) {
                addTopping(t);
            }
        }
        return this;
    }

    public PizzaBuilder clearToppings() {
        this.toppings.clear();
        return this;
    }

    // Build method
    public Pizza build() {
        return new Pizza(name, size, crust, sauce, extraCheese, toppings);
    }
}
