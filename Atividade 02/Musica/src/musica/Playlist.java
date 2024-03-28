/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package musica;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Musica {
    private String nome;
    private String autor;
    private String gravadora;

    public Musica(String nome, String autor, String gravadora) {
        this.nome = nome;
        this.autor = autor;
        this.gravadora = gravadora;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getAutor() {
        return autor;
    }

    public String getGravadora() {
        return gravadora;
    }
}

public class Playlist {
    
    private List<Musica> listaDeMusicas;
    private String dono;

    public Playlist(String dono) {
        
        this.listaDeMusicas = new ArrayList<>();
        this.dono = dono;
    }

    public void adicionarMusica(Musica musica) {
        
        listaDeMusicas.add(musica);
    }

    public void tocarMusica() {
        
        if (listaDeMusicas.isEmpty()) {
            System.out.println("Vazia");
            return;
        }

        Random rand = new Random();
        int index = rand.nextInt(listaDeMusicas.size());
        Musica musicaSelecionada = listaDeMusicas.get(index);

        System.out.println("Tocar: " + musicaSelecionada.getNome());
    }

    public static void main(String[] args) {
        
        Playlist minhaPlaylist = new Playlist("Bon Jovi");

            minhaPlaylist.adicionarMusica(new Musica ("It's My Life", "Bon Joni", "?"));
            minhaPlaylist.adicionarMusica(new Musica ("Always", "Bon Joni", "?"));
            minhaPlaylist.adicionarMusica(new Musica ("You Give Love A BAd Name", "Bon Joni", "?"));
            minhaPlaylist.adicionarMusica(new Musica ("Livin'On A Player", "Bon Joni", "?"));
    
            minhaPlaylist.tocarMusica();
    }
}

