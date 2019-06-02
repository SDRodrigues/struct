package except;

import java.util.Scanner;

public class OutraExcecao {
    public static void main(String[] args) {
        Scanner teclas = new Scanner(System.in);
        System.out.println("Informe o primeiro valor");
        int num1 = teclas.nextInt();
        System.out.println("Informe o segundo valor");
        int num2 = teclas.nextInt();
        try {
            System.out.println("a divisao de " + num1 + " por " + num2 + " é " + num1 / num2);
        } catch (ArithmeticException erro) {
            System.out.println("nao é possivel dividir " + num1 + " por " + num2);
        }

    }
}
