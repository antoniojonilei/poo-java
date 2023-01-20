package ProjetoFinal;

public class ProjetoVideo {
    public static void main(String[] args) {
        Video videos[] = new Video[3];
        videos[0] = new Video("Aprendendo Java");
        videos[1] = new Video("Aula 1 de POO");
        videos[2] = new Video("Como ser Front End");

        Usuario usuarios[] = new Usuario[2];
        usuarios[0] = new Usuario("Jonilei", 31, "M", "jonileisilva"); 
        usuarios[1] = new Usuario("Marislauda", 25, "F", "marisMaris");
        usuarios[2] = new Usuario("Cliofa", 18, "F", "itsmeclio");

        // videos[0].status();
        // videos[1].status();
        // videos[2].status();

        usuarios[0].detalhes();
      

    }
}
