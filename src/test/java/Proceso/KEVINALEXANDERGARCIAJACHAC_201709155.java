/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proceso;

import Objetos.Carrera;
import Objetos.RegistroAcademico;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Objetos.Horario;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import static org.mockito.BDDMockito.given;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
/**
 *
 * @author KEVIN GARCIA
 */
public class KEVINALEXANDERGARCIAJACHAC_201709155 {
    
    @InjectMocks
    private AsignarHorario asignacion;
    
    
    @Mock 
    private Carrera carrera;
    @Mock
    private Horario horario;
    @Mock 
    private RegistroAcademico registro;
    
    
    
    public KEVINALEXANDERGARCIAJACHAC_201709155() {
    }
    
    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }
    
    @Before
    public void setUp2() throws Exception{
        registro = new RegistroAcademico(2017, "09155");
        carrera = new Carrera(9, "Ingeniería en Ciencias y Sistemas");
        asignacion = new AsignarHorario();
        
        when(asignacion.generarHorario(carrera, registro)).thenCallRealMethod();
        horario =  asignacion.generarHorario(carrera, registro);
    }
    
    @Test
    public void horarioNotNull() throws Exception {
        System.out.println("Horario no nulo luego de inializar mock");
        assertNotNull(this.horario);
    }
    
    @Test
    public void codigoNotNull() throws Exception {
        System.out.println("Codigo de horario no nulo luego de inializar mock");
        assertNotNull(horario.getCodigoHorario());
    }
    
}
