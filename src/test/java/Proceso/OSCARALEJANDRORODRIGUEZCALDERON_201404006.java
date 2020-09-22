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

public class AsignarHorarioTest {

    @InjectMocks
    private AsignarHorario horario;
    
    
    @Mock
    private RegistroAcademico registroAcademico;
    
    @Mock
    private Carrera carrera;
    
    
    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }
    /**
     Carrera = 09
     Carnet = 2014
      
     Retorna 414
    */
    
    @Test
    public void addCodHorario() {
        when(registroAcademico.cheequearCarnet()).thenReturn(true);
        when(carrera.procesarCarrera()).thenReturn(1);
        when(registroAcademico.getAnio()).thenReturn(2014);
        
        horario = new Horario();
        
        assertEquals(414, horario.generarHorario(carrera, registroAcademico).getCodigoHorario());
    }
    
    @Test
    public void addCarrera() {
        when(registroAcademico.cheequearCarnet()).thenReturn(true);
        when(carrera.procesarCarrera()).thenReturn(1);
        when(registroAcademico.getAnio()).thenReturn(ArgumentMatchers.anyInt());
        
        horario = new Horario();
        
        assertEquals("Mixto", horario.generarHorario(carrera, registroAcademico).getDescripcion());
    }
}
