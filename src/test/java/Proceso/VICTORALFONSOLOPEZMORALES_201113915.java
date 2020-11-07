/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proceso;

import Objetos.Carrera;
import Objetos.RegistroAcademico;
import Objetos.Horario;
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
 * @author victo
 */
public class VICTORALFONSOLOPEZMORALES_201113915 {
       
    @InjectMocks
    private AsignarHorario asignar_horario;
    
    @Mock 
    private Carrera carrera;
    @Mock
    private Horario horario;
    @Mock 
    private RegistroAcademico registro_academico;
    
    @BeforeEach
    public void setUp() throws Exception {
        
        MockitoAnnotations.initMocks(this);
        
        carrera = Mockito.mock(Carrera.class);
        registro_academico = Mockito.mock(RegistroAcademico.class);
        asignar_horario = new AsignarHorario();
        
        when(asignar_horario.generarHorario(carrera, registro_academico)).thenCallRealMethod();
        when(registro_academico.cheequearCarnet()).thenReturn(true);
        when(carrera.procesarCarrera()).thenReturn(1);
        when(registro_academico.getAnio()).thenReturn(2016);
        when(carrera.procesarCarrera()).thenReturn(3);   
        
        horario = asignar_horario.generarHorario(carrera, registro_academico);
    }
    
    @Test
    public void Comprobar_existencia() throws Exception {
        System.out.println("Verificar que el horario no sea nulo");
        assertNotNull(this.horario,"No deberia ser nulo");
    }
    
    @Test
    public void comprobar_cambios() throws Exception {
        System.out.println("Comprobando resultados");
        when(registro_academico.getAnio()).thenReturn(2011);
        when(registro_academico.cheequearCarnet()).thenReturn(true);
        when(carrera.getCodigo()).thenReturn(5);
        when(carrera.procesarCarrera()).thenReturn(1);
        assertEquals("Nocturno", asignar_horario.generarHorario(carrera, registro_academico).getDescripcion());
    }
    
}
