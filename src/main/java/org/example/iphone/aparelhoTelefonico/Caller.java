package org.example.iphone.aparelhoTelefonico;

public class Caller implements AparelhoTelefonico {

    public void ligar() {
        System.out.println("Ligando para o número com Caller... ");
    }

    public void atender() {
        System.out.println("Atendendo com Caller...");
    }

    public void iniciarCorreioVoz(){
        System.out.println("Iniciando correio de Voz com Caller... ");
    }
}
