package B007Encapsulamento;

public class Encapsulamento {
    public static void main(String[] args) {
        ControleRemoto controle1 = new ControleRemoto();
        controle1.ligar();
        controle1.maisVolume();
        controle1.maisVolume();
        controle1.ligarMudo();

        controle1.desligar();
        controle1.maisVolume();
        
        controle1.abrirMenu();
        controle1.fecharMenu();
    }
}
