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

public class LUISANGELVARGASLEON_201701023 {

    private Estudiante estudiante = Mockito.mock(Estudiante.class);;
    private Carrera carrera = Mockito.mock(Carrera.class);
    private RegistroAcademico registro = Mockito.mock(RegistroAcademico.class);
    private AsignarHorario assignHorario = Mockito.mock(AsignarHorario.class);
    private Horario horario = Mockito.mock(Horario.class);

    @Test
    public void AssingHorarioNN() {
        assignHorario = new AsignarHorario();
        assertNotNull(assignHorario, "No debe ser null");
    }

    @Test
    public void TestAsignarHorario() throws Exception {
        //Creamos carrera de medicina
        carrera = new Carrera(4, "Medicina");
        registro = new RegistroAcademico(2020, "2020");
        assignHorario = new AsignarHorario();
        horario = new Horario();
        //Debe retornar 4, carrera de medicina.
        assertEquals("Medicina", carrera.getDescripcion());
        when(carrera.getCodigo()).thenReturn(4); 
        when(carrera.procesarCarrera()).thenReturn(4);// ProcesarCarrera es 4
        when(registro.getAnio()).thenReturn(2020); // Retorna 2020, el substring de generarHorario seria 0.
        horario = assignHorario.generarHorario(carrera, registro); // Retorna 140
        assertEquals(horario, 140); // retorna 140
    }

}
