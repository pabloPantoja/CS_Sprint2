
package cs_sprint2;

import java.io.Serializable;

import java.util.*;
import cs_sprint2.PersonaAppCS;


/**
 *

 */
public abstract class JugadorAppCS extends PersonaAppCS implements Comparable <JugadorAppCS>{
    protected String nombre_deportivo;
    protected int colocacion;
    protected double precio;
    protected int valoracion;
    protected boolean tieneEquipo;
    protected boolean esdeCampo;
    
    protected String nombre_deportivo1;
    protected int colocacion1;
    protected double precio1;
    protected int valoracion1;
    protected boolean tieneEquipo1;
    protected boolean esdeCampo1;
    
    protected String nombre_deportivo2;
    protected int colocacion2;
    protected double precio2;
    protected int valoracion2;
    protected boolean tieneEquipo2;
    protected boolean esdeCampo2;
    
    protected String nombre_deportivo3;
    protected int colocacion3;
    protected double precio3;
    protected int valoracion3;
    protected boolean tieneEquipo3;
    protected boolean esdeCampo3;

    public JugadorAppCS() {
    }

    public JugadorAppCS(String nombre, String apellidos, int edad, double peso, double altura, String dni, String nombre_deportivo, int colocacion, boolean tieneEquipo, boolean esdeCampo) {
        super(nombre, apellidos, edad, peso, altura, dni);
        this.nombre_deportivo = nombre_deportivo;
        this.colocacion = colocacion;
        this.tieneEquipo = tieneEquipo;
        this.esdeCampo = esdeCampo;
    }
    
    

    public String getNombre_deportivo() {
        return nombre_deportivo;
    }

    public boolean isTieneEquipo() {
        return tieneEquipo;
    }

    public boolean isEsdeCampo() {
        return esdeCampo;
    }

    public void setNombre_deportivo(String nombre_deportivo) {
        this.nombre_deportivo = nombre_deportivo;
    }

    public void setTieneEquipo(boolean tieneEquipo) {
        this.tieneEquipo = tieneEquipo;
    }

    public void setEsdeCampo(boolean esdeCampo) {
        this.esdeCampo = esdeCampo;
    }
    
    public void setPrecio(double precio){   //OJO CUIDADOOOOO
        this.precio = this.CalcularValoracion()*10;
    }
        
    public double getPrecio(){
        return this.precio;
    }
    
    
    public void setValoracion(int valoracion){ //OJO CUIDADO
        this.valoracion = this.CalcularValoracion();
    }
    
    public int getValoracion(){
        return this.valoracion;
    }
    
     public void setColocacion(int colocacion){
        this.colocacion = colocacion;
    }
    
    public int getColocacion(){
        return this.colocacion;
    }
    
     public void setNombre_Deportivo(String nombre_deportivo){
        this.nombre_deportivo = nombre_deportivo;
     }
    
    public String getNombre_Deportivo(){
        return this.nombre_deportivo;
    }
    
    
    @Override
    public int compareTo(JugadorAppCS j){
       if (this.valoracion > j.valoracion){
           return 1;
       }else if (this.valoracion < j.valoracion){
           return -1;
       }
       return 0;
    }
    
    @Override
    @SuppressWarnings("empty-statement")
    public String toString(){
        String s = super.toString();
        s = s + "\nNombre Deportivo: " +nombre_deportivo+ "\nPrecio: " +precio+ "\nValoracion: " +valoracion+ "\nColocacion: " +colocacion;
        return s;
    }
    
    /*
    public boolean isJugadorDeCampo(JugadorAppCS k) {

         return (k instance of JugadorAppCS) ;

     }
    */
    
    public abstract int CalcularValoracion();
    
}
