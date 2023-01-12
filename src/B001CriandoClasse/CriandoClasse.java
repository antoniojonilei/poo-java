package B001CriandoClasse;

public class CriandoClasse {
    public static void main(String[] args) {
        Caneta canetaAzul = new Caneta();
        canetaAzul.cor ="azul";
        canetaAzul.ponta = 0.5f;  
        canetaAzul.carga = 80;      
        canetaAzul.tampar();
        canetaAzul.status();
        canetaAzul.rabiscar();

        System.out.println("-----------");

        Caneta canetaVermelha = new Caneta();
        canetaVermelha.modelo = "BIC";
        canetaVermelha.cor = "vermelho";
        canetaVermelha.carga = 70;
        canetaVermelha.ponta = 1.0f;
        canetaVermelha.destampar();
        canetaVermelha.status();
        canetaVermelha.rabiscar();
        
    }
}
