/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pila;

/**
 *
 * @author oquinter
 */
public class PilaArray implements IPila{
    
    private Object[] elementos;
    private int cantidadElementos;
    
    public PilaArray(){
        cantidadElementos=0;
        elementos = new Object[10];
        
    }
    public PilaArray(int size){
        cantidadElementos=size;
    }
    
    public int size() {
        return cantidadElementos;
    }

    public void push(Object i) {
        elementos[cantidadElementos]=i;
        cantidadElementos++;
    }

    public Object pop() {
       Object e = elementos[cantidadElementos-1];
       cantidadElementos--;
       return e;
    }
    
}
