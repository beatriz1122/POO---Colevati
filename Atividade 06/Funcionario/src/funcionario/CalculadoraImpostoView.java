/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcionario;


public class CalculadoraImpostoView {
    
    public static void main(String[] args) {
        CalculadoraImpostoContext calculadoraSaoPaulo = new CalculadoraImpostoContext(new CalculadoraImpostoSaoPaulo());
        CalculadoraImpostoContext calculadoraBeloHorizonte = new CalculadoraImpostoContext(new CalculadoraImpostoBeloHorizonte());
        CalculadoraImpostoContext calculadoraPortoAlegre = new CalculadoraImpostoContext(new CalculadoraImpostoPortoAlegre());
        CalculadoraImpostoContext calculadoraCuritiba = new CalculadoraImpostoContext(new CalculadoraImpostoCuritiba());

        double impostoSaoPaulo = calculadoraSaoPaulo.calcularImposto(100, 5, 3, 0, 30);
        double impostoBeloHorizonte = calculadoraBeloHorizonte.calcularImposto(100, 5, 3, 0, 30);
        double impostoPortoAlegre = calculadoraPortoAlegre.calcularImposto(100, 5, 3, 20, 30);
        double impostoCuritiba = calculadoraCuritiba.calcularImposto(100, 5, 3, 0, 30);

        System.out.println("Imposto em São Paulo: R$" + impostoSaoPaulo);
        System.out.println("Imposto em Belo Horizonte: R$" + impostoBeloHorizonte);
        System.out.println("Imposto em Porto Alegre: R$" + impostoPortoAlegre);
        System.out.println("Imposto em Curitiba: R$" + impostoCuritiba);
    }
}
