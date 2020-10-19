package com.example.primeiroapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int numClicks = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void carregar(View view){
        numClicks += 1;
        TextView txtNumClick = findViewById(R.id.txtNumClicks);
        TextView txtView = findViewById(R.id.textResult);
        int valor = new Random().nextInt(10);
        txtView.setText("Número:" + valor);
        txtNumClick.append("\nÚltimo número sorteado:" + valor + " // Número de sorteios: " + numClicks);

    }
}