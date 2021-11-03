package home_work_plus.ratesMonitoring.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class DownloadPageUtil {

    public static String downLoadPage(String queryAddress) {

        HttpURLConnection connection = null;
        StringBuffer stringBuffer = new StringBuffer();

        try {
            connection = (HttpURLConnection) new URL(queryAddress).openConnection();
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
                    }
                    System.out.println(stringBuffer);
                } catch (IOException ignored) {
                    throw new IOException();
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
        return stringBuffer.toString();
    }

}
