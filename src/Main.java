import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Solicitar al usuario la moneda de origen
            System.out.print("Ingrese la moneda de origen (3 letras, por ejemplo, USD): ");
            String fromCurrency = scanner.nextLine().toUpperCase();

            // Solicitar al usuario la moneda de destino
            System.out.print("Ingrese la moneda de destino (3 letras, por ejemplo, EUR): ");
            String toCurrency = scanner.nextLine().toUpperCase();

            // Solicitar al usuario la cantidad a convertir
            System.out.print("Ingrese la cantidad a convertir: ");
            double amount = scanner.nextDouble();

            // Obtener las tasas de cambio
            ExchangeRates rates = CurrencyAPI.getExchangeRates();

            // Realizar la conversión
            double convertedAmount = CurrencyConverter.convert(amount, fromCurrency, toCurrency, rates.getConversionRates());
            System.out.printf("%.2f %s son %.2f %s%n", amount, fromCurrency, convertedAmount, toCurrency);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}