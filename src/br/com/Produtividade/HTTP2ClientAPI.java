package br.com.Produtividade;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HTTP2ClientAPI {
    public static void main(String[] args) throws IOException, URISyntaxException, InterruptedException {
//        -----------ANTES
//        URL url = new URL("https://www.casadocodigo.com.br");
//        URLConnection uc = url.openConnection();
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(uc.getInputStream()));
//
//        String line = "";
//
//        while (br.readLine() != null) {
//            line = line.concat(br.readLine()).concat(System.lineSeparator());
//        }

        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest httpRequest = HttpRequest.newBuilder(new URI("https://www.casadocodigo.com.br"))
                .GET().build();

        HttpResponse<String> resp = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
        System.out.println(resp.statusCode());
        System.out.println(resp.body());
        System.out.println(resp.version());

    }

}
