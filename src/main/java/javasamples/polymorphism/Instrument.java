package javasamples.polymorphism;

abstract public class Instrument {
    // Método abstracto que debe ser implementado por cada instrumento específico.
    abstract public void play(Note n);

    // Asumamos que la implementación de tune() sí puede ser generalizable,
    // es decir, implementable en Instrument, y que como parte de su implementación
    // se debe invocar a play();
    // es decir, tune() es un Template Method (Design Patterns)
    public void tune() {
        if (this instanceof ElectricGuitar) {
            ((ElectricGuitar) this).turnOn();
        };

        System.out.println("Afinando un instrumento");
        // La invocación a play() es polimórfica
        play(Note.DO);
        play(Note.RE);
        play(Note.MI);
        //...
        System.out.println("Instrumento afinado");
    };
}
