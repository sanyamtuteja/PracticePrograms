package Test01;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;

public class testApi {

    public static void main(String[] args) throws IOException, ScriptException {
        String disc = "";
        String price = "";
        URL url = new URL("https://jsonmock.hackerrank.com/api/inventory?barcode=74002314");
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");
        int responseCode = con.getResponseCode();
        System.out.println(responseCode);
        StringBuffer response = new StringBuffer();
        String json = "";

        if (responseCode == HttpURLConnection.HTTP_OK) { // success
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    con.getInputStream()));
            String inputLine;

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();
            json = response.toString();
            System.out.println(json);
        } else {
            System.out.println("GET request not worked");
        }

        ScriptEngineManager sem = new ScriptEngineManager();
        ScriptEngine engine = sem.getEngineByName("javascript");
        String script = "Java.asJSONCompatible(" + json + ")";
        Object result = engine.eval(script);
        Map jsonData = (Map) result;

        List data = (List) jsonData.get("data");
        for (int i = 0; i < data.size(); i++) {
            Map<String, Object> matchDetail = (Map) data.get(i);
            for (Map.Entry<String, Object> entry : matchDetail.entrySet()) {
                if (entry.getKey().equals("discount")) {
                    disc = String.valueOf(entry.getValue());
                    System.out.printf("disc   " + disc);
                }
                if (entry.getKey().equals("price")) {
                    price = String.valueOf(entry.getValue());
                    System.out.println("price   " + price);
                }
            }
        }
    }

}
