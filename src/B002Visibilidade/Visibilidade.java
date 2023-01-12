package B002Visibilidade;

public class Visibilidade {
    public static void main(String[] args) {
        Caneta canetaUm = new Caneta();
        canetaUm.modelo = "BIC Cristal";
        canetaUm.cor = "rosa";
        // canetaUm.ponta = 0.5f; // campo ponta privado  
        canetaUm.carga = 80;
        // canetaUm.tampada = false; 
        canetaUm.tampar();     

        canetaUm.status();
        canetaUm.rabiscar();
    }
    
}

// Visibilidade pode ser
// public - publica 
// private - privada
// protected - protegida