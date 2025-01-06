package org.example.iphone.reprodutorMusical;

public class Playfy implements ReprodutorMusical {
    public void tocar() {
        System.out.println("Reproduzindo...");
    }

    public void pausar() {
        System.out.println("Pausando...");
    }

    public void selecionarMusica(Long idMusica){
        System.out.println("Selecionando música com ID: ");
    }
}
