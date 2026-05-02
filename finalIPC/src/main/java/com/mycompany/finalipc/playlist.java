/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.finalipc;

/**
 *
 * @author jeremy
 */
public class playlist {
    nodoDoble cabeza;
    nodoDoble cola;
    nodoDoble actual;
    int contador;
    

    public   void agregar(cancion c){
        nodoDoble nuevo = new nodoDoble (c);
        if (cabeza == null) {
            cabeza = nuevo;
            cola = nuevo;
            actual = nuevo;
        } else {
            cola.siguiente = nuevo;  
            nuevo.anterior = cola;  
            cola = nuevo;    
        }
        contador++; 
    }
    
    public void mostrarPlaylist() {
        System.out.print("Inicio ");
        nodoDoble temp = cabeza; 
        while (temp != null) {
            System.out.print("-> " + temp.dato.titulo);
            temp = temp.siguiente; 
        }
        System.out.println(" -> Fin");
    }
    
    public void eliminarActual() {
        if (actual == null) {
            return;
        }

        //  unico nodo en la lista
        if (actual == cabeza && actual == cola) {
            cabeza = null;
            cola = null;
            actual = null;
        } //  el nodo actual es la cabeza
        else if (actual == cabeza) {
            cabeza = cabeza.siguiente;
            cabeza.anterior = null;
            actual = cabeza;
        } // el nodo es el ultimo
        else if (actual == cola) {
            cola = cola.anterior;
            cola.siguiente = null;
            actual = cola; 
        } // nodo interno
        else {
            actual.anterior.siguiente = actual.siguiente;
            actual.siguiente.anterior = actual.anterior;
            actual = actual.siguiente; 
        }

        contador--;
    }

    public cancion siguiente() {
        if (actual != null && actual.siguiente != null) {
            actual = actual.siguiente;
            actual.dato.reproducir(); 
            return actual.dato;
        }
        return null; 
    }

    public cancion anterior() {
        if (actual != null && actual.anterior != null) {
            actual = actual.anterior;
            actual.dato.reproducir();
            return actual.dato;
        }
        return null; 
    }
}
