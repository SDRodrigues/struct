package Tarefas;

import Sync.NovaTarefa;

public class Teste {
    public static void main(String[] args) {
        int[] lista = {1,2,3,4,5};
        TarefaSoma primeiraTarefaSoma = new TarefaSoma("1", lista);
        TarefaSoma segundaTarefaSoma = new TarefaSoma("2", lista);
//        NovaTarefa primeiraNovaTarefa = new NovaTarefa("Thread 1 ", 400);
//        NovaTarefa segundaNovaTarefa = new NovaTarefa("Thread 2 ", 900);
    }
}
