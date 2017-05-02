/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author Sena
 */
public class Persona {
   private Carro carr;
   private String id;
   private String tallaCamisa;
   private int edad;
   public void setCarr(Carro carrP){
    this.carr=carrP;
    }
   public Carro getCarr(){
    return carr;
    }
    
    public void setId(String idP){
    this.id=idP;
    }
    public String getId(){
    return this.id;
    }
    public void caminar(){
        System.out.println("Estoy Caminando");
    }
}
