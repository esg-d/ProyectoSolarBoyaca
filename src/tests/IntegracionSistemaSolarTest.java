package tests;

import controllers.SistemaController;
import models.SistemaSolar;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IntegracionSistemaSolarTest {
    @Test
    public void testFlujoCompletoExitoso() {
        SistemaSolar sistema = new SistemaSolar(3.0, 15, 8000000);
        SistemaController controlador = new SistemaController();

        String viabilidad = controlador.evaluarViabilidad(sistema);
        double costoKW = controlador.calcularCostoPorKW(sistema);

        assertEquals("Proyecto viable", viabilidad);
        assertEquals(2666666.66, costoKW, 0.1);
    }

    @Test
    public void testFlujoInviablePorAmbosCriterios() {
        SistemaSolar sistema = new SistemaSolar(1.0, 6, 15000000);
        SistemaController controlador = new SistemaController();

        String viabilidad = controlador.evaluarViabilidad(sistema);
        double costoKW = controlador.calcularCostoPorKW(sistema);

        assertEquals("Proyecto requiere ajustes", viabilidad);
        assertEquals(15000000, costoKW);
    }
}
