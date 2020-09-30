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
import Objetos.Estudiante;
import Objetos.Horario;
import Objetos.Carrera;
import org.mockito.Spy;

public class Test_201603016 {
    
    Estudiante estudiante = Mockito.mock(Estudiante.class);
    Carrera carrera = Mockito.mock(Carrera.class);
    RegistroAcademico registro = Mockito.mock(RegistroAcademico.class);
    public static AsignarHorario asignacion;

    @BeforeAll
    public static void setUp() {
        asignacion = new AsignarHorario();
    }

   
    @Test
    public void PruebaJornadaMixta() throws Exception {
        when(registro.getAnio()).thenReturn(2010);
        when(registro.cheequearCarnet()).thenReturn(true);
        when(carrera.getCodigo()).thenReturn(10);
        when(carrera.procesarCarrera()).thenReturn(3);
        assertEquals("Mixto", asignacion.generarHorario(carrera, registro).getDescripcion());
    }

    @Test
    public void PruebaCarnetRegistrado(){
        registro = new RegistroAcademico(1899,"12345");
        assertFalse(registro.cheequearCarnet());
    }


}
