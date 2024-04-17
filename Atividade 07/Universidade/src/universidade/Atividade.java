/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universidade;

import java.util.ArrayList;
import java.util.List;


public class Atividade implements Avaliacao<String> {
    private List<String> atividades;

    public Atividade() {
        atividades = new ArrayList<>();
    }

    public void cadastrarAvaliacao(String avaliacao) {
        atividades.add(avaliacao);
    }

    public String consultarAvaliacao(int posicao) {
        return atividades.get(posicao);
    }

    public void limparListaAvaliacoes() {
        atividades.clear();
    }

    public List<String> getListaAvaliacoes() {
        return atividades;
    }
}
