package Sync;

public class TestaSync extends Thread {
    private String name;
    private Demonstracao demonstracao;
    public TestaSync(String name, Demonstracao demonstracao) {
        this.demonstracao = demonstracao;
        this.name = name;
        start();
    }
    @Override
    public void run() {
        demonstracao.test(name);
    }
}
