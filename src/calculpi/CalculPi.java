/*
 * CalculPi.java                             15/10/2017
 * Elyan Poujol
 * Pas de droits
 */
package calculpi;

/**
 * Calcule l'approximation de Pi au travers de differentes methodes
 * @author Elyan Poujol
 */
public class CalculPi {
    /**
     * Point d'entree de l'application
     * @param args non utilise
     */
    public static void main(String[] args) {
        CalculPiChudnowsky chudnowsky = new CalculPiChudnowsky();
        CalculPiDisque disque = new CalculPiDisque();
        CalculPiDisqueGUI disqueGraphique = new CalculPiDisqueGUI();
    }
}
