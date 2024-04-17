/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcionario;


public class CalculadoraImpostoBeloHorizonte implements CalculadoraImposto {
    @Override
    public double calcularImposto(double areaTotal, int numeroComodos, int numeroQuartos, double areaGaragem, int idadeImovel) {
        return areaTotal * 7 + numeroQuartos * 4;
    }
}

