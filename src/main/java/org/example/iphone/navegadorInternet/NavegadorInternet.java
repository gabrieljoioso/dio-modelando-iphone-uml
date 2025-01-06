package org.example.iphone.navegadorInternet;

public interface NavegadorInternet {
    public default void exibirPagina(String url) {

        System.out.println("Exibindo a página...");
    }

    public default void adicionarNovaAba() {

        System.out.println("Adicionando nova aba...");
    }

    public default void atualizarPagina(){

        System.out.println("Atualizando pagina... ");
    }
}
