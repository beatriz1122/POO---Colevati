/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcionario;


public class FuncionarioTemporario extends Funcionario {
    private int diaFimContrato;
    private int mesFimContrato;
    private int anoFimContrato;

    public FuncionarioTemporario(int id, String nome, double salario, int diaFimContrato, int mesFimContrato, int anoFimContrato) {
        super(id, nome, salario);
        this.diaFimContrato = diaFimContrato;
        this.mesFimContrato = mesFimContrato;
        this.anoFimContrato = anoFimContrato;
    }
}

