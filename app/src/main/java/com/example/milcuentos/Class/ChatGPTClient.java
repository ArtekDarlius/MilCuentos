package com.example.milcuentos.Class;
import okhttp3.*;
import org.jetbrains.annotations.NotNull;
import java.io.IOException;

public class ChatGPTClient {
    private static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");
    private static final String API_URL = "https://api.openai.com/v1/chat/completions";
    private final String apiKey;

    public ChatGPTClient(String apiKey) {
        this.apiKey = apiKey;
    }

    public interface CompletionListener {
        void onSuccess(String response);
        void onFailure(IOException e);
    }

    public void sendRequest(String message, CompletionListener listener) {
        OkHttpClient client = new OkHttpClient();

        String json = "{\"messages\":[{\"role\":\"system\",\"content\":\"user\"},{\"role\":\"user\",\"content\":\"" + message + "\"}],\"model\":\"gpt-3.5-turbo\"}";
        RequestBody requestBody = RequestBody.create(JSON, json);

        Request request = new Request.Builder()
                .url(API_URL)
                .addHeader("Content-Type", "application/json")
                .addHeader("Authorization", "Bearer " + apiKey)
                .post(requestBody)
                .build();

        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onResponse(@NotNull Call call, @NotNull Response response) throws IOException {
                String responseBody = response.body().string();
                listener.onSuccess(responseBody);
            }

            @Override
            public void onFailure(@NotNull Call call, @NotNull IOException e) {
                listener.onFailure(e);
            }
        });
    }
}
