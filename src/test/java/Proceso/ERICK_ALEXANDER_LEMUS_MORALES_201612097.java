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
 * @author erick
 */
public class ERICK_ALEXANDER_LEMUS_MORALES_201612097 {
    
    private Estudiante estudiante;
    private Horario horario;
    private Carrera carrera;
    private RegistroAcademico ra;
    private static AsignarHorario ah;
    
    @BeforeAll
    public static void setUp() {
        ah = new AsignarHorario();
    }
    
    @Test
    public void AsignarHorarioNoNull() {
        assertNotNull(ah, "Dbería no ser null");
    }
    
    @Test
    public void Prueba2() throws Exception {
        estudiante = Mockito.mock(Estudiante.class);
        carrera = Mockito.mock(Carrera.class);
        ra = Mockito.mock(RegistroAcademico.class);
        when(ra.getAnio()).thenReturn(2020);
        when(ra.cheequearCarnet()).thenReturn(true);
        when(carrera.getCodigo()).thenReturn(5);
        when(carrera.procesarCarrera()).thenReturn(4);
        assertEquals("Nocturno", ah.generarHorario(carrera, ra).getDescripcion());
    }
    
}
