package B005Exercicio;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean aberta;

    public ContaBanco(int n, String t, String d) {
        this.setNumConta(n);
        this.setTipo(t);
        this.setDono(d);
        this.aberta = true;
        if (t == "cc") {
            this.saldo = 50;
        } else if (t == "cp") {
            this.saldo = 150;
        }
    }

    public int getNumConta() {
        return this.numConta;
    }
    public void setNumConta(int n) {
        this.numConta = n;
    }

    public String getTipo() {
        return this.tipo;
    }
    public void setTipo(String t) {
        this.tipo = t;
    }

    public String getDono() {
        return this.dono;
    }
    public void setDono(String d) {
        this.dono = d;
    }

    public float getSaldo() {
        return this.saldo;
    }
    public void SetSaldo(float s) {
        this.saldo = s;
    }

    public void abrirConta() {
        this.aberta = true;
    }

    public void fecharConta() {
        if (this.saldo > 0) {
            System.out.println("ERRO! A conta tem saldo");
        } else if (this.saldo < 0) {
            System.out.println("ERRO! A conta esta negativa");
        } else {
            this.aberta = false;            
        }        
    }

    public void depositar(float s) {
        if (this.aberta == true) {
            this.saldo += s;
            System.out.println("Deposito de " + s + " efetuado");            
        } else {
            System.out.println("ERRO! A conta esta fechada");
        }
    }

    public void sacar(float s) {
        if (this.aberta == true && this.saldo >= s) {
            this.saldo -= s;
            System.out.println("Saque de " + s + " efetuado");
        } else if (this.aberta == false){
            System.out.println("ERRO! A conta esta fechada");           
        } else if (s > this.saldo) {
            System.out.println("ERRO! Saldo insuficiente");
        }
    }

    public void pagarMensal() {
        if (this.tipo == "cc") {
            this.saldo -= 12;
        } else if (this.tipo == "cp") {
            this.saldo -= 20;
        }        
    }

    public void status() {
        System.out.println("--- SOBRE A CONTA ---");
        System.out.println("Numero: " + this.getNumConta());
        System.out.println("Conta: " + this.getTipo());
        System.out.println("Nome: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Esta Aberta: " + this.aberta);
    }
}
