package javasamples.designpatterns.builder;

import java.util.*;

public final class Pizza {
    public enum Size { SMALL, MEDIUM, LARGE }
    public enum Crust { THIN, THICK, STUFFED }
    public enum Sauce { TOMATO, PESTO, CREAM, BBQ, NONE }

    private final String name;
    private final Size size;
    private final Crust crust;
    private final Sauce sauce;
    private final boolean extraCheese;
    private final List<String> toppings;

    // Public simple constructor used by builders (keep implementation simple as requested)
    public Pizza(String name, Size size, Crust crust, Sauce sauce, boolean extraCheese, List<String> toppings) {
        this.name = name;
        this.size = size;
        this.crust = crust;
        this.sauce = sauce;
        this.extraCheese = extraCheese;
        this.toppings = toppings == null ? new ArrayList<>() : new ArrayList<>(toppings);
    }

    public String getName() { return name; }
    public Size getSize() { return size; }
    public Crust getCrust() { return crust; }
    public Sauce getSauce() { return sauce; }
    public boolean hasExtraCheese() { return extraCheese; }
    public List<String> getToppings() { return new ArrayList<>(toppings); }

    @Override
    public String toString() {
        return String.format("Pizza[name=%s, size=%s, crust=%s, sauce=%s, extraCheese=%s, toppings=%s]",
                name, size, crust, sauce, extraCheese, toppings);
    }
}
