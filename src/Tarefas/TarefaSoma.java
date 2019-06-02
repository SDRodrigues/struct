package Tarefas;

public class TarefaSoma implements Runnable {
    private String nome;
    private int[] numeros;
    private  static Calcula calcula = new Calcula();

    public TarefaSoma(String nome, int[] numeros) {
        this.nome = nome;
        this.numeros = numeros;
        new Thread(this, nome).start();
    }

    @Override
    public void run() {

    }
}
