package com.example.heranca;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.heranca.classes.Cachorro;
import com.example.heranca.classes.Passaro;


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