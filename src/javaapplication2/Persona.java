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
   private Carro carro1;
   private String id;
   private String tallaCamisa;
   private int edad;
   public void setCarr(Carro carro1P){
    this.carro1=carro1P;
    }
   public Carro getCarro1(){
    return carro1;
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
