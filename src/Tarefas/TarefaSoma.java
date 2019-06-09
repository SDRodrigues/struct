//package Tarefas;
//
//import Sync.Calcula;
//
//// criando uma instancia estatica da classe Calcula,
//// ou seja, todas as instancias da classe TarefaSoma,
//// vao compartilhar a Calcula
//// é um recurso compartilhado
//public class TarefaSoma implements Runnable {
//    private String nome;
//    private int[] numeros;
//    private  static Calcula calcula = new Calcula();
//
//    public TarefaSoma(String nome, int[] numeros) {
//        this.nome = nome;
//        this.numeros = numeros;
//
//        Thread thread = new Thread(this, nome);
//        thread.start();
//    }
//
//    @Override
//    public void run() {
//        System.out.println(this.nome + " iniciada");
//
//        int soma = calcula.somaLista(this.numeros);
//        // quando o metodo somaLista é executado passando os numeros
//        // a cada passada do FOR, a variavel soma nao esta sendo unica para cada thread
//        // ela esta sendo compartilhada, e por isso os valores das duas threads
//        // estao sendo adicionados na variavel soma
//
//        //isso faz com que a saida do programa esteja incorreta,
//        // pois temos duas threads acessando o mesmo recurso apenas uma vez
//
//
//        System.out.println("resultado da thread" + this.nome + " é " + soma);
//        System.out.println(this.nome + " terminou");
//
//    }
//}
