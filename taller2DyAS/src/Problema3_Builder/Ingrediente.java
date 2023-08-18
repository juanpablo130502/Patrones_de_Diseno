package Problema3_Builder;
public enum Ingrediente {
    QUESO(3000.0),
    PEPPERONI(3500.0),
    JAMON(3500.0),
    CHAMPIÑONES(3000.0),
    PIMIENTOS(2500.0),
    CEBOLLA(2500.0),
    ACEITUNAS(2000.0),
    PIÑA(3000.0);

    private final double costo;

    Ingrediente(double costo) {
        this.costo = costo;
    }

    public double getCosto() {
        return costo;
    }
}

