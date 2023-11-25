/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RetroArch.modelo;

/**
 *
 * @author natal
 */
public class Editora {
    
    private int año;
    private String autor;
    private String plataforma;

    public Editora() {
    }

    public Editora(int año, String autor, String plataforma) {
        this.año = año;
        this.autor = autor;
        this.plataforma = plataforma;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    @Override
    public String toString() {
        return "Editora{" + "a\u00f1o=" + año + ", autor=" + autor + ", plataforma=" + plataforma + '}';
    }
    
}
