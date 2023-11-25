/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RetroArch.modelo;

/**
 *
 * @author natal
 */
public class Juego {
     
    private int id;
    private String titulo;
    private String genero;
    private int jugadores;

    public Juego() {
    }

    public Juego(int id, String titulo, String genero, int jugadores) {
        this.id = id;
        this.titulo = titulo;
        this.genero = genero;
        this.jugadores = jugadores;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getJugadores() {
        return jugadores;
    }

    public void setJugadores(int jugadores) {
        this.jugadores = jugadores;
    }

    @Override
    public String toString() {
        return "Juego{" + "id=" + id + ", titulo=" + titulo + ", genero=" + genero + ", jugadores=" + jugadores + '}';
    }
    
    
    
}
