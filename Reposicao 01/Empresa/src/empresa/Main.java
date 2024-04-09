/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package empresa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o identificador do ingresso:");
        String identificador = scanner.nextLine();

        System.out.println("Informe o valor do ingresso:");
        float valor = Float.parseFloat(scanner.nextLine());

        Ingresso ingressoComum = new Ingresso(identificador, valor);

        System.out.println("O ingresso VIP? (s/n):");
        String resposta = scanner.nextLine();

        if (resposta.equalsIgnoreCase("s")) {
            System.out.println("Informe a funcao do comprador do ingresso VIP:");
            String funcao = scanner.nextLine();
            IngressoVIP ingressoVIP = new IngressoVIP(identificador, valor, funcao);

            System.out.println("Informe a taxa de conveniencia:");
            float taxaConveniencia = Float.parseFloat(scanner.nextLine());

            float valorFinalVIP = ingressoVIP.valorFinal(taxaConveniencia);
            System.out.println("Valor final do ingresso VIP: " + valorFinalVIP);
        } else {
            System.out.println("Informe a taxa de conveniencia:");
            float taxaConveniencia = Float.parseFloat(scanner.nextLine());

            float valorFinal = ingressoComum.valorFinal(taxaConveniencia);
            System.out.println("Valor final do ingresso: " + valorFinal);
        }

        scanner.close();
    }
}