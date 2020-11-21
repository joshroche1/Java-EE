package jarpi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ComponentSystemEvent;

@ManagedBean(name = "dbUtility", eager = true)
@SessionScoped
public class dbUtility {

  public String dbSelect() {
    ResultSet rs = null;
    PreparedStatement pst = null;
    Connection con = getConnection();
    String stm = "Select * from users";
    String result = "";
    try {   
      pst = con.prepareStatement(stm);
      pst.execute();
      rs = pst.getResultSet();
      while(rs.next()) {
        result += "<tr><td>";
        result += rs.getString(0);
        result += "</td><td>";
        result += rs.getString(1);
        result += "</td><td>";
        result += rs.getString(2);
        result += "</td></tr>";
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    return result;
  }
  public Connection getConnection() {
    Connection con = null;
    String url = "jdbc:mysql://localhost/test1";
    String user = "tomee";
    String password = "ApacheTomEE";
    try {
      Class.forName("com.mysql.jdbc.Driver");
      con = DriverManager.getConnection(url, user, password);
      System.out.println("Connection completed.");
    } catch (Exception ex) {
      System.out.println(ex.getMessage());
    }
    return con;
  }
}
