// archivo: views/ConsolaVista.java
package views;

import models.SistemaSolar;
import controllers.SistemaController;

import java.util.Scanner;

public class ConsolaVista {
    public void iniciar() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la capacidad (kW) del sistema solar:");
        double capacidad = sc.nextDouble();

        System.out.println("Ingrese el número de paneles:");
        int paneles = sc.nextInt();

        System.out.println("Ingrese el costo total del sistema:");
        double costo = sc.nextDouble();

        SistemaSolar sistema = new SistemaSolar(capacidad, paneles, costo);
        SistemaController controlador = new SistemaController();

        String viabilidad = controlador.evaluarViabilidad(sistema);
        double costoKW = controlador.calcularCostoPorKW(sistema);

        System.out.println("Resultado de viabilidad: " + viabilidad);
        System.out.println("Costo por kW: $" + costoKW);
    }
}

