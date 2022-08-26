
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nikol
 */
public class AgenciaBancaria {
    
    static Scanner input = new Scanner (System.in);
    static Array<Conta> contaBancarias;

public static void main(String[]args){
    contaBancarias = new ArrayList<Conta>();
    operacoes();
} 

public static void operacoes(){
    
    System.out.println("----------------------------------------------------");
    System.out.println("------------Bem Vindo A Nossa Agência---------------");
    System.out.println("----------------------------------------------------");
    System.out.println("*****Selecione uma operação que deseja realizar*****");
    System.out.println("----------------------------------------------------");
    System.out.println("     -opção 01:  Criar conta");
    System.out.println("     -opção 02:  Depositar");
    System.out.println("     -opção 03:  Sacar");
    System.out.println("     -opção 04:  Transferir");
    System.out.println("     -opção 05:  Listar");
    System.out.println("     -opção 06:  Sair");
    
    
    int operacao = input.nextInt();
    
    switch(operacao){
        case 1:
            criaConta();
            break;
        case 2:
            depositar();
            break;
        case 3:
            sacar();
            break;
        case 4:
            transferir();
            break;
        case 5:
            listarContas();
            break;   
        case 6:
            System.out.println("Obrigado por usar nossa agência");
            System.exit(0);
            
            
        default:
            System.out.println("Opção invalida");
            operacoes();
            break;
    }
    
}
    

     public static void criaConta(){
           
           System.out.println("/nNome:");
           String nome = input.next();
           
            System.out.println("/nCPF:");
           String cpf = input.next();
           
            System.out.println("/nEmail:");
           String email = input.next();
           
           Pessoa pessoa = new Pessoa(nome,cpf,email);
           
           Conta conta = new Conta(pessoa);
           
           contaBancarias.add(conta);
           
           
           
           operacoes();
     }
     
     
     private static Conta encontrarConta(int numeroConta){
         
          Conta conta = null;
          
          if(contasBancarias.size()>0){
             for(Conta c: contasBancarias){
                if(c.getNumeroConta()== numeroConta);
                conta = c;
          }
          }
          
          
          return Conta;
     }
     
         
          
     

     
     
     
     
     public static void depositar(){
         System.out.println("Numero da conta:");
         int numeroConta = input.nextInt();
         
         Conta conta = encontrarConta(numeroConta);
         
         if(conta != null){
             System.out.println("Qual valor deseja depositar?");
             double valorDeposito = input.nextDouble();
             conta.depositar(valorDeposito);
             System.out.println("Valor depositado com sucesso!");
         }else{
             System.out.println("Conta não encontrada!");
         }
         
         operacoes();
     }
     
     
     public static void sacar(){
          System.out.println("Numero da conta:");
         int numeroConta = input.nextInt();
         
         Conta conta = encontrarConta(numeroConta);
         
         if(conta != null){
             System.out.println("Qual valor deseja sacar?");
             double valorSaque = input.nextDouble();
             conta.sacar(valorSaque);
             //System.out.println("Valor sacado com sucesso!");
         }else{
             System.out.println("Conta não encontrada!");
         }
         
         operacoes();
         
     } 
     
     public static void transferir(){
         System.out.println("Numero da conta do remetente:");
         int numeroContaRemetente = input.nextInt();
         
         Conta contaRemetente = encontrarConta(numeroContaRemetente);
         
         if(contaRemetente != null){
             System.out.println("Número da conta do destinatario:");
             int numeroContaDestinatario = input.nextInt();
             
             Conta contaDestinatario = encontrarConta(numeroContaDestinatario);
             
         if(contaDestinatario != null){
              System.out.println("Valor da transferencia:");
              double valor = input.nextDouble();
              
              contaRemetente.Transferir(contaDestinatario, valor);
             
         }else{
             System.out.println("A conta para deposito não foi encontrada");
             
         }
         }else{
             System.out.println("Conta para transferencia não encontrada");
         }
                 
                 
         
         
         operacoes();
         
     }
     
     public static void listarContas(){
         if(contasBancarias.size()>0){
             for(Conta conta: contasBancarias){
                 System.out.println(conta);
                 
             }
                     
             }else{
             System.out.println("não ha contas cadastradas");
             
         }
         operacoes ();
     }
}


     