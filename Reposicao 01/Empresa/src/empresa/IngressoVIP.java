/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empresa;


class IngressoVIP extends Ingresso {
    private String funcao;

    public IngressoVIP(String identificador, float valor, String funcao) {
        super(identificador, valor);
        this.funcao = funcao;
    }

    @Override
    public float valorFinal(float taxaConveniencia) {
        float valorIngresso = super.valorFinal(taxaConveniencia);
        return valorIngresso * 1.18f;
    }
}