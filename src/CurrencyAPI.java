import com.google.gson.Gson;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class CurrencyAPI {
    private static final String API_URL = "https://v6.exchangerate-api.com/v6/03a34d88d0b45427f00d9347/latest/USD";

    public static ExchangeRates getExchangeRates() throws Exception {
        URL url = new URL(API_URL);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        if (connection.getResponseCode() == 200) {
            InputStreamReader reader = new InputStreamReader(connection.getInputStream());
            return new Gson().fromJson(reader, ExchangeRates.class);
        } else {
            throw new Exception("Error al obtener las tasas de cambio: " + connection.getResponseCode());
        }
    }
}