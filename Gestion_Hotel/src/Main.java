import java.io.FileWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//         tableau des prix des chambres : tabPrix
        int[][] tp = new int[4][6] ;
        tp[0][0] = 100; tp[0][1]=120 ; tp[0][2] = 130; tp[0][3]=150; tp[0][4] = 0;  tp[0][5]=0;
        tp[1][0] = 130; tp[1][1]=160 ; tp[1][2] = 170; tp[1][3]=190; tp[1][4] = 0;  tp[1][5]=0;
        tp[2][0] = 170; tp[2][1]=200 ; tp[2][2] = 210; tp[2][3]=230; tp[2][4] = 270;  tp[2][5]=350;
        tp[3][0] = 200; tp[3][1]=230 ; tp[3][2] = 240; tp[3][3]=260; tp[3][4] = 300;  tp[3][5]=400;

        // tableau des descriptions des chambres : tabDescript
        String[] td  = {"Lavabo","WC, television","Cabine douche, television","WC, cabine douche, Television","WC, Salle de bain + douche, Television","2 pièces, WC, Salle de bain + douche, Television" } ;

//        Chambre c = new Chambre(30,1,3);
//        System.out.println("Categorie : "+c.DonnerCateg());
//        System.out.println("Capacite : "+c.DonnerNbPers());
//        System.out.println("Prix : "+c.DonnerPrix(tp));
//        c.AffichDescription(td);

//        Hotel h = new Hotel();
//        h.AffichCh(1,tp,td);

        System.out.println("A combien êtes-vous ?");

        FileWriter file;
        try
        {
            file = new FileWriter("Hotel.csv");
            for(int[] e : tp){
                for(int el : e){
                    file.append(String.valueOf(el));
                    file.append(";");
                }
                file.append("\n");
            }
            file.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}