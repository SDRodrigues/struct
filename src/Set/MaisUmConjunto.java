package Set;

import java.util.LinkedHashSet;
import java.util.Set;

public class MaisUmConjunto {
    public static void main (String[] args) {
        Set<String> nomes = new LinkedHashSet<>(); // conjunto homogeneo, esse Set apenas aceitara valores do tipo string
        nomes.add("Ka");
        nomes.add("Doffy");
        nomes.add("Dio");
        nomes.add("Giorno");
        nomes.add("Abbachio");
        for(String name: nomes) {
            System.out.println(name); // imprime os nomes fora de ordem
        }
    }
}
