 package com.moduloveterinaria.model;

public class informacionMascota {
    // Definir atributos de la clase informacionMascota
    private String nombre;
    private String tipo;
    private int edad;

    // Constructor
    public informacionMascota() {}

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}


