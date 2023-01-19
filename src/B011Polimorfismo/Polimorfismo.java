package B011Polimorfismo;

public class Polimorfismo {
    public static void main(String[] args) {
        // ERRO - Animal é classe abstrata e não pode instanciar objetos
        // Animal n = new Animal(); 

        Mamifero mamifero1 = new Mamifero();
        Reptil reptil1 = new Reptil();
        Peixe peixe1 = new Peixe();
        Ave ave1 = new Ave();

        Canguru canguru1 = new Canguru();
        Cobra cobra1 = new Cobra();
        Cachorro dog1 = new Cachorro();
        GoldFish fish1 = new GoldFish();
        Tartaruga turtle1 = new Tartaruga();
        Arara arara1 = new Arara();

        mamifero1.setPeso(35.5f);
        mamifero1.setCorPelo("Marrom");
        mamifero1.alimentar();
        mamifero1.locomover();
        mamifero1.emitirSom();

        reptil1.locomover();
        ave1.locomover();
        peixe1.locomover();

        System.out.println("===============");

        canguru1.locomover(); // mamifero
        dog1.locomover(); // mamifero
        cobra1.locomover();
        fish1.locomover();
        turtle1.locomover();
        arara1.locomover();

        System.out.println("===============");

        canguru1.emitirSom();
        dog1.emitirSom();

    }
}
