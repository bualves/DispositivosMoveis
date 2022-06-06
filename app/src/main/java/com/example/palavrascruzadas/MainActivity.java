package com.example.palavrascruzadas;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button Instrucoes = (Button) findViewById(R.id.btnInstrucao);
        Instrucoes.setOnClickListener(new View.OnClickListener()
                                      {
                                          @Override
                                          public void onClick(View v)
                                          {
                                              AlertDialog.Builder alerta = new AlertDialog.Builder(MainActivity.this);
                                              alerta.setTitle("Instruções");
                                              alerta
                                                      .setMessage("As palavras são colocadas de maneira que sejam lidas da esquerda para a direita ou de cima para baixo, nunca em diagonal, e devem estar formadas por 2 letras, no mínimo.")
                                                      .setNegativeButton("Fechar", new DialogInterface.OnClickListener()
                                                        {
                                                            @Override
                                                            public void onClick(DialogInterface dialog, int which)
                                                            {
                                                                Toast.makeText(getApplicationContext(), "Fechar", Toast.LENGTH_SHORT).show();
                                                            }
                                                        });

                                              AlertDialog alertDialog = alerta.create();
                                              alertDialog.show();
                                          }


                                      });


    }
}