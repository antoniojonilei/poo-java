package B008RelacionamentoEntreClasses;

import java.util.Random;

public class Luta {
    // Atributos 
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada; 

    // Metodos Especiais 
    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public int getRounds() {
        return rounds;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    public boolean getAprovada() {
        return aprovada;
    }

    // Métodos publicos
    public void marcarLuta(Lutador l1, Lutador l2) {
        if ( l1.getCategoria() == l2.getCategoria() && l1 != l2 )  {
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        } else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }

    public void luta() {
        if (this.aprovada) {
            System.out.println("### DESAFIADO ###");
            this.desafiado.apresentar();
            System.out.println("### DESAFIANTE ###");
            this.desafiante.apresentar();

            Random aleatorio = new Random(); //import java.util.Random;
            int vencedor = aleatorio.nextInt(3); // 0 1 2

            System.out.println("### RESULTADO ###");            
            switch (vencedor) {
                case 0: // Empate
                    System.out.println("Empatou!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;

                case 1: // Desafiado vence
                    System.out.println("Vencedor " + this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;

                case 2:  // Desafiante vence
                    System.out.println("Vencedor " + this.desafiante.getNome());
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
            }
            System.out.println(" ============ ");
        } else {
            System.out.println("A luta nao pode acontecer");
        }
    }

}
