/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proceso;

import Objetos.Carrera;
import Objetos.RegistroAcademico;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.Mock;
import static org.junit.Assert.*;
import org.mockito.InjectMocks;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 *
 * @author edgom
 */
@RunWith(MockitoJUnitRunner.class)
public class EDWARD_DANILO_GOMEZ_HERNANDEZ_201602909 {
        
    @Mock
    Carrera Ingenieria = mock(Carrera.class);
    
    @InjectMocks
    RegistroAcademico ra = new RegistroAcademico(2016,"029009");
    
    @Test
    public void test_ProcesarCarrera() throws Exception {
        when(Ingenieria.procesarCarrera()).thenReturn(5);
        assertEquals(5.0, Ingenieria.procesarCarrera(), .01);
    }
    
    @Test
    public void test_ChequeoCarnet() {
        assertFalse(ra.cheequearCarnet());
    }
}