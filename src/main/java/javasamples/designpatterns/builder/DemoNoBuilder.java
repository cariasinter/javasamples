package javasamples.designpatterns.builder;

import java.util.*;

public class DemoNoBuilder {
    public static void main(String[] args) {
        Pizza margherita = new Pizza(
                "Margherita",
                Pizza.Size.MEDIUM,
                Pizza.Crust.THIN,
                Pizza.Sauce.TOMATO,
                false,
                Arrays.asList("Mozzarella", "Basil")
        );

        Pizza pepperoni = new Pizza(
                "Pepperoni",
                Pizza.Size.LARGE,
                Pizza.Crust.THICK,
                Pizza.Sauce.TOMATO,
                true,
                Arrays.asList("Pepperoni", "Oregano")
        );

        System.out.println(margherita);
        System.out.println(pepperoni);
    }
}
