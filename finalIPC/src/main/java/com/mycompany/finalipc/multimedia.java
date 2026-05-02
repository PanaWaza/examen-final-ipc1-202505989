/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.finalipc;

/**
 *
 * @author jeremy
 */
public abstract class multimedia {
    String titulo;
    int duracion; // en segundos
     
    multimedia(String titulo,int duracion){
        this.titulo = titulo;
        this.duracion = duracion;
    }
    
    public abstract void reproducir();
}
