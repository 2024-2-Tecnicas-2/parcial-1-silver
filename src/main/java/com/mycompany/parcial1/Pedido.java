package com.mycompany.parcial1;

import java.util.HashMap;
import java.util.Map;

public class Pedido {

    public Cliente cliente;
    public Map<Producto, Integer> productos;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.productos = new HashMap<>();
    }

    public void agregarProducto(Producto producto, int cantidad) {
        if (producto.getCantidadInventario() >= cantidad) {
            productos.put(producto, cantidad);
            producto.setCantidadInventario(producto.getCantidadInventario() - cantidad);
        } else {
            System.out.println("No hay suficiente inventario para " + producto.getNombre());
        }
    }

    public void mostrarPedido() {
        System.out.println("Pedido para el cliente: " + cliente.getNombre());
        for (Map.Entry<Producto, Integer> entry : productos.entrySet()) {
            Producto producto = entry.getKey();
            int cantidad = entry.getValue();
            System.out.println("Producto: " + producto.getNombre() + ", Cantidad: " + cantidad + ", Precio Total: " + (producto.getPrecio() * cantidad));
        }

    }
}
