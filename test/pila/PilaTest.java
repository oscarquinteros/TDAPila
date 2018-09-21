/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pila;

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
public class PilaTest {
    PilaLista pila;
    public PilaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        pila = new PilaLista(); 
    }
    
    @After
    public void tearDown() {
    }

     @Test
     public void cantidadElemtosPilaVacia() {
     // Preparacion - Arrange     
     //    PilaArray pila = new PilaArray();    
     // Actuar - Act    
         assertEquals(pila.size(), 0);
     
     }
     @Test
     public void agregarElementoPilaVacia(){
     // Preparacion - Arrange
//        PilaArray pila = new PilaArray();    
     // Actuar - Act
        pila.push(1);
     //Afirmar - Assert     
         assertEquals(pila.size(), 1);
     }
     @Test
     public void sacarElementoPila(){
     // Preparacion - Arrange
     // PilaArray pila = new PilaArray();             
        pila.push(1);
        pila.push(2);
        pila.push(3);
     // Actuar
        Object e = pila.pop();
     //Afirmar - Assert     
         assertEquals(e, 3);                  
     }
}
