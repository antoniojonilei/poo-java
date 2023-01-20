package ProjetoFinal;

public class ProjetoVideo {
    public static void main(String[] args) {
        Video videos[] = new Video[3];
        videos[0] = new Video("Aprendendo Java");
        videos[1] = new Video("Aula 1 de POO");
        videos[2] = new Video("Como ser Front End");        

        Usuario usuarios[] = new Usuario[3];
        usuarios[0] = new Usuario("Jonilei", 31, "M", "jonileisilva");
        usuarios[1] = new Usuario("Kitana", 25, "F", "kitanawins");
        usuarios[2] = new Usuario("Sheeva", 60, "F", "Sheevawins");

        /* 
        videos[0].status();
        videos[1].status();
        videos[2].status();

        usuarios[0].detalhes();
        usuarios[1].detalhes();
        usuarios[2].detalhes(); 
        */      

        Visualizacao assistir[] = new Visualizacao[3];
        assistir[0] = new Visualizacao(usuarios[0], videos[1]);
        assistir[0].avaliar();
        assistir[0].detalhes();       
        videos[1].status();

        assistir[1] = new Visualizacao(usuarios[0], videos[0]);
        assistir[1].avaliar(80.5f);
        videos[0].status();

        assistir[2] = new Visualizacao(usuarios[2], videos[2]);
        assistir[2].avaliar(2);
        videos[2].status();
    }
}
