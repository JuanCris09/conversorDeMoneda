package com.conversor.principal;


import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        String url_str = "https://v6.exchangerate-api.com/v6/20acfa4d90cefc22c3d90618/latest/USD";
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url_str))
                .build();

        HttpResponse<String> response = null;
        try {
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        JsonParser jp = new JsonParser();
        JsonElement root = jp.parse(response.body());
        JsonObject jsonobj = root.getAsJsonObject();

        String req_result = jsonobj.get("result").getAsString();

        System.out.println("Resultado de la solicitud: " + req_result);

        int opcion = 0;
        double valor = 0.0;
        String menu = """
                *** Sea bienvenido/a al Conversor de Moneda = ***
                1 - Dolar a Peso Argentino
                2 - Peso Argentino a Dolar
                3 - Dolar a Real brasileño
                4 - Real brasileño a Dolar
                5 - Dolar a Peso Colombiano
                6 - Peso Colombiano a Dolar
                7 - Salir
                Elija una opcion válida: 
                """;

        Scanner entrada = new Scanner(System.in);
        while (opcion != 7) {
            System.out.println(menu);
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingresa el valor que deseas convertir");
                    valor = entrada.nextDouble();
                    System.out.println("El valor " + valor + " [USD] corresponde al valor final de => " newValor " [ARS]");
                    break;
                case 2:
                    System.out.println("Ingresa el valor que deseas convertir");
                    valor = entrada.nextDouble();
                    System.out.println("El valor " + valor + " [USD] corresponde al valor final de => " newValor " [ARS]");
                    break;
                case 3:
                    System.out.println("Ingresa el valor que deseas convertir");
                    valor = entrada.nextDouble();
                    System.out.println("El valor " + valor + " [USD] corresponde al valor final de => " newValor " [ARS]");
                    break;
                case 4:
                    System.out.println("Ingresa el valor que deseas convertir");
                    valor = entrada.nextDouble();
                    System.out.println("El valor " + valor + " [USD] corresponde al valor final de => " newValor " [ARS]");
                    break;
                case 5:
                    System.out.println("Ingresa el valor que deseas convertir");
                    valor = entrada.nextDouble();
                    System.out.println("El valor " + valor + " [USD] corresponde al valor final de => " newValor " [ARS]");
                    break;
                case 6:
                    System.out.println("Ingresa el valor que deseas convertir");
                    valor = entrada.nextDouble();
                    System.out.println("El valor " + valor + " [USD] corresponde al valor final de => " newValor " [ARS]");
                    break;
            }
        }
    }
}
