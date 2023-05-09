package program;

import java.util.ArrayList;
import person.Artista;
import person.Invitado;

/**
 *
 * @author Eduardo Angulo
 */
public class Emision {
    
    private static int ID = 1;
    
    private int serial;
    private ArrayList<Cancion> canciones;
    private ArrayList<Invitado> invitados;
    private Programa programa;
    
    public Emision(Programa programa) {
        this.serial = Emision.ID;
        this.canciones = new ArrayList<>();
        this.invitados = new ArrayList<>();
        this.programa = programa;
        
        this.programa.addEmision(this);
        
        Emision.ID += 1;
    }
    
    public boolean addCancion(Cancion cancion) {
        this.canciones.add(cancion);
        return true;
    }
    
    public boolean addInvitado(Invitado invitado) {
        this.invitados.add(invitado);
        return true;
    }
    
    public int getCantidadCanciones(Artista artista) {
        int cantidad = 0;
        for(Cancion cancion: this.canciones) {
            if(cancion.getArtista().equals(artista)) {
                cantidad += 1;
            }
        }
        return cantidad;
    }
    
}
