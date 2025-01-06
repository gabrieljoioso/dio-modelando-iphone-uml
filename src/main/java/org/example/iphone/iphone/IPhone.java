package org.example.iphone.iphone;

import org.example.iphone.aparelhoTelefonico.AparelhoTelefonico;
import org.example.iphone.navegadorInternet.NavegadorInternet;
import org.example.iphone.reprodutorMusical.ReprodutorMusical;

public class IPhone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    public void ligar() {
        System.out.println("Ligando para o número ");
    }

    public void atender() {
        System.out.println("Atendendo a ligação...");
    }

    @Override
    public void iniciarCorreioVoz() {
        AparelhoTelefonico.super.iniciarCorreioVoz();
    }


}
