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
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;


/**
 *
 * @author tu3
 */
public class EVERALDO_ZACARÍAS_EDWAR_201503986 {
    private AsignarHorario AHorario;
    private Carrera Carrera1;
    
    private Estudiante EstudianteValido;
    private Estudiante EstudianteInvalido;
    
    public EVERALDO_ZACARÍAS_EDWAR_201503986() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        AHorario = new AsignarHorario();
        
        EstudianteValido = mock(Estudiante.class);
        EstudianteInvalido = mock(Estudiante.class);
        when(EstudianteValido.getCarrera()).thenReturn(Carrera1);
        when(EstudianteInvalido.getCarrera()).thenReturn(Carrera1);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of generarHorario method, of class AsignarHorario.
     */
    @org.junit.Test
    public void testGenerarHorario() throws Exception {
        System.out.println("generarHorario");
        Carrera carrera = null;
        RegistroAcademico carnet = null;
        AsignarHorario instance = new AsignarHorario();
        Horario expResult = null;
        Horario result = instance.generarHorario(carrera, carnet);
        assertNotNull(result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @org.junit.Test
    public void testGenerarHorario2() throws Exception {
        System.out.println("generarHorario");
        Carrera carrera = null;
        RegistroAcademico carnet = null;
        AsignarHorario instance = new AsignarHorario();
        Horario expResult = null;
        Horario result = instance.generarHorario(carrera, carnet);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of generarHorario method, of class AsignarHorario.
     */
    
//    @org.junit.Test 
//    public void AsignarHorario_testmockAsignarHorario() {
//    AHorario.generarHorario(EstudianteValido);        
//    }
}
