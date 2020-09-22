/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proceso;

import Objetos.Carrera;
import Objetos.Horario;
import Objetos.RegistroAcademico;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

/**
 *
 * @author ronald
 */
public class RONALDGABRIELROMEROGONZÁLEZ_201701048 {
    @Mock
    static Carrera mockitoCarrera = new Carrera(1,"Ciencias y sistemas");
    public RONALDGABRIELROMEROGONZÁLEZ_201701048() {
    }
    
    @BeforeClass
    public static void setUpClass() throws Exception {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of generarHorario method, of class AsignarHorario.
     */
    @Test
    public void testGenerarHorario() throws Exception {
        System.out.println("generarHorario");
        Carrera carrera =new Carrera(1,"Ciencias y sistemas");
        RegistroAcademico carnet = new RegistroAcademico(2017,"01048");
        AsignarHorario instance = new AsignarHorario();
        Horario expResult = null;
        Horario result = instance.generarHorario(carrera, carnet);
        assertNotEquals(expResult, result);
    }
    
    /**
     * Test of generarHorario method, of class AsignarHorario.
     */
    @Test
    public void testGenerarHorario2() throws Exception {
        System.out.println("generarHorario -> testing results");
        Carrera carrera = new Carrera(1,"Ciencias y sistemas");
        RegistroAcademico carnet = new RegistroAcademico(2017,"01048");
        AsignarHorario instance = new AsignarHorario();
        Horario result = instance.generarHorario(carrera, carnet);
        assertTrue(result.getDescripcion().equals("Vespertino"));
    }
    
    @Test
    public void testMockito() throws Exception{
        System.out.println("@BeforeClass -> setUpClass()");
        Mockito.when(mockitoCarrera.procesarCarrera()).thenReturn(2);
        assertEquals("Deben ser iguales", mockitoCarrera.procesarCarrera(), 2);
    }
    
}
