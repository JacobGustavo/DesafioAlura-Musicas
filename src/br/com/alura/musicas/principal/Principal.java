package br.com.alura.musicas.principal;

import br.com.alura.musicas.modelos.MinhasPreferidas;
import br.com.alura.musicas.modelos.Musica;
import br.com.alura.musicas.modelos.Podcast;

public class Principal {

    public static void main(String[] args) {

        Musica minhaMusica = new Musica();

        minhaMusica.setTitulo("Burguesinha");
        minhaMusica.setCantor("Seu Jorge");

        for (int i = 0; i < 1000; i++) {

            minhaMusica.reproduz();

        }

        for (int i = 0; i < 50; i++) {

            minhaMusica.curte();
            
        }

        Podcast meuPodcast = new Podcast();

        meuPodcast.setTitulo("Flow");
        meuPodcast.setApresentador("Igor");

        for (int i = 0; i < 5000; i++) {

            meuPodcast.reproduz();
            
        }

        for (int i = 0; i < 1000; i++) {

            meuPodcast.curte();

        }

        MinhasPreferidas preferidas = new MinhasPreferidas();

        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhaMusica);

    }

}
