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
        EditText txtEdit = findViewById(R.id.plnText);

        String numEscolhido = txtEdit.getText().toString();

        if (!numEscolhido.equals("")){
            int valor = new Random().nextInt(10);
            txtView.setText("Número:" + valor);
            txtNumClick.append("\nNúmero escolhido: " +  numEscolhido + "\nÚltimo número sorteado:" + valor + "\nNúmero de sorteios: " + numClicks + "\n");
            txtEdit.setText("");
        }


    }
}
