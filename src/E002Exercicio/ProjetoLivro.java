package E002Exercicio;

public class ProjetoLivro {
    public static void main(String[] args) {
        Pessoa pessoas[] = new Pessoa[2];
        Livro livros[] = new Livro[3];

        pessoas[0] = new Pessoa("Jonilei", 31, "M");
        pessoas[1] = new Pessoa("Fernanda", 27, "F");

        livros[0] = new Livro("Aprendendo Java", "Jose da Silva", 300, pessoas[0]);
        livros[1] = new Livro("POO para iniciantes", "Pedro Paulo", 550, pessoas[2]);
        livros[2] = new Livro("Java Avancado", "Maria das Candidas", 820, pessoas[0]);


        System.out.println(livros[1].detalhes());
    }
}
