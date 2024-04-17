/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcionario;


public class FuncionarioTempoParcial extends Funcionario {
    private int horaEntrada;
    private int horaSaida;

    public FuncionarioTempoParcial(int id, String nome, double salario, int horaEntrada, int horaSaida) {
        super(id, nome, salario);
        this.horaEntrada = horaEntrada;
        this.horaSaida = horaSaida;
    }
}

