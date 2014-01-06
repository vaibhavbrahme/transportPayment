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

public class TokenDAO {
     ConnectionPool c = null;
        Connection conn = null;

    public ArrayList<Token> findAll() {
        ArrayList<Token> al = new ArrayList<Token>();
        try {
            if (c == null) {
                c = ConnectionPool.getInstance();
                c.initialize();
            }
            conn = c.getConnection();
            String sql = "select * from token";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                Token bean = new Token();
                bean.setTokenId(rs.getInt("id"));
                bean.setPassword(rs.getString("password"));
                bean.setAmount(rs.getDouble("amount"));

                al.add(bean);
            }
            c.putConnection(conn);

        } catch (Exception e) {
            System.out.println("Exception " + e);
        }
        return al;
    }
 public void update(Token a) {
        ArrayList<Token> al = new ArrayList<Token>();
        try {
            if (c == null) {
                c = ConnectionPool.getInstance();
                c.initialize();
            }
            conn = c.getConnection();
             String sql = "Update token set amount=? where id = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            pstmt.setDouble(1, a.getAmount());
            pstmt.setInt(2, a.getTokenId());
            pstmt.executeUpdate();
            c.putConnection(conn);

        } catch (Exception e) {
            System.out.println("Exception " + e);
        }

    }
}
