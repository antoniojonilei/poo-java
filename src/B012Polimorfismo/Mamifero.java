package B012Polimorfismo;

public class Mamifero extends Animal{
    protected String corPelo;

    // Sobreposição
    @Override
    public void emitirSom() {
        System.out.println("Som de Mamifero");
    }

    // Getters e Setters
    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    public String getCorPelo() {
        return corPelo;
    }
}
