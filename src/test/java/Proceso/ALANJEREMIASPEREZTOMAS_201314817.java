/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

public class ALANJEREMIASPEREZTOMAS_201314817 {
   @InjectMocks
    private AsignarHorario asignacion;


    @Mock 
    private Carrera carrera;
    @Mock
    private Horario horario;
    @Mock 
    private RegistroAcademico registro;
    
    public ALANJEREMIASPEREZTOMAS_201314817() {
    }

    @BeforeEach
    public void inicio() {
        MockitoAnnotations.initMocks(this);
    }

    @Before
    public void pruebaMockito() throws Exception{
        registro = new RegistroAcademico(2013, "14817");
        carrera = new Carrera(9, "Ingenieria en Ciencias y Sistemas");
        asignacion = new AsignarHorario();

        when(asignacion.generarHorario(carrera, registro)).thenCallRealMethod();
        horario =  asignacion.generarHorario(carrera, registro);
    }

    @Test
    public void horarioNoNull() throws Exception {
        System.out.println("El horario no deberia ser nulo");
        assertNotNull(this.horario);
    }

    @Test
    public void codigoNoNull() throws Exception {
        System.out.println("");
        assertNotNull(horario.getCodigoHorario());
    }
  

}
