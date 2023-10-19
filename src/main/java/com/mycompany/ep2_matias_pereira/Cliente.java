package com.mycompany.ep2_matias_pereira;

// Clase que define los atributos y métodos del cliente
public class Cliente {

    // Definición de variables
    String nombre;
    String apellidos;
    int edad;
    String rut;
    String nombreEmpresa;
    String rutEmpresa;
    String giroEmpresa;
    double totalVentas;
    double montoVentas;

    // Constructor de la clase Cliente
    public Cliente(String nombre, String apellidos, int edad, String rut, String nombreEmpresa, String rutEmpresa, String giroEmpresa, double totalVentas, double montoVentas) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.rut = rut;
        this.nombreEmpresa = nombreEmpresa;
        this.rutEmpresa = rutEmpresa;
        this.giroEmpresa = giroEmpresa;
        this.totalVentas = totalVentas;
        this.montoVentas = montoVentas;
    }

    // Método para calcular el monto de IVA
    public double calcularMontoIVA() {
        return getMontoVentas() * 0.19; // Calcula el IVA como el 19% del monto de ventas
    }

    // Método para calcular las utilidades
    public double calcularUtilidades() {
        double montoIVA = calcularMontoIVA();
        double montoUtilidades = getTotalVentas() - montoIVA; // Calcula las utilidades restando el IVA del total de ventas
        return montoUtilidades;
    }

    // METODO GETTER AND SETTER PARA PODER ACCEDER A LOS DATOS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getRutEmpresa() {
        return rutEmpresa;
    }

    public void setRutEmpresa(String rutEmpresa) {
        this.rutEmpresa = rutEmpresa;
    }

    public String getGiroEmpresa() {
        return giroEmpresa;
    }

    public void setGiroEmpresa(String giroEmpresa) {
        this.giroEmpresa = giroEmpresa;
    }

    public double getTotalVentas() {
        return totalVentas;
    }

    public void setTotalVentas(double totalVentas) {
        this.totalVentas = totalVentas;
    }

    public double getMontoVentas() {
        return montoVentas;
    }

    public void setMontoVentas(double montoVentas) {
        this.montoVentas = montoVentas;
    }

}
