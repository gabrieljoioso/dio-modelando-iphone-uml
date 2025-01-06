package org.example.iphone.pessoa;

import org.example.iphone.aparelhoTelefonico.AparelhoTelefonico;
import org.example.iphone.aparelhoTelefonico.Caller;
import org.example.iphone.navegadorInternet.NavegadorInternet;
import org.example.iphone.navegadorInternet.Safari;
import org.example.iphone.reprodutorMusical.Playfy;
import org.example.iphone.reprodutorMusical.ReprodutorMusical;

public class Pessoa {

    public static void main(String[] args) {

        ReprodutorMusical playfy = new Playfy();
        playfy.tocar();
        playfy.pausar();
        playfy.selecionarMusica(1L);

        AparelhoTelefonico caller = new Caller();
        caller.ligar();
        caller.atender();
        caller.iniciarCorreioVoz();

        NavegadorInternet safari = new Safari();
        safari.exibirPagina("https://www.google.com.br");
        safari.adicionarNovaAba();
        safari.atualizarPagina();

    }
}
