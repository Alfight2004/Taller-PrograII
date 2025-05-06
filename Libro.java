public class Libro {
    private String materia;
    private char paralelo;

    public Libro(String materia, char paralelo) {
        this.materia = materia;
        this.paralelo = paralelo;
    }

    public String getMateria() {
        return materia;
    }

    public char getParalelo() {
        return paralelo;
    }

    @Override
    public String toString() {
        return "Libro de " + materia + ", paralelo " + paralelo;
    }
}
