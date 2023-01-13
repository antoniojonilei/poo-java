package B006Exercicio;

public class ContaBanco {
    // Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    // Métodos Especiais Getter e Setters
    public void statusAtual() {
        System.out.println("------ SOBRE A CONTA ------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Nome: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Aberta " + this.getStatus());
    }

    public ContaBanco() {
        this.setSaldo(0);
        this.setStatus(false);
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

    public float getSaldo(){
        return this.saldo;
    }

    public void setSaldo(float s) {
        this.saldo = s;
    }

    public boolean getStatus() {
        return this.status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    // Métodos específicos
    public void abrirConta(String tipo) {
        this.setTipo(tipo);
        this.setStatus(true);

        if (tipo == "cc") {
            this.setSaldo(50);
        } else if (tipo == "cp") {
            this.setSaldo(150);
        }

        System.out.println("Conta aberta com sucesso!");
    }

    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Conta nao pode ser fechada porque ainda tem saldo");
        } else if (this.getSaldo() < 0) {
            System.out.println("COnta nao pode ser fehcado pois tem debito");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso");
        }
    }

    public void depositar(float valor) {
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() + valor);
            System.out.println("Deposito de " + valor + " realizado na conta de " + this.getDono());
        } else {
            System.out.println("Impossivel depositar em uma conata fechada");
        }
    }

    public void sacar(float valor) {
        if (this.getStatus()) {
            if (this.getSaldo() >= valor) {
                this.setSaldo(this.getSaldo() - valor);
                System.out.println("Saque de " + valor + "na conta de " + this.getDono());
            } else {
                System.out.println("Saldo insuficiente para saque");
            }
        } else {
            System.out.println("Impossivel sacar de uma conta fechada");
        }
    }

    public void parMensal() {
        int valor = 0;
        if (this.getTipo() == "cc") {
            valor = 12;
        } else if (this.getTipo() == "cp") {
            valor = 20;
        }

        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() - valor);
            System.out.println("Mensalidade paga com sucesso por " + this.getDono());
        } else {
            System.out.println("Impossivel pagar um conta fechada");
        }
    }
}
