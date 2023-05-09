package core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import person.Artista;
import person.Invitado;
import person.Locutor;
import program.Cancion;
import program.Emision;
import program.Programa;

/**
 *
 * @author Eduardo Angulo
 */
public class RockRollRadio {
    
    private ArrayList<Artista> artistas;
    private ArrayList<Cancion> canciones;
    private ArrayList<Invitado> invitados;
    private ArrayList<Locutor> locutores;
    private ArrayList<Programa> programas;
    
    public RockRollRadio() {
        this.artistas = new ArrayList<>();
        this.canciones = new ArrayList<>();
        this.invitados = new ArrayList<>();
        this.locutores = new ArrayList<>();
        this.programas = new ArrayList<>();
    }

    public ArrayList<Artista> getArtistas() {
        return artistas;
    }
    
    public Artista getArtista(int index) {
        return this.artistas.get(index);
    }
    
    public Cancion getCancion(int index) {
        return this.canciones.get(index);
    }
    
    public Locutor getLocutor(int index) {
        return this.locutores.get(index);
    }
    
    public Programa getPrograma(int index) {
        return this.programas.get(index);
    }
    
    public boolean addArtista(Artista artista) {
        this.artistas.add(artista);
        return true;
    }
    
    public boolean addCancion(Cancion cancion) {
        this.canciones.add(cancion);
        return true;
    }
    
    public boolean addEmision(Emision emision) {
        return true;
    }
    
    public boolean addInvitado(Invitado invitado, Emision emision) {
        this.invitados.add(invitado);
        invitado.addEmision(emision);
        emision.addInvitado(invitado);
        return true;
    }
    
    public boolean addLocutor(Locutor locutor) {
        this.locutores.add(locutor);
        return true;
    }
    
    public boolean addPrograma(Programa programa) {
        this.programas.add(programa);
        return true;
    }
    
    public Programa getProgramaConMasCancionesDeArtista(Artista artista) {
        Map<Programa, Integer> frecuencia = new HashMap<>();
        for(Programa programa: this.programas) {
            frecuencia.put(programa, programa.getFrecuenciaCanciones(artista));
        }
        return Collections.max(frecuencia.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
    
}
