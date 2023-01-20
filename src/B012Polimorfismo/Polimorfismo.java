package B012Polimorfismo;

public class Polimorfismo {
    public static void main(String[] args) {
        // Erro
        // Animal é uma classe abstrata e não pode ser instanciada
        // Animal animal1 = new Animal();

        Mamifero animal1 = new Mamifero();
        Lobo lobo1 = new Lobo();
        Cachorro dog2 = new Cachorro();

        animal1.emitirSom();
        lobo1.emitirSom();
        dog2.emitirSom();

        System.out.println("==================");
        // Polimorfismo de Sobrecarga

        dog2.reagir("ola");
        dog2.reagir("vai apanhar");
        dog2.reagir(11, 45);
        dog2.reagir(21, 00);
        dog2.reagir(true);
        dog2.reagir(false);
        dog2.reagir(2, 12.5f);
        dog2.reagir(17, 4.5f);
    }
}
