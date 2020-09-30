package Proceso;
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

public class Chay_201700345 {

    /*Variables staticas*/
    private static AsignarHorario asigHorario;

    /*Objetos globales*/
    private Estudiante alumno;
    private Horario horario;
     
    /* Realizo la creación de objeto asignHorario, completando su constructor */
    @BeforeAll
    public static void setUp() {
        asigHorario = new AsignarHorario();
        asigHorario.generarHorario(new Carrera(9,"Ciencias y Sistemas"),new RegistroAcademico(2017,"00345"));
    }

    /*Si llega null, estoy realizando instanceando mal mi objeto*/
    @Test
    public void generarHorarioNotNull() { assertNotNull(asigHorario, "Presentar si es null"); }

    /* Valido los metodos de las clases */
    @Test
    public void horario_Mockito() throws Exception {
        Carrera escuela = Mockito.mock(Carrera.class);
        RegistroAcademico carnet = Mockito.mock(RegistroAcademico.class);
        when(escuela.getCodigo()).thenReturn(9);
        when(carnet.cheequearCarnet()).thenReturn(true);
        when(carnet.getAnio()).thenReturn(2017);
        when(escuela.procesarCarrera()).thenReturn(3);
        assertEquals("Matutino", asigHorario.generarHorario(escuela, carnet).getDescripcion());
    }
}
