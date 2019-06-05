package RefCopia;

public class ValorvsReferencia {

    static void porValor(double numero) {
        numero++;
    }

    static void porRerencia(Produto produto) {
        produto.preco++;
    }

    public static void main(String[] args) {
        double numero = 1; //tipo primitivo
         Produto produto = new Produto("Caneta", 1); //objeto
        Produto segundoProduto = produto;
        segundoProduto.nome = "Lapis";
        produto = new Produto("Mochila", 3);

        porValor(numero);
        porRerencia(produto);
        System.out.println(numero);
        System.out.println(produto.preco);
        System.out.println(produto.nome);
    }
}
