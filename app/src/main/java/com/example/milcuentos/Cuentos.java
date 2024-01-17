package com.example.milcuentos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Cuentos extends AppCompatActivity {
    ImageView btnmenu1= null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuentos);
        inicializar();
        acciones();
    }

    private void inicializar() {
        btnmenu1 = findViewById(R.id.aventuras);
    }

    private void acciones() {
        btnmenu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(),ListaCuentosAv.class);
                startActivityForResult(intent,0);

            }
        });
    }
}