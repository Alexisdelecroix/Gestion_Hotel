import java.io.FileWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
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

//        Beans.Chambre c = new Beans.Chambre(30,1,3);
//        System.out.println("Categorie : "+c.DonnerCateg());
//        System.out.println("Capacite : "+c.DonnerNbPers());
//        System.out.println("Prix : "+c.DonnerPrix(tp));
//        c.AffichDescription(td);

//        Beans.Hotel h = new Beans.Hotel();
//        h.AffichCh(1,tp,td);

//        System.out.println("A combien êtes-vous ?");

        FileWriter file;
        try
        {
            file = new FileWriter("Beans.Hotel.csv");
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

//        try
//        {
//            //étape 1: charger la classe de driver
//            Class.forName("org.postgresql.Driver");
//            //étape 2: créer l'objet de connexion
//            Connection conn = DriverManager.getConnection(
//                    "jdbc:postgresql://localhost:5432/hotel","postgres","julian59");
//            //étape 3: créer l'objet statement
//            Statement stmt = conn.createStatement();
//            ResultSet res = stmt.executeQuery("SELECT * FROM chambre");
//            //étape 4: exécuter la requête
//            while(res.next())
//                System.out.println(res.getInt(1)+"  "+res.getInt(2)+"  "+res.getInt(3)+"  "+res.getBoolean(4)+"  "+res.getInt(5)
//                        );
//            //étape 5: fermez l'objet de connexion
//            conn.close();
//        }
//        catch(Exception e){
//            System.out.println(e);
//        }
    }
}