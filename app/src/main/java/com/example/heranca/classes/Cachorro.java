package com.example.heranca.classes;

public class Cachorro extends Animal {
    void latir(){
        System.out.println("Latindo como um doguinho");
    }

    @Override
    public void correr() {
        super.correr();
        System.out.println("cão");
    }
}
