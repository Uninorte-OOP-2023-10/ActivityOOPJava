package program;

import java.util.ArrayList;
import person.Artista;
import person.Locutor;

/**
 *
 * @author Eduardo Angulo
 */
public class Programa {
    
    private static int ID = 1;
    
    private String nombre;
    private int serial;
    private ArrayList<Emision> emisiones;
    private ArrayList<Locutor> locutores;
    
    public Programa(String nombre, Locutor locutor) {
        this.nombre = nombre;
        this.serial = Programa.ID;
        this.emisiones = new ArrayList<>();
        this.locutores = new ArrayList<>();
        
        this.locutores.add(locutor);
        this.locutores.get(0).addPrograma(this);
        
        Programa.ID += 1;
    }

    public String getNombre() {
        return nombre;
    }
    
    public boolean addEmision(Emision emision) {
        this.emisiones.add(emision);
        return true;
    }
    
    public Emision getLastEmision() {
        return this.emisiones.get(this.emisiones.size() - 1);
    }
    
    public int getFrecuenciaCanciones(Artista artista) {
        int frecuencia = 0;
        for(Emision emision: this.emisiones) {
            frecuencia += emision.getCantidadCanciones(artista);
        }
        return frecuencia;
    }
    
}
