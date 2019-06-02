package Pilha;

import java.util.*;

public class Pilha {
    public static void main(String[] args) {
        Stack<String> pilha = new Stack<>();
        Deque<String> deque = new ArrayDeque<>();
        pilha.push("Livro 1");
        pilha.push("Livro 2");
        pilha.push("livro 3"); // o ultimo adicionado, é o primeiro que vai sair
        System.out.println(pilha);

        System.out.println("Verifica o livro do topo da pilha");
        System.out.println(pilha.peek());

        System.out.println("Remove o livro do topo da pilha");
        System.out.println(pilha.pop()); // remove o ultimo livro a ser inserido





    }
}
