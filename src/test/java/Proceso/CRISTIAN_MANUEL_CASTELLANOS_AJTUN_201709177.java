package Proceso;

import Objetos.Carrera;
import Objetos.RegistroAcademico;
import Proceso.AsignarHorario;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.when;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import org.mockito.internal.configuration.injection.MockInjection;


class CRISTIAN_MANUEL_CASTELLANOS_AJTUN_201709177 {
	
	Carrera wrongCareer = new Carrera(13, "Unknow");
	Carrera correctCareer = new Carrera(10, "Ingenieria en ciencias y sistemas");
	RegistroAcademico correctRegister = new RegistroAcademico(2017, "09177");
	RegistroAcademico wrongRegister = new RegistroAcademico(2017, "201709177");
	RegistroAcademico wrongRegisterWrongYear = new RegistroAcademico(1889, "A9C77");
	AsignarHorario a = new AsignarHorario();

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
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
	}
	
}
