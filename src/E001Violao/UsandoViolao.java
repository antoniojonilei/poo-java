package E001Violao;

public class UsandoViolao {
    public static void main(String[] args) {
        Violao primeiroViolao = new Violao();
        primeiroViolao.marca = "Tonante";
        primeiroViolao.cor = "sunburst";
        primeiroViolao.cordas = 0.9f;
        primeiroViolao.afinado = false;
        primeiroViolao.status();
        primeiroViolao.tocar();

    }
}
