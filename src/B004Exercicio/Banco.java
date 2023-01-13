package B004Exercicio;

public class Banco {
    private String nome;
    private String tipo;
    private float saldo;

    public Banco(String n, String t, float s) {
        this.setNome(n);
        this.setTipo(t);
        this.setSaldo(s);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String n) {
        this.nome = n;
    }

    public String getTipo(){
        return this.tipo;
    }

    public void setTipo(String t) {
        this.tipo = t;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public void setSaldo(float s) {
        this.saldo = s;
    }

    public void status() {
        System.out.println("-- SOBRE A CONTA --");
        System.out.println("Cliente: " + this.getNome());
        System.out.println("Conta: " + this.getTipo());
        System.out.println("Saldo: " + this.getSaldo());
    }
}
