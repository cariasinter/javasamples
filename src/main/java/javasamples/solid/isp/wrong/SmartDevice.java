package javasamples.solid.isp.wrong;

// Violacion del Principio de Segregación de Interfaces (ISP)
// Esta interfaz es demasiado amplia
public interface SmartDevice {
    void print();
    void scan();
    void fax();
}
