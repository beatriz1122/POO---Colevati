/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package universidade;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Prova implements Avaliacao<Double> {
    private List<Double> provas;

    public Prova() {
        provas = new ArrayList<>();
    }

    public void cadastrarAvaliacao(Double avaliacao) {
        Random rand = new Random();
        provas.add(rand.nextDouble() * 10); // Gera um número aleatório de 0.0 a 10.0
    }

    public Double consultarAvaliacao(int posicao) {
        return provas.get(posicao);
    }

    public void limparListaAvaliacoes() {
        provas.clear();
    }

    public List<Double> getListaAvaliacoes() {
        return provas;
    }
}

