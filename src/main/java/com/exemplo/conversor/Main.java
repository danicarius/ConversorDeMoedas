package com.exemplo.conversor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CurrencyConverter converter = new CurrencyConverter();
        List<String> historico = new ArrayList<>();
        boolean continuar = true;

        while (continuar) {
            System.out.println("\n=== Conversor de Moedas ===");
            System.out.println("1 - USD para BRL");
            System.out.println("2 - BRL para USD");
            System.out.println("3 - EUR para BRL");
            System.out.println("4 - BRL para EUR");
            System.out.println("5 - GBP para BRL");
            System.out.println("6 - BRL para GBP");
            System.out.println("7 - Ver histórico");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            int option = scanner.nextInt();

            if (option == 0) {
                continuar = false;
                System.out.println("Programa encerrado.");
                break;
            }

            if (option == 7) {
                System.out.println("--- Histórico de Conversões ---");
                for (String registro : historico) {
                    System.out.println(registro);
                }
                continue;
            }

            System.out.print("Digite o valor: ");
            double value = scanner.nextDouble();

            String from = "", to = "";
            switch (option) {
                case 1 -> { from = "USD"; to = "BRL"; }
                case 2 -> { from = "BRL"; to = "USD"; }
                case 3 -> { from = "EUR"; to = "BRL"; }
                case 4 -> { from = "BRL"; to = "EUR"; }
                case 5 -> { from = "GBP"; to = "BRL"; }
                case 6 -> { from = "BRL"; to = "GBP"; }
                default -> {
                    System.out.println("Opção inválida!");
                    continue;
                }
            }

            double converted = converter.convert(from, to, value);
            String resultado = String.format("Valor convertido: %.2f %s -> %.2f %s", value, from, converted, to);
            historico.add(resultado);
            System.out.println(resultado);
        }
    }
}