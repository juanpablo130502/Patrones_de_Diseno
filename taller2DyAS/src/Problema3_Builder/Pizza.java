package Problema3_Builder;
import java.util.List;

class Pizza {
    private String tamaño;
    private String masa;
    private List<String> ingredientes;
    private boolean quesoExtraEnBorde;

    public Pizza() {
        // Constructor por defecto
    }

    public Pizza(String tamaño, String masa, List<String> ingredientes, boolean quesoExtraEnBorde) {
        this.tamaño = tamaño;
        this.masa = masa;
        this.ingredientes = ingredientes;
        this.quesoExtraEnBorde = quesoExtraEnBorde;
    }

    public double calcularCosto() {
        double costoTotal = 0.0;

        costoTotal += TamanioPorcion.valueOf(tamaño).getCosto();
        costoTotal += TipoMasa.valueOf(masa).getCosto();

        for (String ingrediente : ingredientes) {
            costoTotal += Ingrediente.valueOf(ingrediente).getCosto();
        }

        if (quesoExtraEnBorde) {
            costoTotal += 5000.0;
        }

        return costoTotal;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getMasa() {
        return masa;
    }

    public void setMasa(String masa) {
        this.masa = masa;
    }

    public List<String> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<String> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public boolean isQuesoExtraEnBorde() {
        return quesoExtraEnBorde;
    }

    public void setQuesoExtraEnBorde(boolean quesoExtraEnBorde) {
        this.quesoExtraEnBorde = quesoExtraEnBorde;
    }
}
