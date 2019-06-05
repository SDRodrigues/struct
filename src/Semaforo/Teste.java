package Semaforo;

import java.util.concurrent.Semaphore;

public class Teste {
    public static void main(String[] args) {
       Semaphore semaphore = new Semaphore(1);
//       semaphore.acquire(); // erro InterruptedExecution
        try {
            semaphore.acquire();
        } catch (InterruptedException erro) {
            System.out.println("Erro" + erro);
        }
        semaphore.release();
        System.out.println("Tentativas permitidas " + semaphore.availablePermits());
    }
}
