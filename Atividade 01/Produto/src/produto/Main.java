
package produto;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Produto A", 10.5, 20);
        Produto produto2 = new Produto("Produto B", 5.75, 0);

        System.out.println("Produto 1: " + produto1);
        System.out.println("Valor total em estoque do Produto 1: " + produto1.calcularValorTotalEmEstoque());
        System.out.println("Produto 1 disponível? " + (produto1.verificarDisponibilidade() ? "Sim" : "Não"));

        System.out.println();

        System.out.println("Produto 2: " + produto2);
        System.out.println("Valor total em estoque do Produto 2: " + produto2.calcularValorTotalEmEstoque());
        System.out.println("Produto 2 disponível? " + (produto2.verificarDisponibilidade() ? "Sim" : "Não"));
    }
}

