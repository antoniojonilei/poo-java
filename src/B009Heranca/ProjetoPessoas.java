package B009Heranca;

public class ProjetoPessoas {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        Aluno pessoa2 = new Aluno();
        Professor pessoa3 = new Professor();
        Funcionario pessoa4 = new Funcionario();

        pessoa1.setNome("Pedro");
        pessoa2.setNome("Maria");
        pessoa3.setNome("Claudio");
        pessoa4.setNome("Francisca");

        pessoa1.setSexo("M");
        pessoa2.setSexo("F");
        pessoa3.setSexo("M");
        pessoa4.setSexo("F");

        pessoa1.setIdade(18);
        pessoa2.setIdade(15);
        pessoa3.setIdade(35);
        pessoa4.setIdade(28);

        pessoa2.setCurso("Informatica");
        pessoa3.setSalario(2500.75f);
        pessoa4.setSetor("Biblioteca");

        // ERROS 
        // pessoa1.receberAumento(550.20f);
        // pessoa2.mudarTrabalho();
        // pessoa4.cancelarMatricula();

        System.out.println(pessoa1.toString());
        System.out.println(pessoa2.toString());
        System.out.println(pessoa3.toString());
        System.out.println(pessoa4.toString());
    }
}
