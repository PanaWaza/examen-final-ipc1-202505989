
package com.mycompany.finalipc;


public class FinalIPC {

    public static void main(String[] args) {
        
        cancion c1 = new cancion("Bohemian Rhapsody", 354, "Queen");
        cancion c2 = new cancion("Starboy", 230, "The Weeknd");
        cancion c3 = new cancion("Hotel California", 391, "Eagles");
        
        
        c1.reproducir();
        c2.reproducir();
        c3.reproducir();
        
        playlist.agregar(c1);
        playlist.agregar(c2);
        playlist.agregar(c3);
        
        playlist.mostrarPlaylist();
    }
}
