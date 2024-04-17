/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcionario;


public class ControleFuncionarios {
    public Funcionario contrata(int id, String nome, double salario, int bancoHoras) {
        return new FuncionarioTempoIntegral(id, nome, salario, bancoHoras);
    }

public Funcionario contrata(int id, String nome, double salario, int horaEntrada, int horaSaida) {
        return new FuncionarioTempoParcial(id, nome, salario, horaEntrada, horaSaida);
    }

public Funcionario contrata(int id, String nome, double salario, int diaFimContrato, int mesFimContrato, int anoFimContrato) {
        return new FuncionarioTemporario(id, nome, salario, diaFimContrato, mesFimContrato, anoFimContrato);
    }
}
