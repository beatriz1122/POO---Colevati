/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcionario;


public class CalculadoraImpostoCuritiba implements CalculadoraImposto {
    @Override
    public double calcularImposto(double areaTotal, int numeroComodos, int numeroQuartos, double areaGaragem, int idadeImovel) {
        double imposto = areaTotal * 5;
        if (idadeImovel > 50) {
            imposto += idadeImovel * 3;
        } else if (idadeImovel < 20) {
            imposto += idadeImovel * 2;
        } else {
            imposto += idadeImovel * 2.5;
        }
        return imposto;
    }
}
