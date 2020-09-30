
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proceso;

        import Objetos.*;
        import org.junit.jupiter.api.*;
        import static org.junit.jupiter.api.Assertions.*;
        import static org.mockito.BDDMockito.given;
        import org.mockito.*;

        import static org.mockito.Mockito.verify;
        import static org.mockito.Mockito.when;


public class Test_201504002 {

    RegistroAcademico carnet;
    @InjectMocks
    Estudiante estudiante;
    Carrera carrera;
    @Mock
    AsignarHorario test;

    @Mock
    Horario horario;
    @Mock
    RegistroAcademico carne;
    @BeforeAll
    public void init() throws Exception {
         carnet = new RegistroAcademico(2015,"04002");
         carrera = new Carrera(2,"HOli");
         horario = new Horario();
         horario.setCodigoHorario(200);
         when(test.generarHorario(carrera,carnet)).thenReturn(horario);
         when(carne.cheequearCarnet()).thenReturn(false);
    }
    @Test
    public void TestMockito() throws Exception {
        AsignarHorario asignarHorario = new AsignarHorario();
        Horario check =  asignarHorario.generarHorario(carrera,carnet);
        assertEquals(check.getCodigoHorario(),horario.getCodigoHorario());
    }
    @Test
    public void Test2(){
        RegistroAcademico carnet = new RegistroAcademico(1699,"asñldkjf");
        assertFalse(carnet.cheequearCarnet());
    }
}
