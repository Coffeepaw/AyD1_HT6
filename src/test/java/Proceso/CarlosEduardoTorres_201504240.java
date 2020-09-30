package Proceso;

import Objetos.Carrera;
import Objetos.Horario;
import Objetos.RegistroAcademico;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

public class CarlosEduardoTorres_201504240 {
	@Mock
    private AsignarHorario horarioMock;
	
	@Mock
	private RegistroAcademico reg;
	
	@BeforeEach
    public void setUp() {
		MockitoAnnotations.initMocks(this);
    }
	
	@Test
	void validHorario() throws Exception 
	{
		Carrera carr = new Carrera(5, "ingenieria");
		RegistroAcademico reg = new RegistroAcademico(2015, "04240");
		Horario hor = new Horario(210, "matutino");
		Horario hor2 = new Horario(210, "matutino");
		horarioMock.generarHorario(carr, reg);
		when(horarioMock.generarHorario(carr, reg)).thenReturn(hor);
        assertEquals(hor2, horarioMock.generarHorario(carr, reg));
	}
	
	@Test
	void validCarnet() 
	{
		reg.setAnio(2015);
		reg.setCorrelativo("04240");
		when(reg.cheequearCarnet()).thenReturn(true);
		boolean valor = reg.cheequearCarnet();
		assertEquals(valor, reg.cheequearCarnet());
	}
	
}
