/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proceso;


import Objetos.*;
import org.junit.jupiter.api.*;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.*;


public class HenryFranciscoLeonHernandez_201503577 {

    //Sección de Mocks
    @Mock
    private Horario horario;

    @Mock
    private Carrera carrera;

    @Mock
    private RegistroAcademico registro;

    //Sección para inyectar el mock
    @InjectMocks
    private AsignarHorario asignacion;
    
    //Before (SetUp)
    @Before
    public void setUp() throws Exception{
        MockitoAnnotations.initMocks(this);
        registro = new RegistroAcademico(2015, "03577");
        carrera = new Carrera(9, "Ingeniería en Ciencias y Sistemas");
        asignacion = new AsignarHorario();

        when(asignacion.generarHorario(carrera, registro)).thenCallRealMethod();
        horario =  asignacion.generarHorario(carrera, registro);
    }

    //Tests
    @Test
    public void ObtenerHorarioNoNulo() throws Exception {
        System.out.println("Verificando el retorno del horario no null");
        assertNotNull(this.horario);
    }

    @Test
    public void VerificarRangoCarrera() throws Exception{
        System.out.println("Verificando que retorne el valor correcto de procesarCarrera")
        assertEquals(carrera.procesarCarrera(), 1);
    }

    @Test
    public void VeerificarDescripcionCarrera() throws Exception {
        System.out.println("Verificando la descripción de la carrera correctamente");
        boolean flag = false;

        if(horario.getDescripcion().equals("Mixto")){
            flag = true;
        }

        assertTrue(flag);
    }
}
