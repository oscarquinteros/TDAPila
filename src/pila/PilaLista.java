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
public class PilaLista  implements IPila{
    private Nodo ultimoNodo = new Nodo();
    private int cantidadElementos=0;
    
    public int size() {
        return cantidadElementos;
    }    

    public void push(Object i) {
        Nodo elemento = new Nodo();
        elemento.valor=i;
        if (cantidadElementos==0){
            ultimoNodo=elemento;
        } else {
            elemento.siguiente=ultimoNodo;
            ultimoNodo=elemento;
        } 
        cantidadElementos++;       
    }

    public Object pop() {
        Object elemento = ultimoNodo.valor;
        ultimoNodo=ultimoNodo.siguiente;
        cantidadElementos--;       
        return elemento;
    }
    
    
    

    private static class Nodo {
        public Object valor;
        public Nodo siguiente;
        public Nodo() {
        }
    }
}
