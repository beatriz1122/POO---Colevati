/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package agendatelefonica;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Contato {
    private String nome;
    private String telefone;
    private String email;

    public Contato(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }
}

public class AgendaTelefonica {
    private List<Contato> contatos;

    public AgendaTelefonica() {
        this.contatos = new ArrayList<>();
    }

    public void adicionarContato(Contato contato) {
        contatos.add(contato);
    }

    public void removerContato(String nome) {
        for (int i = 0; i < contatos.size(); i++) {
            if (contatos.get(i).getNome().equalsIgnoreCase(nome)) {
                contatos.remove(i);
                System.out.println("Excluido.");
                return;
            }
        }
        System.out.println("Não encontrado.");
    }

    public void buscarContato(String nome) {
        for (Contato contato : contatos) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                System.out.println("Nome: " + contato.getNome());
                System.out.println("Tel.: " + contato.getTelefone());
                System.out.println("Email: " + contato.getEmail());
                return;
            }
        }
        System.out.println("Contato não encontrado.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AgendaTelefonica agenda = new AgendaTelefonica();

        while (true) {
            System.out.println("\nSelecionar :");
            System.out.println("1. Adicionar contato");
            System.out.println("2. Remover contato");
            System.out.println("3. Pesquisaar contato");
            System.out.println("4. Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do contato:");
                    String nome = scanner.nextLine();
                    System.out.println("Digite o telefone do contato:");
                    String telefone = scanner.nextLine();
                    System.out.println("Digite o email do contato:");
                    String email = scanner.nextLine();
                    Contato novoContato = new Contato(nome, telefone, email);
                    agenda.adicionarContato(novoContato);
                    System.out.println("Contato adicionado com sucesso.");
                    break;
                case 2:
                    System.out.println("Digite o nome do contato para remover:");
                    String nomeRemover = scanner.nextLine();
                    agenda.removerContato(nomeRemover);
                    break;
                case 3:
                    System.out.println("Digite o nome do contato:");
                    String nomeBuscar = scanner.nextLine();
                    agenda.buscarContato(nomeBuscar);
                    break;
                case 4:
                    System.out.println("Power Off");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Erra, tente escolher um dos numeros listados");
            }
        }
    }
}
