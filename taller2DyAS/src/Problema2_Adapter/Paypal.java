package Problema2_Adapter;

public class Paypal implements MetodosDePago{
    private String banco;
    private int saldoAPagar;
    private int saldoDisponible;

    public Paypal(String banco, int saldoAPagar, int saldoDisponible)
    {
        this.banco=banco;
        this.saldoAPagar=saldoAPagar;
        this.saldoDisponible=saldoDisponible;
    }
    public Paypal() {
    }

    @Override
    public String getBanco() {

        return banco;
    }

    @Override
    public int getSaldoDisponible() {

        return saldoDisponible;
    }

    @Override
    public int getSaldoAPagar() {

        return saldoAPagar;
    }
}
