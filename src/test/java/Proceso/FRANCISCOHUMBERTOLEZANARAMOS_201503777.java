/*
*   FRANCISCO HUMBERTO LEZANA RAMOS - 201503777
*   HOJA DE TRABAJO #6
*   ANALISIS Y DISEÑO DE SISTEMAS 1
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

/**
 *
 * @author betor
 */
public class FRANCISCOHUMBERTOLEZANARAMOS_201503777 {
    
    private RegistroAcademico registro = Mockito.mock(RegistroAcademico.class);
    private Carrera carrera = Mockito.mock(Carrera.class);
    
    //TEST NO 1 - DEBE RETORNAR FALSE YA QUE NO EXISTE CARNET REGISTRADO
    @Test
    public void TestCarnetRegistrado(){
        registro = new RegistroAcademico(1777,"15377");
        assertFalse(registro.cheequearCarnet());
    }
    
    //TEST NO 2 - DEBE RETORNAR 0 YA QUE NO EXISTE CARRERA PARA RANGO DEFINIDO
    @Test
    public void TestCarnetRegistrado(){
    	carrera = new Carrera(88, "TEST CARRERA");
        int checkNumber = carrera.procesarCarrera();
        assertEquals(0, checkNumber);
	}
}
