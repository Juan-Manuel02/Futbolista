public class Entrenador extends AumentoSueldo {
    private String dni;
    private String nombre;
    private int edad;
    private String idFederacion;

    // Constructor
    public Entrenador(String dni, String nombre, int edad, String idFederacion) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.idFederacion = idFederacion;
    }

    // To String

    @Override
    public String toString() {
        return "Entrenador " +
                "\n[DNI:" + dni +
                "\nNombre: " + nombre +
                "\nEdad: " + edad +
                "\nID Federación: " + idFederacion + "]";
    }

    // Implementación de la interfaz
    @Override
    public void anunciarAumento() {
        System.out.println(nombre + ": Tienes un aumento de sueldo.");
    }
}
