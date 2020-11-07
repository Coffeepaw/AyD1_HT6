package Proceso;

import Objetos.Carrera;
import Objetos.Horario;
import Objetos.RegistroAcademico;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import static org.mockito.Mockito.*;

public class Diego_Alejandro_Caballeros_Melchor_201602723 {

    Carrera carreraMock;
    RegistroAcademico registroMock;
    AsignarHorario asignar;
    @Before
    public void setup(){
        carreraMock = mock(Carrera.class);
        registroMock = mock(RegistroAcademico.class);
        asignar = new AsignarHorario();
    }

    // PRUEBA EN EL GENERAR HORARIO
    @Test
    public void test_generarHorario() throws Exception {
        asignar = new AsignarHorario();

        carreraMock = mock(Carrera.class);
        registroMock = mock(RegistroAcademico.class);
        when(carreraMock.procesarCarrera()).thenReturn(4);
        when(registroMock.cheequearCarnet()).thenReturn(true);
        when(registroMock.getAnio()).thenReturn(1998);

        Horario respuesta = asignar.generarHorario(this.carreraMock,this.registroMock);
        Assert.assertNotNull(respuesta);
    }

    // PRUEBA PARA COMPROBAR SI GUARDAR LOS DATOS ADECUADOS EN HORARIO
    @Test
    public void test_generarHorario2() throws Exception {
        asignar = new AsignarHorario();
        Horario expect = new Horario(513,"Nocturno");

        carreraMock = mock(Carrera.class);
        registroMock = mock(RegistroAcademico.class);
        when(carreraMock.procesarCarrera()).thenReturn(1);
        when(registroMock.cheequearCarnet()).thenReturn(true);
        when(registroMock.getAnio()).thenReturn(1993);

        Horario respuesta = asignar.generarHorario(this.carreraMock,this.registroMock);
        Assert.assertEquals(140,respuesta.getCodigoHorario());
        Assert.assertEquals("Mixto", respuesta.getDescripcion());
    }
}











