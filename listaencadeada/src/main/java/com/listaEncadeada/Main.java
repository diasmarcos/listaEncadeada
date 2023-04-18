package com.listaEncadeada;

public class Main {
    public static void main(String[] args) {

        ListaEncadeada<String> minhaListaencadeada = new ListaEncadeada<>();

        minhaListaencadeada.add("teste1");
        minhaListaencadeada.add("teste2");
        minhaListaencadeada.add("teste3");
        minhaListaencadeada.add("teste4");

        System.out.println(minhaListaencadeada.get(1));
        System.out.println(minhaListaencadeada.get(3));
        System.out.println(minhaListaencadeada.get(2));

        System.out.println(minhaListaencadeada);
        System.out.println(minhaListaencadeada.remove(2));

        System.out.println(minhaListaencadeada);


    }
}
