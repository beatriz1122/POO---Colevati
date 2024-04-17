

import java.util.InputMismatchException;
import java.util.Scanner;

public class TesteOperacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OperacaoController operacaoController = new OperacaoController();

        System.out.println("Informe um numero inteiro, e nao pode ser negativo:");
        int numero;
        try {
            numero = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Erro: o numero nao pode ser quebrado!");
            return;
        }

        try {
            int resultado = operacaoController.operacaoValor(numero);
            System.out.println("Resultado: " + resultado);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        scanner.close();
    }
}
