package org.example;

public class Cars {

    private String modelo;
    private String marca;
    private String color;
    private int asientos;
    private double valor;

    public Cars() {
    }

    public Cars(String modelo, String nombre, String color, int asientos, double valor) {
        this.modelo = modelo;
        this.marca = nombre;
        this.color = color;
        this.asientos = asientos;
        this.valor = valor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAsientos() {
        return asientos;
    }

    public void setAsientos(int asientos) {
        this.asientos = asientos;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Cars{" +
                "modelo='" + modelo + '\'' +
                ", nombre='" + marca + '\'' +
                ", color='" + color + '\'' +
                ", asientos=" + asientos +
                ", valor=" + valor +
                '}';
    }
}
