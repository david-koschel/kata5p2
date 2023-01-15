package kata5p2.view;

import kata5p2.model.Mail;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MailListReaderBD {

    public List<Mail> read() {
        List<Mail> result = new ArrayList<>();
        try {
            Connection conn = DriverManager.getConnection("jdbc:sqlite:KATA5.db");
            if (conn != null) {
                ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM EMAIL");
                while (rs.next()) {
                    result.add(new Mail(rs.getString("Mail")));
                }
                conn.close();
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return result;
    }
}
