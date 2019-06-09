package Sync;
// apenas uma thread vai acessar o metodo por vez
// nao  vai ser permitido que as duas threads
// acessem o metodo ao mesmo tempo
// a thread 1 é executada, faz a soma, termina
// e depois a thread 2 executa, faz a soma
public class Demonstracao {
    public synchronized void test(String name) {
        for(int i=0;i<8;i++) {
            Chama.chama(name + " :: "+ i);
            try{
                Thread.sleep(500);
            } catch (Exception erro) {
                System.out.println(erro);
            }
        }
    }
    public static void main(String[] args) {
        Demonstracao demonstracao = new Demonstracao();
        new TestaSync("THREAD 1", demonstracao);
        new TestaSync("THREAD 2", demonstracao);
        new TestaSync("THREAD 3", demonstracao);
    }
}
