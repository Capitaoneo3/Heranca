package com.example.heranca;

public class Passaro extends Animal {
    void voar(){

        System.out.println("Voando como um gaviao");
    }

    @Override
    void correr() {
        super.correr();
        System.out.println("Passaro");
    }
}
