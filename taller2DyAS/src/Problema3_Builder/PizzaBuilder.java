package Problema3_Builder;
interface PizzaBuilder {
    void seleccionarTamaño(String tamaño);

    void seleccionarMasa(String masa);

    void agregarIngrediente(String ingrediente);

    void agregarQuesoExtraEnBorde();

    Pizza construir();
}
