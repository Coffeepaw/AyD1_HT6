package Proceso;

import Objetos.Carrera;
import Objetos.RegistroAcademico;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

public class BrayanMauricioArocheBororUEDI_201503918 {
	
	
	private static Carrera mock_carrera;
	private static RegistroAcademico mock_registroacademico;
	
	@BeforeAll
	public static void setUp() {
		mock_carrera = Mockito.mock(Carrera.class);
		mock_registroacademico = Mockito.mock(RegistroAcademico.class);
	}
		
	@Test
	void carreraValidaTest()
	{
		try {
			when(mock_carrera.procesarCarrera()).thenReturn(0);
			mock_carrera = new Carrera(8, "Ciencias y Sistemas.");
			int numero = mock_carrera.procesarCarrera();
			assertEquals(1, numero);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	void carnetValidoTest()
	{
		try {
			when(mock_registroacademico.cheequearCarnet()).thenReturn(false);
			mock_registroacademico = new RegistroAcademico(2015, "03918");
			assertTrue(mock_registroacademico.cheequearCarnet());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
