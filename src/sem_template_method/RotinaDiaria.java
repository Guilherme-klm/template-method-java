package sem_template_method;

public class RotinaDiaria {

    public void executar(String tipoAnimal) throws Exception {
        if ("Gato".equals(tipoAnimal)) {
            Gato gato = new Gato();
            gato.acordar();
            gato.comer();
            gato.dormir();
        } else if("Cachorros".equals(tipoAnimal)) {
            Cachorro cachorro = new Cachorro();
            cachorro.acordar();
            cachorro.comer();
            cachorro.dormir();
        } else if ("Lagarto".equals(tipoAnimal)) {
            Lagarto lagarto = new Lagarto();
            lagarto.acordar();
            lagarto.comer();
            lagarto.dormir();
        } else {
            throw new Exception("Animal inválido");
        }
    }
}
