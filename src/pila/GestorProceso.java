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
public class GestorProceso {
    private IPila pila;
    
    public void agregarPila(IPila pila) {
        this.setPila(pila);
    }

    /**
     * @return the pila
     */
    public IPila getPila() {
        return pila;
    }

    /**
     * @param pila the pila to set
     */
    public void setPila(IPila pila) {
        this.pila = pila;
    }
    
}
