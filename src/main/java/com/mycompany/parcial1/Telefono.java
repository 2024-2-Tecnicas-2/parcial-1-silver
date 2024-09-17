package com.mycompany.parcial1;

public class Telefono extends Producto {

    public String marca;
    public String modelo;

    public Telefono(String nombre, String descripcion, double precio, int cantidadInventario, String marca, String modelo) {
        super(nombre, descripcion, precio, cantidadInventario);
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return super.toString() + ", Telefono{" + "marca='" + marca + '\'' + ", modelo='" + modelo + '\'' + '}';
    }
}
