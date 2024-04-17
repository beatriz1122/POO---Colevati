package conta;


import java.util.Scanner;

public class TesteConta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Conta conta = new Conta();


        System.out.println("Digite o número da agência:");
        conta.setAgencia(scanner.nextInt());

        System.out.println("Digite o código da conta:");
        conta.setCodigo(scanner.nextInt());

        System.out.println("Digite o saldo inicial da conta:");
        conta.setSaldo(scanner.nextFloat());

        System.out.println("Digite o limite da conta:");
        conta.setLimite(scanner.nextFloat());


        try {
            System.out.println("Digite o valor a ser depositado:");
            float valorDeposito = scanner.nextFloat();
            conta.deposita(valorDeposito);

            System.out.println("Digite o valor a ser sacado:");
            float valorSaque = scanner.nextFloat();
            conta.saca(valorSaque);
        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro ao sacar: " + e.getMessage());
        }

        scanner.close();
    }
}
