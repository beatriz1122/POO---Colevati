/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package model;

public class Imposto {
    public static double calcularImposto(String cidade, double areaTotal, int numeroComodos, int numeroQuartos, double areaGaragem, int idadeImovel) {
        switch (cidade) {
            case "SaoPaulo":
                return areaTotal * 10 + numeroComodos * 2;
            case "BeloHorizonte":
                return areaTotal * 7 + numeroQuartos * 4;
            case "PortoAlegre":
                if (areaGaragem > 0) {
                    return areaTotal * 7.5 + areaGaragem * 2.5;
                } else {
                    return areaTotal * 8;
                }
            case "Curitiba":
                double imposto = areaTotal * 5;
                if (idadeImovel > 50) {
                    imposto += idadeImovel * 3;
                } else if (idadeImovel < 20) {
                    imposto += idadeImovel * 2;
                } else {
                    imposto += idadeImovel * 2.5;
                }
                return imposto;
            default:
                return 0;
        }
    }
}
