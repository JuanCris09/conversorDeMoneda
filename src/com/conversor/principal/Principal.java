package com.conversor.principal;


import com.conversor.modelo.ConsultarMoneda;
import com.conversor.modelo.FiltrarMoneda;
import com.conversor.modelo.Moneda;

import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Principal {
    public static void main(String[] args) {

        int opcion = 0;
        double valor = 0.0;
        String menu = """
                *** Sea bienvenido/a al Conversor de Moneda = ***
                1 - Dolar a Peso Argentino
                2 - Peso Argentino a Dolar
                3 - Dolar a Boliviano de Bolivia
                4 - Boliviano de Bolivia a Dolar
                5 - Dolar a Peso Colombiano
                6 - Peso Colombiano a Dolar
                7 - Salir
                Elija una opcion válida: 
                """;

        Scanner entrada = new Scanner(System.in);

        while (opcion != 7) {
            System.out.println(menu);
            opcion = entrada.nextInt();
            ConsultarMoneda consulta = new ConsultarMoneda();
            Set<String> monedasInteres = new HashSet<>();
            switch (opcion) {
                case 1:
                    System.out.println("Ingresa el valor que deseas convertir");
                    Moneda moneda = consulta.buscaMoneda("USD");
                    Map<String, Double> conversionRates = moneda.conversion_rates();
                    monedasInteres.add("ARS");
                    valor = entrada.nextDouble();
                    Map<String, Double> filteredRates = FiltrarMoneda.filtrarMonedas(conversionRates, monedasInteres);

                    for (Map.Entry<String, Double> entry : filteredRates.entrySet()) {
                        System.out.println(entry.getKey() + ": " + entry.getValue());
                        Double resultado = (valor * entry.getValue());
                        System.out.println("El valor " + valor + " [USD] corresponde al valor final de => " + resultado + " [ARS]");
                    }
                    break;
                case 2:
                    System.out.println("Ingresa el valor que deseas convertir");
                    Moneda argentino = consulta.buscaMoneda("ARS");
                    Map<String, Double> conversionRates1 = argentino.conversion_rates();
                    monedasInteres.add("USD");
                    valor = entrada.nextDouble();
                    Map<String, Double> filteredRates1 = FiltrarMoneda.filtrarMonedas(conversionRates1, monedasInteres);
                    for (Map.Entry<String, Double> entry : filteredRates1.entrySet()) {
                        System.out.println(entry.getKey() + ": " + entry.getValue());
                        Double resultado = (valor * entry.getValue());
                        System.out.println("El valor " + valor + "[ARS] corresponde al valor final de => " + resultado + " [USD]");
                    }
                    break;
                case 3:
                    System.out.println("Ingresa el valor que deseas convertir");
                    Moneda dolar = consulta.buscaMoneda("USD");
                    Map<String, Double> conversionRates2 = dolar.conversion_rates();
                    monedasInteres.add("BOB");
                    valor = entrada.nextDouble();
                    Map<String, Double> filterRates2 = FiltrarMoneda.filtrarMonedas(conversionRates2, monedasInteres);
                    for (Map.Entry<String, Double> entry : filterRates2.entrySet()) {
                        System.out.println(entry.getKey() + ": " + entry.getValue());
                        Double resultado = (valor * entry.getValue());
                        System.out.println("El valor " + valor + " [USD] corresponde al valor final de => " + resultado + " [BOB]");
                    }
                    break;
                case 4:
                    System.out.println("Ingresa el valor que deseas convertir");
                    Moneda boliviano = consulta.buscaMoneda("BOB");
                    valor = entrada.nextDouble();
                    Map<String, Double> conversionRates3 = boliviano.conversion_rates();
                    monedasInteres.add("USD");
                    Map<String, Double> filteRates3 = FiltrarMoneda.filtrarMonedas(conversionRates3, monedasInteres);
                    for (Map.Entry<String, Double> entry : filteRates3.entrySet()) {
                        System.out.println(entry.getKey() + ": " + entry.getValue());
                        Double resultado = (valor * entry.getValue());
                        System.out.println("El valor " + valor + " [BOB] corresponde al valor final de => " + resultado + " [USD]");
                    }
                    break;
                case 5:
                    System.out.println("Ingresa el valor que deseas convertir");
                    Moneda dolar1 = consulta.buscaMoneda("USD");
                    valor = entrada.nextDouble();
                    Map<String, Double> conversionRates4 = dolar1.conversion_rates();
                    monedasInteres.add("COP");
                    Map<String, Double> filteRates4 = FiltrarMoneda.filtrarMonedas(conversionRates4, monedasInteres);
                    for (Map.Entry<String, Double> entry : filteRates4.entrySet()) {
                        System.out.println(entry.getKey() + ": " + entry.getValue());
                        Double resultado = (valor * entry.getValue());
                        System.out.println("El valor " + valor + " [USD] corresponde al valor final de => " + resultado + " [COP]");
                    }
                    break;
                case 6:
                    System.out.println("Ingresa el valor que deseas convertir");
                    Moneda cop = consulta.buscaMoneda("COP");
                    valor = entrada.nextDouble();
                    Map<String, Double> conversionRates5 = cop.conversion_rates();
                    monedasInteres.add("USD");
                    Map<String, Double> filteRates5 = FiltrarMoneda.filtrarMonedas(conversionRates5, monedasInteres);
                    for (Map.Entry<String, Double> entry : filteRates5.entrySet()) {
                        System.out.println(entry.getKey() + ": " + entry.getValue());
                        Double resultado = (valor * entry.getValue());
                        System.out.println("El valor " + valor + " [COP] corresponde al valor final de => " + resultado + " [USD]");
                    }
                    break;
            }
        }
    }
}
