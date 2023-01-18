package B010Heranca;

public class Heranca {
    
    public static void main(String[] args) {
        // Não se pode instanciar um objeto de uma classe abstrata
        // ERRO
        // Pessoa pessoa1 = new Pessoa();

        Visitante visitante1 = new Visitante();
        visitante1.setNome("Juvenal");
        visitante1.setIdade(22);
        visitante1.setSexo("M");
        System.out.println(visitante1.toString());

        Aluno aluno1 = new Aluno();
        aluno1.setNome("Claudio");
        aluno1.setMatricula(1234);
        aluno1.setCurso("Tecnologia");
        aluno1.setIdade(33);
        aluno1.setSexo("M");
        System.out.println(aluno1.toString());
        aluno1.pagarMensalidade();

        Bolsista bolsista1 = new Bolsista();
        bolsista1.setMatricula(3521);
        bolsista1.setNome("Jubileu");
        bolsista1.setBolsa(12.5f);
        bolsista1.setSexo("M");
        System.out.println(bolsista1.toString());
        bolsista1.pagarMensalidade();
        
    }    
    
}
