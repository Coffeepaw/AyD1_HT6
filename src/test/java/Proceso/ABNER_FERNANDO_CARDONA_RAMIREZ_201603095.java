/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proceso;

import Proceso.AsignarHorario;
import Objetos.Carrera;
import Objetos.Estudiante;
import Objetos.Horario;
import Objetos.RegistroAcademico;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.Mock;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 *
 * @author Fernando
 */
public class ABNER_FERNANDO_CARDONA_RAMIREZ_201603095 {
    
    public AsignarHorario asignar;
    public Carrera mockCarrera;
    public Estudiante mockEstudiante;
    public Horario mockHorario; 
    public RegistroAcademico mockRegistro;
    
    @Before
    public void inicio(){
        
        asignar = new AsignarHorario();
        mockCarrera = mock(Carrera.class);
        mockEstudiante = mock(Estudiante.class);
        mockHorario = mock(Horario.class);
        mockRegistro = mock(RegistroAcademico.class);
        when(mockCarrera.getDescripcion()).thenReturn("Soy la descripcion");
       
    }
    
    @Test
    public void generarHorarioValido() throws Exception{
        //when(mockCarrera.procesarCarrera()).thenThrow(new Exception());
        when(mockRegistro.cheequearCarnet()).thenReturn(true);
        int[] codigos = {210,130,265,140,414,985,856,165,369,651,847,513,771};
        String[] descripciones = {"Mixto", "Vespertino", "Matutino", "Nocturno"};
        
        for(int i=2000;i<2009;i++){
            when(mockRegistro.getAnio()).thenReturn(i);
            for(int j=1;j<=4;j++){
                int suma = (i-2000)+j;
                when(mockCarrera.procesarCarrera()).thenReturn(j);
                Horario horario = asignar.generarHorario(mockCarrera, mockRegistro);
                assertEquals(horario.getDescripcion(),descripciones[j-1]);
                assertEquals(horario.getCodigoHorario(),codigos[suma-1]);
            }
        }
    }
    @Test
    public void chequearCarnetInvalido() throws Exception{
        
        when(mockRegistro.cheequearCarnet()).thenReturn(false);
        when(mockCarrera.procesarCarrera()).thenReturn(1);
        try{
            assertEquals(asignar.generarHorario(mockCarrera, mockRegistro),new Exception("Registro Invalido"));
        }catch(Exception e){
            assertEquals(e.getMessage(),"Registro invalido");
        }
        
    }
    
    @Test
    public void validarProcesarCarrera() throws Exception{
        
        when(mockRegistro.cheequearCarnet()).thenReturn(true);
        when(mockCarrera.procesarCarrera()).thenThrow(new Exception("Carrera no valida"));
        try{
            assertEquals(asignar.generarHorario(mockCarrera, mockRegistro),new Exception("Carrera Invalido"));
        }catch(Exception e){
            assertEquals(e.getMessage(),"Carrera no valida");
        }
    }
    
}
