package B010Heranca;

public class Aluno extends Pessoa{

    // Herança para diferença 

    private int matricula;
    private String curso;

    // Método final - Não pode ser sobreposto
    // public final void pagarMensalidade() {
    //     System.out.println("Pagando mensalidade de Aluno " + this.getNome());
    // }

    public void pagarMensalidade() {
        System.out.println("Pagando mensalidade de Aluno " + this.getNome());
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }
}
