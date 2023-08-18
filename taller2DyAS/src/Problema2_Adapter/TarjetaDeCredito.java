package Problema2_Adapter;

public class TarjetaDeCredito implements MetodosDePago{
    private String banco;
    private int saldoAPagar;
    private int saldoDisponible;

    public TarjetaDeCredito (String banco, int saldoAPagar, int saldoDisponible)
    {
        this.banco=banco;
        this.saldoAPagar=saldoAPagar;
        this.saldoDisponible=saldoDisponible;
    }
    public TarjetaDeCredito() {
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
