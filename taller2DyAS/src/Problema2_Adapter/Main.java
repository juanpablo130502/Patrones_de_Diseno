package Problema2_Adapter;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int valueMethod;
        valueMethod = Integer.parseInt(JOptionPane.showInputDialog("Seleccione metodo de pago"));
        switch (valueMethod){
            case 1: MetodosDePago Paypal = new Paypal();
                System.out.println("Acabas de pagar con Paypal");
                break;
            case 2: MetodosDePago TarjataDeCredito = new TarjetaDeCredito();

                System.out.println("Acabas de pagar con Tarjeta de crédito");
                break;
            case 3: MetodosDePago Adaptee = new AdapterAdaptee(new Adaptee());
                System.out.println("Acabas de pagar con Adaptee");
                break;
        }

    }
}
