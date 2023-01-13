package B005Exercicio;

public class Clientes {
    public static void main(String[] args) {
        ContaBanco creuza = new ContaBanco(1234, "cc", "Creuza");
        creuza.depositar(500);

        System.out.println("mensalidade: 30");
        creuza.pagarMensal();

        creuza.sacar(300);
        creuza.sacar(210);

        System.out.println("mensalidade: 30");
        creuza.pagarMensal();
         
        creuza.depositar(20); 
        
        creuza.fecharConta();

        creuza.sacar(10);

        creuza.abrirConta();

        creuza.status();
    }
}
