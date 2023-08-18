package Problema3_Builder;
public enum TipoMasa {
    DELGADA(5000.0),
    GRUESA(7000.0),
    INTEGRAL(8000.0);

    private final double costo;

    TipoMasa(double costo) {
        this.costo = costo;
    }

    public double getCosto() {
        return costo;
    }
}
