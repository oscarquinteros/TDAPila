package pila;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author oquinter
 */
public class GestorProcesosTest {
    
    public GestorProcesosTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

     @Test
     public void IngresarPilaGestor() {
         
     GestorProceso gestor = new GestorProceso();
     PilaArray pilaArray = new PilaArray();
     pilaArray.push("A");
     pilaArray.push("B");
     pilaArray.push("C");
     
     gestor.agregarPila(pilaArray);
     
     assertEquals(gestor.getPila().size(),3);
     
     }
}
