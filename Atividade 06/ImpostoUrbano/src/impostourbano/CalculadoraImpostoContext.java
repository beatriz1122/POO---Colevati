/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package impostourbano;

// Classe para aplicar o padrão Strategy
public class CalculadoraImpostoContext {
    private CalculadoraImposto calculadoraImposto;

    public CalculadoraImpostoContext(CalculadoraImposto calculadoraImposto) {
        this.calculadoraImposto = calculadoraImposto;
    }

    public double calcularImposto(double areaTotal, int numeroComodos, int numeroQuartos, double areaGaragem, int idadeImovel) {
        return calculadoraImposto.calcularImposto(areaTotal, numeroComodos, numeroQuartos, areaGaragem, idadeImovel);
    }
}
