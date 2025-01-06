package org.example.iphone.reprodutorMusical;

public interface ReprodutorMusical {
    public default void tocar() {
        System.out.println("Reproduzindo pelo reprodutor...");
    }

    public default void pausar() {
        System.out.println("Pausando pelo reprodutor...");
    }

    public default void selecionarMusica(Long idMusica){
        System.out.println("Selecionado musica pelo reprodutor...");
    }
}
