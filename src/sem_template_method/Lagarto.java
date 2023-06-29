package sem_template_method;

public class Lagarto {

    public void executarRotinaDiaria() {
        acordar();
        comer();
        dormir();
    }

    protected void acordar() {
        System.out.println("O lagarto acordou!");
    }

    protected void comer() {
        System.out.println("O lagarto foi comer!");
    }

    protected void dormir() {
        System.out.println("O lagarto foi dormir!");
    }
}
