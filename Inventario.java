import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private List<Entrega> entregas = new ArrayList<>();

    public void registrarEntrega(Colegio colegio, Libro libro, int cantidad) {
        Entrega entrega = new Entrega(colegio, libro, cantidad);
        entregas.add(entrega);
        guardarEnArchivo(entrega);
    }

    private void guardarEnArchivo(Entrega entrega) {
        try (FileWriter writer = new FileWriter("registro_entregas.txt", true)) {
            writer.write(entrega.toString() + "\n");
        } catch (IOException e) {
            System.out.println("Error al guardar el registro: " + e.getMessage());
        }
    }
}
