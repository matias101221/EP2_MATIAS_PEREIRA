package com.mycompany.ep2_matias_pereira;

// Clase Ventas que realiza cálculos relacionados con las ventas y utilidades
class Ventas {

    // Método estático para calcular el monto de IVA sobre el monto de ventas dado
    public static double calcularMontoIVA(double montoVentas) {
        return Math.round(montoVentas * 0.19); // Calcula el monto de IVA como el 19% del monto de ventas y lo redondea
    }

    // Método estático para calcular las utilidades dados el total de ventas y el monto de ventas
    public static double calcularUtilidades(double totalVentas, double montoVentas) {
        // Calcula el monto de IVA llamando al método calcularMontoIVA
        double montoIVA = calcularMontoIVA(montoVentas);
        // Calcula las utilidades restando el monto de IVA del total de ventas
        double montoUtilidades = totalVentas - montoIVA;
        return montoUtilidades; // Devuelve el monto de utilidades
    }
}
