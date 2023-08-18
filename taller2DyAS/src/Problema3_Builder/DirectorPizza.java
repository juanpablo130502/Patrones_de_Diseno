package Problema3_Builder;
import java.util.List;

public class DirectorPizza {
    private PizzaBuilder builder;

    public DirectorPizza(PizzaBuilder builder) {
        this.builder = builder;
    }

    public Pizza construirPizzaPersonalizada(String tamaño, String masa, List<String> ingredientes, boolean quesoExtra) {
        builder.seleccionarTamaño(tamaño);
        builder.seleccionarMasa(masa);
        for (String ingrediente : ingredientes) {
            builder.agregarIngrediente(ingrediente);
        }
        if (quesoExtra) {
            builder.agregarQuesoExtraEnBorde();
        }
        return builder.construir();
    }
}

