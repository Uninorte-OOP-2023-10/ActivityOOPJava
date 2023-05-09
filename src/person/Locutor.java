package person;

import java.util.ArrayList;
import program.Programa;

/**
 *
 * @author Eduardo Angulo
 */
public class Locutor extends Persona {
    
    private ArrayList<Programa> programas;
    
    public Locutor(String nombre) {
        super(nombre);
        this.programas = new ArrayList<>();
    }
    
    public boolean addPrograma(Programa programa) {
        this.programas.add(programa);
        return true;
    }
    
}
