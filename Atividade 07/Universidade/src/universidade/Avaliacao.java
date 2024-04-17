/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universidade;


import java.util.List;

public interface Avaliacao<T> {
    void cadastrarAvaliacao(T avaliacao);
    T consultarAvaliacao(int posicao);
    void limparListaAvaliacoes();
    List<T> getListaAvaliacoes();
}
