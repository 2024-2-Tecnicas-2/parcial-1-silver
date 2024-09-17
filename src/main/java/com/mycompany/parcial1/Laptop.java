package com.mycompany.parcial1;

public class Laptop extends Producto {

    public String procesador;
    public int memoriaRAM;

    public Laptop(String nombre, String descripcion, double precio, int cantidadInventario, String procesador, int memoriaRAM) {
        super(nombre, descripcion, precio, cantidadInventario);
        this.procesador = procesador;
        this.memoriaRAM = memoriaRAM;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public int getMemoriaRAM() {
        return memoriaRAM;
    }

    public void setMemoriaRAM(int memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    @Override
    public String toString() {
        return super.toString() + ", Laptop{" + "procesador='" + procesador + '\'' + ", memoriaRAM=" + memoriaRAM + '}';
    }
}
