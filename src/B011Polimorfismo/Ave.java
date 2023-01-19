package B011Polimorfismo;

public class Ave extends Animal{
    private String corPena;

    public void fazerNinho() {
        System.out.println("Construiu um ninho");
    }

    // Métodos sobrepostos
    @Override
    public void locomover() {
        System.out.println("Voando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo frutas");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Ave");
    }

    // Getters e Setters
    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

    public String getCorPena() {
        return corPena;
    }
}
