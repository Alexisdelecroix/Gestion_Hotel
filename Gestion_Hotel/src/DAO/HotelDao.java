package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class HotelDao extends Dao<Hotel>{
    public HotelDao(Connection conn) {
        super(conn);
    }

    @Override
    public boolean create(Hotel obj) {
        return false;
    }

    @Override
    public boolean delete(Hotel obj) {
        return false;
    }

    @Override
    public boolean update(Hotel obj) {
        return false;
    }

    @Override
    public Hotel fint(int id) {

        try
        {
            //étape 1: charger la classe de driver
            Class.forName("org.postgresql.Driver");
            //étape 2: créer l'objet de connexion
            Connection conn = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/hotel","postgres","julian59");
            //étape 3: créer l'objet statement
            Statement stmt = conn.createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM chambre");
            //étape 4: exécuter la requête
            while(res.next())
                System.out.println(res.getInt(1)+"  "+res.getInt(2)+"  "+res.getInt(3)+"  "+res.getBoolean(4)+"  "+res.getInt(5)
                );
            //étape 5: fermez l'objet de connexion
            conn.close();
        }
        catch(Exception e){
            System.out.println(e);
        }

    }
}
