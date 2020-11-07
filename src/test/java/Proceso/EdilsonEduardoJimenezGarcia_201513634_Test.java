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
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

public class EdilsonEduardoJimenezGarcia_201513634_Test {
    Carrera carrera = new Carrera(2, "carrera de prueba");
    RegistroAcademico registroAcademico = new RegistroAcademico(2015, "13634");
    AsignarHorario asignacion = new AsignarHorario();

    @Test
    public void generarHorario() throws Exception{
        Horario horario = asignacion.generarHorario(carrera, registroAcademico);

        try {
            assertEquals(horario.getCodigoHorario(), 856);
        } catch (Exception e) {
            //TODO: handle exception
        }
        
    }

    @Test
    public void verificarDescription() throws Exception{
        Horario horario = asignacion.generarHorario(carrera, registroAcademico);

        try {
            assertEquals(horario.getDescripcion(), "Vespertino");
        } catch (Exception e) {
            //TODO: handle exception
        }
    }
}
