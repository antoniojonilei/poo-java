package B009Heranca;

public class Aluno extends Pessoa {
    private boolean matriculado;
    private String curso;

    public void cancelarMatricula() {
        System.out.println("Matricula sera cancelada");
    }

    public void setMatriculado(boolean matriculado) {
        this.matriculado = matriculado;
    }

    public boolean getMatriculado() {
        return this.matriculado;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

}
