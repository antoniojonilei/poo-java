package ProjetoFinal;

public class Video implements AcoesVideo{
    private String titulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;

    // Constructor
    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliacao = 1;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }

    // Getters e Setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getViews() {
        return views;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    public boolean getReproduzindo() {
        return this.reproduzindo;
    }
    
    // Implementação dos métodos da interface 
    @Override
    public void play() {

    }

    @Override
    public void pause() {

    }

    @Override 
    public void like() {

    }

    // detalhes String
    public void status() {
        System.out.println("========== Video ==========");
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Avaliaçao: " + this.avaliacao);
        System.out.println("Views: " + this.views);
        System.out.println("Curtidas: " + this.curtidas);
        System.out.println("Reproduzindo: " + this.reproduzindo);
    }

}
