

public class OperacaoController {
    public int operacaoValor(int numero) {
        if ((double) numero != (double) (int) numero) {
            throw new IllegalArgumentException("O numero tem que ser inteiro!");
        }

        if (numero < 0) {
            throw new IllegalArgumentException("O numero nao pode ser negativo!");
        }

        if (numero % 2 == 0) {
            return numero * numero; 
        } else {
            return numero * numero * numero; 
        }
    }
}

