import java.util.Scanner;

public class Chambre extends Hotel{
    private int numero;
    private int categorie;
    private int nbPersonnes;

    Scanner sc = new Scanner(System.in);
    int[][] TabPrix = {
            {100, 120, 130, 150, 0, 0},
            {130, 160, 170, 190, 0, 0},
            {170, 200, 210, 230, 270, 350},
            {200, 230, 240, 260, 300, 400},
    };

    String[] TabDescript = {
            "Lavabo", "WC, Télévision", "Cabine Douche, Télévision", "WC , cabine douche, télévision" ,
            "wc, salle de bain, douche, télévision", "2 pièces, salle de bain, douche, wc, télévision"
    };

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
     public void DonnerCateg() {
         System.out.println("Votre catégories de chambre est : "+categorie);
     }
    public void DonnerNbPers() {
        System.out.println("Vous êtes "+nbPersonnes+ " personnes dans la chambre");
    }


        public void DonnerPrix() {
            System.out.println("Quelle catégorie de chambre voulez-vous ?");
            categorie = sc.nextInt();
            System.out.println("A combien êtes-vous ? 4 pers. max.");
            nbPersonnes = sc.nextInt();
            int j, i = 1;
            for (int[] tab1D : TabPrix) {
                j = 1;
                for (int val : tab1D) {
                    if ( i == nbPersonnes && j == categorie) {
                        if (val != 0){
                            System.out.println("Cette chambre coute "+ val+ " euros");
                        } else {
                            System.out.println("Cette chambre n'est pas disponible !!");
                        }
                    }
                    j++;
                }
                i++;
            }
        }

        public void AffichDescription() {
            System.out.println("Quelle catégorie de chambre voulez-vous ?");
            categorie = sc.nextInt();
            int j = 1;
            for (int[] tab1D : TabPrix) {
                j = 1;
                for (int val : tab1D) {
                    if ( j == categorie) {
                        if (val != 0) {
                            System.out.println("Cette chambre possède : " + TabDescript[j - 1]);
                        }
                    }
                    j++;
                }

            }
        }
}
