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


public class MarlonAbrahamFuentesZarate_199911132 {

	AsignarHorario asigH;
    @Test
	// Prueba para comparar segun el valor enviado al metodo
    public void traslapar() {
       
        // assert
        assertEquals(true, asigH.Traslape());
    }

	@Test
	// Preuaba usando un mock de lista
	public void verDescripcion() {
				
		assertTrue(asigH.VerDescripcion().length()>0);
	}


	
}