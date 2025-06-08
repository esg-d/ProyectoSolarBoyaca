// archivo: controllers/SistemaController.java
package controllers;

import models.SistemaSolar;

public class SistemaController {
    public String evaluarViabilidad(SistemaSolar sistema) {
        if (sistema.getCostoTotal() <= 10000000 && sistema.getCapacidadKW() >= 1.5) {
            return "Proyecto viable";
        } else {
            return "Proyecto requiere ajustes";
        }
    }

    public double calcularCostoPorKW(SistemaSolar sistema) {
        return sistema.getCostoTotal() / sistema.getCapacidadKW();
    }
}

