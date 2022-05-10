import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestEjercicioContarLetras {
    @Test
    public void testContarLetrasIguales(){
        String input = "aaaa";
        String outputEsperado = "{a=4}";
        String outputActual = EjercicioContarLetras.contarRepeticiones(input);
        Assertions.assertEquals(outputEsperado, outputActual);
    }

    @Test
    public void testContarNumerosNoIguales(){
        Integer[] input = {1,2,3,4};
        String outputEsperado = "{1=1, 2=1, 3=1, 4=1}";
        String outputActual = EjercicioContarNumeros.contarRepeticiones(input);
        Assertions.assertEquals(outputEsperado, outputActual);
    }

    @Test
    public void testContarNumerosMixtos(){
        Integer[] input = {1,2,3,1};
        String outputEsperado = "{1=2, 2=1, 3=1}";
        String outputActual = EjercicioContarNumeros.contarRepeticiones(input);
        Assertions.assertEquals(outputEsperado, outputActual);
    }

    @Test
    public void testContarNumerosNegativos(){
        Integer[] input = {-1,2,3,1};
        String outputEsperado = "{-1=1, 1=1, 2=1, 3=2}";
        String outputActual = EjercicioContarNumeros.contarRepeticiones(input);
        Assertions.assertEquals(outputEsperado, outputActual);
    }

    @Test
    public void testContarNumerosSinNumeros(){
        Integer[] input = {};
        String outputEsperado = "{}";
        String outputActual = EjercicioContarNumeros.contarRepeticiones(input);
        Assertions.assertEquals(outputEsperado, outputActual);
    }

    @Test
    public void testContarNumerosConNull(){
        Integer[] input = null;
        String outputActual = EjercicioContarNumeros.contarRepeticiones(input);
        Assertions.assertNull(outputActual);
    }


}
