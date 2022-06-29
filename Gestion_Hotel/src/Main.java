import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        // déclarer et initialiser un tableau 2D
        int[][] TabPrix = {
                {100, 120, 130, 150, 0, 0},
                {130, 160, 170, 190, 0, 0},
                {170, 200, 210 ,230 ,270 , 350},
                {200, 230, 240, 260,300,400},
        };

        // afficher le tableau 2D
        for (int[] tab: TabPrix) {
            for (int s: tab) {
                System.out.print(s + "\t");
            }
            System.out.println("\n");
        }

//        int j, i = 1;
//        for (int[] tab1D : TabPrix) {
//            j = 1;
//            for (int val : tab1D) {
//                System.out.println("[" + i + "][" + j + "] = " + val);
//                j++;
//            }
//            i++;
//        }

        String[] TabDescript = {
                "Lavabo", "WC, Télévision", "Cabine Douche, Télévision", "WC , cabine douche, télévision" ,
                "wc, salle de bain, douche, télévision", "2 pièces, salle de bain, douche, wc, télévision"
        };

            int nbPerson;
            int categorie;
        Scanner sc = new Scanner(System.in);

        Chambre test = new Chambre(1,1,1);
        test.AffichDescription();

//        System.out.println("A combien êtes-vous ? 4 pers. max.");
//        nbPerson = sc.nextInt();
//
//        while (nbPerson > 4 || nbPerson < 1) {
//            System.out.println("Apprend a lire, 4 pers. max. et 1 pers. minimum");
//            System.out.println("A combien êtes-vous ? 4 pers. max.");
//            nbPerson = sc.nextInt();
//        }
//
//        System.out.println("Quelle catégorie de chambre voulez-vous ?");
//        categorie = sc.nextInt();
//
//        while (categorie > 6 || categorie < 1) {
//            System.out.println("Cette catégorie n'existe pas");
//            System.out.println("Quelle catégorie de chambre voulez-vous ?");
//            categorie = sc.nextInt();
//        }

//        int j, i = 1;
//        for (int[] tab1D : TabPrix) {
//            j = 1;
//            for (int val : tab1D) {
//                if ( i == nbPerson && j == categorie) {
//                    if (val != 0){
//                        System.out.println("Une chambre est disponible");
//                        System.out.println("Cette chambre coute "+ val+ " euros");
//                        System.out.println("Cette chambre possède : "+TabDescript[j-1]);
//                    } else {
//                        System.out.println("Cette chambre n'est pas disponible !!");
//                    }
//                }
//                j++;
//            }
//            i++;
//        }
//        Chambre test = new Chambre(25, 4, 2);
//        System.out.println("Quelle chambre voulez vous prendre (numéro) ?");
//        test.donnerNumero();
    }
}