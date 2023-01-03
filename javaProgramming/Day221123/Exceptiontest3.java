package Day221123;
import java.sql.*;

class samsam{
    samsam() throws SQLException, ClassNotFoundException{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection conn= null;
        conn=DriverManager.getConnection("jdbc:oracle:thon:@127.0.0.1:1521:XE","scott","tiger");
    }
}

public class Exceptiontest3 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        new samsam();
    }
}