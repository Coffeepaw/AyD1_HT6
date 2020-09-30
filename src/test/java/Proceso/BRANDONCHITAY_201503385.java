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
import Proceso.AsignarHorario;

public class PlantillaParaTestNoEditar {

    @Test
	void test_registro_academinco()
	{
		try {
            AsignarHorario test = Mockito.mock(AsignarHorario.class);
			when(test.cheequearCarnet()).thenReturn(false);
			test = new RegistroAcademico(2015, "03385");
			assertTrue(test.cheequearCarnet());
		} catch (Exception e) {
			System.out.println(e);
		}
    }
    
    @Test
	void test_carrera()
	{
		try {
            AsignarHorario test = Mockito.mock(AsignarHorario.class);
			when(test.procesarCarrera()).thenReturn(false);
            test = new Carrera(2, "Probando 201503385");
            assertEqual(test.getCodigo(), 2);
			assertEqual(test.getDescripcion(), "Probando 201503385");
		} catch (Exception e) {
			System.out.println(e);
		}
    }
    
    @Test
	void test_horario()
	{
		try {
            AsignarHorario test = Mockito.mock(AsignarHorario.class);
			when(test.procesarCarrera()).thenReturn(false);
            test = new Horario(1, "Mixto");
            assertEqual(test.getCodigoHorario(), 1);
			assertEqual(test.getDescripcion(), "Mixto");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}


