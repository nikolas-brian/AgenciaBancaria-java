/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.agenciabancaria;

/**
 *
 * @author nikol
 */
public class Pessoa {

    public static int counter = 1; 
      private String nome;
      private String cpf;
      private String email;
      
      
      
     public Pessoa(String nome, String cPF , String email){
     
     this.nome = nome;
     cpf = cPF;
     this.email = email;
     counter += 1;
     
     }
     public String getNome(){
         return nome;
     }
     public void setNome(String nome){
         this.nome = nome;
     }
     public String getCPF(){
         return cpf;
     }
     public void setCPF(String cPF){
         this.cpf = cPF;
     }
     public String getEmail(){
         return email;
     }
     public void setEmail(String email){
         this.email = email;
     }
     
     public String toString(){
         return "/nNome:" + this.getNome() +
                "/nCPF: " + this.getCPF()  +
                "/nemail:"+ this.getEmail();
     }
 
    
     }
