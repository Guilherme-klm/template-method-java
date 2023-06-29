package sem_template_method;

public class Main {

    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        cachorro.executarRotinaDiaria();

        Gato gato = new Gato();
        gato.executarRotinaDiaria();

        Lagarto lagarto = new Lagarto();
        lagarto.executarRotinaDiaria();
    }
}