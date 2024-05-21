package Sorted;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class Ejemplo1 {
    public static void main(String[] args) {
            List<Integer> numeros = Arrays.asList(5, 3, 9, 1, 4, 7);

            List<Integer> numerosOrdenados = numeros.stream()
                    .sorted()
                    .collect(Collectors.toList());

            System.out.println("Números ordenados: " + numerosOrdenados);
        }
    }


