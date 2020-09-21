/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//LABORATORIO ANALISIS DE SISTEMAS 1
//SEMESTRE DE 2020
//OSCAR RENE JORDAN ORELLANA
//201122846
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

public class OSCARRENEJORDANORELLANA_201122846 {
    
    AsignarHorario asignacion = new AsignarHorario();
    
    Carrera CarreraMock = mock(Carrera.class);
    RegistroAcademico RegAcaMock = mock(RegistroAcademico.class);
    
    @Test
    public void PruebaHorarioConCarreraNoValida() throws Exception    
    {
        RegAcaMock = new RegistroAcademico(2000, "98765");
        CarreraMock = new Carrera(13, "carrera no valida");
        String excepcion = asignacion.generarHorario(CarreraMock, RegAcaMock).toString();
        String esperado = "Registro invalido";
        assertTrue(excepcion.contains(esperado));
    }
    
    @Test
    public void PruebaHorario() throws Exception
    {
        RegAcaMock = new RegistroAcademico(2020, "12345");
        CarreraMock = new Carrera(12, "carrera valida");
        String desc = asignacion.generarHorario(CarreraMock, RegAcaMock).getDescripcion();
        assertEquals(desc, "Matutino");
    }
    
    
}
