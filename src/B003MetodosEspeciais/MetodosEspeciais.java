package B003MetodosEspeciais;

public class MetodosEspeciais {
    public static void main(String[] args) {
        Caneta canetaUm = new Caneta("Bic", "Vermelho", 0.7f);
        // canetaUm.setModelo("Bic");
        // canetaUm.modelo = "BIC"
        // canetaUm.setPonta(0.7f);
        // canetaUm.ponta = 0.7f;

        System.out.println("Tenho uma caneta " + canetaUm.getModelo() + " de ponta " + canetaUm.getPonta());

        Caneta canetaDois = new Caneta("Nike", "Amarelo", 0.6f);
        canetaDois.status();

        Caneta canetaTres = new Caneta("Tramontina", "Preto", 1.2f);
        canetaTres.status();
    }
}
