/* INTERFAZ:
 * Diseña la clase Futbolista con los atributos dni, nombr, edad y numeroGoles.
 * ------------------------------------------------------------------------------
 * Implementar:
 *  Constructor, To String e equals basado en DNI
 *  Diseñar la clase Entrenador con los atributos nombre, edad, dni, idFederacion
 *  Diseñar la clase Masajista con los atributos nombre, dni, codigoColegiado, anioExperiencia
 * ------------------------------------------------------------------------------
 * Implementar la interfaz aumento de sueldo, la cual solo se aplica al futbolista y al entrenador
 * que se le anuncie: "tienes un aumento de sueldo"
 */
public class Main {
    public static void main(String[] args) {

        // Creamos las instancias de futbolista y entrenador
        Futbolista futbolista = new Futbolista("06445509L","José Garcia",36,100);
        Entrenador entrenador = new Entrenador("76541123K","Pedro Gutierrez",40,"FED001");

        // Imprimimos la información
        System.out.println(futbolista);
        System.out.println(entrenador);

        // Aumento de sueldo
        futbolista.anunciarAumento();
        entrenador.anunciarAumento();





    }
}