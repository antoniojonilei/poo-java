package B001CriandoClasse;

public class CriandoClasse {
    public static void main(String[] args) {
        Caneta canetaAzul = new Caneta();
        canetaAzul.cor ="azul";
        canetaAzul.ponta = 0.5f;
        canetaAzul.tampada = false;

        canetaAzul.status();
        
    }
}
