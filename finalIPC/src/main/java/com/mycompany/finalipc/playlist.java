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
    static nodoDoble cabeza;
    static nodoDoble cola;
    static nodoDoble actual;
    static int contador;
    

    public static  void agregar(cancion c){
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
    
    public static void mostrarPlaylist(){
        System.out.print("Inicio ");
        actual = cabeza;
        while (actual != null) {
            System.out.print("-> "+actual.dato.titulo);
            actual = actual.siguiente;
        }
        System.out.println("-> Fin ");
    }
    
    public void eliminar(){
        // se elimina el actual
        
    }
    public void navegar(){
        
    }
}
