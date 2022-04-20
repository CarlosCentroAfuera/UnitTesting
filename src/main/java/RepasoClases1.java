import java.util.Random;

public class RepasoClases1 {

    public static void main(String[] args) {
        // Crear 1 objeto de la clase Repaso1
        Repaso1 r1 = new Repaso1();
        System.out.println(r1.getNum());
        System.out.println(r1);


        Repaso1 r = null;
        // Crear 5 objetos de la clase Repaso1 utilizando bucle
        for (int i = 0; i < 5; i++) {
            r = new Repaso1();
            System.out.println(r.getNum());
            System.out.println(r);

        }

        System.out.println(r.getNum());
    }


}

class Repaso1 {
    String nombre;
    private Integer num;

    Repaso1() {
        Random r = new Random();
        num = r.nextInt();
        imprimirPositivoONegativo();
    }

    void imprimirPositivoONegativo(){
        if (metodo1()){
            System.out.println("Es positiva");
        } else {
            System.out.println("Es negativa");
        }
    }

    private boolean metodo1() {
        /*
        Hace lo mismo que lo de abajo
        if (num > 0) return true;
        else return false;
         */
        return num > 0;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getNum() {
        return num;
    }

    @Override
    public String toString() {
        return "Repaso1{" +
                "nombre='" + nombre + '\'' +
                ", num=" + num +
                '}';
    }


}
