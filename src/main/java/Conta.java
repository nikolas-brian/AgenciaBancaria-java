
import com.mycompany.agenciabancaria.Pessoa;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nikol
 */
public class Conta {
    private static int contadorDeContas = 1;
    
    private int numeroConta;
    private Pessoa pessoa;
    private Double saldo = 0.0;
    
    public Conta(Pessoa pessoa){
       this.numeroConta = contadorDeContas;
       this.pessoa = pessoa;
       contadorDeContas += 1;
       
       
       
       
    }   
    public int getNumeroConta(){
        return numeroConta;
    }
     
    public void SetNumeroConta (int numeroConta){
        this.numeroConta = numeroConta;
    }
    
     public Pessoa getPessoa(){
        return pessoa;
    }
     
    public void SetPessoa (Pessoa pessoa){
        this.pessoa = pessoa;
    }
     public Double getSaldo(){
        return saldo;
    }
     
    public void SetSaldo (Double saldo){
        this.saldo  = saldo;
    }
    
    public String ToString(){
        return "/nNúmero da conta:" + this.getNumeroConta()+
       
              
               "/nNome:" + this.pessoa.getNome()+
               "/nCPF:" + this.pessoa.getCPF()+
               "/nEmail:" + this.pessoa.getEmail()+
               "/nSaldo:" + Utils.doubleToString(this.getSaldo()) +
               "/n";
        
    }
    
    public void depositar(double valor){
        if(valor > 0){
            SetSaldo(getSaldo()+ valor);
            System.out.println("Seu Deposito Foi Realizado Com Sucesso");
        }else{
            System.out.println("Não Foi Possivel Realizar o Deposito ");
        }
    }

    
 
  public void sacar(double valor){
 
       if(valor > 0 && this.getSaldo()>= valor){
          SetSaldo(getSaldo() - valor);
          System.out.println("Saque  Realizado Com Sucesso");
       }else{
          System.out.println("Não Foi Possivel Realizar o Saque ");

  }


  }
  
  public void Transferir (Conta contaParaDeposito , double valor ){
      if(valor >0 && this.getSaldo()>= valor ){
          SetSaldo(getSaldo() - valor);
          contaParaDeposito.saldo = contaParaDeposito.getSaldo() + valor;
          System.out.println("Transferencia   Realizada Com Sucesso");
      }else{
          System.out.println("Não Foi Possivel Realizar a Transferencia  ");
      }
      
  }
  }


