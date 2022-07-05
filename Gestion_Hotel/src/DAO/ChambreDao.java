package DAO;

import Beans.Chambre;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ChambreDao extends Dao<Chambre> {
    public ChambreDao(Connection conn) {
        super(conn);
    }

    @Override
    public Chambre create(Chambre obj) {
        try {

            //Vu que nous sommes sous postgres, nous allons chercher manuellement
            //la prochaine valeur de la séquence correspondant à l'id de notre table
            ResultSet result = this    .connect
                    .createStatement(
                            ResultSet.TYPE_SCROLL_INSENSITIVE,
                            ResultSet.CONCUR_UPDATABLE
                    ).executeQuery(
                            "SELECT NEXTVAL('langage_lan_id_seq') as id"
                    );
            if(result.first()){
                long id = result.getLong("id");
                PreparedStatement prepare = this    .connect
                        .prepareStatement(
                                "INSERT INTO langage (lan_id, lan_nom) VALUES(?, ?)"
                        );
                prepare.setInt(1, obj.getNumero());
                prepare.setInt(2, obj.getCategorie());
                prepare.setInt(3, obj.getNbPersonnes());
                prepare.setInt(4, obj.getPrix());
                prepare.setBoolean(5, obj.isOccupe());

                prepare.executeUpdate();
                obj = this.fint((int) id);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return obj;
    }


    @Override
    public Chambre delete(Chambre obj) {

    }

    @Override
    public Chambre update(Chambre obj) {

    }

    @Override
    public Chambre fint(int id) {

    }
}
