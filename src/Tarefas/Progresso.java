package Tarefas;
// para executar metodoso em paralelo, nossa classe deve implementar a interface Runnable
// o metodo que precisar ser executado em paralelo, deve ser eecutado dentro do metodo run()
public class Progresso implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i + " Progresso");
        }
    }
}
