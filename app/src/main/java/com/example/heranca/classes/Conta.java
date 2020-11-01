package com.example.heranca.classes;

public class Conta {

   private int numeroConta;
   private double saldo = 100;


    public void depositar( double valorDeposito){
        saldo= this.saldo+valorDeposito;
    }
    public void sacar(double valorSaque){
        saldo=this.saldo-valorSaque;
    }
    public double recuperSaldo(){

        return this.saldo;
    }
}
