/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Fabricio
 */
public class Dog {
    
    public String nome, raca;
    public float peso; 
    
    public Dog() {}
    public Dog(String nome, String raca, float peso) {}
    
    public void debugAtributos(){
        System.out.println(this.nome);
        System.out.println(this.peso);
        System.out.println(this.raca);
    }
    
    public void Andar(){
        System.out.println("Cachorrinho está andando. ");
    }
    	
}
