package Map;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Map1 {
    public static void main(String[] args) {
            List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

            List<Integer> dobles = numeros.stream()
                    .map(n -> n * 2)
                    .collect(Collectors.toList());

            System.out.println("Dobles de los números: " + dobles);
        }
    }


