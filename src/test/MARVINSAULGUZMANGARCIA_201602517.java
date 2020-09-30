package test;

import Objetos.Carrera;
import Objetos.RegistroAcademico;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

public class MARVINSAULGUZMANGARCIA_201602517 {

    AsignarHorario asig = new AsignarHorario();
    Carrera mockcar = mock(Carrera.class);
    RegistroAcademico mocreg = mock(RegistroAcademico.class);

    @Test
    public void AsignacionNoNull() {
        assertNotNull(asig, "No puede ser Null");
    }

    @Test
    public void PruebaHorarioMatutino() throws Exception
    {
        mocreg = new RegistroAcademico(2020, "12345");
        mockcar = new Carrera(12, "carrera valida");
        String obtenerdescripcion = asig.generarHorario(mockcar, mocreg).getDescripcion();
        assertEquals(obtenerdescripcion, "Matutino");
    }
   
}
