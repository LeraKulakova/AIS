
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import model.Usluga;


public class UslugaDAO implements DAO<Usluga> {
    
    private final Connection con;

    public UslugaDAO(Connection con) {
        this.con = con;
    }
    
    @Override
    public Integer create(Usluga entity) {
        String sql = "INSERT INTO `gostinica`.`usluga` (`naimenovanie`, `opisanie`, `stoimost`) VALUES (?,?,?);";
      try (PreparedStatement st  = con. prepareStatement(sql)){
          st.setString(1, entity.getNaimenovanie());
            st.setFloat(2, entity.getStoimost());
            st.setString(3, entity.getOpisanie());
            st.execute();
            ResultSet keys = st.getGeneratedKeys();
            keys.next();
            return keys.getInt(1);
        } catch (SQLException ex) {
      }
        return null;
    }

    @Override
    public Usluga read(Integer Id) {
       Usluga d = null;
        String sql = "SELECT * FROM usluga WHERE id = ?;";
        try (PreparedStatement st = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);) {
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                d = new Usluga();
                d.setId(rs.getInt("id"));
                d.setNaimenovanie(rs.getString("naimenovanie"));
                d.setStoimost(rs.getFloat("stoimost"));
                d.setOpisanie(rs.getString("opisanie"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Usluga> readAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Usluga entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delite(Usluga entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
