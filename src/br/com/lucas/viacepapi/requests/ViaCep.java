package br.com.lucas.viacepapi.requests;

import br.com.lucas.viacepapi.modelos.CEP;
import br.com.lucas.viacepapi.modelos.Cepconsumido;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ViaCep {

    private String url;
    private String responsejson;


    public ViaCep(String cep){
        this.url = "http://viacep.com.br/ws/"+cep+"/json/";
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create(this.url)).build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            this.responsejson = response.body();
        }
        catch (IOException | InterruptedException e){
            System.out.println("Erro : " + e);
            this.responsejson = "{'erro' : 'falha na leitura'}";
        }
    }

    public String getResponsejson() {
        return responsejson;
    }
}
