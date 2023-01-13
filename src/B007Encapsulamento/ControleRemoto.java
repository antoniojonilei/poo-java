package B007Encapsulamento;

public class ControleRemoto implements Controlador{
    // Atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;

    // Métodos Especiais
    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    private int getVolume() {
        return this.volume;
    }

    private boolean getLigado() {
        return this.ligado;
    }

    private boolean getTocanco() {
        return this.tocando;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    // Métodos Abstratos
    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }
    
    @Override
    public void abrirMenu() {
        System.out.println(" ---- MENU ---- ");
        System.out.println("Esta ligado: " + this.ligado);
        System.out.println("Esta tocando: " + this.tocando);
        System.out.print("Volume: " + this.volume);

        for (int i = 0; i <= this.getVolume(); i += 10) {
            System.out.print(" I");
        }
    }
    
    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu... ");
    }
    
    @Override
    public void maisVolume() {
        if (this.getLigado()) {
            this.setVolume(getVolume() + 5);
        } else {
            System.out.println("Impossivel aumentar o volume");
        }
    }
    
    @Override
    public void menosVolume() {
        if (this.getLigado()) {
            this.setVolume(getVolume() - 5);
        } else {
            System.out.println("Impossivel diminuir o volume");
        }
    }
    
    @Override
    public void ligarMudo() {
        if (this.getLigado() && this.getVolume() > 0) {
            this.setVolume(0);
        } else {
            System.out.println("Impossivel ligar o mudo");
        }
    }
    
    @Override
    public void desligarMudo() {
        if (this.getLigado() && this.getVolume() == 0) {
            this.setVolume(50);
        } else {
            System.out.println("Impossivel desligar o mudo");
        }
    }
    
    @Override
    public void play() {
        if (this.getLigado() && !(this.getTocanco())) {
            this.setTocando(true);
        } else {
            System.out.println("Impossivel dar play");
        }
    }
    
    @Override
    public void pause() {
        if (this.getLigado() && this.getTocanco()) {
            this.setTocando(false);
        } else {
            System.out.println("Impossivel pausar");
        }
    }  
}   
