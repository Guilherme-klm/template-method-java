package com_template_method;

public class Main {

    public static void main(String[] args) {
        Animal cachorro = new Cachorro();
        cachorro.executarRotinaDiaria();

        Animal gato = new Gato();
        gato.executarRotinaDiaria();

        Animal lagarto = new Lagarto();
        lagarto.executarRotinaDiaria();
    }
}