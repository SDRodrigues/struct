package except;

public class Excecao {
    public static void main(String[] args) {
        int numeros[] = new int[5];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = 1 + 3 * 2;
        }
        for (int i = 0; i <= numeros.length; i++) { // Erro ArrayIndexOutBoundException
            try {
                System.out.println(numeros[i]); // significa que está saindo dos limites do array
            } catch (ArrayIndexOutOfBoundsException erro) {
                System.out.println("Estamos tentando acessar uma posicao do array que nao existe");
            }
        }
    }
}