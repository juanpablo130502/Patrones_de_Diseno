package Problema2_Adapter;

public class AdapterAdaptee implements MetodosDePago{
    private Adaptee adaptee;
    private int fondosDisponibles;
    private String nameBanco;
    private int sumaAPagar;

    public void Adaptee (String nameBanco, int sumaAPagar, int fondosDisponibles)
    {
        this.nameBanco=nameBanco;
        this.sumaAPagar=sumaAPagar;
        this.fondosDisponibles=fondosDisponibles;
    }
    public AdapterAdaptee(Adaptee adaptee)
    {

        this.adaptee=adaptee;
    }

    @Override
    public String getBanco() {

        return this.adaptee.getNameBanco();
    }

    @Override
    public int getSaldoDisponible() {
        return this.adaptee.getFondosDisponibles();
    }

    @Override
    public int getSaldoAPagar() {

        return this.adaptee.getSumaAPagar();
    }
}
