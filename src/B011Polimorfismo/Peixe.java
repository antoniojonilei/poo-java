package B011Polimorfismo;

public class Peixe extends Animal{
    private String corEscama;

    public void soltarBolha() {
        System.out.println("Soltou uma bolha");
    }
    
    // Métodos sobrepostos
    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Peixe nao faz som");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Mamifero");
    }

    // Getters e Setters
    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    public String getCorEscama() {
        return corEscama;
    }
}
