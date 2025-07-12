/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ed.davidnavarroc.proyecto2;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Gestor {
    //Propiedades de la clase Gestor
    private Departamento[] departamentos;
    private int ultimoDep;
    private int idDepartamento;
    private int idArticulo;

    //Constructor de la clase Gestor
    public Gestor() {
        this.departamentos = new Departamento[20];
        this.ultimoDep = -1;
        this.idDepartamento = 1;
        this.idArticulo = 1;
    }

    //------------------------------------------------------

    //Getters y Setters
    public Departamento[] getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(Departamento[] departamentos) {
        this.departamentos = departamentos;
    }

    public int getUltimoDep() {
        return ultimoDep;
    }

    public void setUltimoDep(int ultimoDep) {
        this.ultimoDep = ultimoDep;
    }

    public int getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(int idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public int getIdArticulo() {
        return idArticulo;
    }

    public void setIdArticulo(int idArticulo) {
        this.idArticulo = idArticulo;
    }
    
    //------------------------------------------------------
    
    //Método para verificar si la pila de Departamentos está llena
    public boolean pilaLlena(){
        boolean pLlena = false;//Valor booleano para identificar si la pila está llena
        if(ultimoDep == departamentos.length - 1){//Si el índice del último departamento es igual a 19 significa que la pila está llena
            pLlena = true;
        }
        return pLlena;//Retorna el booleado para verificar si está llena
    }
    
    //Método para verificar si la pila de departamentos está vacía
    public boolean pilaVacia(){
        boolean pVacia = false;//Valor booleano para identificar si la pila está vacía
        if(ultimoDep == -1){//Si el índice del último departamento es igual a -1 significa que la pila está vacía
            pVacia = true;
        }
        return pVacia;//Retorna el booleano para verificar si está vacía
    }
    
    //Método para agregar un departamento
    public boolean agregarDepartamento(String nombreDepartamento){
        if(pilaLlena()){//Si la pila de Departamentos está llena, retorna falso y no continúa
            return false;
        }
        
        if(nombreDepartamento == null || nombreDepartamento.trim().isEmpty()){
            return false;//Si el nombre del departamento está vacío o vacío, retorna falso y no continúa
        }
        
        // Crea un nuevo objeto Departamento con el ID actual y el nombre ingresado (eliminando espacios extra)
        Departamento nuevoDepartamento = new Departamento(idDepartamento, nombreDepartamento.trim());
        departamentos[++ultimoDep] = nuevoDepartamento;//Inserta el nuevo departamento en la siguiente posición de la pila e incrementa el índice
        idDepartamento++;//Se incrementa el ID después de insertar el departamento
        
        return true;//El retorno true indica que el departamento se agregó correctamente
    }
    
    //Método que aumenta el contador de ID de artículos en 1. Se utiliza después de agregar un nuevo artículo para que sea consecutivo
    public void incrementarIdArticulo() {
    idArticulo++;
    }
}
