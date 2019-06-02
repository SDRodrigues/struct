package Maps;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        Map<Integer, String> nomes = new HashMap<>();
        nomes.put(762, "Ringo"); // adiciona valores ou substituui valores existentes
        nomes.put(444, "Polnaref");
        nomes.put(123, "Wekapipo");
        nomes.put(899, "Steely Dan");

        System.out.println(nomes.keySet()); // percorre as chaves do map
        System.out.println(nomes.values()); // percorre os valores do map
        System.out.println(nomes.entrySet()); // conjuto de registros

        nomes.put(123, "PocoLoco");  // substitui o elemento existente
        System.out.println(nomes.get(123));

        System.out.println(nomes.containsKey(987756)); // procura o numero na estrutura de chaves
        System.out.println(nomes.containsValue("Wekapipo")); // procura o valor na estrutura de valores

        System.out.println("Valores");
        for(String nome: nomes.values()) {
            System.out.println(nome);
        }
        System.out.println("Chaves");
        for (Integer nome: nomes.keySet()) {
            System.out.println(nome);
        }

    }
}
