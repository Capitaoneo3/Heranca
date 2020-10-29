package com.example.heranca;

public class Animal {
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Double getTamanho() {
        return tamanho;
    }

    public void setTamanho(Double tamanho) {
        this.tamanho = tamanho;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    String cor;
    Double tamanho;
    Double peso;

    void correr(){
        System.out.println("correndo como um ");
    }
    void dormir(){
        System.out.println("dormindo como um  ");
    }

}
