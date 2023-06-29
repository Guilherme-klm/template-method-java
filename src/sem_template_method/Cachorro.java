package sem_template_method;

public class Cachorro {

    public void executarRotinaDiaria() {
        acordar();
        comer();
        dormir();
    }

    protected void acordar() {
        System.out.println("O cachorro acordou");
    }

    protected void comer() {
        System.out.println("O cachorro foi comer");
    }

    protected void dormir() {
        System.out.println("O cachorro foi dormir");
    }
}
