package Function;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
public class Function1 {
    public static void main(String[] args) {
            List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

            Function<Integer, Integer> cuadrado = n -> n * n;

            List<Integer> cuadrados = numeros.stream()
                    .map(cuadrado)
                    .collect(Collectors.toList());

            System.out.println("Cuadrados de los números: " + cuadrados);
        }
    }


