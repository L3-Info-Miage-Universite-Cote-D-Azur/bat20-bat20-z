package bat;

/**
 * classe qui représente un joueur
 */
public class Joueur {

    /**
     * à n'utiliser que lorsque la partie est terminée
     * @return true si le joueur est le gagnant
     */
    public boolean isGagnant() {
        return gagnant;
    }

    /**
     * pour changer l'état du joeur
     * @param gagnant : true si le joueur a gagné
     */
    public void setGagnant(boolean gagnant) {
        this.gagnant = gagnant;
    }

    private boolean gagnant;


}
