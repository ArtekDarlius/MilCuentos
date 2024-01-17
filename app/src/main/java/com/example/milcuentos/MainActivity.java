package com.example.milcuentos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    ImageButton btncuentos= null;
    ImageButton btncrearHistoria;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicializar();
        acciones();
    }

    private void acciones() {
        btncuentos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(),Cuentos.class);
                startActivityForResult(intent,0);
                
            }
        });
        btncrearHistoria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(),CreateStory.class);
                startActivityForResult(intent,0);
            }
        });
    }

    private void inicializar() {


        btncuentos= findViewById(R.id.Btncuentos);
        btncrearHistoria = findViewById(R.id.Btngpt);


    }
}