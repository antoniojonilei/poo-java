package B010Heranca;

public class Bolsista extends Aluno{
    private float bolsa;

    public void renovarBolsa() {
        System.out.println("Renovando bolsa de " + this.getNome());
    }

    // método sendo sobreposto
    @Override
    public void pagarMensalidade(){
        System.out.println(this.getNome() + " é Bolsista. Pagamento facilitado");
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }

    public float getBolsa() {
        return bolsa;
    }
}
