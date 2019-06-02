package Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConjuntoHash {
    public static void main(String[] args) { // respeita a ordem de insercao
        Set<String> name = new TreeSet<>(); // conjunto homogeneo, esse Set apenas aceitara valores do tipo string
        name.add("Zeppeli");
        name.add("Dire");
        name.add("Straits");
        name.add("Risotto");
        name.add("Dopio");
        for(String duw: name) {
            System.out.println(duw); // imprime os nomes fora de ordem
        }
    }
}
