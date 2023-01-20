package ProjetoFinal;

public class ProjetoVideo {
    public static void main(String[] args) {
        Video videos[] = new Video[3];
        videos[0] = new Video("Aprendend Java");
        videos[1] = new Video("Aula 1 de POO");
        videos[2] = new Video("Como ser Front End");

        Usuario usuarios[] = new Usuario[2];
        usuarios[0] = new Usuario("Jonilei", 31, "M", "jonileisilva"); 
        usuarios[1] = new Usuario("Marislauda", 25, "F", "marisMaris");
        usuarios[2] = new Usuario("Cliofa", 18, "F", "itsmeclio");

        System.out.println(videos[0].toString());
        System.out.println(videos[1].toString());
        System.out.println(videos[2].toString());

        // System.out.println(usuarios[0].toString());
        // System.out.println(usuarios[1].toString());
        // System.out.println(usuarios[2].toString());
    }
}
