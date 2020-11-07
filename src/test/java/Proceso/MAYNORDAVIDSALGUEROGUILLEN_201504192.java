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

/**
 *
 * @author madas
 */


public class MAYNORDAVIDSALGUEROGUILLEN_201504192 {
   
    
    @Test
    public void PruebaCheequearCarnet(){
        registro1 = new RegistroAcademico(2020, "00000");
        Assert.assertTrue(registro1.cheequearCarnet());
    }
    
    public void PruebaGenerarHorarioIncorrecto(){
        registro = new RegistroAcademico(2020, "00000");
        carrera = new Carrera(00, "No Existe");
        if(AsignarHorario.generarHorario(carrera, registro) instanceof String){
            assertEquals(AsignarHorario.generarHorario(carrera, registro).toString(), "Registro invalido");
        }
    }
    
}
