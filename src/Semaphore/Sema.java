package Semaphore;

import java.util.concurrent.Semaphore;

 class Compartilha {
    static  int contador = 0;
}

public class Sema extends Thread {
    Semaphore semaphore;
    String nomeDaThread;

    public Sema(Semaphore semaphore, String nomeDaThread) {
        super(nomeDaThread);
        this.semaphore = semaphore;
        this.nomeDaThread = nomeDaThread;
    }

    @Override
    public void run() {
        if (this.getName().equals("A")) {
            System.out.println("Comecando a thread " + nomeDaThread);
            try {
              // primeiro, vamos buscar a permissao
                System.out.println(nomeDaThread + " Está esperando a permissao.");
                // aguardando o lock
//                System.out.println("Testa se tem permssao" + semaphore.tryAcquire());
                semaphore.acquire();
                System.out.println(nomeDaThread + " recebeu permissao");
                // agora, acessamos o recurso compartilhado.
                // outras threads irao esperar, até que essa thread
                // termine aqui
                for (int i = 0; i < 5; i ++) {
                    Compartilha.contador++;
                    System.out.println(nomeDaThread + ": " + Compartilha.contador);
                    Thread.sleep(10);
                }
            } catch (InterruptedException erro) {
                System.out.println("Erro" + erro);
            }
            System.out.println(nomeDaThread + " libera permissao");
            semaphore.release();
        } else {
            if (this.getName().equals("B"))
            System.out.println("Comecando a thread " + nomeDaThread);
            try {
                // primeiro, buscamos a permissao
                System.out.println(nomeDaThread + " está aguardando permissao");

//                System.out.println("Testa se tem permssao" + semaphore.tryAcquire());
                //  adquire a permissao
                semaphore.acquire();
                System.out.println(nomeDaThread + " recebe permissao");
                // agora, acessamos o recurso compartilhado.
                // outras threads irao esperar, até que essa thread
                // termine
                for (int i = 0; i < 5; i ++) {
                    Compartilha.contador++;
                    System.out.println(nomeDaThread + ": " + Compartilha.contador);
                    Thread.sleep(10);
                }
            } catch (InterruptedException erro) {
                System.out.println("Erro" + erro);
            }
            System.out.println(nomeDaThread + " libera permissao");
            semaphore.release();
        }

    }
}
