package com_template_method;

public class Cachorro extends Animal {
    @Override
    protected void acordar() {
        System.out.println("O cachorro acordou");
    }

    @Override
    protected void comer() {
        System.out.println("O cachorro foi comer");
    }

    @Override
    protected void dormir() {
        System.out.println("O cachorro foi dormir");
    }
}
