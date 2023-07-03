package sem_template_method;

public class Main {

    public static void main(String[] args) {
        RotinaDiaria rotinaDiaria = new RotinaDiaria();
        try {
            rotinaDiaria.executar("Gato");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}