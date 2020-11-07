/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proceso;

import Objetos.Carrera;
import Objetos.Estudiante;
import Objetos.Horario;
import Objetos.RegistroAcademico;
import java.util.ArrayList;
import java.util.List;

//importaciones de testing
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;
import org.mockito.Mockito;

public class AsignarHorario {

    public AsignarHorario() {
        
    }
    
    

    public Horario generarHorario(Carrera carrera, RegistroAcademico carnet) throws Exception {
        Horario horario = new Horario();

        if (carnet.cheequearCarnet()) {
            switch (carrera.procesarCarrera() + Integer.parseInt(String.valueOf(carnet.getAnio()).substring(3, 4))) {
                case 1:
                    horario.setCodigoHorario(210);
                    break;
                case 2:
                    horario.setCodigoHorario(130);
                    break;
                case 3:
                    horario.setCodigoHorario(265);
                    break;
                case 4:
                    horario.setCodigoHorario(140);
                    break;
                case 5:
                    horario.setCodigoHorario(414);
                    break;
                case 6:
                    horario.setCodigoHorario(985);
                    break;
                case 7:
                    horario.setCodigoHorario(856);
                    break;
                case 8:
                    horario.setCodigoHorario(165);
                    break;
                case 9:
                    horario.setCodigoHorario(369);
                    break;
                case 10:
                    horario.setCodigoHorario(651);
                    break;
                case 11:
                    horario.setCodigoHorario(847);
                    break;
                case 12:
                    horario.setCodigoHorario(513);
                    break;
                case 13:
                    horario.setCodigoHorario(771);
                    break;

            }
            switch (carrera.procesarCarrera()) {
                case 1:
                    horario.setDescripcion("Mixto");
                    return horario;
                case 2:
                    horario.setDescripcion("Vespertino");
                    return horario;
                case 3:
                    horario.setDescripcion("Matutino");
                    return horario;
                case 4:
                    horario.setDescripcion("Nocturno");
                    return horario;
            }
        } else {
            throw new Exception("Registro invalido");
        }

        return null;
    }

    public boolean Traslape() 
    {
        Horario horario = new Horario();
        horario.setTraslape(true); 
        return true;
    }

    public String VerDescripcion() 
    {
        Horario horario = new Horario();
        return horario.getDescripcion(); 
        
    }


}

class getHoraTest{
        private Horario validHora;
        
       public getHora(){
       }
       
       @BeforeEach
        public void setUp() {
            validHora = new Horario();
        }

        @AfterEach
        public void tearDown() {
            validHora = null;
        }

        @Test
        public void checkTest() {
            assertEquals(4, validHora.getCodigoHorario());
        }
    }


class setHoraTest{
    private Horario validHora;
    
    @BeforeEach
    public void setUp(){
        //1 MOCKEAR LAS CLASES DE DEPENDENCIA
        validHora = Mockito.mock(Horario.class);
    }
    
    @Test
    public void addTest(){
        //EJECUTAR CODIGO DE LA CLASE A TESTEAR
        Mockito.verify(validHora).getCodigoHorario(3);

    }
 }


class setCarrera{
    private Horario validHora;
    
    @BeforeEach
    public void setUp(){
        //1 MOCKEAR LAS CLASES DE DEPENDENCIA
        validCarrera = Mockito.mock(Carrera.class);
    }
    
    @Test
    public void addTest(){
        //EJECUTAR CODIGO DE LA CLASE A TESTEAR
        Mockito.verify(validHora).getCodigo();

    }
 }
