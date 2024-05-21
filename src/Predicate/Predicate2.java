package Predicate;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
public class Predicate2 {

    public static void main(String[] args) {
            List<Integer> numeros = Arrays.asList(1, 2, 3, 6, 8, 4, 5, 7);

            Predicate<Integer> esMayorQueCinco = n -> n > 5;

            List<Integer> numerosMayoresQueCinco = numeros.stream()
                    .filter(esMayorQueCinco)
                    .collect(Collectors.toList());

            System.out.println("Números mayores que 5: " + numerosMayoresQueCinco);
        }
    }


