
package empresa;

class Ingresso {
    private String identificador;
    private float valor;

    public Ingresso(String identificador, float valor) {
        this.identificador = identificador;
        this.valor = valor;
    }

    public float valorFinal(float taxaConveniencia) {
        return this.valor + taxaConveniencia;
    }
}

