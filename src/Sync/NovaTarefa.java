//package Sync;
//
//public class NovaTarefa extends Thread {
//    private String nome;
//    private int tempo;
//    public NovaTarefa(String nome, int tempo) {
//        this.nome = nome;
//        this.tempo = tempo;
//
//        start();
//    }
//
//    public void run() {
//        try {
//            for (int i = 0; i < 6; i++) {
//                System.out.println(nome + "contador " + i);
//                Thread.sleep(tempo);
//            }
//        } catch (InterruptedException erro) {
//            // quando for executado esse erro, significa que a thread foi interrompida
//            System.out.println(erro);
//        }
//    }
//}
