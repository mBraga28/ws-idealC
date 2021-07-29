package Aplicação;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Exercício12 {
    public static void main(String[] args) {

        Map<String, String> cookies = new TreeMap<>();

        cookies.put("usuário","Maboa");
        cookies.put("email","maboa@gmail.com");
        cookies.put("telefone","98855656");

        cookies.remove("email");
        cookies.put("telefone", "998445667");

        System.out.println("Contém a chave 'telefone': " + cookies.containsKey("telefone"));
        System.out.println("Número de telefone: " + cookies.get("telefone"));
        System.out.println("Email: " + cookies.get("email"));
        System.out.println("Tamanho: " + cookies.size());

        System.out.println("TODOS SO COOKIES: ");
        for(String chave: cookies.keySet()) {
            System.out.println(chave + ": " + cookies.get(chave));
        }


    }
}
