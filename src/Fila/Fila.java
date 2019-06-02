package Fila;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();
        fila.offer("Erina");
        fila.offer("Jojo");
        fila.add("Wham");

        System.out.println("Peek/Element");
        System.out.println(fila.peek()); // verifica qual o primeiro elemento que foi inserido // nulo
        System.out.println(fila.element()); // verifica o primeiro elemento que foi inserido

        System.out.println("Poll/Remove");
        System.out.println(fila.poll());
        System.out.println(fila.remove());
        System.out.println(fila.poll());
        System.out.println(fila.poll()); // a fila esta vazia, retorna nulo
//        System.out.println(fila.remove()); // afila esta vazia retorna um erro

        }
    }
