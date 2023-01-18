package E002Exercicio;

public class Livro implements Publicacao{

    private String titulo;
    private String autor;
    private int totalPaginas;
    private int paginaAtual;
    private boolean aberto;
    private Pessoa leitor;

    public String detalhes() {
        return "Livro{" + "titulo=" 
                + titulo + ",\n autor=" 
                + autor + ",\n totalPaginas=" 
                + totalPaginas + ",\n paginaAtual=" 
                + paginaAtual + ",\n aberto=" 
                + aberto + ",\n leitor=" + leitor + '}';
    }

    public Livro(String titulo, String autor, int totalPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalPaginas = totalPaginas;
        this.leitor = leitor;
        this.aberto = false;
        this.paginaAtual = 0;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setTotalPaginas(int totalPaginas) {
        this.totalPaginas = totalPaginas;
    }

    public int getTotalPaginas() {
        return totalPaginas;
    }

    public void setPaginaAtual(int paginaAtual) {
        this.paginaAtual = paginaAtual;
    }

    public int getPaginaAtual() {
        return paginaAtual;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public boolean getAberto() {
        return this.aberto;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    public Pessoa getLeitor() {
        return leitor;
    }  
    
    
    @Override
    public void abrir(){
        this.setAberto(true);
    }

    @Override
    public void fechar(){
        this.setAberto(false);
    }

    @Override
    public void folhear(int pagina){
        this.setPaginaAtual(pagina);
    }

    @Override
    public void avancarPagina(){
        this.setPaginaAtual(getPaginaAtual() + 1);
    }

    @Override
    public void voltarPagina(){
        this.setPaginaAtual(getPaginaAtual() - 1);
    }
}
