package sem_template_method;

public class Gato {

    public void executarRotinaDiaria() {
        acordar();
        comer();
        dormir();
    }

    protected void acordar() {
        System.out.println("O gato acordou!");
    }

    protected void comer() {
        System.out.println("O gato foi comer!");
    }

    protected void dormir() {
        System.out.println("O gato foi dormir!");
    }
}
