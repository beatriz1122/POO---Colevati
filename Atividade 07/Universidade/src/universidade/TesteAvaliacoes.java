package universidade;

import java.util.ArrayList;
import java.util.List;

public class TesteAvaliacoes {
    public static void main(String[] args) {
        Avaliacao<Double> prova = new ControleAvaliacoes<>(new ArrayList<>());
        
        Avaliacao<String> atividade = new ControleAvaliacoes<>(new ArrayList<>());

        prova.cadastrarAvaliacao(8.5);
        prova.cadastrarAvaliacao(7.2);

        atividade.cadastrarAvaliacao("Resumo sobre Java");
        atividade.cadastrarAvaliacao("Exercícios de Matemática");

        System.out.println("Provas:");
        for (Double p : prova.getListaAvaliacoes()) {
            System.out.println("Nota: " + p);
        }

        System.out.println("\nAtividades:");
        for (String a : atividade.getListaAvaliacoes()) {
            System.out.println("Atividade: " + a);
        }

        prova.limparListaAvaliacoes();
        atividade.limparListaAvaliacoes();

        System.out.println("\nListas limpas!");
    }
}
