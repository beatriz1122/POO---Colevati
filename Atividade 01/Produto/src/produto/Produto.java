
package produto;

public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    public Produto(String nome, double preco, int quantidadeEmEstoque) {
        this.nome = nome;
        if (preco < 0) {
            this.preco = 0;
        } else {
            this.preco = preco;
        }
        if (quantidadeEmEstoque < 0) {
            this.quantidadeEmEstoque = 0; 
        } else {
            this.quantidadeEmEstoque = quantidadeEmEstoque;
        }
    }

    public double calcularValorTotalEmEstoque() {
        return this.preco * this.quantidadeEmEstoque;
    }

    public boolean verificarDisponibilidade() {
        return this.quantidadeEmEstoque > 0;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco < 0) {
            this.preco = 0; // Evita preço negativo
        } else {
            this.preco = preco;
        }
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        if (quantidadeEmEstoque < 0) {
            this.quantidadeEmEstoque = 0; // Evita quantidade negativa em estoque
        } else {
            this.quantidadeEmEstoque = quantidadeEmEstoque;
        }
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidadeEmEstoque=" + quantidadeEmEstoque +
                '}';
    }
}


