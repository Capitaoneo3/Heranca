package com.example.heranca.classes;

public class Passaro extends Animal {
    void voar(){

        System.out.println("Voando como um gaviao");
    }

    @Override
    public void correr() {
        super.correr();
        System.out.println("Passaro");
    }
}
