public class Colegio {
    private String nombre;

    public Colegio(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Colegio: " + nombre;
    }
}
