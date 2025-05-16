package com.exemplo.conversor;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class CurrencyConverter {

    private final String API_KEY = e225d599223a829f5adb2186


    public double convert(String from, String to, double amount) {
        try {
            String endpoint = String.format("https://v6.exchangerate-api.com/v6/%s/pair/%s/%s/%.2f", API_KEY, from, to, amount);
            URL url = new URL(endpoint);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            JsonObject json = JsonParser.parseReader(new InputStreamReader(connection.getInputStream())).getAsJsonObject();
            return json.get("conversion_result").getAsDouble();

        } catch (Exception e) {
            System.out.println("Erro ao converter: " + e.getMessage());
            return 0;
        }
    }
}
