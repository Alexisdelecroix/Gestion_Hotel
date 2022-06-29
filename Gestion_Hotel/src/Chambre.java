public class Chambre extends Hotel{
    private int numero;
    private int categorie;
    private int nbPersonnes;

    public Chambre(int numero, int categorie, int nbPersonnes) {
        this.numero = numero;
        this.categorie = categorie;
        this.nbPersonnes = nbPersonnes;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCategorie() {
        return categorie;
    }

    public void setCategorie(int categorie) {
        this.categorie = categorie;
    }

    public int getNbPersonnes() {
        return nbPersonnes;
    }

    public void setNbPersonnes(int nbPersonnes) {
        this.nbPersonnes = nbPersonnes;
    }

    public void donnerNumero() {
        System.out.println("Votre numéro de chambre est le " + numero);
    }
}
