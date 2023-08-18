package Problema3_Builder;

import java.util.ArrayList;

public class ConstructorPizza implements PizzaBuilder {
    private Pizza pizzaEnConstruccion;

    public ConstructorPizza() {
        this.pizzaEnConstruccion = new Pizza();
        this.pizzaEnConstruccion.setIngredientes(new ArrayList<>());
    }

    @Override
    public void seleccionarTamaño(String tamaño) {
        pizzaEnConstruccion.setTamaño(tamaño);
    }

    @Override
    public void seleccionarMasa(String masa) {
        pizzaEnConstruccion.setMasa(masa);
    }

    @Override
    public void agregarIngrediente(String ingrediente) {
        pizzaEnConstruccion.getIngredientes().add(ingrediente);
    }

    @Override
    public void agregarQuesoExtraEnBorde() {
        pizzaEnConstruccion.setQuesoExtraEnBorde(true);
    }

    @Override
    public Pizza construir() {
        return pizzaEnConstruccion;
    }
}
