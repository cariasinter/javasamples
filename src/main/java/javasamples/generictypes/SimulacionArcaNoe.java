package javasamples.generictypes;

import java.util.ArrayList;
import java.util.List;

public class SimulacionArcaNoe {

    public static void main(String[] args) {
        ejecutarSimulacionV3();

    }

    public static void ejecutarSimulacion() {
        List<Pareja> parejas = new ArrayList<>();

        Pareja p = new Pareja(
                new Raton("Mickey"),
                new Raton("Minnie"));
        parejas.add(p);

        p = new Pareja(new Pato("Donald"),
                new Pato("Daisy"));
        parejas.add(p);

        // Iterate over parejas and call comer() on each animal
        for (Pareja pareja : parejas) {
            Animal animal1 = (Animal) pareja.getPrimero();
            Animal animal2 = (Animal) pareja.getSegundo();
            animal1.comer();
            animal2.comer();
        }
    }

    public static void ejecutarSimulacionV2() {
        List<ParejaV2> parejas = new ArrayList<>();

        ParejaV2 p = new ParejaV2(
                        new Raton("Mickey"),
                        new Raton("Minnie"));
        parejas.add(p);

        p = new ParejaV2(
                new Perro("Pluto"),
                new Pato("Daysi"));
        parejas.add(p);

        // Iterate over parejas and call comer() on each animal
        for (ParejaV2 pareja : parejas) {
            Animal animal1 =  pareja.getPrimero();
            Animal animal2 =  pareja.getSegundo();
            animal1.comer();
            animal2.comer();
        }
    }

    public static void ejecutarSimulacionV3() {
        List<ParejaV3> parejas = new ArrayList<>();

        ParejaV3<? extends Animal> p = new ParejaV3<Raton>(
                new Raton("Mickey"),
                new Raton("Minnie"));
        parejas.add(p);

        p = new ParejaV3<Perro>(
                new Perro("Pluto"),
                new Perro("Canela"));
        parejas.add(p);


        // Iterate over parejas and call comer() on each animal
        for (ParejaV3 pareja : parejas) {
            Animal animal1 =  pareja.getPrimero();
            Animal animal2 =  pareja.getSegundo();
            animal1.comer();
            animal2.comer();
        }
    }
}
