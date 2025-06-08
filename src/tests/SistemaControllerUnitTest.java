package tests;

import controllers.SistemaController;
import models.SistemaSolar;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SistemaControllerUnitTest {

    @Test
    public void testViabilidadPositiva() {
        SistemaController sc = new SistemaController();
        SistemaSolar sistema = new SistemaSolar(2.0, 10, 9000000);
        assertEquals("Proyecto viable", sc.evaluarViabilidad(sistema));
    }

    @Test
    public void testViabilidadNegativaPorCosto() {
        SistemaController sc = new SistemaController();
        SistemaSolar sistema = new SistemaSolar(2.0, 10, 15000000);
        assertEquals("Proyecto requiere ajustes", sc.evaluarViabilidad(sistema));
    }

    @Test
    public void testViabilidadNegativaPorCapacidad() {
        SistemaController sc = new SistemaController();
        SistemaSolar sistema = new SistemaSolar(1.0, 10, 9000000);
        assertEquals("Proyecto requiere ajustes", sc.evaluarViabilidad(sistema));
    }

    @Test
    public void testCostoPorKWExacto() {
        SistemaController sc = new SistemaController();
        SistemaSolar sistema = new SistemaSolar(2.0, 8, 10000000);
        assertEquals(5000000, sc.calcularCostoPorKW(sistema));
    }

    @Test
    public void testCostoPorKWDecimal() {
        SistemaController sc = new SistemaController();
        SistemaSolar sistema = new SistemaSolar(2.5, 12, 10000000);
        assertEquals(4000000, sc.calcularCostoPorKW(sistema), 0.001);
    }
}

