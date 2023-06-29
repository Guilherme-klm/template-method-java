package com_template_method;

public class Gato extends Animal {

    @Override
    protected void acordar() {
        System.out.println("O gato acordou!");
    }

    @Override
    protected void comer() {
        System.out.println("O gato foi comer!");
    }

    @Override
    protected void dormir() {
        System.out.println("O gato foi dormir!");
    }
}
