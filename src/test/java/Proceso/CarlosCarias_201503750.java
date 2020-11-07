/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proceso;

import Objetos.Carrera;
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
 * @author carlo
 */
public class CarlosCarias_201503750 {
    
    @InjectMocks AsignarHorario horarioTest = null;
    @Mock Carrera mockCarrera;
    @Mock RegistroAcademico mockCarnet;
    public CarlosCarias_201503750() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        mockCarrera = Mockito.mock(Carrera.class);
        mockCarnet = Mockito.mock(RegistroAcademico.class);
        horarioTest = new AsignarHorario();
    }
    
    @AfterEach
    public void tearDown() {
    }
    

    @Test
    public void HorarioMatutinoCorrecto() throws Exception {
        // using Mockito.mock() method
        Horario horarioResult = new Horario();
        horarioResult.setCodigoHorario(165);
        horarioResult.setDescripcion("Matutino");
        when(mockCarrera.procesarCarrera()).thenReturn(3);
        when(mockCarnet.cheequearCarnet()).thenReturn(Boolean.TRUE);
        when(mockCarnet.getAño()).thenReturn(2015);
        assertEquals(horarioResult.getCodigoHorario(), horarioTest.generarHorario(mockCarrera, mockCarnet).getCodigoHorario());
        assertEquals(horarioResult.getDescripcion(), horarioTest.generarHorario(mockCarrera, mockCarnet).getDescripcion());
    }
    
    @Test
    public void HorarioInCorrecto() throws Exception {
        Horario horarioResult = new Horario();
        horarioResult.setCodigoHorario(165);
        horarioResult.setDescripcion("Matutino");
        when(mockCarrera.procesarCarrera()).thenReturn(3);
        when(mockCarnet.cheequearCarnet()).thenReturn(Boolean.FALSE);
        when(mockCarnet.getAño()).thenReturn(2015);
        Exception exception = null;
        try {
            horarioTest.generarHorario(mockCarrera, mockCarnet);
        } catch (Exception e) {
            exception = e;
        }
        assertNotNull(exception);
    }
}
