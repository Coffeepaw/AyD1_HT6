/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proceso;

import Objetos.Carrera;
import Objetos.RegistroAcademico;
import Proceso.AsignarHorario;
import static junit.framework.Assert.assertEquals;
import org.junit.Test;
import org.junit.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
/*
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
*/
/**
 *
 * @author ismor
 */
public class EliezerIsaiCoronadoMorales_200924991 {
    RegistroAcademico reg = mock(RegistroAcademico.class);
    Carrera carr = mock(Carrera.class);
    AsignarHorario asig = mock(AsignarHorario.class);
    
    public EliezerIsaiCoronadoMorales_200924991() {
    }
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     
     @Test
     public void Prueba1_Mock() throws Exception {
         when(reg.cheequearCarnet()).thenReturn(Boolean.TRUE);
         when(carr.procesarCarrera()).thenReturn(2);
         assertEquals(asig.generarHorario(carr, reg).getDescripcion(),"Vespertino");
     }
     
     public void Prueba2_Mock() throws Exception {
         when(reg.cheequearCarnet()).thenReturn(Boolean.TRUE);
         when(carr.procesarCarrera()).thenReturn(1);   
         assertEquals(asig.generarHorario(carr, reg).getDescripcion(),"Mixto");
     }
     
     public void Prueba3_sinMock() throws Exception{
        AsignarHorario s = new AsignarHorario();
        Carrera c = new Carrera();
        c.setCodigo(9);
        c.setDescripcion("desc");
        RegistroAcademico a = new RegistroAcademico();
        a.setAnio(2009);
        a.setCorrelativo("24991");
        assertEquals(asig.generarHorario(c, a).getDescripcion(),"Mixto");
        System.out.println(s.generarHorario(c, a).getDescripcion());
     }
     
     
     
     
}
