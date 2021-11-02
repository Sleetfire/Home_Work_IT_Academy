package home_work_plus.ratesMonitoring;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import java.util.regex.Pattern;

public class RatesMonitoringMain {
    public static void main(String[] args) {
        String query = "https://myfin.by/currency/torgi-na-bvfb";

        HttpURLConnection connection = null;

        Pattern pattern = Pattern.compile("/(<([^>]+)>)/ig");

        StringBuffer stringBuffer = new StringBuffer();

        try {

            connection = (HttpURLConnection) new URL(query).openConnection();
            connection.setRequestMethod("GET");
            connection.setUseCaches(false);
            connection.setConnectTimeout(250);
            connection.setReadTimeout(250);
            connection.connect();

            if (HttpURLConnection.HTTP_OK == connection.getResponseCode()) {
                try (BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
                    String line;
                    while ((line = in.readLine()) != null) {
                        stringBuffer.append(line);
                        stringBuffer.append("\n");
                    }
                    System.out.println(stringBuffer);
                } catch (IOException ignored) {
                    ignored.printStackTrace();
                }
            } else {
                System.err.println("fail: " + connection.getResponseCode() + ", " + connection.getResponseMessage());
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                connection.disconnect();
            }
        }

        String[] strArray = stringBuffer.toString().split(" /(<([^>]+)>)/ig");
        System.out.println(Arrays.toString(strArray));

    }
}
