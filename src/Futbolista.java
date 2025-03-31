public class Futbolista extends AumentoSueldo {
    private String dni;
    private String nombre;
    private int edad;
    private int numGoles;

    // Constructor
    public Futbolista(String dni, String nombre, int edad, int numGoles) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.numGoles = numGoles;
    }

    // To String
    @Override
    public String toString() {
        return "Futbolista " +
                "\n[DNI: " + dni +
                "\nNombre: " + nombre +
                "\nEdad: " + edad +
                "\nGoles: " + numGoles + "]";
    }

    // Equals para comprobar el DNI
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // si es la misma referencia son iguales
        if (!(obj instanceof Futbolista)) return false; // verificamos si es correcto
        Futbolista other = (Futbolista) obj;
        return this.dni.equals(other.dni); // comparamos el DNI.
    }

    // Implementación de la interfaz
    @Override
    public void anunciarAumento() {
        System.out.println(nombre + ": Tienes un aumento de sueldo.");
    }
}
