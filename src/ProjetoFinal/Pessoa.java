package ProjetoFinal;

public abstract class Pessoa {
    protected String nome;
    protected int idade;
    protected String sexo;
    protected int experiencia;

    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.experiencia = 0;
    }

    public void ganharExperiencia() {
        setExperiencia(getExperiencia() + 5);
    }

    // Getter e Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public int getExperiencia() {
        return experiencia;
    }

    // detalhes
    public void detalhes() {
        System.out.println("======== Pessoa ========");
        System.out.println("Pessoa: " + this.nome);
    }
    
}
