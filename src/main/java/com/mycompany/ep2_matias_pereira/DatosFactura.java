package com.mycompany.ep2_matias_pereira;

import java.util.Scanner;

// Clase que recopila datos de la factura a través de la entrada del usuario
class DatosFactura {

    // Variables privadas de la clase
    private String nombre_Cliente;
    private String rut_Cliente;
    private String nombre_Empresa;
    private String rut_Empresa;
    private String giro_Empresa;
    private double total_Ventas;
    private double monto_Ventas;

    // Constructor de la clase DatosFactura que recopila datos del usuario a través de la entrada estándar
    public DatosFactura() {
        // Creación de una instancia de Scanner para recopilar datos del usuario
        Scanner scanner = new Scanner(System.in);

        // Recopilación del nombre del cliente
        System.out.print("Nombre del Cliente: ");
        this.nombre_Cliente = scanner.nextLine();

        // Recopilación del RUT del cliente
        System.out.print("RUT del Cliente: ");
        this.rut_Cliente = scanner.nextLine();

        // Recopilación del nombre de la empresa
        System.out.print("Nombre de la Empresa: ");
        this.nombre_Empresa = scanner.nextLine();

        // Recopilación del RUT de la empresa
        System.out.print("RUT de la Empresa: ");
        this.rut_Empresa = scanner.nextLine();

        // Recopilación del giro de la empresa
        System.out.print("Giro de la Empresa: ");
        this.giro_Empresa = scanner.nextLine();

        // Recopilación del total de ventas
        System.out.print("Total de Ventas: ");
        this.total_Ventas = scanner.nextDouble();

        // Recopilación del monto de ventas
        System.out.print("Monto de Ventas: ");
        this.monto_Ventas = scanner.nextDouble();
    }

    // Métodos getter para acceder a los datos recopilados
    public String getNombreCliente() {
        return nombre_Cliente;
    }

    public String getRutCliente() {
        return rut_Cliente;
    }

    public String getNombreEmpresa() {
        return nombre_Empresa;
    }

    public String getRutEmpresa() {
        return rut_Empresa;
    }

    public String getGiroEmpresa() {
        return giro_Empresa;
    }

    public double getTotalVentas() {
        return total_Ventas;
    }

    public double getMontoVentas() {
        return monto_Ventas;
    }
}
