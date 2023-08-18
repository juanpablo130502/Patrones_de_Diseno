package Problema1_TMethod;

abstract class ProcesoPedido {

    public void procesoPedido(Producto producto){
        verificarInventario(producto);
        totalPedido(producto);
        facturar(producto);
        notificarCliente(producto);
    }

    protected abstract void verificarInventario(Producto producto);
    protected abstract void notificarCliente(Producto producto);
    protected abstract void facturar(Producto producto);
    protected abstract void totalPedido(Producto producto);
}
