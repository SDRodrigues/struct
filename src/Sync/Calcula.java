//package Sync;
//// apenas uma thread vai acessar o metodo por vez
//// nao  vai ser permitido que as duas threads
//// acessem o metodo ao mesmo tempo
//// a thread 1 é executada, faz a soma, termina
//// e depois a thread 2 executa, faz a soma
//public class Calcula {
//    private int soma;
//    public synchronized int somaLista(int[] lista) {
//        soma = 0;
//        // a variavel soma está sendo compartilhada, pois tem
//        // instancia estatica da calcula
//        for (int i = 0; i < lista.length; i++) {
//
//            soma += lista[i];
//            // currentThread é a thread atual que está acessando
//            System.out.println("executando " + Thread.currentThread().getName() +
//                    "somando" + lista[i] + "total de " + soma);
//            try {
//                Thread.sleep(100);
//            } catch (InterruptedException erro) {
//                System.out.println("o erro ocorrido foi resolvido" + erro);
//            }
//        }
//        return soma;
//    }
//}
