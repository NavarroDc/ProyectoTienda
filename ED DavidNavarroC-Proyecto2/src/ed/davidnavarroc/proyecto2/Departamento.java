/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ed.davidnavarroc.proyecto2;

import javax.swing.JOptionPane;

public class Departamento {
    
    //Propiedades de la clase Departamento
    private int id;
    private String nombre;
    private Articulo[] articulos;
    private int frenteCola;
    private int finalCola;

    //Constructor de la clase departamento
    public Departamento(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.articulos = new Articulo[20];
        this.frenteCola = 0;
        this.finalCola = -1;
    }
    
    //-------------------------------------------------
    
    //Getters y Setters
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
    
    //Método para verificar si la cola de artículos está llena
    public boolean colaLlena(){
        boolean cLlena = false;//Valor booleando para identificar si la cola está llena
        
        if(finalCola == articulos.length - 1){//Si el final de la cola es igual a 19, significa que está llena
            cLlena = true;
        }
       return cLlena;//Retorna el booleano para verificar si la cola está llena
    }
    
    //Método para verificar si la cola de artículos está vacía
    public boolean colaVacia(){
        boolean cVacia = false;//Valor booleano para identificar si la cola está vacía
        
        if(finalCola == - 1){//Si el final de la cola es igual a -1, significa que la cola está vacía
            cVacia = true;
        }
        return cVacia;//Retorna el valor booleano para verificar si la cola está vacía
    }
    
    //Método para agregar un artículo en el arreglo de articulos
    public boolean agregarArticulo(Articulo nuevoArticulo){
        if(colaLlena()){//Si la cola de artículos está llena no se puede agregar más artículos y retorna false
            return false;
        }
        finalCola++;//Se incrementa el índice final de la cola (último artículo insertado en la cola) FIFO
        articulos[finalCola] = nuevoArticulo;//El nuevo artículo se guarda al final de la cola en artículos[]
        return true;
    }
    
    //Método para eliminar un artículo de la cola de artículos
    public boolean eliminarArtículo(){
        if(colaVacia()){//Si la cola está vacía retorna false y no continúa
            return false;
        }
        articulos[frenteCola] = null;//Se elimina el artículo del frente de la cola con (null)
        frenteCola++;//Hace que el frente de la cola sea el siguiente número porque el previo ya se eliminó
        return true;
    }
}