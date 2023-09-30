
import java.io.IOException;
import java.util.Scanner;

public class MenuPrincipal {

    public static void main(String[] args) throws IOException {
        // Imprimir el menú de opciones
        System.out.println("1. Crear reserva");
        System.out.println("2. Editar reserva");
        System.out.println("3. Eliminar reserva");
        System.out.println("4. Buscar reserva");
        System.out.println("5. Registrar huésped");
        System.out.println("6. Editar huésped");
        System.out.println("7. Eliminar huésped");

        // Obtener la opción del usuario
        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();

        // Ejecutar la acción correspondiente a la opción seleccionada
        switch (opcion) {
            case 1:
                // Crear reserva
                break;
            case 2:
                // Editar reserva
                break;
            case 3:
                // Eliminar reserva
                break;
            case 4:
                // Buscar reserva
                break;
            case 5:
                // Registrar huésped
                break;
            case 6:
                // Editar huésped
                break;
            case 7:
                // Eliminar huésped
                break;
        }
    }
}
