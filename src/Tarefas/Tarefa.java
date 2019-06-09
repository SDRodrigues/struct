package Tarefas;
// executa as duas threads em paralelo
public class Tarefa {
    public static void main(String[] args) {
        Progresso progresso = new Progresso();
        Thread thread1 = new Thread(progresso);
        thread1.start(); //executa parte da primeira thread e depois executa a segunda thread

        Relatorio relatorio = new Relatorio();
        Thread thread2 = new Thread(relatorio);
        thread2.start(); //executa parte da segunda thread e depois executa parte da primeira thread
    }
}
