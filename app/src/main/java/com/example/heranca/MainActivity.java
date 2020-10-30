package com.example.heranca;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Passaro passaro= new Passaro();

        Cachorro cachorro= new Cachorro();

       // passaro.correr();
        //cachorro.correr();
        passaro.setCor("rosa");
        System.out.println(passaro.getCor());
    }




}