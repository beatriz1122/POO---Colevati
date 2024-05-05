/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package impostourbano;

public class CalculadoraImpostoSaoPaulo implements CalculadoraImposto {
    @Override
    public double calcularImposto(double areaTotal, int numeroComodos, int numeroQuartos, double areaGaragem, int idadeImovel) {
        return areaTotal * 10 + numeroComodos * 2;
    }
}
