
package contabancaria;


public class Contas {
    public static void main(String[] args) {
        ContaPoupanca poupanca = new ContaPoupanca("João", 12345, 1000.0f, 1);
        ContaEspecial especial = new ContaEspecial("Maria", 54321, 2000.0f, 500.0f);

        poupanca.sacar(500.0f);
        especial.sacar(1500.0f);
        especial.sacar(3000.0f);
        poupanca.depositar(200.0f);
        especial.depositar(300.0f);
        poupanca.calcularNovoSaldo(0.05f);

        System.out.println("\nDados da Conta Poupança:");
        System.out.println("Cliente: " + poupanca.cliente);
        System.out.println("Número da Conta: " + poupanca.num_conta);
        System.out.println("Saldo: R$" + poupanca.saldo);

        System.out.println("\nDados da Conta Especial:");
        System.out.println("Cliente: " + especial.cliente);
        System.out.println("Número da Conta: " + especial.num_conta);
        System.out.println("Saldo: R$" + especial.saldo);
        System.out.println("Limite: R$" + especial.limite);
    }
}