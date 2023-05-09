package person;

import java.util.ArrayList;
import program.Emision;

/**
 *
 * @author Eduardo Angulo
 */
public class Invitado extends Persona {
    
    private ArrayList<Emision> emisiones;
    
    public Invitado(String nombre) {
        super(nombre);
        this.emisiones = new ArrayList<>();
    }
    
    public boolean addEmision(Emision emision) {
        this.emisiones.add(emision);
        return true;
    }
    
}
