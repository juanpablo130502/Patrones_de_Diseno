package Problema1_TMethod;

public class PdPrAlimento extends ProcesoPedido{
    @Override
    protected void verificarInventario(Producto producto) {
        System.out.println("Verificando inventario del producto : "+producto.getNombre());
    }

    @Override
    protected void totalPedido(Producto producto) {
        System.out.println("Calculando el valor total del producto : "+producto.getPrecio());
    }

    @Override
    protected void facturar(Producto producto) {
        System.out.println("Facturando al cliente el producto : "+producto.getPrecio());
    }

    @Override
    protected void notificarCliente(Producto producto) {
        System.out.println("Notificando al cliente que se realizo el correctamente el pedido del : "+producto.getNombre());
    }
}
