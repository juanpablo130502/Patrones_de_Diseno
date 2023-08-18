package Problema3_Builder;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        PizzaBuilder constructorPizza = new ConstructorPizza();
        DirectorPizza director = new DirectorPizza(constructorPizza);

        List<String> ingredientes = new ArrayList<>();
        ingredientes.add("QUESO");
        ingredientes.add("PEPPERONI");
        ingredientes.add("CHAMPIÑONES");

        Pizza pizzaPersonalizada = director.construirPizzaPersonalizada("MEDIANO", "DELGADA", ingredientes, true);

        mostrarInformacionPizza(pizzaPersonalizada);
    }


    public static void mostrarInformacionPizza(Pizza pizza) {
        System.out.println("Tamaño: " + pizza.getTamaño());
        System.out.println("Masa: " + pizza.getMasa());
        System.out.println("Ingredientes:");
        for (String ingrediente : pizza.getIngredientes()) {
            System.out.println("- " + ingrediente);
        }
        if (pizza.isQuesoExtraEnBorde()) {
            System.out.println("Queso extra en el borde");
        }
        System.out.println("Costo total: " + pizza.calcularCosto() + " COP");
    }
}
