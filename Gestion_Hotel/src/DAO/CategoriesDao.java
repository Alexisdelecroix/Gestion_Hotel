package DAO;

import java.sql.Connection;

public class CategoriesDao<Categories> extends Dao<Categories>{
    public CategoriesDao(Connection conn) {
        super(conn);
    }

    @Override
    public boolean create(Categories obj) {
        return false;
    }

    @Override
    public boolean delete(Categories obj) {
        return false;
    }

    @Override
    public boolean update(Categories obj) {
        return false;
    }

    @Override
    public boolean fint(int id) {
        return false;
    }
}
