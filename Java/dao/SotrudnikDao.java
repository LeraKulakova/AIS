package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Sotrudnik;

public class SotrudnikDao implements DAO<Sotrudnik> {

    private final Connection con;

    public SotrudnikDao(Connection con) {
        this.con = con;
    }

    @Override
    public Integer create(Sotrudnik entity) {

        try {
            String sql = "INSERT INTO `gostinica`.`sotrudnik`(`fio`, `rozhdenie`, `pol`, `telefon`, `passport`, `dolzhnost`) VALUES (?, ?, ?, ?, ?, ?);";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, entity.getId());
            stmt.setString(2, entity.getFio());
            stmt.setDate(3, new java.sql.Date(entity.getRozhdenie().getTime()));
            stmt.setInt(4, entity.getPol());
            stmt.setString(5, entity.getTelefon());
            stmt.setInt(6, entity.getPassport().getId());
            stmt.setInt(7, entity.getDolzhnost().getId());

            con.prepareStatement(sql);
        } catch (SQLException ex) {
            Logger.getLogger(SotrudnikDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    }

    @Override
    public Sotrudnik read(Integer Id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Sotrudnik> readAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Sotrudnik entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delite(Sotrudnik entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
