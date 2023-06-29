package com_template_method;

public abstract class Animal {

    public void executarRotinaDiaria() {
        acordar();
        comer();
        dormir();
    }

    protected abstract void acordar();

    protected abstract void comer();

    protected abstract void dormir();
}
