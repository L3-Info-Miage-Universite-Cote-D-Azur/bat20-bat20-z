package bat;

public class Partie {


    Joueur joueur ;
    boolean fini = false;

    public Partie() {
        joueur = new Joueur();
        setFini(true);
        joueur.setGagnant(true);
        finPartie();
    }


    private void finPartie() {
        System.out.println("la partie est finie, le gagnant est "+joueur);
    }





    public Joueur getJoueur() {
        return joueur;
    }

    public boolean isFini() {
        return fini;
    }

    private void setFini(boolean b) {
        this.fini = b;
    }




    public final static void main(String[] args) {
        System.out.println("début de la partie");
        Partie p = new Partie();
    }
}
