package javasamples.designpatterns.builder.v2;

import java.util.*;
import javasamples.designpatterns.builder.Pizza;
import javasamples.designpatterns.builder.PizzaBuilder;

public class DemoV2 {
    public static void main(String[] args) {
        PizzaDirector director = new PizzaDirector();

        Pizza margherita = director.buildMargherita("Margarita");
        Pizza bbq = director.buildBBQ(null);
        Pizza pepperoni = director.buildPepperoni("Peperoni");

        List<Pizza> list = Arrays.asList(margherita, bbq, pepperoni);
        list.forEach(System.out::println);
    }
}
