package ProjetoFinal;

public class ProjetoVideo {
    public static void main(String[] args) {
        Video videos[] = new Video[3];
        videos[0] = new Video("Aprendendo Java");
        videos[1] = new Video("Aula 1 de POO");
        videos[2] = new Video("Como ser Front End");

        videos[0].status();
        // videos[1].status();
        // videos[2].status();

        Usuario usuarios[] = new Usuario[3];
        usuarios[0] = new Usuario("Jonilei", 31, "M", "jonileisilva");
        usuarios[1] = new Usuario("Kitana", 25, "F", "kitanawins");
        usuarios[2] = new Usuario("Sheeva", 60, "F", "Sheevawins");

        usuarios[0].detalhes();
        usuarios[1].detalhes();
        usuarios[2].detalhes();

        // System.out.println(videos[0].getTitulo());
      

    }
}
