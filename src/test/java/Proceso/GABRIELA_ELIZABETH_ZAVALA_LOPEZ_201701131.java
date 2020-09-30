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

public class GabrielaElizabethZavalaLopez_201701131 {


    private Estudiante estudiante;
    private Horario horario;
    private Carrera carrera;
    private RegistroAcademico registro;
    private static AsignarHorario asignar_horario;

    //Pruebas de Asignar Horario
    //Ejecutar antes de todo
    @BeforeAll
    public static void setUp() {
        asignar_horario = new AsignarHorario();
        asignar_horario.generarHorario(new Carrera(9,"Ciencias y Sistemas", new RegistroAcademico(2017,"01131")));

    }

    @Test
    public void AsignarHorarioNoNull() {
        assertNotNull(asignar_horario, "No debe retornar un null");
    }

    @Test
    public void PruebaMocks() throws Exception {
        ///declaracion de clases en Mocks
        estudiante = Mockito.mock(Estudiante.class);
        carrera = Mockito.mock(Carrera.class);
        registro = Mockito.mock(RegistroAcademico.class);
        // validaciones de los valores agredados anteriormente
        when(RegistroAcademico.getAnio()).thenReturn(2017); //retornar el año del estudiante
        when(ra.cheequearCarnet()).thenReturn(true); // si el carne es valido
        when(carrera.procesarCarrera()).thenReturn(1); //la carrera
        assertEquals("Ciencias y Sistemas", asignar_horario.generarHorario(new Carrera(9,"Ciencias y Sistemas",  new RegistroAcademico(2017,"01131")).getDescripcion());
    }
}
