/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ed.davidnavarroc.proyecto2;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Gestor {
    
    private Departamento[] departamentos;
    private int ultimoDep;
    private int idDepartamento;
    private int idArticulo;

    public Gestor() {
        this.departamentos = new Departamento[20];
        this.ultimoDep = -1;
        this.idDepartamento = 1;
        this.idArticulo = 1;
    }

    //------------------------------------------------------

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
    
    public boolean pilaLlena(){
        boolean pLlena = false;
        if(ultimoDep == departamentos.length - 1){
            pLlena = true;
        }
        return pLlena;
    }
    
    public boolean pilaVacia(){
        boolean pVacia = false;
        if(ultimoDep == -1){
            pVacia = true;
        }
        return pVacia;
    }
    
    public boolean agregarDepartamento(String nombreDepartamento){
        if(pilaLlena()){
            return false;
        }
        
        if(nombreDepartamento == null || nombreDepartamento.trim().isEmpty()){
            return false;
        }
        
        Departamento nuevoDepartamento = new Departamento(idDepartamento, nombreDepartamento.trim());
        departamentos[++ultimoDep] = nuevoDepartamento;
        idDepartamento++;
        
        return true;
    }
    
    public void incrementarIdArticulo() {
    idArticulo++;
    
    }
    
    
    
    
}
