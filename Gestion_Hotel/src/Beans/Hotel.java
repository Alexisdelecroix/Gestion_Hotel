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

    // methode qui affiche les chambres correspondant ?? une certaine capacit??
    public void AffichCh(Chambre ch) {

        System.out.println("Nombre de chambres qui corresponds: " + ch.DonnerNbPers()+"/n"+ "" +
                "Cat??gorie de la chambre: " + ch.DonnerCateg() + "/n" + "" +
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
                System.out.println("Cat??gorie : " + uneChambre.DonnerCateg());
                System.out.println("Prix : " + uneChambre.DonnerPrix());
                System.out.println("Nombre de personne oui anna : " + uneChambre.DonnerNbPers());
                System.out.println(" ");
                nbFind++;
            }
        }
        if(nbFind == 0){
            System.out.println("Aucune chambre correspondant ?? ce num??ro n'a ??t?? trouv?? !");
        }
    }
        public void RechercheDHotel() {
            try {
                //??tape 1: charger la classe de driver
                Class.forName("org.postgresql.Driver");
                //??tape 2: cr??er l'objet de connexion
                Connection conn = DriverManager.getConnection(
                        "jdbc:postgresql://localhost:5432/gestion_hotel2", "postgres", "Kara59");
                //??tape 3: cr??er l'objet statement
                Statement stmt = conn.createStatement();
                ResultSet res = stmt.executeQuery("SELECT * FROM hotel");
                //??tape 4: ex??cuter la requ??te
                while (res.next())
                    System.out.println("L'id de l'h??tel est : "+res.getInt(1) + "\n" + "Le nom de l'h??tel est :  "+ res.getString(2) + "\n" + "L'adresse de l'h??tel est :  " + res.getString(3) + "\n" + "Num??ro de t??l??phone :  " + res.getString(4)
                    );
                //??tape 5: fermez l'objet de connexion
                conn.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
}