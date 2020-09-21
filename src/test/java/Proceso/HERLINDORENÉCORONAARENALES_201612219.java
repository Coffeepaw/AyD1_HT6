package Proceso;

import Objetos.Carrera;
import Objetos.Horario;
import Objetos.RegistroAcademico;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

public class HERLINDORENÉCORONAARENALES_201612219 {
	
	public Carrera carrera;
	public RegistroAcademico registro;
	
	public AsignarHorario asignar = new AsignarHorario();
	
	
	@BeforeEach
    public void setUp() throws Exception{
        //Mock necesarios para la clase asignar horario
        carrera = Mockito.mock(Carrera.class);
        registro = Mockito.mock(RegistroAcademico.class);
        
        when(registro.cheequearCarnet()).thenReturn(true);
        when(carrera.procesarCarrera()).thenReturn(1);
        when(registro.getAnio()).thenReturn(2016);
        when(carrera.procesarCarrera()).thenReturn(3);    
    }
	
	@Test
	public void test1() throws Exception
	{
		//Verifica que el horario sea 369
		assertEquals(asignar.generarHorario(carrera, registro).getCodigoHorario(),369);
	}
	
	@Test
	public void test2() throws Exception
	{
		//Verifica que el horario no sea vespertino
		assertNotEquals(asignar.generarHorario(carrera, registro).getDescripcion(),"Vespertino");
	}

}
