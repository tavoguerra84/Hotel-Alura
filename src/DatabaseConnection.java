
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        // Cargar el driver JDBC de MySQL
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Crear la conexión a la base de datos
        String url = "jdbc:mysql://localhost:3306/hotel";
        String username = "root";
        String password = "";
        Connection connection = DriverManager.getConnection(url, username, password);

        return connection;
    }
}
