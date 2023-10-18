package br.com.lucas.viacepapi.menu;

import br.com.lucas.viacepapi.modelos.CEP;
import br.com.lucas.viacepapi.modelos.Cepconsumido;
import br.com.lucas.viacepapi.requests.ViaCep;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        String endereco = "";
        String cep = "";
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        while (true){
            System.out.println("Digite o cep que deseja consultar. Caso deseje sair digite sair.");
            cep = leitura.nextLine();

            if (cep.equalsIgnoreCase("sair")){
                break;
            }
            System.out.println(endereco);

            ViaCep viaCep = new ViaCep(cep);
            String json = viaCep.getResponsejson();
            Cepconsumido cepconsumido = gson.fromJson(json, Cepconsumido.class);
            CEP cep1 = new CEP(cepconsumido);
            System.out.println(cep1);

        }
    }
}