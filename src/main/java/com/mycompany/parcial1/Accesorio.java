package com.mycompany.parcial1;

public class Accesorio extends Producto {

    public String tipo;

    public Accesorio(String nombre, String descripcion, double precio, int cantidadInventario, String tipo) {
        super(nombre, descripcion, precio, cantidadInventario);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return super.toString() + ", Accesorio{" + "tipo='" + tipo + '\'' + '}';
    }
}
