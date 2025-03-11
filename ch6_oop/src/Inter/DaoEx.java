package Inter;

interface DataAccessOvject {
    void select();

    void insert();

    void update();

    void delete();

}

class OracleDao implements DataAccessOvject {

    @Override
    public void select() {

    }

    @Override
    public void insert() {

    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }

}

class MySqlDao implements DataAccessOvject {

    @Override
    public void select() {

    }

    @Override
    public void insert() {

    }

    @Override
    public void update() {
    }

    @Override
    public void delete() {

    }

}

public class DaoEx {
    public static void main(String[] args) {
        dbWork(new OracleDao());
        dbWork(new MySqlDao());

    }

    static void dbWork(DataAccessOvject dao) {
        dao.update();
        dao.delete();
        dao.insert();
        dao.select();

    }
}
