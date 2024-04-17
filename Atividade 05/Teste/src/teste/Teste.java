
package teste;

public class Teste {
    public static void main(String[] args) {
        System.out.println("Inicio do main");
        try {
            metodo1();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: Índice fora dos limites do vetor");
        }
        System.out.println("Fim do main");
    }

    public static void metodo1() {
        System.out.println("Inicio do metodo 1");
        try {
            metodo2();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: Valor fora do vetor");
            throw e;
        }
        System.out.println("Fim do metodo 1");
    }

    public static void metodo2() {
        System.out.println("Inicio do metodo 2");
        int[] vetor = new int[10];
        try {
            for (int i = 0; i <= 15; i++) {
                vetor[i] = i;
                System.out.println(i);
                if (i == 9) {
                    int vlr = vetor[i] / vetor[0];
                    System.out.println(vlr);
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: Valor fora do vetor");
            throw e;
        } catch (ArithmeticException e) {
            System.out.println("Erro: Divisao por zero");
        }
        System.out.println("Fim do metodo 2");
    }
}
