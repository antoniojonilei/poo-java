package B008RelacionamentoEntreClasses;

public class UltraEmojiCombat {
    public static void main(String[] args) {
        Lutador lutadores[] = new Lutador[6];
        
        lutadores[0] = new Lutador("Pretty Boy", "França", 31, 1.75f, 68.9f, 11, 2, 1);        
        lutadores[1] = new Lutador("PutScript", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3);
        lutadores[2] = new Lutador("SnapShadow", "EUA", 35, 1.65f, 80.9f, 12, 2, 1);
        lutadores[3] = new Lutador("Dead Code", "Australia", 28, 193.f, 81.6f, 13, 0, 2);
        lutadores[4] = new Lutador("UFOCObol", "Brasil", 37, 1.70f, 119.3f, 5, 4, 3);
        lutadores[5] = new Lutador("Nerddaart", "EUA", 30, 1.81f, 105.7f, 12, 2, 4);


        // lutadores[0].apresentar();
        // lutadores[1].apresentar();
        // lutadores[2].apresentar();
        // lutadores[3].apresentar();
        // lutadores[4].apresentar();
        lutadores[1].apresentar();

        // lutadores[0].status();

        lutadores[1].ganharLuta();
        lutadores[1].perderLuta();
        lutadores[1].empatarLuta();
        lutadores[1].status();

        
    }
}
