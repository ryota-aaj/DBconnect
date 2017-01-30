package dbconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQL {

   String driver;
   String server, dbname, url, user, password;
   Connection con;
   Statement stmt;
   ResultSet rs;
    public MySQL() {
        this.driver = "org.gjt.mm.mysql.Driver";
        this.server = "ms000.sist.ac.jp";
        this.dbname = "java2016";
        this.url = "jdbc:mysql://" + server + "/" + dbname + "?useUnicode=true&characterEncoding=UTF-8";
        this.user = "java2016";
        this.password = "java2016";
        try {
            this.con = DriverManager.getConnection(url, user, password);
            this.stmt = con.createStatement ();
        } catch (SQLException e) {
             e.printStackTrace();
        }
        try {
            Class.forName (driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public MySQL(String driver, String server, String dbname, String url, String user, String password) {
		super();
		this.driver = driver;
		this.server = server;
		this.dbname = dbname;
		this.url = url;
		this.user = user;
		this.password = password;
	}

	public MySQL(String driver, String server, String dbname, String url, String user, String password, Connection con,
			Statement stmt, ResultSet rs) {
		super();
		this.driver = driver;
		this.server = server;
		this.dbname = dbname;
		this.url = url;
		this.user = user;
		this.password = password;
		this.con = con;
		this.stmt = stmt;
		this.rs = rs;
	}

	public void close(){
        try {
            rs.close();
            stmt.close();
            con.close();
        } catch (SQLException e) {
          e.printStackTrace();
        }

    }
    
    public ResultSet selectAll(){
        String sql = "SELECT * FROM `50516029`";
        ResultSet rs = null;
         try {
            rs = stmt.executeQuery (sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }
}
