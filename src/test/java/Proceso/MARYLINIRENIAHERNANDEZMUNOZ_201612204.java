/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proceso;

import java.util.ArrayList;
import java.util.Collection;
import Objetos.*;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

import static org.mockito.Mockito.*;
/**
 *
 * @author Irenia
 */
public class MARYLINIRENIAHERNANDEZMUNOZ_201612204 {
    AsignarHorario ah = new AsignarHorario();
    
    @Test
    public void generarHorarioVacioTest() throws Exception{
        // using Mockito.mock() method
        //ArrayList<String> mockList = mock(ArrayList.class);
        //when(mockList.size()).thenReturn(5);
        //assertTrue(mockList.size()==5);
        
        AsignarHorario mockAsignarHorario = mock(AsignarHorario.class);
        assertNull(mockAsignarHorario.generarHorario(null, null));
        //mockAsignarHorario = new AsignarHorario();
        //assertNull(mockAsignarHorario.generarHorario(new Carrera(1,'c1'), new RegistroAcademico(2015, '201501')));
    }
    
    @Test
    public void generarHorarioParametrosTest() throws Exception {
        //Collection collection = new ArrayList();
        //assertTrue(collection.isEmpty());
        AsignarHorario mockAsignarHorario = mock(AsignarHorario.class);
        
        RegistroAcademico mock_ra =  mock(RegistroAcademico.class);
        mock_ra = new RegistroAcademico(2010, "34567");
        
        Carrera mock_c = mock(Carrera.class);
        mock_c = new Carrera(1, "descripcion de carrera");
        
        Horario h_test = mockAsignarHorario.generarHorario(mock_c, mock_ra);
        
        assertNull(h_test);
    }
    
    @Test		
    public void testAssert(){
        //Variable declaration		
        String string1="Junit";					
        String string2="Junit";					
        String string3="test";					
        String string4="test";					
        String string5=null;					
        int variable1=1;					
        int variable2=2;					
        int[] airethematicArrary1 = { 1, 2, 3 };					
        int[] airethematicArrary2 = { 1, 2, 3 };					
        		
        //Assert statements		
        assertEquals(string1,string2);					
        assertSame(string3, string4);					
        assertNotSame(string1, string3);					
        assertNotNull(string1);			
        assertNull(string5);			
        assertTrue(variable1<variable2);					
        assertArrayEquals(airethematicArrary1, airethematicArrary2);					
    }
}
