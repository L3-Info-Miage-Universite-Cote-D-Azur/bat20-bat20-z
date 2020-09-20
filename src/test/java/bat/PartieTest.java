package bat;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PartieTest {

    /**
     * vérification que la partie se termine avec un gagnant.
     * ce gagnant est le (seul) joueur
     */
    @Test
    public void testerUnePartieSimple() {
        Partie p = new Partie();
        assertTrue(p.isFini());
        assertTrue(p.getJoueur().isGagnant());
    }
}
