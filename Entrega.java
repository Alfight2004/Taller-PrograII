import java.time.LocalDate;

public class Entrega {
    private Colegio colegio;
    private Libro libro;
    private int cantidad;
    private LocalDate fecha;

    public Entrega(Colegio colegio, Libro libro, int cantidad) {
        this.colegio = colegio;
        this.libro = libro;
        this.cantidad = cantidad;
        this.fecha = LocalDate.now();
    }

    @Override
    public String toString() {
        return fecha + " - " + colegio + ", " + libro + ", Cantidad: " + cantidad;
    }
}
