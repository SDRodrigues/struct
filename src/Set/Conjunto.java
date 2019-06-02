package Set;

import java.util.HashSet;
import java.util.Set;

public class Conjunto {
    public static void main(String[] args) {
     Set conjunto = new HashSet(); // conjunto heterogeneo
     conjunto.add('a');
     conjunto.add("texto");
     conjunto.add(1);
     conjunto.add(3.14);
     conjunto.add(false);
     conjunto.add(15);

        System.out.println("Add");
        System.out.println(conjunto.add(1)); // nao adicionou esse elemento
        System.out.println(conjunto.add(10)); // adicionou esse eemento
        System.out.println(conjunto.size());
        System.out.println(conjunto);


        System.out.println("Remove");
        System.out.println(conjunto.remove("a")); // nao remove a string, pois ela nao existe no set
        System.out.println(conjunto.remove('a')); // removeu  o char a

        System.out.println("Contem"); // verifica se o elemento está ou nao contido dentro de um conjunto
        System.out.println(conjunto.contains('a')); // nao contem o elemento pois foi removido
        System.out.println(conjunto.contains(1)); // contem o elemento e retorna true
        System.out.println(conjunto);

        Set nums = new HashSet(); // conjunto heterogeneo
        nums.add(15);
        nums.add(44);
        nums.add(33);

        conjunto.retainAll(nums); // intersecao de 2 conjuntos
        System.out.println(" une os dois conjuntos" + conjunto.addAll(nums));
        System.out.println(conjunto.size()); // mostra a quantidade de elementos que existem nos dois conjuntos


        conjunto.clear(); // limpa os conjuntos
        System.out.println(conjunto.isEmpty()); //verifica se o conjunto esta ou nao vazio
    }
}
