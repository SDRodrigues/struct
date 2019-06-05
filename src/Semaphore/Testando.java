package Semaphore;

import java.util.concurrent.Semaphore;

public class Testando {
    public static void main(String args[]) throws InterruptedException {
        Semaphore semaphore = new Semaphore(1);
        Sema sema1 = new Sema(semaphore, "A");
        Sema sema2 = new Sema(semaphore, "B");

        sema1.start();
        sema2.start();

        sema1.join();
        sema2.join();

        System.out.println("contador:" + Compartilha.contador);
        System.out.println("permissoes permitidas:" + semaphore.availablePermits());
    }
}
