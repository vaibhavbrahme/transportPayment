/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kd
 */
import com.vedisoft.ConnectionPool;
    import java.sql.*;
    import java.util.ArrayList;
    import javax.servlet.http.HttpSession;

public class TariffDAO {
     ConnectionPool c = null;
        Connection conn = null;

    public ArrayList<Tariff> findAll() {
        ArrayList<Tariff> al = new ArrayList<Tariff>();
        try {
            if (c == null) {
                c = ConnectionPool.getInstance();
                c.initialize();
            }
            conn = c.getConnection();
            String sql = "select * from tariff";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                Tariff bean = new Tariff();
                bean.setTariffId(rs.getInt("id"));
                bean.setCity(rs.getString("city"));
                bean.setMedium(rs.getString("medium"));
                bean.setStartPoint(rs.getString("startPlace"));
                bean.setEndPoint(rs.getString("stopPlace"));
                bean.setAmount(rs.getDouble("amount"));
                al.add(bean);
            }
            c.putConnection(conn);

        } catch (Exception e) {
            System.out.println("Exception " + e);
        }
        return al;
    }

}
