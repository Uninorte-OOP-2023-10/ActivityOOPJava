package person;

import java.util.ArrayList;
import program.Cancion;

/**
 *
 * @author Eduardo Angulo
 */
public class Artista extends Persona {
    
    private ArrayList<Cancion> canciones;
    
    public Artista(String nombre) {
        super(nombre);
        this.canciones = new ArrayList<>();
    }
    
    public boolean addCancion(Cancion cancion) {
        this.canciones.add(cancion);
        return true;
    }
    
}
