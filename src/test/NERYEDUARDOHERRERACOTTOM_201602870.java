import static org.mockito.BDDMockito.given;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import Objetos.Horario;
import Objetos.Carrera;
import org.mockito.Spy;

public class NERYEDUARDOHERRERACOTTOM_201602870 {

    public AsignarHorario asignacion;
    Carrera carrera;
    RegistroAcademico registro;


    @BeforeAll
    public static void setUp() {
        carrera  = Mockito.mock(Carrera.class);
        registro = Mockito.mock(RegistroAcademico.class);
    }


    @Test
    public void test_1() throws Exception {
        when(carrera.procesarCarrera()).thenReturn(5);
        assertEquals(new Double(5), new Double(carrera.procesarCarrera());
    }

    @Test
    public void test_2() throws Exception    
    {
        registro = new RegistroAcademico(2016, "02870");
        carrera = new Carrera(10, "Unknown");
        String exp = asignacion.generarHorario(carrera, registro).toString();
        String res = "Registro invalido";
        assertEquals(asignacion.generarHorario(carrera, registro).toString(), "Registro invalido");
    }

}
