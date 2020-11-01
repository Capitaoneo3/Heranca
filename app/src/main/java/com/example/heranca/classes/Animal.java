package com.example.heranca.classes;

import org.w3c.dom.ls.LSOutput;

public class Animal {
    public String getCor() {

        return cor;
    }

    public void setCor(String cor) {

        this.cor = cor;
    }

<<<<<<< HEAD:app/src/main/java/com/example/heranca/classes/Animal.java
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

    protected String cor;
    private Double tamanho;
    private Double peso;
=======
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

>>>>>>> 926116ab7f45e973665934664c18612b2c6296b6:app/src/main/java/com/example/heranca/Animal.java
    void correr(){

        System.out.println("correndo como um ");
    }
    void dormir(){

        System.out.println("dormindo como um  ");
    }


}
