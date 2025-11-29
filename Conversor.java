import java.net.*;
import java.io.*;
import org.json.JSONObject;

public class ConversordeMoeda {
    public static void main(String[] args) throws Exception {
        double valor = 100;
        String de = "EUR", para = "BRL";

        URL url = new URL("https://open.er-api.com/v6/latest/" + de);
        HttpURLConnection c = (HttpURLConnection) url.openConnection();

        BufferedReader r = new BufferedReader(new InputStreamReader(c.getInputStream()));
        String jsonText = r.lines().reduce("", (a,b) -> a + b);
        JSONObject json = new JSONObject(jsonText);

        double taxa = json.getJSONObject("rates").getDouble(para);
        System.out.println(valor + " " + de + " = " + (valor * taxa) + " " + para);
    }
}


