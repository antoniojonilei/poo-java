package ProjetoFinal;

public class Usuario extends Pessoa{
    private String login;
    private int totalAssistido;

    public Usuario(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totalAssistido = 0;
    }

    public void viuMaisUm() {
        setTotalAssistido(getTotalAssistido() + 1);
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getLogin() {
        return login;
    }

    public void setTotalAssistido(int totalAssistido) {
        this.totalAssistido = totalAssistido;
    }

    public int getTotalAssistido() {
        return this.totalAssistido;
    }

    // Sobreposição - Polimorfismo 
    @Override
    public void detalhes() {
        super.detalhes(); // chama da superclasse
        System.out.println("Login: " + this.login);
        System.out.println("Assitiu: " + this.totalAssistido);
    }

}
