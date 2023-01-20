package ProjetoFinal;

public class Visualizacao {
    private Usuario espectador;
    private Video filme;

    public Visualizacao(Usuario espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotalAssistido(this.espectador.getTotalAssistido() + 1);
        this.filme.setViews(this.filme.getViews() + 1);
    }

    // polimorfismo -sobrecarga
    public void avaliar() {
        this.filme.setAvaliacao(5);
    }

    public void avaliar(int nota) {
        this.filme.setAvaliacao(nota);
    }

    public void avaliar(float porc) {
        int total = 0;
        if (porc <= 20) {
            total = 3;
        } else if (porc <= 50) {
            total = 5;
        } else if (porc <= 90) {
            total = 8;
        } else {
            total = 10;
        } 

        this.filme.setAvaliacao(total);
    }

    // getter e setters
    public void setEspectador(Usuario espectador) {
        this.espectador = espectador;
    }

    public Usuario getEspectador() {
        return espectador;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    public Video getFilme() {
        return filme;
    }

    // @Override
    // public String toString() {
    //     return "Visualizacao = " + "Espectador: " + espectador + "Filme: " + filme;
    // }

    public void detalhes() {
        System.out.println("====== assistindo =======");
        System.out.println("Espectador: " + espectador);
        System.out.println("Filmes: " + filme);
    }
}
