package cs_sprint2;

import java.util.*;
import cs_sprint2.ExcesoAtributosExceptionAppCS;



/**
 *
 
 */
public class JugadorDeCampoAppCS extends JugadorAppCS{
    private int velocidad;
    private int potencia;
    private int regate;
    private int tiro;

    public JugadorDeCampoAppCS() {
    }

    /**
     *
     * @param nombre
     * @param apellidos
     * @param edad
     * @param peso
     * @param altura
     * @param nombre_deportivo
     * @param colocacion
     * @param precio
     * @param valoracion
     * @param velocidad
     * @param potencia
     * @param regate
     * @param tiro
     * @param tieneEquipo
     * @param esdeCampo
     * @throws ExcesoAtributosException
     */
    public JugadorDeCampoAppCS (String nombre, String apellidos, int edad, double peso, double altura, String dni, String nombre_deportivo, int colocasao, int velocidad, int potencia, int regate, int tiro, boolean tieneEquipo, boolean esdeCampo) throws ExcesoAtributosExceptionAppCS{
        super(nombre, apellidos, edad, peso, altura, dni, nombre_deportivo, colocasao, tieneEquipo, true);
        this.velocidad = velocidad;
        this.potencia = potencia;
        this.regate = regate;
        this.tiro = tiro;
    }

    public void setVelocidad(int velocidad) throws ExcesoAtributosExceptionAppCS{
        if ((velocidad <0)|| (velocidad > 5)){
            throw new ExcesoAtributosExceptionAppCS();
        }else{
            this.velocidad = velocidad;
        }
    }
    
    public void setPotencia(int potencia) throws ExcesoAtributosExceptionAppCS{
        if ((potencia <0)|| (potencia > 5)){
            throw new ExcesoAtributosExceptionAppCS();
        }else{
            this.potencia = potencia;
        }
    }
   public void setRegate(int regate) throws ExcesoAtributosExceptionAppCS{
        if ((regate <0)|| (regate > 5)){
            throw new ExcesoAtributosExceptionAppCS();
        }else{
            this.regate = regate;
        }
    } 
    
   public void setTiro(int tiro) throws ExcesoAtributosExceptionAppCS{
        if ((tiro <0)|| (tiro > 5)){
            throw new ExcesoAtributosExceptionAppCS();
        }else{
            this.tiro = tiro;
        }
    }
    
    
    public boolean isJugadorDeCampoAppCS(JugadorAppCS j) {
         return (j instanceof JugadorDeCampoAppCS);
     }
   
    
    public int getVelocidad(){
        return this.velocidad;
    }
    
     public int getPotencia(){
        return this.potencia;
    }
     
      public int getRegate(){
        return this.regate;
    }
      
       public int getTiro(){
        return this.tiro;
    }
    
    
    /*public double Valor (){
        return (getVelocidad() + getPotencia() + getRegate() + getTiro() + getColocacion())*10;
    }*/
    
    
    @Override
    public String toString(){
        String s = super.toString();
        s = s + "\nVelocidad: " +velocidad+ "\nRegate: " +regate+ "\nTiro: " +tiro+ "\nPotencia: " +potencia; 
        return s;
    }   
       
    @Override   
    public int CalcularValoracion(){
        int skills = this.velocidad + this.regate + this.tiro + this.potencia + this.colocacion;
        this.setValoracion((int)skills);
        return skills;
    }
}
