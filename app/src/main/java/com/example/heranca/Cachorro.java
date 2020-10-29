package com.example.heranca;

public class Cachorro extends Animal {
    void latir(){
        System.out.println("Latindo como um doguinho");
    }

    @Override
    void correr() {
        super.correr();
        System.out.println("cão");
    }
}
