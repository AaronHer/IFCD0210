/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoDatos;

/**
 *
 * @author Equipo
 */
public class CalcularSueldo {
    private String nombre;
    private String direccion;
    private int numDiasTrabajados;
    private double valorDia, salario;
    
    public CalcularSueldo(){
        this.nombre = "";
        this.direccion = "";
        this.numDiasTrabajados = 0;
        this.valorDia = 0;
        this.salario = 0;
    }
    
    
    public void salario(){
        this.setSalario(this.numDiasTrabajados*this.valorDia);
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the numDiasTrabajados
     */
    public int getNumDiasTrabajados() {
        return numDiasTrabajados;
    }

    /**
     * @param numDiasTrabajados the numDiasTrabajados to set
     */
    public void setNumDiasTrabajados(int numDiasTrabajados) {
        this.numDiasTrabajados = numDiasTrabajados;
    }

    /**
     * @return the valorDia
     */
    public double getValorDia() {
        return valorDia;
    }

    /**
     * @param valorDia the valorDia to set
     */
    public void setValorDia(double valorDia) {
        this.valorDia = valorDia;
    }

    /**
     * @return the salario
     */
    public double getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }
        
        
    
}
