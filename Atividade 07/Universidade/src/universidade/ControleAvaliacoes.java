/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universidade;

import java.util.List;

public class ControleAvaliacoes<T> implements Avaliacao<T> {
    private List<T> listaAvaliacoes;

    public ControleAvaliacoes(List<T> listaAvaliacoes) {
        this.listaAvaliacoes = listaAvaliacoes;
    }

    public void cadastrarAvaliacao(T avaliacao) {
        listaAvaliacoes.add(avaliacao);
    }

    public T consultarAvaliacao(int posicao) {
        return listaAvaliacoes.get(posicao);
    }

    public void limparListaAvaliacoes() {
        listaAvaliacoes.clear();
    }

    public List<T> getListaAvaliacoes() {
        return listaAvaliacoes;
    }
}
