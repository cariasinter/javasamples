package javasamples.polymorphism;

public class Musica {


    private static Instrument createRandomInstrument() {
        int random = (int) (Math.random() * 4);
        switch (random) {
            case 0:
                return new Piano();
            case 1:
                return new Guitar();
            case 2:
                return new Violin();
             case 3:
                return new ElectricGuitar();
            default:
                return null;
        }
    }

    private static void testSimplePolymorphism() {
        Instrument i = createRandomInstrument();
        i.play(Note.DO);

        // i =  createRandomInstrument();
        // i.play(Note.RE);
    }

    private static void testPolymorphicCollections() {
        Instrument[] orquesta = new Instrument[8];
        System.out.println("Creando la orquesta...");
        for (int i = 0; i < orquesta.length; i++) {
            orquesta[i] = createRandomInstrument();
        }

        System.out.println("Afinando la orquesta...");
        for (int i = 0; i < orquesta.length; i++) {
            Instrument currentInstrument = orquesta[i];
            currentInstrument.tune();
        }
        System.out.println("Orquesta lista para tocar!");
    }

    public static void main(String[] args) {
        // testSimplePolymorphism();
        testPolymorphicCollections();
    }
}
