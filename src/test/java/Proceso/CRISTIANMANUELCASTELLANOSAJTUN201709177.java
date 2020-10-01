package Proceso;

import Objetos.Carrera;
import Objetos.Horario;
import Objetos.RegistroAcademico;
import Proceso.AsignarHorario;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.mockito.Mockito.*;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.when;

import org.mockito.InjectMocks;
import org.mockito.internal.configuration.injection.MockInjection;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

class CRISTIANMANUELCASTELLANOSAJTUN201709177 {
	
	@InjectMocks
	AsignarHorario asignar;
	@Spy
	AsignarHorario asignarSpy;
	@Mock
	Carrera carrera;
	@Mock
	RegistroAcademico registro;
	@Mock
	Horario horario;
	
	@BeforeEach
	void setUp() {
		MockitoAnnotations.initMocks(this);
		System.out.println("\n@BeforeAll->setup()");
	}
	
	@AfterEach
	void tearDown() {
		System.out.println("@AfterAll -> tearDown()");
	}
	
	@Test
	@DisplayName("Test utilizando variables reales")
	void testNormal() throws Exception {
		Carrera career = new Carrera(9, "Sistemas");
		RegistroAcademico carnet = new RegistroAcademico(2017, "09177");
		AsignarHorario asignarl = new AsignarHorario();
		assertEquals(asignarl.generarHorario(career, carnet).getCodigoHorario(),165);
	}
	
	@Test
	@DisplayName("Test utilizando mocks")
	void testMock() throws Exception{
		when(registro.cheequearCarnet()).thenReturn(true);
		when(carrera.procesarCarrera()).thenReturn(1);
		when(registro.getAnio()).thenReturn(2017);
		
		assertEquals(asignar.generarHorario(carrera, registro).getCodigoHorario(),165);
	}
	
	@Test
	@DisplayName("Test con un carnet invalido con mocks")
	void testMock_carnetInvalido() throws Exception{
		when(registro.cheequearCarnet()).thenReturn(false);// Un carnet invalido fue enviado como parametro
		when(carrera.procesarCarrera()).thenReturn(4);
		when(registro.getAnio()).thenReturn(1900);// Un carnet invalido posee anio invalido
		
		assertThrows(Exception.class,()-> asignar.generarHorario(carrera, registro));
	}
	
	@Test
	@DisplayName("Test Carrera invalida utilizando mocks")
	void testMock_carreraInvalida() throws Exception {
		when(registro.cheequearCarnet()).thenReturn(true);
		when(carrera.procesarCarrera()).thenThrow(new Exception("Codigo carrera mayor a 12"));
		when(registro.getAnio()).thenReturn(2017);
		
		assertThrows(Exception.class,()-> asignar.generarHorario(carrera, registro));
	}
	
	@Test
	@DisplayName("Test utilizando spy")
	void testSpy() throws Exception {
		when(registro.cheequearCarnet()).thenReturn(true);
		when(registro.getAnio()).thenReturn(2017);
		Carrera career = new Carrera(10, "Mecanica");
		
		assertEquals(asignarSpy.generarHorario(career, registro).getCodigoHorario(),651);
	}
	
	@Test
	@DisplayName("Test carnet invalido utilizando spy")
	void testSpy_carneInvalido() throws Exception {
		when(carrera.procesarCarrera()).thenReturn(4);
		RegistroAcademico registro = new RegistroAcademico(1900, "09177");
		
		Exception ex = null;
		try {
			assertEquals(asignarSpy.generarHorario(carrera, registro).getCodigoHorario(),651);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			ex = e;
			System.out.println("Expected error on invalid register:"+e);
			// e.printStackTrace();
		}
		assertNotNull(ex);
	}
	
	@Test
	@DisplayName("Test carrera invalida utilizando spy")
	void testSpy_carreraInvalida() {
		when(registro.cheequearCarnet()).thenReturn(true);
		when(registro.getAnio()).thenReturn(2017);
		Carrera career = new Carrera(13, "Error");
		
		Exception ex = null;
		try {
			assertEquals(asignarSpy.generarHorario(career, registro).getCodigoHorario(),651);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			ex = e;
			System.out.println("Expected error on invalid career:"+e);
			// e.printStackTrace();
		}
		assertNotNull(ex);
		
	}
	
	
	/*carrera = null;
	registro = null;
	horario = null;
	asignar = null;*/

	/*carrera = new Carrera(9, "Ingenieria en ciencias y sistemas");
	registro = new RegistroAcademico(2017, "09177");
	horario = mock(Horario.class);
	asignar = new AsignarHorario();*/
	
	/*try {
		given(asignar.generarHorario(carrera, registro))
			.willReturn(horario);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}*/
	//fail();
	// given
	//Carrera carrera = mock(Carrera.class);
	//RegistroAcademico carnet = mock(RegistroAcademico.class);
	
	/*Carrera carrera = new Carrera(8, "Ingenieria en ciencias y sistemas");
	RegistroAcademico carnet = new RegistroAcademico(2017, "09177");
	AsignarHorario assign = mock(AsignarHorario.class);
	try {
		when(assign.generarHorario(carrera,carnet))
			.thenReturn(new Horario(8,"Descripcion"));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.out.println("Error");
	}*/
	
	//verify(assign).generarHorario(carrera, carnet);
	
	/*@Test
	void ShouldFail() {
		fail("fail test");
	}*/
	
	/*Carrera wrongCareer = new Carrera(13, "Unknow");
	Carrera correctCareer = new Carrera(10, "Ingenieria en ciencias y sistemas");
	RegistroAcademico correctRegister = new RegistroAcademico(2017, "09177");
	RegistroAcademico wrongRegister = new RegistroAcademico(2017, "201709177");
	RegistroAcademico wrongRegisterWrongYear = new RegistroAcademico(1889, "A9C77");
	AsignarHorario a = new AsignarHorario();

	@BeforeEach
	void setUp() throws Exception {
	}

	

	@Test
	@DisplayName("Should throws error invalid register")
	void ShouldThrowsErrorInvalidRegister() {
		assertThrows(Exception.class, ()->a.generarHorario(correctCareer, wrongRegister));
	}
	
	@Test
	@DisplayName("Should throws error invalid carrer")
	void ShouldThrowsErrorInvalidCareer() {
		try {
			assertThrows(Exception.class,()->a.generarHorario(wrongCareer, correctRegister));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	@DisplayName("Should throws error invalid year on career")
	void ShouldThrowsErrorInvalidYearOnCareer() {
		try {
			assertThrows(Exception.class,()->a.generarHorario(wrongCareer, wrongRegisterWrongYear));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}*/
	
}
