package org.example.iphone.navegadorInternet;

public class Safari implements NavegadorInternet {

    public void exibirPagina(String url) {

        System.out.println("Exibindo a página com Safari...");
    }

    public void adicionarNovaAba() {

        System.out.println("Adicionando nova aba com Safari...");
    }

    public void atualizarPagina(){

        System.out.println("Atualizando pagina com Safari... ");
    }
}
