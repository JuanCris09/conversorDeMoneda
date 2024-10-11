package com.conversor.modelo;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultarMoneda {
    public Moneda buscaMoneda(String moneda) {
        String apiKey = "20acfa4d90cefc22c3d90618";
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/" + apiKey + "/latest/" + moneda);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            JsonParser jp = new JsonParser();
            JsonElement root = jp.parse(response.body());
            JsonObject jsonobj = root.getAsJsonObject();

            Gson gson = new GsonBuilder()
                    .setPrettyPrinting()
                    .create();

            String req_result = jsonobj.get("result").getAsString();
            System.out.println("Resultado de la solicitud: " + req_result);

            Moneda money = gson.fromJson(jsonobj, Moneda.class);

            return money;

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
