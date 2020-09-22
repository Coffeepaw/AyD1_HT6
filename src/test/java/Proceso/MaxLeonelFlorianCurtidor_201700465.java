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

public class MaxLeonelFlorianCurtidor_201700465() {

    
    Horario horario = new Horario();
    AsignarHorario asignacion = new AsignarHorario();
    

    public MaxLeonelFlorianCurtidor_201700465(){

    }

    @Test
    public void AsignacionVacia() {
        assertNotNull(asignacion);
    }

    @Test
    public void HorarioVacio() {
        assertNotNull(horario);
    }



}
