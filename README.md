# Conversor de Moedas

[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)](https://www.java.com)
[![License](https://img.shields.io/badge/license-MIT-green?style=for-the-badge)](LICENSE)

Este projeto em Java realiza conversão de moedas com dados em tempo real, utilizando a API [ExchangeRate-API](https://www.exchangerate-api.com/).

## Funcionalidades

- Interface via console
- 6 opções de conversão (USD, BRL, EUR, GBP)
- Histórico de conversões exibido em tempo real
- Uso da biblioteca Gson para desserializar JSON
- Conversão dinâmica usando API externa

## Como usar

1. Insira sua chave da API no arquivo `CurrencyConverter.java`
2. Compile o projeto com Maven:
   ```bash
   mvn clean install
   ```
3. Execute:
   ```bash
   mvn exec:java -Dexec.mainClass="com.exemplo.conversor.Main"
   ```

## Como compartilhar no GitHub

1. Crie um repositório no GitHub (ex: `conversor-moedas`).
2. No terminal, dentro da pasta do projeto:
   ```bash
   git init
   git add .
   git commit -m "Primeiro commit - Conversor de Moedas"
   git branch -M main
   git remote add origin https://github.com/seu-usuario/conversor-moedas.git
   git push -u origin main
   ```

## Badge

Use este badge para o Java:
```
[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)](https://www.java.com)
```