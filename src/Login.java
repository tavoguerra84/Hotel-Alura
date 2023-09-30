
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Login {

    public static void main(String[] args) throws IOException, SQLException, ClassNotFoundException {
        // Obtener la conexión a la base de datos
        Connection connection = DatabaseConnection.getConnection();

        // Leer el nombre de usuario y la contraseña del usuario
        String username = System.console().readLine("Ingrese su nombre de usuario: ");
        String password = System.console().readLine("Ingrese su contraseña: ");

        // Verificar que el usuario esté autorizado
        String sql = "SELECT rol FROM usuarios WHERE nombre_usuario = ? AND contrasena = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, username);
        statement.setString(2, password);
        ResultSet resultSet = statement.executeQuery();

        if (resultSet.next()) {
            // El usuario está autorizado
            System.out.println("Bienvenido, " + username + ".");
        } else {
            // El usuario no está autorizado
            System.out.println("Nombre de usuario o contraseña incorrectos.");
        }

        // Cerrar la conexión a la base de datos
        connection.close();
    }
}
