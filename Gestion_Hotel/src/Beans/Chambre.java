package Beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Chambre {
    private  int numero;
    private  int categorie;
    private  int nbPersonnes;
    private int prix;
    private boolean occupe;

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

    public Chambre() {
    }

    public int getNumero() {
        return numero;
    }

    public int getCategorie() {
        return categorie;
    }

    public int getNbPersonnes() {
        return nbPersonnes;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public boolean isOccupe() {
        return occupe;
    }

    public void setOccupe(boolean occupe) {
        this.occupe = occupe;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
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


    public int DonnerPrix() {
        return this.prix;
    }

    public void AffichDescription(String[] td) {
        System.out.println("La chambre possède : " + td[categorie - 1]);

    }


    public void RechercheDChambre() {
        try {
            //étape 1: charger la classe de driver
            Class.forName("org.postgresql.Driver");
            //étape 2: créer l'objet de connexion
            Connection conn = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/gestion_hotel2", "postgres", "Kara59");
            //étape 3: créer l'objet statement
            Statement stmt = conn.createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM chambre");
            //étape 4: exécuter la requête
            while (res.next())
                System.out.println(res.getInt(1) + "  " + res.getInt(2) + "  " + res.getInt(3) + "  "
                        + " " + res.getBoolean(4) + " " + res.getInt(5) + " " + res.getInt(6)
                );
            ResultSet res1 = stmt.executeQuery("SELECT * FROM categories");
            //étape 4: exécuter la requête
            while (res1.next())
                System.out.println(res1.getInt(1) + "  " + res1.getString(2));

            //étape 5: fermez l'objet de connexion
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}