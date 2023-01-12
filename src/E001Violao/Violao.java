package E001Violao;

public class Violao {
    String marca;
    String cor;
    float cordas;
    boolean afinado;

    void status() {
        System.out.println("Violao: " + this.marca);
        System.out.println("Cor: " + this.cor);
        System.out.println("Cordas: " + this.cordas);
        System.out.println("Está afinado? " + this.afinado);
    }

    void tocar() {
        if (this.afinado == false) {
            System.out.println("O som está horrivel, esta desafinado");
        } else {
            System.out.println("Que beleza, afinadinho");
        }
    }

    void afinar() {
        this.afinado = true;
    }

    void desafinar() {
        this.afinado = false;
    }

}
