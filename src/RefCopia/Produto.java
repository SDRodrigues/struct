package RefCopia;

public class Produto {
    String nome;
    double preco;
    static double desconto;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    double precoComDesconto() {
        return preco - preco * desconto;
    }
}
