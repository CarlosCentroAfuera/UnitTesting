import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestEjercicioContarNumeros {

    @Test
    public void test1() {
        Integer[] list = {1,2,3,4};
        String result = EjercicioContarNumeros.contarRepeticiones(list);
        Assertions.assertEquals(result, "{1=1, 2=1, 3=1, 4=1}");
    }

    @Test
    public void test2() {
        Integer[] list = {1,1,1,1};
        String result = EjercicioContarNumeros.contarRepeticiones(list);
        Assertions.assertEquals(result, "{1=4}");
    }


    @Test
    public void test3() {
        Integer[] list = {1,1,1,1};
        String result = EjercicioContarNumeros.contarRepeticiones(list);
        Assertions.assertEquals(result, "{1=4}");
    }
}
