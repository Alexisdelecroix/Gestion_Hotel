import java.util.Scanner;

public class Chambre{
    private int numero;
    private int categorie;
    private int nbPersonnes;

    Scanner sc = new Scanner(System.in);
//    int[][] TabPrix = {
//            {100, 120, 130, 150, 0, 0},
//            {130, 160, 170, 190, 0, 0},
//            {170, 200, 210, 230, 270, 350},
//            {200, 230, 240, 260, 300, 400},
//    };

//    String[] TabDescript = {
//            "Lavabo", "WC, Télévision", "Cabine Douche, Télévision", "WC , cabine douche, télévision" ,
//            "wc, salle de bain, douche, télévision", "2 pièces, salle de bain, douche, wc, télévision"
//    };

    public Chambre(int numero, int categorie, int nbPersonnes) {
        this.numero = numero;
        this.categorie = categorie;
        this.nbPersonnes = nbPersonnes;
    }


    public int donnerNumero() {
        return numero;
    }
     public int DonnerCateg() {
         return categorie;
     }
    public int DonnerNbPers() {
        return nbPersonnes;
    }


    public int DonnerPrix(int tabPrix[][]){
        return ( tabPrix[nbPersonnes-1][categorie-1] );
    } ;

    public void AffichDescription(String[] td) {
            System.out.println("La chambre possède : "+td[categorie -1]);

            }
        }

