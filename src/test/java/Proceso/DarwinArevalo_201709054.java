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
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import Objetos.Horario;

/**
 * @author Darwin Arevalo - 201709054
 */
public class DarwinArevalo_201709054 {
    private static AsignarHorario asignarHorario;
    private static Carrera carrera;
    private static RegistroAcademico registroAcademico;

    @BeforeAll
    public static void setup() {
        asignarHorario = new AsignarHorario();
        carrera = new Carrera(4, "Ingeniería");
        registroAcademico = new RegistroAcademico(2017, "09054");
    }

    @Test
    public void firstTest() throws Exception {
        Horario horario = asignarHorario.generarHorario(carrera, registroAcademico);
        assertEquals(847, horario.getCodigoHorario(), "Debe retornar el código correcto de horario");
        assertEquals("Nocturno", horario.getDescripcion(), "Debe retornar el horario Nocturno");
    }

    @Test
    public void secondTest() throws Exception {
        assignHorarioMock();

        assertThrows(java.lang.Exception.class, () -> {
            asignarHorario.generarHorario(carrera, registroAcademico);
        }, "Debe retornar una exception porque el carnet no esta correcto");
    }

    public void assignHorarioMock() throws Exception {
        carrera = mock(Carrera.class);
        registroAcademico = mock(RegistroAcademico.class);
        when(carrera.procesarCarrera()).thenReturn(3);
        when(registroAcademico.getAnio()).thenReturn(2015);
        when(registroAcademico.cheequearCarnet()).thenReturn(false);
    }
}