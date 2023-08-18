package Problema3_Builder;
public enum TamanioPorcion {
    PEQUENO(15000.0),
    MEDIANO(20000.0),
    GRANDE(25000.0);

    private final double costo;

    TamanioPorcion(double costo) {
        this.costo = costo;
    }

    public double getCosto() {
        return costo;
    }
}
