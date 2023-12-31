package fr.iut.editeur.document;

public class Document {


    private String texte;

    public Document() {
        this.texte = "";
    }
	
    public String getTexte() {
        return texte;
    }

    /**
     * met le texte à la valeur de texte
     * @param texte description du premier paramètre
     */
    public void setTexte(String texte) {
        this.texte = texte;
    }

    /**
     *
     * @param texte texte à ajouter
     */
    public void ajouter(String texte) {
        this.texte += texte;
    }

    /**
     * @param start début du remplacement
     * @param end fin du remplacement
     * @param remplacement texte qui remplace
     */
    public void remplacer(int start, int end, String remplacement) {
        String leftPart = texte.substring(0, start);
        String rightPart = texte.substring(end);
        texte = leftPart + remplacement + rightPart;
    }


    @Override
    public String toString() {
        return this.texte;
    }
}
