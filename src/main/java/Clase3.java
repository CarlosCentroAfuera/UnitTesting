import java.util.Objects;

public class Clase3 {

    /**
    En este ejemplo vemos como hacer un equals de dos objetos que tienen el mismo contenido.
     */
    public static void main(String[] args) {
        Persona p1 = new Persona("Carlos", "aaa");
        Persona p2 = new Persona("Carlos", "aaa");
        System.out.println(p1);
        System.out.println(p2);
        if (p1.equals(p2)) {
            System.out.println("Es la misma persona");
        } else {
            System.out.println("Son personas distintas");
        }
    }

}
class Persona {
    String nombre;
    String apellido;
    String dni;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return Objects.equals(nombre, persona.nombre) && Objects.equals(apellido, persona.apellido) && Objects.equals(dni, persona.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellido, dni);
    }

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
}