public class Masajista {
    private String dni;
    private String nombre;
    private String CodeColegio;
    private int experiencia;

    // Constructor
    public Masajista(String dni, String nombre, String codeColegio, int experiencia) {
        this.dni = dni;
        this.nombre = nombre;
        CodeColegio = codeColegio;
        this.experiencia = experiencia;
    }

    // To String
    @Override
    public String toString() {
        return "Masajista" +
                "\n[dni: " + dni +
                "\nnombre: " + nombre +
                "\nCodeColegio: " + CodeColegio +
                "\nexperiencia: " + experiencia +"]";
    }
}
