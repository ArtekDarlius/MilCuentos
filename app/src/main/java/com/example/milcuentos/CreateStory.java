package com.example.milcuentos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.milcuentos.Class.ChatGPTClient;

import java.io.IOException;

public class CreateStory extends AppCompatActivity {
    private ChatGPTClient chatGPTClient;
    private TextView txtRespuesta;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_story);

        txtRespuesta=findViewById(R.id.txtResponse);

        // Inicializa el cliente de ChatGPT con tu clave de API
        chatGPTClient = new ChatGPTClient("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");

        // Ejemplo de envío de mensaje y manejo de respuesta
        sendMessage("Dime que dia es hoy");
    }

    private void sendMessage(String message) {
        chatGPTClient.sendRequest(message, new ChatGPTClient.CompletionListener() {
            @Override
            public void onSuccess(String response) {
                // Procesa la respuesta recibida
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        // Actualiza la interfaz de usuario con la respuesta
                        // response contiene la respuesta generada por ChatGPT
                        txtRespuesta.setText(response);
                    }
                });
            }

            @Override
            public void onFailure(IOException e) {
                // Maneja errores de conexión o de la API
                e.printStackTrace();
            }
        });
    }
}