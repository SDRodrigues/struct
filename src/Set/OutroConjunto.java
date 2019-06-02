package Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class OutroConjunto {
    public static void main(String[] args) {
        Set<String> aprovados = new HashSet<>(); // conjunto homogeneo, esse Set apenas aceitara valores do tipo string
        aprovados.add("Kuma");
        aprovados.add("Doflamingo");
        aprovados.add("Jotaro");
        aprovados.add("Giorno");
        aprovados.add("Mista");
//        aprovados.add(2); // nao aceita valores int
        for(String nome: aprovados) {
            System.out.println(nome); // imprime os nomes fora de ordem
        }




    }
    }
