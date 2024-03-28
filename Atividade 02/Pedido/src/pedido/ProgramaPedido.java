/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pedido;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Produto {
    private int codigo;
    private double valor;
    private String descricao;

    public Produto(int codigo, double valor, String descricao) {
        this.codigo = codigo;
        this.valor = valor;
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }
}

class ItemPedido {
    private int quantidade;
    private Produto produto;

    public ItemPedido(int quantidade, Produto produto) {
        this.quantidade = quantidade;
        this.produto = produto;
    }

    // Outros getters e setters
    public int getQuantidade() {
        return quantidade;
    }

    public Produto getProduto() {
        return produto;
    }
}

class Pedido {
    private int numeroNota;
    private double valorTotal;
    private List<ItemPedido> itens;

    public Pedido() {
        this.itens = new ArrayList<>();
    }

    public void adicionaItem(ItemPedido item) {
        this.itens.add(item);
    }

    public double calcularValorTotal() {
        double total = 0;
        for (ItemPedido item : itens) {
            total += item.getQuantidade() * item.getProduto().getValor();
        }
        return total;
    }
}

public class ProgramaPedido {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Produto produto1 = new Produto(1, 10.0, "Nescau");
        Produto produto2 = new Produto(2, 20.0, "Ovinho");

        Pedido pedido = new Pedido();

        System.out.println("Adicionar itens:");
        System.out.println("Quantidade de Nescau:");
        int quantidadeProduto1 = scanner.nextInt();
        pedido.adicionaItem(new ItemPedido(quantidadeProduto1, produto1));

        System.out.println("Quantidade de Ovinho:");
        int quantidadeProduto2 = scanner.nextInt();
        pedido.adicionaItem(new ItemPedido(quantidadeProduto2, produto2));

        double valorTotalPedido = pedido.calcularValorTotal();
        System.out.println("Valor total: R$" + valorTotalPedido);

        scanner.close();
    }
}
