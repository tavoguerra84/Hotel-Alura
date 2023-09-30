
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AutenticacionUsuario {

    public static boolean autenticar(String username, String password) throws SQLException, ClassNotFoundException {
        // Obtener la conexión a la base de datos
        Connection connection = DatabaseConnection.getConnection();
		return false;

    }
}
