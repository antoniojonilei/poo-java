package B006Exercicio;

public class Clientes {
    public static void main(String[] args) {
        ContaBanco pessoa1 = new ContaBanco();
        pessoa1.setNumConta(1400);
        pessoa1.setDono("Creuza");
        pessoa1.abrirConta("cc");
        pessoa1.depositar(500);      

        ContaBanco  pessoa2 = new ContaBanco();
        pessoa2.setNumConta(4554);
        pessoa2.setDono("Jubileu");
        pessoa2.abrirConta("cp");
        pessoa2.depositar(300);

        pessoa1.statusAtual();
        pessoa2.statusAtual();
    }
}
