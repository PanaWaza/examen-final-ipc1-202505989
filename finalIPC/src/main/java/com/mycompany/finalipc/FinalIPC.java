
package com.mycompany.finalipc;


public class FinalIPC {

    public static void main(String[] args) {
        playlist lista = new playlist();
        
        cancion c1 = new cancion("Bohemian Rhapsody", 354, "Queen");
        cancion c2 = new cancion("Starboy", 230, "The Weeknd");
        cancion c3 = new cancion("Hotel California", 391, "Eagles");
        
        System.out.println(" primer commit ");
        c1.reproducir();
        c2.reproducir();
        c3.reproducir();
        
        System.out.println(" segundo commit ");
        lista.agregar(c1);
        lista.agregar(c2);
        lista.agregar(c3);
        
        lista.mostrarPlaylist();
        
        System.out.println(" tercer commit ");
        lista.siguiente();
        lista.siguiente();
        lista.anterior();
        lista.eliminarActual();
        lista.mostrarPlaylist();
        
    }
}
