package B004Exercicio;

public class Clientes {
    public static void main(String[] args) {
        Banco creuza = new Banco("Creuza", "Corrente", 500);
        creuza.status();

        Banco jubileu = new Banco("Jubileu", "Poupanca", 300);
        jubileu.status();

    }
}
