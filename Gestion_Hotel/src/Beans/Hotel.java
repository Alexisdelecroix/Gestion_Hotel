package Beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Hotel {
//    attributs
    private String nom;
    private String adresse;
    private String numeroTel;
    private Chambre uneChambre;

    public Hotel() {
    }

    public Hotel(String nom, String adresse, String numeroTel, Chambre uneChambre) {
        this.nom = nom;
        this.adresse = adresse;
        this.numeroTel = numeroTel;
        this.uneChambre = uneChambre;
    }

    //    Beans.Chambre[] tabCh;
//    Scanner sc = new Scanner(System.in);
//    Beans.Hotel h = new Beans.Hotel();
//
//    public Beans.Hotel() {
//        tabCh = new Beans.Chambre[31];
//        // affectation de valeurs dans le tableau
//        tabCh[0] = new Beans.Chambre(1, 1, 1);
//        tabCh[1] = new Beans.Chambre(2, 2, 1);
//        tabCh[2] = new Beans.Chambre(3, 3, 1);
//        tabCh[3] = new Beans.Chambre(4, 4, 1);
//        tabCh[4] = new Beans.Chambre(5, 1, 2);
//        tabCh[5] = new Beans.Chambre(6, 2, 2);
//        tabCh[6] = new Beans.Chambre(7, 3, 2);
//        tabCh[7] = new Beans.Chambre(8, 4, 2);
//        tabCh[8] = new Beans.Chambre(9, 1, 3);
//        tabCh[9] = new Beans.Chambre(10, 2, 3);
//        tabCh[10] = new Beans.Chambre(11, 3, 3);
//        tabCh[11] = new Beans.Chambre(12, 4, 3);
//        tabCh[12] = new Beans.Chambre(13, 5, 3);
//        tabCh[13] = new Beans.Chambre(14, 6, 3);
//        tabCh[14] = new Beans.Chambre(15, 1, 4);
//        tabCh[15] = new Beans.Chambre(16, 2, 4);
//        tabCh[16] = new Beans.Chambre(17, 3, 4);
//        tabCh[17] = new Beans.Chambre(18, 4, 4);
//        tabCh[18] = new Beans.Chambre(19, 5, 4);
//        tabCh[19] = new Beans.Chambre(20, 6, 4);
//        tabCh[20] = new Beans.Chambre(21, 1, 1);
//        tabCh[21] = new Beans.Chambre(22, 2, 2);
//        tabCh[22] = new Beans.Chambre(23, 1, 2);
//        tabCh[23] = new Beans.Chambre(24, 3, 1);
//        tabCh[24] = new Beans.Chambre(25, 3, 2);
//        tabCh[25] = new Beans.Chambre(26, 4, 4);
//        tabCh[26] = new Beans.Chambre(27, 5, 4);
//        tabCh[27] = new Beans.Chambre(28, 2, 2);
//        tabCh[28] = new Beans.Chambre(29, 4, 3);
//        tabCh[29] = new Beans.Chambre(30, 3, 2);
//        tabCh[30] = new Beans.Chambre(31, 4, 2);
//    }

    // methode qui affiche les chambres correspondant à une certaine capacité
    public void AffichCh(Chambre ch) {

        System.out.println("Nombre de chambres qui corresponds: " + ch.DonnerNbPers()+"/n"+ "" +
                "Catégorie de la chambre: " + ch.DonnerCateg() + "/n" + "" +
                "Prix de la chambre : " + ch.DonnerPrix());
    }

    public void afficherChambreNum() {
        System.out.println(uneChambre.donnerNumero());
    }

    public void searchCh(int nbCham){
        int nbFind = 0;
        {
            if (uneChambre.donnerNumero() == nbCham) {
                System.out.println("Beans.Chambre : " + uneChambre.donnerNumero());
                System.out.println("Catégorie : " + uneChambre.DonnerCateg());
                System.out.println("Prix : " + uneChambre.DonnerPrix());
                System.out.println("Nombre de personne oui anna : " + uneChambre.DonnerNbPers());
                System.out.println(" ");
                nbFind++;
            }
        }
        if(nbFind == 0){
            System.out.println("Aucune chambre correspondant à ce numéro n'a été trouvé !");
        }
    }
        public void RechercheDHotel() {
            try {
                //étape 1: charger la classe de driver
                Class.forName("org.postgresql.Driver");
                //étape 2: créer l'objet de connexion
                Connection conn = DriverManager.getConnection(
                        "jdbc:postgresql://localhost:5432/gestion_hotel2", "postgres", "Kara59");
                //étape 3: créer l'objet statement
                Statement stmt = conn.createStatement();
                ResultSet res = stmt.executeQuery("SELECT * FROM hotel");
                //étape 4: exécuter la requête
                while (res.next())
                    System.out.println(res.getInt(1) + "  " + res.getString(2) + "  " + res.getString(3) + "  " + res.getString(4)
                    );
                //étape 5: fermez l'objet de connexion
                conn.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
}