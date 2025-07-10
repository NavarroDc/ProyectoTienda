/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ed.davidnavarroc.proyecto2;

public class Departamento {
    
    private int id;
    private String nombre;
    private Articulo[] articulos = new Articulo[20];
    private int frenteCola = 0;
    private int finalCola = -1;
    private int numActualCola = 0;

    public Departamento(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Articulo[] getArticulos() {
        return articulos;
    }

    public void setArticulos(Articulo[] articulos) {
        this.articulos = articulos;
    }

    public int getFrenteCola() {
        return frenteCola;
    }

    public void setFrenteCola(int frenteCola) {
        this.frenteCola = frenteCola;
    }

    public int getFinalCola() {
        return finalCola;
    }

    public void setFinalCola(int finalCola) {
        this.finalCola = finalCola;
    }

    public int getNumActualCola() {
        return numActualCola;
    }

    public void setNumActualCola(int numActualCola) {
        this.numActualCola = numActualCola;
    }
}
