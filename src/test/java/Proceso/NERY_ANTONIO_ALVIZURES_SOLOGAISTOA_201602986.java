/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proceso;

import Objetos.Carrera;
import Objetos.Horario;
import Objetos.RegistroAcademico;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

public class NERY_ANTONIO_ALVIZURES_SOLOGAISTOA_201602986 {
    
    AsignarHorario asignacion;
    Carrera carrera_mock;
    RegistroAcademico registro_mock;
   
    @Before
    public void init() throws Exception{
        asignacion = new AsignarHorario();
        
        carrera_mock = mock(Carrera.class);
        
        when(carrera_mock.getCodigo()).thenReturn(2);
        when(carrera_mock.procesarCarrera()).thenReturn(1);

        registro_mock = mock(RegistroAcademico.class);
        when(registro_mock.cheequearCarnet()).thenReturn(true);
        when(registro_mock.getAnio()).thenReturn(2016);
    }
    
    @Test
    public void carnetValidoAceptado() throws Exception{
 
        Assert.assertNotNull(asignacion.generarHorario(carrera_mock, registro_mock));

    }
    
    
    @Test
    public void descripcionTest() throws Exception{
       
        Assert.assertEquals(asignacion.generarHorario(carrera_mock, registro_mock).getDescripcion(),"Mixto");
    }
    

    
}
