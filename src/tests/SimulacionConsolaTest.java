package tests;

import views.ConsolaVista;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class SimulacionConsolaTest {

    @Test
    public void testSimulacionConEntradaValida() {
        String entradaSimulada = "2.0\n8\n9000000\n";
        InputStream stdin = System.in;
        System.setIn(new ByteArrayInputStream(entradaSimulada.getBytes()));

        ConsolaVista vista = new ConsolaVista();
        vista.iniciar();

        System.setIn(stdin);
        // En pruebas reales se redirige también System.out para validar salidas.
    }
}
