import java.util.Map;

public class CurrencyConverter {
    public static double convert(double amount, String fromCurrency, String toCurrency, Map<String, Double> rates) {
        if (!rates.containsKey(fromCurrency) || !rates.containsKey(toCurrency)) {
            throw new IllegalArgumentException("Moneda no soportada");
        }
        double fromRate = rates.get(fromCurrency);
        double toRate = rates.get(toCurrency);
        return amount * (toRate / fromRate);
    }
}