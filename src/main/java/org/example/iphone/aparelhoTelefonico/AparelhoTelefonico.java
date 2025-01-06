package org.example.iphone.aparelhoTelefonico;

public interface AparelhoTelefonico {
    public default void ligar() {
        System.out.println("Ligando para o número... ");
    }

    public default void atender() {

        System.out.println("Atendendo...");
    }

    public default void iniciarCorreioVoz(){

        System.out.println("Iniciando correio de Voz... ");
    }
}
