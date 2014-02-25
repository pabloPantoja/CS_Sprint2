package cs_sprint2;

import java.io.Serializable;

import java.util.*;


/**
 *
comentario de prueba de la rama nueva ramaPablo
 */
public class PersonaAppCS implements Serializable {
    protected String dni;
    protected String nombre;
    protected String apellidos;
    protected int edad;
    protected double peso;
    protected double altura;
    
    
    //creación de variables inutiles para el testeo
    protected double peso1;
    protected double altura1;
    
    protected double peso2;
    protected double altura2;
    
    protected double peso3;
    protected double altura3;
    
    protected double peso4;
    protected double altura4;
    
    protected double peso5;
    protected double altura5;
    

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

