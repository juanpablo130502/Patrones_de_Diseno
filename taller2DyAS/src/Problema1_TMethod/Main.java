package Problema1_TMethod;
public class Main {
    public static void main(String[] args) {
        Producto prElectronico = new Producto("AsusVivobook", 2500000);
        Producto prAlimento = new Producto("Hersheys", 5000);
        Producto prRopa = new Producto("Saco H&M", 75000);

        PdPrElectronico pdPrElectronicom = new PdPrElectronico();
        PdPrAlimento pdPrAlimento = new PdPrAlimento();
        PdPrRopa pdPrRopa = new PdPrRopa();

        pdPrElectronicom.procesoPedido(prElectronico);
        pdPrAlimento.procesoPedido(prAlimento);
        pdPrRopa.procesoPedido(prRopa);
    }
}