
package contabancaria;

import javax.swing.JOptionPane;


public class ContaBancaria {

    /**
     * @param args the command line arguments
     */
     
      public static void main(String[] args) {

		int numero;
		String nome;
		double saldo = 0;
                int opcao;

		numero = Integer.parseInt(JOptionPane.showInputDialog("Informe numero da conta: ")); 
                nome = JOptionPane.showInputDialog("Informe nome da conta: ");
                System.out.println("Saldo: 00,00"); 
                opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para saque e 2 para deposito: ")); 
                
            switch(opcao) {
                case 1:
                    double saque = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do saque: "));
                    if (saque <= saldo) {
                        
                        saldo = saldo - saque;
                        
                        break;
                    } else {
                        System.out.println("Valor digitado inválido. Repita a operação.");
                        break;
                    }
                case 2:
                    double deposito = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do deposito: "));
                   
                    if (deposito > 0) {
                        saldo = deposito + saldo;
                        break;
                    } else {
                        System.out.println("Valor digitado inválido. Repita a operação.");
                        break;
                    }
                default:
                    System.out.println("Opção inválida. Deve ser digitado um número entre 1 e 2. Tente novamente: ");
                    break;
            }
         System.out.println("Saldo:" + saldo);   
        }
    }

