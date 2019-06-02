package Tarefas;

public class Calcula {
    private int soma;

    public int somaLista(int[] lista) {
        soma = 0;
        for (int i = 0; i < lista.length; i++) {
            soma += lista[i];
        }
        return soma;
    }
}
