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

public class LuisFernandoMoralesGarcia_201503612 {

  @Test
    public void p1(){
        AsignarHorario AH=new AsignarHorario();
        Carrera ca= new Carrera(2, 'Sistemas');
        RegistroAcademico RA= new RegistroAcademico(2010, '03612');
        
        assertEquals(AH.generarHorario(ca, RA), 210);
    }
    
     @Test
    public void p1(){
        AsignarHorario AH=new AsignarHorario();
        Carrera ca= new Carrera(4, 'Civil');
        RegistroAcademico RA= new RegistroAcademico(2014, '03612');
        
        assertEquals(AH.generarHorario(ca, RA), 2414);
    }

}
