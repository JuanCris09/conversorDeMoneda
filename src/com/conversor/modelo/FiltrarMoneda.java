package com.conversor.modelo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FiltrarMoneda {
    public static Map<String, Double> filtrarMonedas(Map<String, Double> conversionRates, Set<String> monedasInteres) {
        Map<String, Double> filteredRates = new HashMap<>();

        for (String moneda : monedasInteres) {
            if (conversionRates.containsKey(moneda)) {
                filteredRates.put(moneda, conversionRates.get(moneda));
            }
        }

        return filteredRates;
    }


}
