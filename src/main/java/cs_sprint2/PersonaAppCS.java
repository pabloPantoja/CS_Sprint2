package cs_sprint2;

import java.io.Serializable;

import java.util.*;


/**
 *

 */
public class PersonaAppCS implements Serializable {
    protected String dni;
    protected String nombre;
    protected String apellidos;
    protected int edad;
    protected double peso;
    protected double altura;

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
     public String getNombre (){
        return this.nombre;
    }
    
    public void setNobre (String nombre){
        this.nombre = nombre;
    }
    
     public String getApellidos (){
        return this.apellidos;
    }
    
    public void setApellidos (String apellidos){
        this.apellidos = apellidos;
    }
    
     public int getEdad (){
        return this.edad;
    }
    
    public void setEdad (int edad){
        this.edad = edad;
    }
    
     public double getPeso (){
        return this.peso;
    }
    
    public void setPeso (double peso){
        this.peso = peso;
    }
    
     public double getAltura (){
        return this.altura;
    }
    
    public void setAltura (double altura){
        this.altura = altura;
    }
    
    
    public PersonaAppCS (){
        nombre = null;
        apellidos = null;
        edad = 0;
        peso = 0;
        altura = 0;
        dni = null;
    }
    
    public PersonaAppCS (String nombre, String apellidos, int edad, double peso, double altura, String dni){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        this.dni = dni;
    }
    
    public boolean esMismaPersona(PersonaAppCS p){
        return this.dni.equalsIgnoreCase(p.dni);
    }
    
    /**
     *
     * @return
     */
    @Override
     public String toString(){
        return "Nombre: " +this.nombre+ "\nApellidos: " +this.apellidos+ "\nEdad: " +this.edad+ "\nPeso: " +this.peso+ "\nAltura: " +this.altura;
    }
    
}

