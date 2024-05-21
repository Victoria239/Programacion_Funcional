package Function;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
public class Function2 {
        public static void main(String[] args) {
            List<String> cadenas = Arrays.asList("1", "2", "3", "4", "5");

            Function<String, Integer> stringToInteger = Integer::parseInt;

            List<Integer> enteros = cadenas.stream()
                    .map(stringToInteger)
                    .collect(Collectors.toList());

            System.out.println("Lista de enteros: " + enteros);
        }
    }


