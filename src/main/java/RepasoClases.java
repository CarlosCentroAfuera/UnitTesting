import java.util.Random;

public class RepasoClases {

    public static void main(String[] args) {
        // Crear 1 objeto de la clase Repaso1
        Repaso1 r1 = new Repaso1();
        System.out.println(r1.num);

        Repaso1 r = null;
        // Crear 5 objetos de la clase Repaso1 utilizando bucle
        for (int i = 0; i < 5; i++) {
            r = new Repaso1();
            System.out.println(r.num);

        }
        System.out.println(r.num);
    }

}

class Repaso1 {
    String nombre;
    Integer num;

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

    boolean metodo1() {
        /*
        Hace lo mismo que lo de abajo
        if (num > 0) return true;
        else return false;
         */
        return num > 0;
    }
}

class Repaso2 {

}