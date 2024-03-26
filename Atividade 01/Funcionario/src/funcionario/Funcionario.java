/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcionario;

import java.util.Scanner;

public class Funcionario {
    
    private String nome;
    private double salario;
    private String cargo;
    private final double salarioMinimo = 1412.00;
    private final double taxaImposto = 0.10; 
    private final double beneficio = 200.00; 

public Funcionario(String nome, double salario, String cargo) {

    this.nome = nome;
        if (salario < salarioMinimo) {
            this.salario = salarioMinimo;
    } else {
            this.salario = salario;
        }
        this.cargo = cargo;
    }

    public double calcularSalarioLiquido() {
    
        double salarioLiquido = salario - (salario * taxaImposto) + beneficio;
        return salarioLiquido;
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do funcionário:");
        String nome = scanner.nextLine();

        System.out.println("Digite o salário do funcionário:");
        double salario = scanner.nextDouble();

        System.out.println("Digite o cargo do funcionário:");
        scanner.nextLine();
        String cargo = scanner.nextLine();

        Funcionario funcionario = new Funcionario(nome, salario, cargo);

        System.out.println("Salário líquido do funcionário: R$" + funcionario.calcularSalarioLiquido());

        scanner.close();
    }
}

