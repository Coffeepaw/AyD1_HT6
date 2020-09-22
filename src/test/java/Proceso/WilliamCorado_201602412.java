/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proceso;
import Objetos.Carrera;
import Objetos.Estudiante;
import Objetos.Horario;
import Objetos.RegistroAcademico;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
/**
 *
 * @author william
 */
public class WilliamCorado_201602412 {

    private Estudiante estudiante;
    private Horario horario;
    private Carrera carrera;
    private RegistroAcademico registro;
    private static AsignarHorario asigHorario;

    @BeforeAll
    public static void setUp() {
        carrera = new Carrera(1,"prueba");
        registro = new RegistroAcademico(2016,"02412");
        asigHorario = new AsignarHorario();
        asigHorario.generarHorario(carrera,registro);
    }

    @Test
    public void generarHorarioNotNull() {
        assertNotNull(asigHorario, "Dbería no ser null");
    }

    @Test
    public void generarHorario_Mockito() throws Exception {
        carrera = Mockito.mock(Carrera.class);
        registro = Mockito.mock(RegistroAcademico.class);
        when(carrera.getCodigo()).thenReturn(1);
        when(registro.cheequearCarnet()).thenReturn(true);
        when(ra.getAnio()).thenReturn(2016);
        when(carrera.procesarCarrera()).thenReturn(2);
        assertEquals("Vespertino", asigHorario.generarHorario(carrera, registro).getDescripcion());
    }
}
