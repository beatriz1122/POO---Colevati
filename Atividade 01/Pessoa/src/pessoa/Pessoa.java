/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pessoa;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Pessoa {
    
    private String nome;
    private LocalDate dataNascimento;
    private String profissao;
    private static final int maximo = 150;

public Pessoa(String nome, LocalDate dataNascimento, String profissao) {
        
    this.nome = nome;
    this.dataNascimento = dataNascimento;
    this.profissao = profissao;

}

public int calcularIdade() {

    LocalDate hoje = LocalDate.now();
    Period periodo = Period.between(this.dataNascimento, hoje);
    return periodo.getYears();
    
}

public boolean idadeValida() {
        
    return calcularIdade() <= maximo;
    
}

public void getInfo() {
        
    System.out.println("Nome: " + this.nome);
    System.out.println("Data de Nascimento: " + this.dataNascimento);
    System.out.println("Profissão: " + this.profissao);
    System.out.println("Idade: " + calcularIdade());
    
}

public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome da pessoa:");
        String nome = scanner.nextLine();

        System.out.println("Digite o ano de nascimento da pessoa:");
        int ano = scanner.nextInt();

        System.out.println("Digite o mes de nascimento da pessoa:");
        int mes = scanner.nextInt();

        System.out.println("Digite o dia de nascimento da pessoa:");
        int dia = scanner.nextInt();

        LocalDate dataNascimento = LocalDate.of(ano, mes, dia);

        System.out.println("Digite a profissao da pessoa:");
        String profissao = scanner.next();

        Pessoa pessoa = new Pessoa(nome, dataNascimento, profissao);

    if (pessoa.idadeValida()) {
            System.out.println("Informações da Pessoa:");
            pessoa.getInfo();
        } else {
            System.out.println("Idade invalida! A pessoa não pode ter mais de 150 anos.");
        }

        scanner.close();
    }
}
