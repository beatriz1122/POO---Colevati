/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcionario;


public class CalculadoraImpostoPortoAlegre implements CalculadoraImposto {
    @Override
    public double calcularImposto(double areaTotal, int numeroComodos, int numeroQuartos, double areaGaragem, int idadeImovel) {
        if (areaGaragem > 0) {
            return areaTotal * 7.5 + areaGaragem * 2.5;
        } else {
            return areaTotal * 8;
        }
    }
}

