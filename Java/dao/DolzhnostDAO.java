package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Dolzhnost;

public class DolzhnostDAO implements DAO<Dolzhnost> {

    private final Connection con;

    public DolzhnostDAO(Connection con) {
        this.con = con;
    }

    @Override
    public Integer create(Dolzhnost entity) {
        String sql = "INSERT INTO `gostinica`.`dolzhnost` (`nazvanie`, `oclad`, `obayzannosti`, `trebovaniya`) VALUES (?,?,?,?);";
        try (PreparedStatement st = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);) {
            st.setString(1, entity.getNazvanie());
            st.setFloat(2, entity.getOclad());
            st.setString(3, entity.getObayzannosti());
            st.setString(4, entity.getTrebovaniay());
            st.execute();
            ResultSet keys = st.getGeneratedKeys();
            keys.next();
            return keys.getInt(1);
        } catch (SQLException ex) {

        }
        return null;
    }

    @Override
    public Dolzhnost read(Integer id) {
        Dolzhnost d = null;
        String sql = "SELECT * FROM dolzhnost WHERE id = ?;";
        try (PreparedStatement st = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);) {
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                d = new Dolzhnost();
                d.setId(rs.getInt("id"));
                d.setNazvanie(rs.getString("name"));
                d.setOclad(rs.getFloat("oklaad"));
                d.setObayzannosti(rs.getString("obayzannosti"));
                d.setTrebovaniay(rs.getString("trebovaniay"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Dolzhnost> readAll() {
        List<Dolzhnost> dolzhnosti = new ArrayList<>();
        String sql = "SELECT * FROM dolzhnost";
        try (Statement st = con.createStatement();) {
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                Dolzhnost d = new Dolzhnost();
                d.setId(rs.getInt("id"));
                d.setNazvanie(rs.getString("name"));
                d.setOclad(rs.getFloat("oclad"));
                d.setObayzannosti(rs.getString("obayzahhosti"));
                d.getTrebovaniay(rs.getString("trebovaniay"));
                dolzhnosti.add(d);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return dolzhnosti;
    }

    @Override
    public void update(Dolzhnost entity) {
        String sql = "UPDATE `gostinica`.`dolzhnost` (`nazvanie`, `oclad`, `obayzannosti`, `trebovaniya`) VALUE (?,?,?,?) WHERE id = ?;";
        try (PreparedStatement st = con.prepareStatement(sql);) {
            st.setString(1, entity.getNazvanie());
            st.setFloat(2, entity.getOclad());
            st.setString(3, entity.getObayzannosti());
            st.setString(4, entity.getTrebovaniay());
            st.setInt(5, entity.getId());
            st.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delite(Dolzhnost entity) {
        String sql = "DELETE FROM dolzhnost WHERE id = ?";
        try (PreparedStatement st = con.prepareStatement(sql);) {
            st.setInt(1, entity.getId());
            st.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
