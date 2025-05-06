import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Registro de Entrega de Libros ===");

        boolean continuar = true;
        while (continuar) {
            System.out.print("\nNombre del colegio: ");
            String nombreColegio = scanner.nextLine();

            System.out.print("Asignatura del libro: ");
            String asignatura = scanner.nextLine();

            char paralelo;
            while (true) {
                System.out.print("Paralelo (A, B o C): ");
                String p = scanner.nextLine().toUpperCase();
                if (p.length() == 1 && "ABC".contains(p)) {
                    paralelo = p.charAt(0);
                    break;
                } else {
                    System.out.println("Paralelo inválido. Solo A, B o C.");
                }
            }

            int cantidad;
            while (true) {
                System.out.print("Cantidad de libros: ");
                try {
                    cantidad = Integer.parseInt(scanner.nextLine());
                    if (cantidad > 0) break;
                    else System.out.println("La cantidad debe ser mayor que cero.");
                } catch (NumberFormatException e) {
                    System.out.println("Ingresa un número válido.");
                }
            }

            Colegio colegio = new Colegio(nombreColegio);
            Libro libro = new Libro(asignatura, paralelo);

            inventario.registrarEntrega(colegio, libro, cantidad);
            System.out.println("✅ Entrega registrada correctamente.");

            // Preguntar si desea continuar
            while (true) {
                System.out.print("\n¿Deseas registrar otra entrega? (1 = Sí, 0 = No): ");
                String opcion = scanner.nextLine();
                if (opcion.equals("1")) {
                    break;
                } else if (opcion.equals("0")) {
                    continuar = false;
                    System.out.println("📦 Registro finalizado.");
                    break;
                } else {
                    System.out.println("Opción inválida. Escribe 1 o 0.");
                }
            }
        }

        scanner.close();
    }
}
