package except;
// utilizamos o try  para tentar  realizar algo,  geralmente realizar aquilo que pode  acarretar  em um problema

// utilizamos o catch  para capturar erro, e com isso  oferecer  ao usuario  uma mensagem  adequada sem que
// o sistema quebre
public class Excecao {
    public static void main(String[] args) {
        int numeros[] = new int[5];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 3 * 2;
        }
        for (int i = 0; i <= numeros.length; i++) { // Erro ArrayIndexOutBoundException
            try {
                System.out.println(numeros[i]); // significa que está saindo dos limites do array
            } catch (ArrayIndexOutOfBoundsException erro) {
                System.out.println("Estamos tentando acessar uma posicao do array que nao existe");
            }
            finally {
                System.out.println("Continua o processo");
            }
        }
    }
}