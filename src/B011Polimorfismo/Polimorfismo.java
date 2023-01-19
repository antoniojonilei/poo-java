package B011Polimorfismo;

public class Polimorfismo {
    public static void main(String[] args) {
        // ERRO - Animal é classe abstrata e não pode instanciar objetos
        // Animal n = new Animal(); 

        Mamifero mamifero1 = new Mamifero();
        Reptil reptil1 = new Reptil();
        Peixe peixe1 = new Peixe();
        Ave ave1 = new Ave();

        mamifero1.setPeso(35.5f);
        mamifero1.setCorPelo("Marrom");
        mamifero1.alimentar();
        mamifero1.locomover();
        mamifero1.emitirSom();

        reptil1.locomover();
        ave1.locomover();
        peixe1.locomover();
    }
}
