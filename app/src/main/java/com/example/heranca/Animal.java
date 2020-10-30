package com.example.heranca;

public class Animal {
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    private String cor;
    private double tamanho;
    private double peso;

    void correr(){
        System.out.println("correndo como um ");
    }
    void dormir(){
        System.out.println("dormindo como um  ");
    }

}
