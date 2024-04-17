/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcionario;


public class FuncionarioTempoIntegral extends Funcionario {
    private int bancoHoras;

    public FuncionarioTempoIntegral(int id, String nome, double salario, int bancoHoras) {
        super(id, nome, salario);
        this.bancoHoras = bancoHoras;
    }
}

