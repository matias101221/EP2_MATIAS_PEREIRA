package com.mycompany.ep2_matias_pereira;

import java.util.Scanner;    // SE IMPORTA LA UTILIDAD SCANNER DE JAVA PARA GUARDAR DATOS POR CONSOLA

// CREAMOS CLASE QUE SERA LA MAIN
public class EP2_MATIAS_PEREIRA {

    // USAMOS METODO MAIN
    public static void main(String[] args) {
        // Creación de una instancia de DatosFactura para recopilar la información necesaria
        DatosFactura datosFactura = new DatosFactura();

// Cálculo del monto de IVA utilizando el método estático calcularMontoIVA de la clase Ventas
        double montoIVA = Ventas.calcularMontoIVA(datosFactura.getMontoVentas());

// Cálculo de utilidades utilizando el método estático calcularUtilidades de la clase Ventas
        double utilidades = Ventas.calcularUtilidades(datosFactura.getTotalVentas(), datosFactura.getMontoVentas());

// Impresión de los datos recopilados del objeto datosFactura y los resultados de los cálculos
        System.out.println("Cliente: " + datosFactura.getNombreCliente());
        System.out.println("RUT del Cliente: " + datosFactura.getRutCliente());
        System.out.println("Nombre de la Empresa: " + datosFactura.getNombreEmpresa());
        System.out.println("RUT de la Empresa: " + datosFactura.getRutEmpresa());
        System.out.println("Giro de la Empresa: " + datosFactura.getGiroEmpresa());
        System.out.println("Total de Ventas: " + Math.round(datosFactura.getTotalVentas()));
        System.out.println("Monto de Ventas: " + Math.round(datosFactura.getMontoVentas()));
        System.out.println("Monto de IVA a pagar: " + Math.round(montoIVA));
        System.out.println("Monto de utilidades: " + Math.round(utilidades));
         
        
        String[] arrayDatos = {
    datosFactura.getNombreCliente(),
    datosFactura.getRutCliente(),
    datosFactura.getNombreEmpresa(),
    datosFactura.getRutEmpresa(),
    datosFactura.getGiroEmpresa(),
    String.valueOf(datosFactura.getTotalVentas()),
    String.valueOf(datosFactura.getMontoVentas()),
    String.valueOf(montoIVA),
    String.valueOf(utilidades)
};
        
        
        

        

    }
}
