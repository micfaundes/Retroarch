/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RetroArch.modelo;

/**
 *
 * @author natal
 */
public class Consola {
    
    private int id;
    private String region;
    private String model;
    private String fabricante;

    public Consola() {
    }

    public Consola(int id, String region, String model, String fabricante) {
        this.id = id;
        this.region = region;
        this.model = model;
        this.fabricante = fabricante;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    @Override
    public String toString() {
        return "Consola{" + "id=" + id + ", region=" + region + ", model=" + model + ", fabricante=" + fabricante + '}';
    }
    
    
    
}
