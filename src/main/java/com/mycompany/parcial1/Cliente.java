package com.mycompany.parcial1;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    public String nombre;
    public String direccionEnvio;
    public List<Pedido> pedidos;

    public Cliente(String nombre, String direccionEnvio) {
        this.nombre = nombre;
        this.direccionEnvio = direccionEnvio;
        this.pedidos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccionEnvio() {
        return direccionEnvio;
    }

    public void setDireccionEnvio(String direccionEnvio) {
        this.direccionEnvio = direccionEnvio;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void agregarPedido(Pedido pedido) {
        this.pedidos.add(pedido);
    }

    @Override
    public String toString() {
        return "Cliente{"
                + "nombre='" + nombre + '\''
                + ", direccionEnvio='" + direccionEnvio + '\''
                + ", pedidos=" + pedidos
                + '}';
    }
}
