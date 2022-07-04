package DAO;

import java.sql.Connection;

public class ChambreDao<Chambre> extends Dao<Chambre> {
    public ChambreDao(Connection conn) {
        super(conn);
    }

    @Override
    public boolean create(Chambre obj) {
        return false;
    }

    @Override
    public boolean delete(Chambre obj) {
        return false;
    }

    @Override
    public boolean update(Chambre obj) {
        return false;
    }

    @Override
    public boolean fint(int id) {
        return false;
    }
}
