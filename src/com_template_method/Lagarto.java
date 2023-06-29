package com_template_method;

public class Lagarto extends Animal {
    @Override
    protected void acordar() {
        System.out.println("O lagarto acordou!");
    }

    @Override
    protected void comer() {
        System.out.println("O lagarto foi comer!");
    }

    @Override
    protected void dormir() {
        System.out.println("O lagarto foi dormir!");
    }
}
