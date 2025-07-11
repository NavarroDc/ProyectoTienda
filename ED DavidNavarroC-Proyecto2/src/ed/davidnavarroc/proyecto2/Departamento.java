/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ed.davidnavarroc.proyecto2;

public class Departamento {
    
    private int id;
    private String nombre;
    private Articulo[] articulos;
    private int frenteCola;
    private int finalCola;

    public Departamento(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.articulos = new Articulo[20];
        this.frenteCola = 0;
        this.finalCola = -1;
    }
    
    //-------------------------------------------------
    
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
    //-------------------------------------------------
    
    public boolean colaLlena(){
        boolean cLlena = false;
        
        if(finalCola == articulos.length - 1){
            cLlena = true;
        }
       return cLlena;
    }
    
    public boolean agregarArticulo(Articulo nuevoArticulo){
        if(colaLlena()){
            return false;
        }
        finalCola++;
        articulos[finalCola] = nuevoArticulo;
        return true;
    }
}